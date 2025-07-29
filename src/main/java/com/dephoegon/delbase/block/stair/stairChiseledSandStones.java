package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorShift.stair.chiseledSandStoneStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class stairChiseledSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<StairBlock> CHISELED_SAND_STONE_STAIR = registerBlock("chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(SANDSTONE));
    public static final DeferredBlock<StairBlock> RED_CHISELED_SAND_STONE_STAIR = registerBlock("red_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(RED_SANDSTONE));
    public static final DeferredBlock<StairBlock> BLOOD_CHISELED_SAND_STONE_STAIR = registerBlock("blood_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> WHITE_CHISELED_SAND_STONE_STAIR = registerBlock("white_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> ORANGE_CHISELED_SAND_STONE_STAIR = registerBlock("orange_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> MAGENTA_CHISELED_SAND_STONE_STAIR = registerBlock("magenta_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_CHISELED_SAND_STONE_STAIR = registerBlock("light_blue_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> YELLOW_CHISELED_SAND_STONE_STAIR = registerBlock("yellow_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIME_CHISELED_SAND_STONE_STAIR = registerBlock("lime_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(LIME_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PINK_CHISELED_SAND_STONE_STAIR = registerBlock("pink_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(PINK_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GRAY_CHISELED_SAND_STONE_STAIR = registerBlock("gray_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_CHISELED_SAND_STONE_STAIR = registerBlock("light_gray_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> CYAN_CHISELED_SAND_STONE_STAIR = registerBlock("cyan_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PURPLE_CHISELED_SAND_STONE_STAIR = registerBlock("purple_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLUE_CHISELED_SAND_STONE_STAIR = registerBlock("blue_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GREEN_CHISELED_SAND_STONE_STAIR = registerBlock("green_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BROWN_CHISELED_SAND_STONE_STAIR = registerBlock("brown_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLACK_CHISELED_SAND_STONE_STAIR = registerBlock("black_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(BLACK_SAND_STONE.get()));
    
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