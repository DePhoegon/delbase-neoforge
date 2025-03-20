package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.colorShift.gen.chiseledSandStone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.Delabse.MOD_ID;

public class genChiseledSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<Block> BLOOD_CHISELED_SAND_STONE = registerBlock("blood_chiseled_sand_stone",
            () -> new chiseledSandStone(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<Block> WHITE_CHISELED_SAND_STONE = registerBlock("white_chiseled_sand_stone",
            () -> new chiseledSandStone(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<Block> ORANGE_CHISELED_SAND_STONE = registerBlock("orange_chiseled_sand_stone",
            () -> new chiseledSandStone(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<Block> MAGENTA_CHISELED_SAND_STONE = registerBlock("magenta_chiseled_sand_stone",
            () -> new chiseledSandStone(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<Block> LIGHT_BLUE_CHISELED_SAND_STONE = registerBlock("light_blue_chiseled_sand_stone",
            () -> new chiseledSandStone(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<Block> YELLOW_CHISELED_SAND_STONE = registerBlock("yellow_chiseled_sand_stone",
            () -> new chiseledSandStone(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<Block> LIME_CHISELED_SAND_STONE = registerBlock("lime_chiseled_sand_stone",
            () -> new chiseledSandStone(LIME_SAND_STONE.get()));
    public static final DeferredBlock<Block> PINK_CHISELED_SAND_STONE = registerBlock("pink_chiseled_sand_stone",
            () -> new chiseledSandStone(PINK_SAND_STONE.get()));
    public static final DeferredBlock<Block> GRAY_CHISELED_SAND_STONE = registerBlock("gray_chiseled_sand_stone",
            () -> new chiseledSandStone(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<Block> LIGHT_GRAY_CHISELED_SAND_STONE = registerBlock("light_gray_chiseled_sand_stone",
            () -> new chiseledSandStone(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<Block> CYAN_CHISELED_SAND_STONE = registerBlock("cyan_chiseled_sand_stone",
            () -> new chiseledSandStone(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<Block> PURPLE_CHISELED_SAND_STONE = registerBlock("purple_chiseled_sand_stone",
            () -> new chiseledSandStone(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<Block> BLUE_CHISELED_SAND_STONE = registerBlock("blue_chiseled_sand_stone",
            () -> new chiseledSandStone(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<Block> GREEN_CHISELED_SAND_STONE = registerBlock("green_chiseled_sand_stone",
            () -> new chiseledSandStone(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<Block> BROWN_CHISELED_SAND_STONE = registerBlock("brown_chiseled_sand_stone",
            () -> new chiseledSandStone(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<Block> BLACK_CHISELED_SAND_STONE = registerBlock("black_chiseled_sand_stone",
            () -> new chiseledSandStone(BLACK_SAND_STONE.get()));

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