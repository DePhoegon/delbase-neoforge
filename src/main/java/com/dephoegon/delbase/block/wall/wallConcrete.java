package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.alt.concreteWall;
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

public class wallConcrete {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<WallBlock> RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            () -> new concreteWall(RED_CONCRETE));
    public static final DeferredBlock<WallBlock> WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            () -> new concreteWall(WHITE_CONCRETE));
    public static final DeferredBlock<WallBlock> ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            () -> new concreteWall(ORANGE_CONCRETE));
    public static final DeferredBlock<WallBlock> MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            () -> new concreteWall(MAGENTA_CONCRETE));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            () -> new concreteWall(LIGHT_BLUE_CONCRETE));
    public static final DeferredBlock<WallBlock> YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            () -> new concreteWall(YELLOW_CONCRETE));
    public static final DeferredBlock<WallBlock> LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            () -> new concreteWall(LIME_CONCRETE));
    public static final DeferredBlock<WallBlock> PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            () -> new concreteWall(PINK_CONCRETE));
    public static final DeferredBlock<WallBlock> GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            () -> new concreteWall(GRAY_CONCRETE));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            () -> new concreteWall(LIGHT_GRAY_CONCRETE));
    public static final DeferredBlock<WallBlock> CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            () -> new concreteWall(CYAN_CONCRETE));
    public static final DeferredBlock<WallBlock> PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            () -> new concreteWall(PURPLE_CONCRETE));
    public static final DeferredBlock<WallBlock> BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            () -> new concreteWall(BLUE_CONCRETE));
    public static final DeferredBlock<WallBlock> GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            () -> new concreteWall(GREEN_CONCRETE));
    public static final DeferredBlock<WallBlock> BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            () -> new concreteWall(BROWN_CONCRETE));
    public static final DeferredBlock<WallBlock> BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            () -> new concreteWall(BLACK_CONCRETE));

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