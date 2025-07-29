package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorShift.slab.smoothSandStoneSlabEnergy;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class slabSmoothSandStonesEnergy {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<SlabBlock> OVERRIDE_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(SANDSTONE));
    public static final DeferredBlock<SlabBlock> OVERRIDE_RED_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("red_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(RED_SANDSTONE));
    public static final DeferredBlock<SlabBlock> BLOOD_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("blood_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("white_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("orange_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("magenta_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("light_blue_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("yellow_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("lime_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("pink_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("gray_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("light_gray_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("cyan_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("purple_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("blue_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("green_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("brown_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_SMOOTH_SAND_STONE_SLAB_ENERGY = registerBlock("black_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(BLACK_SAND_STONE.get()));

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