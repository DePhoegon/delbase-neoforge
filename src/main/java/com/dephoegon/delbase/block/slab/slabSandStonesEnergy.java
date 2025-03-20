package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorShift.slab.sandStoneSlabEnergy;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.Delabse.MOD_ID;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class slabSandStonesEnergy {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<SlabBlock> OVERRIDE_SAND_STONE_SLAB_ENERGY = registerBlock("sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(SANDSTONE));
    public static final DeferredBlock<SlabBlock> OVERRIDE_RED_SAND_STONE_SLAB_ENERGY = registerBlock("red_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(RED_SANDSTONE));
    public static final DeferredBlock<SlabBlock> BLOOD_SAND_STONE_SLAB_ENERGY = registerBlock("blood_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_SAND_STONE_SLAB_ENERGY = registerBlock("white_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_SAND_STONE_SLAB_ENERGY = registerBlock("orange_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_SAND_STONE_SLAB_ENERGY = registerBlock("magenta_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_SAND_STONE_SLAB_ENERGY = registerBlock("light_blue_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_SAND_STONE_SLAB_ENERGY = registerBlock("yellow_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_SAND_STONE_SLAB_ENERGY = registerBlock("lime_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_SAND_STONE_SLAB_ENERGY = registerBlock("pink_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_SAND_STONE_SLAB_ENERGY = registerBlock("gray_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_SAND_STONE_SLAB_ENERGY = registerBlock("light_gray_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_SAND_STONE_SLAB_ENERGY = registerBlock("cyan_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_SAND_STONE_SLAB_ENERGY = registerBlock("purple_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_SAND_STONE_SLAB_ENERGY = registerBlock("blue_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_SAND_STONE_SLAB_ENERGY = registerBlock("green_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_SAND_STONE_SLAB_ENERGY = registerBlock("brown_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_SAND_STONE_SLAB_ENERGY = registerBlock("black_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(BLACK_SAND_STONE.get()));

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