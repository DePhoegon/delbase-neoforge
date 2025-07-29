package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorShift.slab.smoothSandStoneSlab;
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

public class slabSmoothSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<SlabBlock> BLOOD_SMOOTH_SAND_STONE_SLAB = registerBlock("blood_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_SMOOTH_SAND_STONE_SLAB = registerBlock("white_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_SMOOTH_SAND_STONE_SLAB = registerBlock("orange_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_SMOOTH_SAND_STONE_SLAB = registerBlock("magenta_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_SLAB = registerBlock("light_blue_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_SMOOTH_SAND_STONE_SLAB = registerBlock("yellow_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_SMOOTH_SAND_STONE_SLAB = registerBlock("lime_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_SMOOTH_SAND_STONE_SLAB = registerBlock("pink_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_SMOOTH_SAND_STONE_SLAB = registerBlock("gray_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_SLAB = registerBlock("light_gray_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_SMOOTH_SAND_STONE_SLAB = registerBlock("cyan_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_SMOOTH_SAND_STONE_SLAB = registerBlock("purple_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_SMOOTH_SAND_STONE_SLAB = registerBlock("blue_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_SMOOTH_SAND_STONE_SLAB = registerBlock("green_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_SMOOTH_SAND_STONE_SLAB = registerBlock("brown_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_SMOOTH_SAND_STONE_SLAB = registerBlock("black_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(BLACK_SAND_STONE.get()));

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