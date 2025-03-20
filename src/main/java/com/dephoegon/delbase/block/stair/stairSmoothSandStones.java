package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorShift.stair.smoothSandStoneStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.Delabse.MOD_ID;

public class stairSmoothSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<StairBlock> BLOOD_SMOOTH_SAND_STONE_STAIR = registerBlock("blood_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> WHITE_SMOOTH_SAND_STONE_STAIR = registerBlock("white_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> ORANGE_SMOOTH_SAND_STONE_STAIR = registerBlock("orange_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> MAGENTA_SMOOTH_SAND_STONE_STAIR = registerBlock("magenta_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_STAIR = registerBlock("light_blue_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> YELLOW_SMOOTH_SAND_STONE_STAIR = registerBlock("yellow_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIME_SMOOTH_SAND_STONE_STAIR = registerBlock("lime_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(LIME_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PINK_SMOOTH_SAND_STONE_STAIR = registerBlock("pink_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(PINK_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GRAY_SMOOTH_SAND_STONE_STAIR = registerBlock("gray_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_STAIR = registerBlock("light_gray_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> CYAN_SMOOTH_SAND_STONE_STAIR = registerBlock("cyan_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PURPLE_SMOOTH_SAND_STONE_STAIR = registerBlock("purple_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLUE_SMOOTH_SAND_STONE_STAIR = registerBlock("blue_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GREEN_SMOOTH_SAND_STONE_STAIR = registerBlock("green_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BROWN_SMOOTH_SAND_STONE_STAIR = registerBlock("brown_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLACK_SMOOTH_SAND_STONE_STAIR = registerBlock("black_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(BLACK_SAND_STONE.get()));

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