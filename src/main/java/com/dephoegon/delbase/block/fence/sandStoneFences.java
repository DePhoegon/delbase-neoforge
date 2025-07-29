package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorShift.fence.sandStoneFence;
import com.dephoegon.delbase.aid.block.colorShift.fence.sandStoneFenceGate;
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
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class sandStoneFences {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<FenceBlock> WHITE_SAND_STONE_FENCE = registerBlock("white_sand_stone_fence",
            () -> new sandStoneFence(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> WHITE_SAND_STONE_FENCE_GATE = registerBlock("white_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> ORANGE_SAND_STONE_FENCE = registerBlock("orange_sand_stone_fence",
            () -> new sandStoneFence(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> ORANGE_SAND_STONE_FENCE_GATE = registerBlock("orange_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> MAGENTA_SAND_STONE_FENCE = registerBlock("magenta_sand_stone_fence",
            () -> new sandStoneFence(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_SAND_STONE_FENCE_GATE = registerBlock("magenta_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_SAND_STONE_FENCE = registerBlock("light_blue_sand_stone_fence",
            () -> new sandStoneFence(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_SAND_STONE_FENCE_GATE = registerBlock("light_blue_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> YELLOW_SAND_STONE_FENCE = registerBlock("yellow_sand_stone_fence",
            () -> new sandStoneFence(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> YELLOW_SAND_STONE_FENCE_GATE = registerBlock("yellow_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIME_SAND_STONE_FENCE = registerBlock("lime_sand_stone_fence",
            () -> new sandStoneFence(LIME_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIME_SAND_STONE_FENCE_GATE = registerBlock("lime_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(LIME_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PINK_SAND_STONE_FENCE = registerBlock("pink_sand_stone_fence",
            () -> new sandStoneFence(PINK_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PINK_SAND_STONE_FENCE_GATE = registerBlock("pink_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(PINK_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GRAY_SAND_STONE_FENCE = registerBlock("gray_sand_stone_fence",
            () -> new sandStoneFence(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GRAY_SAND_STONE_FENCE_GATE = registerBlock("gray_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_SAND_STONE_FENCE = registerBlock("light_gray_sand_stone_fence",
            () -> new sandStoneFence(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_SAND_STONE_FENCE_GATE = registerBlock("light_gray_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> CYAN_SAND_STONE_FENCE = registerBlock("cyan_sand_stone_fence",
            () -> new sandStoneFence(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> CYAN_SAND_STONE_FENCE_GATE = registerBlock("cyan_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PURPLE_SAND_STONE_FENCE = registerBlock("purple_sand_stone_fence",
            () -> new sandStoneFence(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PURPLE_SAND_STONE_FENCE_GATE = registerBlock("purple_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BLUE_SAND_STONE_FENCE = registerBlock("blue_sand_stone_fence",
            () -> new sandStoneFence(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLUE_SAND_STONE_FENCE_GATE = registerBlock("blue_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BROWN_SAND_STONE_FENCE = registerBlock("brown_sand_stone_fence",
            () -> new sandStoneFence(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BROWN_SAND_STONE_FENCE_GATE = registerBlock("brown_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GREEN_SAND_STONE_FENCE = registerBlock("green_sand_stone_fence",
            () -> new sandStoneFence(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GREEN_SAND_STONE_FENCE_GATE = registerBlock("green_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> RED_SAND_STONE_FENCE = registerBlock("red_sand_stone_fence",
            () -> new sandStoneFence(RED_SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> RED_SAND_STONE_FENCE_GATE = registerBlock("red_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(RED_SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLACK_SAND_STONE_FENCE = registerBlock("black_sand_stone_fence",
            () -> new sandStoneFence(BLACK_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLACK_SAND_STONE_FENCE_GATE = registerBlock("black_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BLACK_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> SAND_STONE_FENCE = registerBlock("sand_stone_fence",
            () -> new sandStoneFence(SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> SAND_STONE_FENCE_GATE = registerBlock("sand_stone_fence_gate",
            () -> new sandStoneFenceGate(SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLOOD_SAND_STONE_FENCE = registerBlock("blood_sand_stone_fence",
            () -> new sandStoneFence(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLOOD_SAND_STONE_FENCE_GATE = registerBlock("blood_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BLOOD_SAND_STONE.get()));

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
