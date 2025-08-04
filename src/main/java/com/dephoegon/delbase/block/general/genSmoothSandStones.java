package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.colorShift.gen.smoothSandStone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.Delbase.Mod_ID;

public class genSmoothSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<Block> BLOOD_SMOOTH_SAND_STONE = registerBlock("blood_smooth_sand_stone",
            () -> new smoothSandStone(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<Block> WHITE_SMOOTH_SAND_STONE = registerBlock("white_smooth_sand_stone",
            () -> new smoothSandStone(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<Block> ORANGE_SMOOTH_SAND_STONE = registerBlock("orange_smooth_sand_stone",
            () -> new smoothSandStone(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<Block> MAGENTA_SMOOTH_SAND_STONE = registerBlock("magenta_smooth_sand_stone",
            () -> new smoothSandStone(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<Block> LIGHT_BLUE_SMOOTH_SAND_STONE = registerBlock("light_blue_smooth_sand_stone",
            () -> new smoothSandStone(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<Block> YELLOW_SMOOTH_SAND_STONE = registerBlock("yellow_smooth_sand_stone",
            () -> new smoothSandStone(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<Block> LIME_SMOOTH_SAND_STONE = registerBlock("lime_smooth_sand_stone",
            () -> new smoothSandStone(LIME_SAND_STONE.get()));
    public static final DeferredBlock<Block> PINK_SMOOTH_SAND_STONE = registerBlock("pink_smooth_sand_stone",
            () -> new smoothSandStone(PINK_SAND_STONE.get()));
    public static final DeferredBlock<Block> GRAY_SMOOTH_SAND_STONE = registerBlock("gray_smooth_sand_stone",
            () -> new smoothSandStone(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<Block> LIGHT_GRAY_SMOOTH_SAND_STONE = registerBlock("light_gray_smooth_sand_stone",
            () -> new smoothSandStone(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<Block> CYAN_SMOOTH_SAND_STONE = registerBlock("cyan_smooth_sand_stone",
            () -> new smoothSandStone(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<Block> PURPLE_SMOOTH_SAND_STONE = registerBlock("purple_smooth_sand_stone",
            () -> new smoothSandStone(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<Block> BLUE_SMOOTH_SAND_STONE = registerBlock("blue_smooth_sand_stone",
            () -> new smoothSandStone(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<Block> GREEN_SMOOTH_SAND_STONE = registerBlock("green_smooth_sand_stone",
            () -> new smoothSandStone(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<Block> BROWN_SMOOTH_SAND_STONE = registerBlock("brown_smooth_sand_stone",
            () -> new smoothSandStone(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<Block> BLACK_SMOOTH_SAND_STONE = registerBlock("black_smooth_sand_stone",
            () -> new smoothSandStone(BLACK_SAND_STONE.get()));

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