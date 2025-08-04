package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorShift.wall.smoothSandStoneWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.Delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class wallSmoothSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<WallBlock> SMOOTH_SAND_STONE_WALL = registerBlock("smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(SANDSTONE));
    public static final DeferredBlock<WallBlock> RED_SMOOTH_SAND_STONE_WALL = registerBlock("red_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(RED_SANDSTONE));
    public static final DeferredBlock<WallBlock> BLOOD_SMOOTH_SAND_STONE_WALL = registerBlock("blood_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> WHITE_SMOOTH_SAND_STONE_WALL = registerBlock("white_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> ORANGE_SMOOTH_SAND_STONE_WALL = registerBlock("orange_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> MAGENTA_SMOOTH_SAND_STONE_WALL = registerBlock("magenta_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_WALL = registerBlock("light_blue_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> YELLOW_SMOOTH_SAND_STONE_WALL = registerBlock("yellow_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIME_SMOOTH_SAND_STONE_WALL = registerBlock("lime_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(LIME_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PINK_SMOOTH_SAND_STONE_WALL = registerBlock("pink_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(PINK_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GRAY_SMOOTH_SAND_STONE_WALL = registerBlock("gray_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_WALL = registerBlock("light_gray_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> CYAN_SMOOTH_SAND_STONE_WALL = registerBlock("cyan_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PURPLE_SMOOTH_SAND_STONE_WALL = registerBlock("purple_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLUE_SMOOTH_SAND_STONE_WALL = registerBlock("blue_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GREEN_SMOOTH_SAND_STONE_WALL = registerBlock("green_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BROWN_SMOOTH_SAND_STONE_WALL = registerBlock("brown_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLACK_SMOOTH_SAND_STONE_WALL = registerBlock("black_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BLACK_SAND_STONE.get()));

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