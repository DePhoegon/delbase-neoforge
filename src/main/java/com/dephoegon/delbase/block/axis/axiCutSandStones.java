package com.dephoegon.delbase.block.axis;

import com.dephoegon.delbase.aid.block.colorShift.axis.cutSandStone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static com.dephoegon.delbase.block.general.genSandStones.*;

public class axiCutSandStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<RotatedPillarBlock> BLOOD_CUT_SAND_STONE = registerBlock("blood_cut_sand_stone",
            () -> new cutSandStone(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> WHITE_CUT_SAND_STONE = registerBlock("white_cut_sand_stone",
            () -> new cutSandStone(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> ORANGE_CUT_SAND_STONE = registerBlock("orange_cut_sand_stone",
            () -> new cutSandStone(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> MAGENTA_CUT_SAND_STONE = registerBlock("magenta_cut_sand_stone",
            () -> new cutSandStone(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> LIGHT_BLUE_CUT_SAND_STONE = registerBlock("light_blue_cut_sand_stone",
            () -> new cutSandStone(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> YELLOW_CUT_SAND_STONE = registerBlock("yellow_cut_sand_stone",
            () -> new cutSandStone(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> LIME_CUT_SAND_STONE = registerBlock("lime_cut_sand_stone",
            () -> new cutSandStone(LIME_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> PINK_CUT_SAND_STONE = registerBlock("pink_cut_sand_stone",
            () -> new cutSandStone(PINK_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> GRAY_CUT_SAND_STONE = registerBlock("gray_cut_sand_stone",
            () -> new cutSandStone(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> LIGHT_GRAY_CUT_SAND_STONE = registerBlock("light_gray_cut_sand_stone",
            () -> new cutSandStone(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> CYAN_CUT_SAND_STONE = registerBlock("cyan_cut_sand_stone",
            () -> new cutSandStone(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> PURPLE_CUT_SAND_STONE = registerBlock("purple_cut_sand_stone",
            () -> new cutSandStone(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> BLUE_CUT_SAND_STONE = registerBlock("blue_cut_sand_stone",
            () -> new cutSandStone(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> GREEN_CUT_SAND_STONE = registerBlock("green_cut_sand_stone",
            () -> new cutSandStone(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> BROWN_CUT_SAND_STONE = registerBlock("brown_cut_sand_stone",
            () -> new cutSandStone(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<RotatedPillarBlock> BLACK_CUT_SAND_STONE = registerBlock("black_cut_sand_stone",
            () -> new cutSandStone(BLACK_SAND_STONE.get()));

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