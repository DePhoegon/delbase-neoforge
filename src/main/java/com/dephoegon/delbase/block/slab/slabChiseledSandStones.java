package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorShift.slab.chiseledSandStoneSlab;
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

public class slabChiseledSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<SlabBlock> OVERRIDE_CHISELED_SAND_STONE_SLAB = registerBlock("chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(SANDSTONE));
    public static final DeferredBlock<SlabBlock> OVERRIDE_RED_CHISELED_SAND_STONE_SLAB = registerBlock("red_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(RED_SANDSTONE));
    public static final DeferredBlock<SlabBlock> BLOOD_CHISELED_SAND_STONE_SLAB = registerBlock("blood_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_CHISELED_SAND_STONE_SLAB = registerBlock("white_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_CHISELED_SAND_STONE_SLAB = registerBlock("orange_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_CHISELED_SAND_STONE_SLAB = registerBlock("magenta_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_CHISELED_SAND_STONE_SLAB = registerBlock("light_blue_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_CHISELED_SAND_STONE_SLAB = registerBlock("yellow_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_CHISELED_SAND_STONE_SLAB = registerBlock("lime_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_CHISELED_SAND_STONE_SLAB = registerBlock("pink_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_CHISELED_SAND_STONE_SLAB = registerBlock("gray_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_CHISELED_SAND_STONE_SLAB = registerBlock("light_gray_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_CHISELED_SAND_STONE_SLAB = registerBlock("cyan_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_CHISELED_SAND_STONE_SLAB = registerBlock("purple_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_CHISELED_SAND_STONE_SLAB = registerBlock("blue_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_CHISELED_SAND_STONE_SLAB = registerBlock("green_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_CHISELED_SAND_STONE_SLAB = registerBlock("brown_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_CHISELED_SAND_STONE_SLAB = registerBlock("black_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BLACK_SAND_STONE.get()));

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