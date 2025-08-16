package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorShift.fence.smoothSandStoneFence;
import com.dephoegon.delbase.aid.block.colorShift.fence.smoothSandStoneFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static com.dephoegon.delbase.block.general.genSmoothSandStones.*;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class fenceSmoothSandStone {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<FenceBlock> WHITE_SMOOTH_SAND_STONE_FENCE = registerBlock("white_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(WHITE_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> WHITE_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("white_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(WHITE_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> ORANGE_SMOOTH_SAND_STONE_FENCE = registerBlock("orange_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(ORANGE_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> ORANGE_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("orange_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(ORANGE_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> MAGENTA_SMOOTH_SAND_STONE_FENCE = registerBlock("magenta_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(MAGENTA_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("magenta_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(MAGENTA_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_FENCE = registerBlock("light_blue_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(LIGHT_BLUE_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("light_blue_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(LIGHT_BLUE_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> YELLOW_SMOOTH_SAND_STONE_FENCE = registerBlock("yellow_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(YELLOW_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> YELLOW_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("yellow_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(YELLOW_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIME_SMOOTH_SAND_STONE_FENCE = registerBlock("lime_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(LIME_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIME_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("lime_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(LIME_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PINK_SMOOTH_SAND_STONE_FENCE = registerBlock("pink_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(PINK_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PINK_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("pink_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(PINK_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GRAY_SMOOTH_SAND_STONE_FENCE = registerBlock("gray_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(GRAY_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GRAY_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("gray_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(GRAY_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_FENCE = registerBlock("light_gray_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(LIGHT_GRAY_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("light_gray_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(LIGHT_GRAY_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> CYAN_SMOOTH_SAND_STONE_FENCE = registerBlock("cyan_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(CYAN_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> CYAN_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("cyan_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(CYAN_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PURPLE_SMOOTH_SAND_STONE_FENCE = registerBlock("purple_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(PURPLE_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PURPLE_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("purple_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(PURPLE_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BLUE_SMOOTH_SAND_STONE_FENCE = registerBlock("blue_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(BLUE_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLUE_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("blue_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(BLUE_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BROWN_SMOOTH_SAND_STONE_FENCE = registerBlock("brown_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(BROWN_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BROWN_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("brown_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(BROWN_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GREEN_SMOOTH_SAND_STONE_FENCE = registerBlock("green_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(GREEN_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GREEN_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("green_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(GREEN_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> RED_SMOOTH_SAND_STONE_FENCE = registerBlock("red_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(RED_SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> RED_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("red_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(RED_SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLACK_SMOOTH_SAND_STONE_FENCE = registerBlock("black_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(BLACK_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLACK_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("black_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(BLACK_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> SMOOTH_SAND_STONE_FENCE = registerBlock("smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLOOD_SMOOTH_SAND_STONE_FENCE = registerBlock("blood_smooth_sand_stone_fence",
            () -> new smoothSandStoneFence(BLOOD_SMOOTH_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLOOD_SMOOTH_SAND_STONE_FENCE_GATE = registerBlock("blood_smooth_sand_stone_fence_gate",
            () -> new smoothSandStoneFenceGate(BLOOD_SMOOTH_SAND_STONE.get()));
    
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
