package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorShift.slab.chiseledSandStoneSlabEnergy;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.Delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class slabChiseledSandStonesEnergy {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<SlabBlock> OVERRIDE_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(SANDSTONE));
    public static final DeferredBlock<SlabBlock> OVERRIDE_RED_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("red_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(RED_SANDSTONE));
    public static final DeferredBlock<SlabBlock> BLOOD_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("blood_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("white_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("orange_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("magenta_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("light_blue_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("yellow_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("lime_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("pink_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("gray_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("light_gray_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("cyan_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("purple_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("blue_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("green_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("brown_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_CHISELED_SAND_STONE_SLAB_ENERGY = registerBlock("black_chiseled_sand_stone_slab_energy",
            () -> new chiseledSandStoneSlabEnergy(BLACK_SAND_STONE.get()));

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