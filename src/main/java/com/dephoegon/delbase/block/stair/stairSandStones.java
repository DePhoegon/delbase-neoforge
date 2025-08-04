package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorShift.stair.sandStoneStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.Delbase.Mod_ID;

public class stairSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<StairBlock> BLOOD_SAND_STONE_STAIR = registerBlock("blood_sand_stone_stair",
            () -> new sandStoneStair(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> WHITE_SAND_STONE_STAIR = registerBlock("white_sand_stone_stair",
            () -> new sandStoneStair(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> ORANGE_SAND_STONE_STAIR = registerBlock("orange_sand_stone_stair",
            () -> new sandStoneStair(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> MAGENTA_SAND_STONE_STAIR = registerBlock("magenta_sand_stone_stair",
            () -> new sandStoneStair(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_SAND_STONE_STAIR = registerBlock("light_blue_sand_stone_stair",
            () -> new sandStoneStair(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> YELLOW_SAND_STONE_STAIR = registerBlock("yellow_sand_stone_stair",
            () -> new sandStoneStair(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIME_SAND_STONE_STAIR = registerBlock("lime_sand_stone_stair",
            () -> new sandStoneStair(LIME_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PINK_SAND_STONE_STAIR = registerBlock("pink_sand_stone_stair",
            () -> new sandStoneStair(PINK_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GRAY_SAND_STONE_STAIR = registerBlock("gray_sand_stone_stair",
            () -> new sandStoneStair(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_SAND_STONE_STAIR = registerBlock("light_gray_sand_stone_stair",
            () -> new sandStoneStair(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> CYAN_SAND_STONE_STAIR = registerBlock("cyan_sand_stone_stair",
            () -> new sandStoneStair(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PURPLE_SAND_STONE_STAIR = registerBlock("purple_sand_stone_stair",
            () -> new sandStoneStair(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLUE_SAND_STONE_STAIR = registerBlock("blue_sand_stone_stair",
            () -> new sandStoneStair(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GREEN_SAND_STONE_STAIR = registerBlock("green_sand_stone_stair",
            () -> new sandStoneStair(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BROWN_SAND_STONE_STAIR = registerBlock("brown_sand_stone_stair",
            () -> new sandStoneStair(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLACK_SAND_STONE_STAIR = registerBlock("black_sand_stone_stair",
            () -> new sandStoneStair(BLACK_SAND_STONE.get()));

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