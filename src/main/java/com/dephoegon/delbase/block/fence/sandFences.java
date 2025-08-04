package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorShift.fence.sandFence;
import com.dephoegon.delbase.aid.block.colorShift.fence.sandFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.Delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

public class sandFences {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<FenceBlock> WHITE_SAND_FENCE = registerBlock("white_sand_fence",
            () -> new sandFence(WHITE_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> WHITE_SAND_FENCE_GATE = registerBlock("white_sand_fence_gate",
            () -> new sandFenceGate(WHITE_SAND.get()));
    public static final DeferredBlock<FenceBlock> ORANGE_SAND_FENCE = registerBlock("orange_sand_fence",
            () -> new sandFence(ORANGE_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> ORANGE_SAND_FENCE_GATE = registerBlock("orange_sand_fence_gate",
            () -> new sandFenceGate(ORANGE_SAND.get()));
    public static final DeferredBlock<FenceBlock> MAGENTA_SAND_FENCE = registerBlock("magenta_sand_fence",
            () -> new sandFence(MAGENTA_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_SAND_FENCE_GATE = registerBlock("magenta_sand_fence_gate",
            () -> new sandFenceGate(MAGENTA_SAND.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_SAND_FENCE = registerBlock("light_blue_sand_fence",
            () -> new sandFence(LIGHT_BLUE_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_SAND_FENCE_GATE = registerBlock("light_blue_sand_fence_gate",
            () -> new sandFenceGate(LIGHT_BLUE_SAND.get()));
    public static final DeferredBlock<FenceBlock> YELLOW_SAND_FENCE = registerBlock("yellow_sand_fence",
            () -> new sandFence(YELLOW_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> YELLOW_SAND_FENCE_GATE = registerBlock("yellow_sand_fence_gate",
            () -> new sandFenceGate(YELLOW_SAND.get()));
    public static final DeferredBlock<FenceBlock> LIME_SAND_FENCE = registerBlock("lime_sand_fence",
            () -> new sandFence(LIME_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> LIME_SAND_FENCE_GATE = registerBlock("lime_sand_fence_gate",
            () -> new sandFenceGate(LIME_SAND.get()));
    public static final DeferredBlock<FenceBlock> PINK_SAND_FENCE = registerBlock("pink_sand_fence",
            () -> new sandFence(PINK_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> PINK_SAND_FENCE_GATE = registerBlock("pink_sand_fence_gate",
            () -> new sandFenceGate(PINK_SAND.get()));
    public static final DeferredBlock<FenceBlock> GRAY_SAND_FENCE = registerBlock("gray_sand_fence",
            () -> new sandFence(GRAY_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> GRAY_SAND_FENCE_GATE = registerBlock("gray_sand_fence_gate",
            () -> new sandFenceGate(GRAY_SAND.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_SAND_FENCE = registerBlock("light_gray_sand_fence",
            () -> new sandFence(LIGHT_GRAY_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_SAND_FENCE_GATE = registerBlock("light_gray_sand_fence_gate",
            () -> new sandFenceGate(LIGHT_GRAY_SAND.get()));
    public static final DeferredBlock<FenceBlock> CYAN_SAND_FENCE = registerBlock("cyan_sand_fence",
            () -> new sandFence(CYAN_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> CYAN_SAND_FENCE_GATE = registerBlock("cyan_sand_fence_gate",
            () -> new sandFenceGate(CYAN_SAND.get()));
    public static final DeferredBlock<FenceBlock> PURPLE_SAND_FENCE = registerBlock("purple_sand_fence",
            () -> new sandFence(PURPLE_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> PURPLE_SAND_FENCE_GATE = registerBlock("purple_sand_fence_gate",
            () -> new sandFenceGate(PURPLE_SAND.get()));
    public static final DeferredBlock<FenceBlock> BLUE_SAND_FENCE = registerBlock("blue_sand_fence",
            () -> new sandFence(BLUE_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> BLUE_SAND_FENCE_GATE = registerBlock("blue_sand_fence_gate",
            () -> new sandFenceGate(BLUE_SAND.get()));
    public static final DeferredBlock<FenceBlock> BROWN_SAND_FENCE = registerBlock("brown_sand_fence",
            () -> new sandFence(BROWN_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> BROWN_SAND_FENCE_GATE = registerBlock("brown_sand_fence_gate",
            () -> new sandFenceGate(BROWN_SAND.get()));
    public static final DeferredBlock<FenceBlock> GREEN_SAND_FENCE = registerBlock("green_sand_fence",
            () -> new sandFence(GREEN_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> GREEN_SAND_FENCE_GATE = registerBlock("green_sand_fence_gate",
            () -> new sandFenceGate(GREEN_SAND.get()));
    public static final DeferredBlock<FenceBlock> RED_SAND_FENCE = registerBlock("red_sand_fence",
            () -> new sandFence(RED_SAND));
    public static final DeferredBlock<FenceGateBlock> RED_SAND_FENCE_GATE = registerBlock("red_sand_fence_gate",
            () -> new sandFenceGate(RED_SAND));
    public static final DeferredBlock<FenceBlock> BLACK_SAND_FENCE = registerBlock("black_sand_fence",
            () -> new sandFence(BLACK_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> BLACK_SAND_FENCE_GATE = registerBlock("black_sand_fence_gate",
            () -> new sandFenceGate(BLACK_SAND.get()));
    public static final DeferredBlock<FenceBlock> SAND_FENCE = registerBlock("sand_fence",
            () -> new sandFence(SAND));
    public static final DeferredBlock<FenceGateBlock> SAND_FENCE_GATE = registerBlock("sand_fence_gate",
            () -> new sandFenceGate(SAND));
    public static final DeferredBlock<FenceBlock> BLOOD_SAND_FENCE = registerBlock("blood_sand_fence",
            () -> new sandFence(BLOOD_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> BLOOD_SAND_FENCE_GATE = registerBlock("blood_sand_fence_gate",
            () -> new sandFenceGate(BLOOD_SAND.get()));


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