package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.colorShift.gen.normSandStone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.MOD_ID;
import static com.dephoegon.delbase.Delabse.MOD_ID;

public class genSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    public static final DeferredBlock<Block> BLOOD_SAND_STONE = registerBlock("blood_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_RED));
    public static final DeferredBlock<Block> WHITE_SAND_STONE = registerBlock("white_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_WHITE));
    public static final DeferredBlock<Block> ORANGE_SAND_STONE = registerBlock("orange_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_ORANGE));
    public static final DeferredBlock<Block> MAGENTA_SAND_STONE = registerBlock("magenta_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_MAGENTA));
    public static final DeferredBlock<Block> LIGHT_BLUE_SAND_STONE = registerBlock("light_blue_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_LIGHT_BLUE));
    public static final DeferredBlock<Block> YELLOW_SAND_STONE = registerBlock("yellow_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_YELLOW));
    public static final DeferredBlock<Block> LIME_SAND_STONE = registerBlock("lime_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_LIGHT_GREEN));
    public static final DeferredBlock<Block> PINK_SAND_STONE = registerBlock("pink_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_PINK));
    public static final DeferredBlock<Block> GRAY_SAND_STONE = registerBlock("gray_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_GRAY));
    public static final DeferredBlock<Block> LIGHT_GRAY_SAND_STONE = registerBlock("light_gray_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_LIGHT_GRAY));
    public static final DeferredBlock<Block> CYAN_SAND_STONE = registerBlock("cyan_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_CYAN));
    public static final DeferredBlock<Block> PURPLE_SAND_STONE = registerBlock("purple_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_PURPLE));
    public static final DeferredBlock<Block> BLUE_SAND_STONE = registerBlock("blue_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_BLUE));
    public static final DeferredBlock<Block> GREEN_SAND_STONE = registerBlock("green_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_GREEN));
    public static final DeferredBlock<Block> BROWN_SAND_STONE = registerBlock("brown_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_BROWN));
    public static final DeferredBlock<Block> BLACK_SAND_STONE = registerBlock("black_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_BLACK));
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