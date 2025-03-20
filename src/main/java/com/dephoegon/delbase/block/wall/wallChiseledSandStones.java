package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorShift.wall.chiseledSandStoneWall;
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

public class wallChiseledSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<WallBlock> OVERRIDE_CHISELED_SAND_STONE_WALL = registerBlock("chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(SANDSTONE));
    public static final DeferredBlock<WallBlock> OVERRIDE_RED_CHISELED_SAND_STONE_WALL = registerBlock("red_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(RED_SANDSTONE));
    public static final DeferredBlock<WallBlock> BLOOD_CHISELED_SAND_STONE_WALL = registerBlock("blood_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> WHITE_CHISELED_SAND_STONE_WALL = registerBlock("white_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> ORANGE_CHISELED_SAND_STONE_WALL = registerBlock("orange_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> MAGENTA_CHISELED_SAND_STONE_WALL = registerBlock("magenta_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_CHISELED_SAND_STONE_WALL = registerBlock("light_blue_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> YELLOW_CHISELED_SAND_STONE_WALL = registerBlock("yellow_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIME_CHISELED_SAND_STONE_WALL = registerBlock("lime_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(LIME_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PINK_CHISELED_SAND_STONE_WALL = registerBlock("pink_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(PINK_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GRAY_CHISELED_SAND_STONE_WALL = registerBlock("gray_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_CHISELED_SAND_STONE_WALL = registerBlock("light_gray_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> CYAN_CHISELED_SAND_STONE_WALL = registerBlock("cyan_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PURPLE_CHISELED_SAND_STONE_WALL = registerBlock("purple_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLUE_CHISELED_SAND_STONE_WALL = registerBlock("blue_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GREEN_CHISELED_SAND_STONE_WALL = registerBlock("green_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BROWN_CHISELED_SAND_STONE_WALL = registerBlock("brown_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLACK_CHISELED_SAND_STONE_WALL = registerBlock("black_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BLACK_SAND_STONE.get()));

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