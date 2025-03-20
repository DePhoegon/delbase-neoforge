package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorShift.wall.sandStoneWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.Delabse.MOD_ID;

public class wallSandStone {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<WallBlock> BLOOD_SAND_STONE_WALL = registerBlock("blood_sand_stone_wall",
            () -> new sandStoneWall(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> WHITE_SAND_STONE_WALL = registerBlock("white_sand_stone_wall",
            () -> new sandStoneWall(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> ORANGE_SAND_STONE_WALL = registerBlock("orange_sand_stone_wall",
            () -> new sandStoneWall(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> MAGENTA_SAND_STONE_WALL = registerBlock("magenta_sand_stone_wall",
            () -> new sandStoneWall(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_SAND_STONE_WALL = registerBlock("light_blue_sand_stone_wall",
            () -> new sandStoneWall(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> YELLOW_SAND_STONE_WALL = registerBlock("yellow_sand_stone_wall",
            () -> new sandStoneWall(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIME_SAND_STONE_WALL = registerBlock("lime_sand_stone_wall",
            () -> new sandStoneWall(LIME_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PINK_SAND_STONE_WALL = registerBlock("pink_sand_stone_wall",
            () -> new sandStoneWall(PINK_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GRAY_SAND_STONE_WALL = registerBlock("gray_sand_stone_wall",
            () -> new sandStoneWall(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_SAND_STONE_WALL = registerBlock("light_gray_sand_stone_wall",
            () -> new sandStoneWall(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> CYAN_SAND_STONE_WALL = registerBlock("cyan_sand_stone_wall",
            () -> new sandStoneWall(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PURPLE_SAND_STONE_WALL = registerBlock("purple_sand_stone_wall",
            () -> new sandStoneWall(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLUE_SAND_STONE_WALL = registerBlock("blue_sand_stone_wall",
            () -> new sandStoneWall(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GREEN_SAND_STONE_WALL = registerBlock("green_sand_stone_wall",
            () -> new sandStoneWall(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BROWN_SAND_STONE_WALL = registerBlock("brown_sand_stone_wall",
            () -> new sandStoneWall(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLACK_SAND_STONE_WALL = registerBlock("black_sand_stone_wall",
            () -> new sandStoneWall(BLACK_SAND_STONE.get()));

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