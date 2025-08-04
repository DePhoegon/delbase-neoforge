package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorShift.stair.cutSandStoneStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.Delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class stairCutSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<StairBlock> CUT_SAND_STONE_STAIR = registerBlock("cut_sand_stone_stair",
            () -> new cutSandStoneStair(SANDSTONE));
    public static final DeferredBlock<StairBlock> RED_CUT_SAND_STONE_STAIR = registerBlock("red_cut_sand_stone_stair",
            () -> new cutSandStoneStair(RED_SANDSTONE));
    public static final DeferredBlock<StairBlock> BLOOD_CUT_SAND_STONE_STAIR = registerBlock("blood_cut_sand_stone_stair",
            () -> new cutSandStoneStair(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> WHITE_CUT_SAND_STONE_STAIR = registerBlock("white_cut_sand_stone_stair",
            () -> new cutSandStoneStair(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> ORANGE_CUT_SAND_STONE_STAIR = registerBlock("orange_cut_sand_stone_stair",
            () -> new cutSandStoneStair(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> MAGENTA_CUT_SAND_STONE_STAIR = registerBlock("magenta_cut_sand_stone_stair",
            () -> new cutSandStoneStair(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_CUT_SAND_STONE_STAIR = registerBlock("light_blue_cut_sand_stone_stair",
            () -> new cutSandStoneStair(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> YELLOW_CUT_SAND_STONE_STAIR = registerBlock("yellow_cut_sand_stone_stair",
            () -> new cutSandStoneStair(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIME_CUT_SAND_STONE_STAIR = registerBlock("lime_cut_sand_stone_stair",
            () -> new cutSandStoneStair(LIME_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PINK_CUT_SAND_STONE_STAIR = registerBlock("pink_cut_sand_stone_stair",
            () -> new cutSandStoneStair(PINK_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GRAY_CUT_SAND_STONE_STAIR = registerBlock("gray_cut_sand_stone_stair",
            () -> new cutSandStoneStair(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_CUT_SAND_STONE_STAIR = registerBlock("light_gray_cut_sand_stone_stair",
            () -> new cutSandStoneStair(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> CYAN_CUT_SAND_STONE_STAIR = registerBlock("cyan_cut_sand_stone_stair",
            () -> new cutSandStoneStair(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PURPLE_CUT_SAND_STONE_STAIR = registerBlock("purple_cut_sand_stone_stair",
            () -> new cutSandStoneStair(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLUE_CUT_SAND_STONE_STAIR = registerBlock("blue_cut_sand_stone_stair",
            () -> new cutSandStoneStair(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GREEN_CUT_SAND_STONE_STAIR = registerBlock("green_cut_sand_stone_stair",
            () -> new cutSandStoneStair(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BROWN_CUT_SAND_STONE_STAIR = registerBlock("brown_cut_sand_stone_stair",
            () -> new cutSandStoneStair(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLACK_CUT_SAND_STONE_STAIR = registerBlock("black_cut_sand_stone_stair",
            () -> new cutSandStoneStair(BLACK_SAND_STONE.get()));
    
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