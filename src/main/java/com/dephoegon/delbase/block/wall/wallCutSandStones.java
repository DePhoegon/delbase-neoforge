package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorShift.wall.cutSandStoneWall;
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
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class wallCutSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<WallBlock> OVERRIDE_CUT_SAND_STONE_WALL = registerBlock("cut_sand_stone_wall",
            () -> new cutSandStoneWall(SANDSTONE));
    public static final DeferredBlock<WallBlock> OVERRIDE_RED_CUT_SAND_STONE_WALL = registerBlock("red_cut_sand_stone_wall",
            () -> new cutSandStoneWall(RED_SANDSTONE));
    public static final DeferredBlock<WallBlock> BLOOD_CUT_SAND_STONE_WALL = registerBlock("blood_cut_sand_stone_wall",
            () -> new cutSandStoneWall(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> WHITE_CUT_SAND_STONE_WALL = registerBlock("white_cut_sand_stone_wall",
            () -> new cutSandStoneWall(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> ORANGE_CUT_SAND_STONE_WALL = registerBlock("orange_cut_sand_stone_wall",
            () -> new cutSandStoneWall(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> MAGENTA_CUT_SAND_STONE_WALL = registerBlock("magenta_cut_sand_stone_wall",
            () -> new cutSandStoneWall(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_CUT_SAND_STONE_WALL = registerBlock("light_blue_cut_sand_stone_wall",
            () -> new cutSandStoneWall(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> YELLOW_CUT_SAND_STONE_WALL = registerBlock("yellow_cut_sand_stone_wall",
            () -> new cutSandStoneWall(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIME_CUT_SAND_STONE_WALL = registerBlock("lime_cut_sand_stone_wall",
            () -> new cutSandStoneWall(LIME_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PINK_CUT_SAND_STONE_WALL = registerBlock("pink_cut_sand_stone_wall",
            () -> new cutSandStoneWall(PINK_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GRAY_CUT_SAND_STONE_WALL = registerBlock("gray_cut_sand_stone_wall",
            () -> new cutSandStoneWall(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_CUT_SAND_STONE_WALL = registerBlock("light_gray_cut_sand_stone_wall",
            () -> new cutSandStoneWall(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> CYAN_CUT_SAND_STONE_WALL = registerBlock("cyan_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PURPLE_CUT_SAND_STONE_WALL = registerBlock("purple_cut_sand_stone_wall",
            () -> new cutSandStoneWall(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLUE_CUT_SAND_STONE_WALL = registerBlock("blue_cut_sand_stone_wall",
            () -> new cutSandStoneWall(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GREEN_CUT_SAND_STONE_WALL = registerBlock("green_cut_sand_stone_wall",
            () -> new cutSandStoneWall(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BROWN_CUT_SAND_STONE_WALL = registerBlock("brown_cut_sand_stone_wall",
            () -> new cutSandStoneWall(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLACK_CUT_SAND_STONE_WALL = registerBlock("black_cut_sand_stone_wall",
            () -> new cutSandStoneWall(BLACK_SAND_STONE.get()));

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