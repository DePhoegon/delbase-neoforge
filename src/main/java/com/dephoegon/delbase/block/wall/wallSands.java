package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorShift.wall.sandWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.Delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

public class wallSands {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<WallBlock> OVERRIDE_SAND_WALL = registerBlock("sand_wall",
            () -> new sandWall(SAND));
    public static final DeferredBlock<WallBlock> OVERRIDE_RED_SAND_WALL = registerBlock("red_sand_wall",
            () -> new sandWall(RED_SAND));
    public static final DeferredBlock<WallBlock> BLOOD_SAND_WALL = registerBlock("blood_sand_wall",
            () -> new sandWall(BLOOD_SAND.get()));
    public static final DeferredBlock<WallBlock> WHITE_SAND_WALL = registerBlock("white_sand_wall",
            () -> new sandWall(WHITE_SAND.get()));
    public static final DeferredBlock<WallBlock> ORANGE_SAND_WALL = registerBlock("orange_sand_wall",
            () -> new sandWall(ORANGE_SAND.get()));
    public static final DeferredBlock<WallBlock> MAGENTA_SAND_WALL = registerBlock("magenta_sand_wall",
            () -> new sandWall(MAGENTA_SAND.get()));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_SAND_WALL = registerBlock("light_blue_sand_wall",
            () -> new sandWall(LIGHT_BLUE_SAND.get()));
    public static final DeferredBlock<WallBlock> YELLOW_SAND_WALL = registerBlock("yellow_sand_wall",
            () -> new sandWall(YELLOW_SAND.get()));
    public static final DeferredBlock<WallBlock> LIME_SAND_WALL = registerBlock("lime_sand_wall",
            () -> new sandWall(LIME_SAND.get()));
    public static final DeferredBlock<WallBlock> PINK_SAND_WALL = registerBlock("pink_sand_wall",
            () -> new sandWall(PINK_SAND.get()));
    public static final DeferredBlock<WallBlock> GRAY_SAND_WALL = registerBlock("gray_sand_wall",
            () -> new sandWall(GRAY_SAND.get()));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_SAND_WALL = registerBlock("light_gray_sand_wall",
            () -> new sandWall(LIGHT_GRAY_SAND.get()));
    public static final DeferredBlock<WallBlock> CYAN_SAND_WALL = registerBlock("cyan_sand_wall",
            () -> new sandWall(CYAN_SAND.get()));
    public static final DeferredBlock<WallBlock> PURPLE_SAND_WALL = registerBlock("purple_sand_wall",
            () -> new sandWall(PURPLE_SAND.get()));
    public static final DeferredBlock<WallBlock> BLUE_SAND_WALL = registerBlock("blue_sand_wall",
            () -> new sandWall(BLUE_SAND.get()));
    public static final DeferredBlock<WallBlock> GREEN_SAND_WALL = registerBlock("green_sand_wall",
            () -> new sandWall(GREEN_SAND.get()));
    public static final DeferredBlock<WallBlock> BROWN_SAND_WALL = registerBlock("brown_sand_wall",
            () -> new sandWall(BROWN_SAND.get()));
    public static final DeferredBlock<WallBlock> BLACK_SAND_WALL = registerBlock("black_sand_wall",
            () -> new sandWall(BLACK_SAND.get()));

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