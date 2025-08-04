package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorShift.slab.sandSlabEnergy;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.Delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

public class slabSandsEnergy {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<SlabBlock> OVERRIDE_SAND_SLAB_ENERGY = registerBlock("sand_slab_energy",
            () -> new sandSlabEnergy(SAND));
    public static final DeferredBlock<SlabBlock> OVERRIDE_RED_SAND_SLAB_ENERGY = registerBlock("red_sand_slab_energy",
            () -> new sandSlabEnergy(RED_SAND));
    public static final DeferredBlock<SlabBlock> BLOOD_SAND_SLAB_ENERGY = registerBlock("blood_sand_slab_energy",
            () -> new sandSlabEnergy(BLOOD_SAND.get()));
    public static final DeferredBlock<SlabBlock> WHITE_SAND_SLAB_ENERGY = registerBlock("white_sand_slab_energy",
            () -> new sandSlabEnergy(WHITE_SAND.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_SAND_SLAB_ENERGY = registerBlock("orange_sand_slab_energy",
            () -> new sandSlabEnergy(ORANGE_SAND.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_SAND_SLAB_ENERGY = registerBlock("magenta_sand_slab_energy",
            () -> new sandSlabEnergy(MAGENTA_SAND.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_SAND_SLAB_ENERGY = registerBlock("light_blue_sand_slab_energy",
            () -> new sandSlabEnergy(LIGHT_BLUE_SAND.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_SAND_SLAB_ENERGY = registerBlock("yellow_sand_slab_energy",
            () -> new sandSlabEnergy(YELLOW_SAND.get()));
    public static final DeferredBlock<SlabBlock> LIME_SAND_SLAB_ENERGY = registerBlock("lime_sand_slab_energy",
            () -> new sandSlabEnergy(LIME_SAND.get()));
    public static final DeferredBlock<SlabBlock> PINK_SAND_SLAB_ENERGY = registerBlock("pink_sand_slab_energy",
            () -> new sandSlabEnergy(PINK_SAND.get()));
    public static final DeferredBlock<SlabBlock> GRAY_SAND_SLAB_ENERGY = registerBlock("gray_sand_slab_energy",
            () -> new sandSlabEnergy(GRAY_SAND.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_SAND_SLAB_ENERGY = registerBlock("light_gray_sand_slab_energy",
            () -> new sandSlabEnergy(LIGHT_GRAY_SAND.get()));
    public static final DeferredBlock<SlabBlock> CYAN_SAND_SLAB_ENERGY = registerBlock("cyan_sand_slab_energy",
            () -> new sandSlabEnergy(CYAN_SAND.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_SAND_SLAB_ENERGY = registerBlock("purple_sand_slab_energy",
            () -> new sandSlabEnergy(PURPLE_SAND.get()));
    public static final DeferredBlock<SlabBlock> BLUE_SAND_SLAB_ENERGY = registerBlock("blue_sand_slab_energy",
            () -> new sandSlabEnergy(BLUE_SAND.get()));
    public static final DeferredBlock<SlabBlock> GREEN_SAND_SLAB_ENERGY = registerBlock("green_sand_slab_energy",
            () -> new sandSlabEnergy(GREEN_SAND.get()));
    public static final DeferredBlock<SlabBlock> BROWN_SAND_SLAB_ENERGY = registerBlock("brown_sand_slab_energy",
            () -> new sandSlabEnergy(BROWN_SAND.get()));
    public static final DeferredBlock<SlabBlock> BLACK_SAND_SLAB_ENERGY = registerBlock("black_sand_slab_energy",
            () -> new sandSlabEnergy(BLACK_SAND.get()));

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void  registerBlockItem(String name, DeferredBlock<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(64)));
    }
}