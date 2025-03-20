package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorShift.wall.terracottaWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.MOD_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class wallTerracotta {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<WallBlock> WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            () -> new terracottaWall(WHITE_TERRACOTTA));
    public static final DeferredBlock<WallBlock> ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            () -> new terracottaWall(ORANGE_TERRACOTTA));
    public static final DeferredBlock<WallBlock> MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            () -> new terracottaWall(MAGENTA_TERRACOTTA));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            () -> new terracottaWall(LIGHT_BLUE_TERRACOTTA));
    public static final DeferredBlock<WallBlock> YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            () -> new terracottaWall(YELLOW_TERRACOTTA));
    public static final DeferredBlock<WallBlock> LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            () -> new terracottaWall(LIME_TERRACOTTA));
    public static final DeferredBlock<WallBlock> PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            () -> new terracottaWall(PINK_TERRACOTTA));
    public static final DeferredBlock<WallBlock> GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            () -> new terracottaWall(GRAY_TERRACOTTA));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            () -> new terracottaWall(LIGHT_GRAY_TERRACOTTA));
    public static final DeferredBlock<WallBlock> CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            () -> new terracottaWall(CYAN_TERRACOTTA));
    public static final DeferredBlock<WallBlock> PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            () -> new terracottaWall(PURPLE_TERRACOTTA));
    public static final DeferredBlock<WallBlock> BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            () -> new terracottaWall(BLUE_TERRACOTTA));
    public static final DeferredBlock<WallBlock> BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            () -> new terracottaWall(BROWN_TERRACOTTA));
    public static final DeferredBlock<WallBlock> GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            () -> new terracottaWall(GREEN_TERRACOTTA));
    public static final DeferredBlock<WallBlock> RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            () -> new terracottaWall(RED_TERRACOTTA));
    public static final DeferredBlock<WallBlock> BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            () -> new terracottaWall(BLACK_TERRACOTTA));
    public static final DeferredBlock<WallBlock> TERRACOTTA_WALL = registerBlock("terracotta_wall",
            () -> new terracottaWall(TERRACOTTA));

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