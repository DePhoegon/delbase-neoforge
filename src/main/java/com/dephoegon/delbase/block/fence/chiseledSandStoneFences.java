package com.dephoegon.delbase.block.fence;



import com.dephoegon.delbase.aid.block.colorShift.fence.chiseledSandStoneFence;
import com.dephoegon.delbase.aid.block.colorShift.fence.chiseledSandStoneFenceGate;
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
import static com.dephoegon.delbase.block.general.genChiseledSandStones.*;
import static net.minecraft.world.level.block.Blocks.CHISELED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;

public class chiseledSandStoneFences {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<FenceBlock> WHITE_CHISELED_SAND_STONE_FENCE = registerBlock("white_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(WHITE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> WHITE_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("white_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(WHITE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> ORANGE_CHISELED_SAND_STONE_FENCE = registerBlock("orange_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(ORANGE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> ORANGE_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("orange_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(ORANGE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> MAGENTA_CHISELED_SAND_STONE_FENCE = registerBlock("magenta_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(MAGENTA_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("magenta_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(MAGENTA_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_CHISELED_SAND_STONE_FENCE = registerBlock("light_blue_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(LIGHT_BLUE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("light_blue_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(LIGHT_BLUE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> YELLOW_CHISELED_SAND_STONE_FENCE = registerBlock("yellow_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(YELLOW_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> YELLOW_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("yellow_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(YELLOW_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIME_CHISELED_SAND_STONE_FENCE = registerBlock("lime_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(LIME_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIME_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("lime_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(LIME_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PINK_CHISELED_SAND_STONE_FENCE = registerBlock("pink_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(PINK_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PINK_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("pink_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(PINK_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GRAY_CHISELED_SAND_STONE_FENCE = registerBlock("gray_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(GRAY_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GRAY_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("gray_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(GRAY_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_CHISELED_SAND_STONE_FENCE = registerBlock("light_gray_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(LIGHT_GRAY_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("light_gray_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(LIGHT_GRAY_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> CYAN_CHISELED_SAND_STONE_FENCE = registerBlock("cyan_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(CYAN_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> CYAN_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("cyan_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(CYAN_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PURPLE_CHISELED_SAND_STONE_FENCE = registerBlock("purple_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(PURPLE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PURPLE_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("purple_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(PURPLE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BLUE_CHISELED_SAND_STONE_FENCE = registerBlock("blue_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BLUE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLUE_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("blue_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BLUE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BROWN_CHISELED_SAND_STONE_FENCE = registerBlock("brown_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BROWN_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BROWN_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("brown_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BROWN_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GREEN_CHISELED_SAND_STONE_FENCE = registerBlock("green_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(GREEN_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GREEN_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("green_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(GREEN_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> RED_CHISELED_SAND_STONE_FENCE = registerBlock("red_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(RED_SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> RED_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("red_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(RED_SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLACK_CHISELED_SAND_STONE_FENCE = registerBlock("black_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BLACK_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLACK_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("black_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BLACK_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> CHISELED_SAND_STONE_FENCE = registerBlock("chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(CHISELED_SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> CHISELED_SAND_STONE_FENCE_GATE = registerBlock("chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(CHISELED_SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLOOD_CHISELED_SAND_STONE_FENCE = registerBlock("blood_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BLOOD_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLOOD_CHISELED_SAND_STONE_FENCE_GATE = registerBlock("blood_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BLOOD_CHISELED_SAND_STONE.get()));

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