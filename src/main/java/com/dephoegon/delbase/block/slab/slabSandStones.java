package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorShift.slab.sandStoneSlab;
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

public class slabSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<SlabBlock> BLOOD_SAND_STONE_SLAB = registerBlock("blood_sand_stone_slab",
            () -> new sandStoneSlab(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_SAND_STONE_SLAB = registerBlock("white_sand_stone_slab",
            () -> new sandStoneSlab(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_SAND_STONE_SLAB = registerBlock("orange_sand_stone_slab",
            () -> new sandStoneSlab(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_SAND_STONE_SLAB = registerBlock("magenta_sand_stone_slab",
            () -> new sandStoneSlab(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_SAND_STONE_SLAB = registerBlock("light_blue_sand_stone_slab",
            () -> new sandStoneSlab(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_SAND_STONE_SLAB = registerBlock("yellow_sand_stone_slab",
            () -> new sandStoneSlab(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_SAND_STONE_SLAB = registerBlock("lime_sand_stone_slab",
            () -> new sandStoneSlab(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_SAND_STONE_SLAB = registerBlock("pink_sand_stone_slab",
            () -> new sandStoneSlab(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_SAND_STONE_SLAB = registerBlock("gray_sand_stone_slab",
            () -> new sandStoneSlab(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_SAND_STONE_SLAB = registerBlock("light_gray_sand_stone_slab",
            () -> new sandStoneSlab(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_SAND_STONE_SLAB = registerBlock("cyan_sand_stone_slab",
            () -> new sandStoneSlab(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_SAND_STONE_SLAB = registerBlock("purple_sand_stone_slab",
            () -> new sandStoneSlab(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_SAND_STONE_SLAB = registerBlock("blue_sand_stone_slab",
            () -> new sandStoneSlab(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_SAND_STONE_SLAB = registerBlock("green_sand_stone_slab",
            () -> new sandStoneSlab(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_SAND_STONE_SLAB = registerBlock("brown_sand_stone_slab",
            () -> new sandStoneSlab(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_SAND_STONE_SLAB = registerBlock("black_sand_stone_slab",
            () -> new sandStoneSlab(BLACK_SAND_STONE.get()));

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