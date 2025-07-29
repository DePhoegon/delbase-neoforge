package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorShift.fence.cutSandStoneFence;
import com.dephoegon.delbase.aid.block.colorShift.fence.cutSandStoneFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.CUT_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;

public class cutSandStoneFences {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<FenceBlock> WHITE_CUT_SAND_STONE_FENCE = registerBlock("white_cut_sand_stone_fence",
            () -> new cutSandStoneFence(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> WHITE_CUT_SAND_STONE_FENCE_GATE = registerBlock("white_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> ORANGE_CUT_SAND_STONE_FENCE = registerBlock("orange_cut_sand_stone_fence",
            () -> new cutSandStoneFence(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> ORANGE_CUT_SAND_STONE_FENCE_GATE = registerBlock("orange_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> MAGENTA_CUT_SAND_STONE_FENCE = registerBlock("magenta_cut_sand_stone_fence",
            () -> new cutSandStoneFence(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_CUT_SAND_STONE_FENCE_GATE = registerBlock("magenta_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_CUT_SAND_STONE_FENCE = registerBlock("light_blue_cut_sand_stone_fence",
            () -> new cutSandStoneFence(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_CUT_SAND_STONE_FENCE_GATE = registerBlock("light_blue_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> YELLOW_CUT_SAND_STONE_FENCE = registerBlock("yellow_cut_sand_stone_fence",
            () -> new cutSandStoneFence(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> YELLOW_CUT_SAND_STONE_FENCE_GATE = registerBlock("yellow_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIME_CUT_SAND_STONE_FENCE = registerBlock("lime_cut_sand_stone_fence",
            () -> new cutSandStoneFence(LIME_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIME_CUT_SAND_STONE_FENCE_GATE = registerBlock("lime_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(LIME_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PINK_CUT_SAND_STONE_FENCE = registerBlock("pink_cut_sand_stone_fence",
            () -> new cutSandStoneFence(PINK_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PINK_CUT_SAND_STONE_FENCE_GATE = registerBlock("pink_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(PINK_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GRAY_CUT_SAND_STONE_FENCE = registerBlock("gray_cut_sand_stone_fence",
            () -> new cutSandStoneFence(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GRAY_CUT_SAND_STONE_FENCE_GATE = registerBlock("gray_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_CUT_SAND_STONE_FENCE = registerBlock("light_gray_cut_sand_stone_fence",
            () -> new cutSandStoneFence(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_CUT_SAND_STONE_FENCE_GATE = registerBlock("light_gray_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> CYAN_CUT_SAND_STONE_FENCE = registerBlock("cyan_cut_sand_stone_fence",
            () -> new cutSandStoneFence(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> CYAN_CUT_SAND_STONE_FENCE_GATE = registerBlock("cyan_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PURPLE_CUT_SAND_STONE_FENCE = registerBlock("purple_cut_sand_stone_fence",
            () -> new cutSandStoneFence(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PURPLE_CUT_SAND_STONE_FENCE_GATE = registerBlock("purple_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BLUE_CUT_SAND_STONE_FENCE = registerBlock("blue_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLUE_CUT_SAND_STONE_FENCE_GATE = registerBlock("blue_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BROWN_CUT_SAND_STONE_FENCE = registerBlock("brown_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BROWN_CUT_SAND_STONE_FENCE_GATE = registerBlock("brown_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GREEN_CUT_SAND_STONE_FENCE = registerBlock("green_cut_sand_stone_fence",
            () -> new cutSandStoneFence(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GREEN_CUT_SAND_STONE_FENCE_GATE = registerBlock("green_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> RED_CUT_SAND_STONE_FENCE = registerBlock("red_cut_sand_stone_fence",
            () -> new cutSandStoneFence(RED_SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> RED_CUT_SAND_STONE_FENCE_GATE = registerBlock("red_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(RED_SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLACK_CUT_SAND_STONE_FENCE = registerBlock("black_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BLACK_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLACK_CUT_SAND_STONE_FENCE_GATE = registerBlock("black_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BLACK_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> CUT_SAND_STONE_FENCE = registerBlock("cut_sand_stone_fence",
            () -> new cutSandStoneFence(CUT_SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> CUT_SAND_STONE_FENCE_GATE = registerBlock("cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(CUT_SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLOOD_CUT_SAND_STONE_FENCE = registerBlock("blood_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLOOD_CUT_SAND_STONE_FENCE_GATE = registerBlock("blood_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BLOOD_SAND_STONE.get()));

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
