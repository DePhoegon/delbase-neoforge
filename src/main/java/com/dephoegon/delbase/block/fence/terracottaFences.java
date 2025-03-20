package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorShift.fence.terracottaFence;
import com.dephoegon.delbase.aid.block.colorShift.fence.terracottaFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.MOD_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class terracottaFences {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<FenceBlock> WHITE_TERRACOTTA_FENCE = registerBlock("white_terracotta_fence",
            () -> new terracottaFence(WHITE_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> WHITE_TERRACOTTA_FENCE_GATE = registerBlock("white_terracotta_fence_gate",
            () -> new terracottaFenceGate(WHITE_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> ORANGE_TERRACOTTA_FENCE = registerBlock("orange_terracotta_fence",
            () -> new terracottaFence(ORANGE_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> ORANGE_TERRACOTTA_FENCE_GATE = registerBlock("orange_terracotta_fence_gate",
            () -> new terracottaFenceGate(ORANGE_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> MAGENTA_TERRACOTTA_FENCE = registerBlock("magenta_terracotta_fence",
            () -> new terracottaFence(MAGENTA_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_TERRACOTTA_FENCE_GATE = registerBlock("magenta_terracotta_fence_gate",
            () -> new terracottaFenceGate(MAGENTA_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_TERRACOTTA_FENCE = registerBlock("light_blue_terracotta_fence",
            () -> new terracottaFence(LIGHT_BLUE_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_TERRACOTTA_FENCE_GATE = registerBlock("light_blue_terracotta_fence_gate",
            () -> new terracottaFenceGate(LIGHT_BLUE_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> YELLOW_TERRACOTTA_FENCE = registerBlock("yellow_terracotta_fence",
            () -> new terracottaFence(YELLOW_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> YELLOW_TERRACOTTA_FENCE_GATE = registerBlock("yellow_terracotta_fence_gate",
            () -> new terracottaFenceGate(YELLOW_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> LIME_TERRACOTTA_FENCE = registerBlock("lime_terracotta_fence",
            () -> new terracottaFence(LIME_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> LIME_TERRACOTTA_FENCE_GATE = registerBlock("lime_terracotta_fence_gate",
            () -> new terracottaFenceGate(LIME_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> PINK_TERRACOTTA_FENCE = registerBlock("pink_terracotta_fence",
            () -> new terracottaFence(PINK_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> PINK_TERRACOTTA_FENCE_GATE = registerBlock("pink_terracotta_fence_gate",
            () -> new terracottaFenceGate(PINK_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> GRAY_TERRACOTTA_FENCE = registerBlock("gray_terracotta_fence",
            () -> new terracottaFence(GRAY_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> GRAY_TERRACOTTA_FENCE_GATE = registerBlock("gray_terracotta_fence_gate",
            () -> new terracottaFenceGate(GRAY_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_TERRACOTTA_FENCE = registerBlock("light_gray_terracotta_fence",
            () -> new terracottaFence(LIGHT_GRAY_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_TERRACOTTA_FENCE_GATE = registerBlock("light_gray_terracotta_fence_gate",
            () -> new terracottaFenceGate(LIGHT_GRAY_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> CYAN_TERRACOTTA_FENCE = registerBlock("cyan_terracotta_fence",
            () -> new terracottaFence(CYAN_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> CYAN_TERRACOTTA_FENCE_GATE = registerBlock("cyan_terracotta_fence_gate",
            () -> new terracottaFenceGate(CYAN_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> PURPLE_TERRACOTTA_FENCE = registerBlock("purple_terracotta_fence",
            () -> new terracottaFence(PURPLE_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> PURPLE_TERRACOTTA_FENCE_GATE = registerBlock("purple_terracotta_fence_gate",
            () -> new terracottaFenceGate(PURPLE_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> BLUE_TERRACOTTA_FENCE = registerBlock("blue_terracotta_fence",
            () -> new terracottaFence(BLUE_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> BLUE_TERRACOTTA_FENCE_GATE = registerBlock("blue_terracotta_fence_gate",
            () -> new terracottaFenceGate(BLUE_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> BROWN_TERRACOTTA_FENCE = registerBlock("brown_terracotta_fence",
            () -> new terracottaFence(BROWN_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> BROWN_TERRACOTTA_FENCE_GATE = registerBlock("brown_terracotta_fence_gate",
            () -> new terracottaFenceGate(BROWN_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> GREEN_TERRACOTTA_FENCE = registerBlock("green_terracotta_fence",
            () -> new terracottaFence(GREEN_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> GREEN_TERRACOTTA_FENCE_GATE = registerBlock("green_terracotta_fence_gate",
            () -> new terracottaFenceGate(GREEN_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> RED_TERRACOTTA_FENCE = registerBlock("red_terracotta_fence",
            () -> new terracottaFence(RED_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> RED_TERRACOTTA_FENCE_GATE = registerBlock("red_terracotta_fence_gate",
            () -> new terracottaFenceGate(RED_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> BLACK_TERRACOTTA_FENCE = registerBlock("black_terracotta_fence",
            () -> new terracottaFence(BLACK_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> BLACK_TERRACOTTA_FENCE_GATE = registerBlock("black_terracotta_fence_gate",
            () -> new terracottaFenceGate(BLACK_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> TERRACOTTA_FENCE = registerBlock("terracotta_fence",
            () -> new terracottaFence(TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> TERRACOTTA_FENCE_GATE = registerBlock("terracotta_fence_gate",
            () -> new terracottaFenceGate(TERRACOTTA));
    
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