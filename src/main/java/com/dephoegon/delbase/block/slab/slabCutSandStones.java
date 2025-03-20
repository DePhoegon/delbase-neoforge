package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorShift.slab.cutSandStoneSlab;
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

public class slabCutSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<SlabBlock> BLOOD_CUT_SAND_STONE_SLAB = registerBlock("blood_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_CUT_SAND_STONE_SLAB = registerBlock("white_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_CUT_SAND_STONE_SLAB = registerBlock("orange_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_CUT_SAND_STONE_SLAB = registerBlock("magenta_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_CUT_SAND_STONE_SLAB = registerBlock("light_blue_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_CUT_SAND_STONE_SLAB = registerBlock("yellow_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_CUT_SAND_STONE_SLAB = registerBlock("lime_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_CUT_SAND_STONE_SLAB = registerBlock("pink_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_CUT_SAND_STONE_SLAB = registerBlock("gray_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_CUT_SAND_STONE_SLAB = registerBlock("light_gray_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_CUT_SAND_STONE_SLAB = registerBlock("cyan_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_CUT_SAND_STONE_SLAB = registerBlock("purple_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_CUT_SAND_STONE_SLAB = registerBlock("blue_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_CUT_SAND_STONE_SLAB = registerBlock("green_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_CUT_SAND_STONE_SLAB = registerBlock("brown_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_CUT_SAND_STONE_SLAB = registerBlock("black_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BLACK_SAND_STONE.get()));

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