package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorShift.fence.concreteFence;
import com.dephoegon.delbase.aid.block.colorShift.fence.concreteFenceGate;
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
import static net.minecraft.world.level.block.Blocks.*;

public class fenceConcrete {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<FenceBlock> WHITE_CONCRETE_FENCE = registerBlock("white_concrete_fence",
            () -> new concreteFence(WHITE_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> WHITE_CONCRETE_FENCE_GATE = registerBlock("white_concrete_fence_gate",
            () -> new concreteFenceGate(WHITE_CONCRETE));
    public static final DeferredBlock<FenceBlock> ORANGE_CONCRETE_FENCE = registerBlock("orange_concrete_fence",
            () -> new concreteFence(ORANGE_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> ORANGE_CONCRETE_FENCE_GATE = registerBlock("orange_concrete_fence_gate",
            () -> new concreteFenceGate(ORANGE_CONCRETE));
    public static final DeferredBlock<FenceBlock> MAGENTA_CONCRETE_FENCE = registerBlock("magenta_concrete_fence",
            () -> new concreteFence(MAGENTA_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_CONCRETE_FENCE_GATE = registerBlock("magenta_concrete_fence_gate",
            () -> new concreteFenceGate(MAGENTA_CONCRETE));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_CONCRETE_FENCE = registerBlock("light_blue_concrete_fence",
            () -> new concreteFence(LIGHT_BLUE_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_CONCRETE_FENCE_GATE = registerBlock("light_blue_concrete_fence_gate",
            () -> new concreteFenceGate(LIGHT_BLUE_CONCRETE));
    public static final DeferredBlock<FenceBlock> YELLOW_CONCRETE_FENCE = registerBlock("yellow_concrete_fence",
            () -> new concreteFence(YELLOW_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> YELLOW_CONCRETE_FENCE_GATE = registerBlock("yellow_concrete_fence_gate",
            () -> new concreteFenceGate(YELLOW_CONCRETE));
    public static final DeferredBlock<FenceBlock> LIME_CONCRETE_FENCE = registerBlock("lime_concrete_fence",
            () -> new concreteFence(LIME_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> LIME_CONCRETE_FENCE_GATE = registerBlock("lime_concrete_fence_gate",
            () -> new concreteFenceGate(LIME_CONCRETE));
    public static final DeferredBlock<FenceBlock> PINK_CONCRETE_FENCE = registerBlock("pink_concrete_fence",
            () -> new concreteFence(PINK_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> PINK_CONCRETE_FENCE_GATE = registerBlock("pink_concrete_fence_gate",
            () -> new concreteFenceGate(PINK_CONCRETE));
    public static final DeferredBlock<FenceBlock> GRAY_CONCRETE_FENCE = registerBlock("gray_concrete_fence",
            () -> new concreteFence(GRAY_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> GRAY_CONCRETE_FENCE_GATE = registerBlock("gray_concrete_fence_gate",
            () -> new concreteFenceGate(GRAY_CONCRETE));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_CONCRETE_FENCE = registerBlock("light_gray_concrete_fence",
            () -> new concreteFence(LIGHT_GRAY_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_CONCRETE_FENCE_GATE = registerBlock("light_gray_concrete_fence_gate",
            () -> new concreteFenceGate(LIGHT_GRAY_CONCRETE));
    public static final DeferredBlock<FenceBlock> CYAN_CONCRETE_FENCE = registerBlock("cyan_concrete_fence",
            () -> new concreteFence(CYAN_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> CYAN_CONCRETE_FENCE_GATE = registerBlock("cyan_concrete_fence_gate",
            () -> new concreteFenceGate(CYAN_CONCRETE));
    public static final DeferredBlock<FenceBlock> PURPLE_CONCRETE_FENCE = registerBlock("purple_concrete_fence",
            () -> new concreteFence(PURPLE_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> PURPLE_CONCRETE_FENCE_GATE = registerBlock("purple_concrete_fence_gate",
            () -> new concreteFenceGate(PURPLE_CONCRETE));
    public static final DeferredBlock<FenceBlock> BLUE_CONCRETE_FENCE = registerBlock("blue_concrete_fence",
            () -> new concreteFence(BLUE_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> BLUE_CONCRETE_FENCE_GATE = registerBlock("blue_concrete_fence_gate",
            () -> new concreteFenceGate(BLUE_CONCRETE));
    public static final DeferredBlock<FenceBlock> BROWN_CONCRETE_FENCE = registerBlock("brown_concrete_fence",
            () -> new concreteFence(BROWN_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> BROWN_CONCRETE_FENCE_GATE = registerBlock("brown_concrete_fence_gate",
            () -> new concreteFenceGate(BROWN_CONCRETE));
    public static final DeferredBlock<FenceBlock> GREEN_CONCRETE_FENCE = registerBlock("green_concrete_fence",
            () -> new concreteFence(GREEN_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> GREEN_CONCRETE_FENCE_GATE = registerBlock("green_concrete_fence_gate",
            () -> new concreteFenceGate(GREEN_CONCRETE));
    public static final DeferredBlock<FenceBlock> RED_CONCRETE_FENCE = registerBlock("red_concrete_fence",
            () -> new concreteFence(RED_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> RED_CONCRETE_FENCE_GATE = registerBlock("red_concrete_fence_gate",
            () -> new concreteFenceGate(RED_CONCRETE));
    public static final DeferredBlock<FenceBlock> BLACK_CONCRETE_FENCE = registerBlock("black_concrete_fence",
            () -> new concreteFence(BLACK_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> BLACK_CONCRETE_FENCE_GATE = registerBlock("black_concrete_fence_gate",
            () -> new concreteFenceGate(BLACK_CONCRETE));

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