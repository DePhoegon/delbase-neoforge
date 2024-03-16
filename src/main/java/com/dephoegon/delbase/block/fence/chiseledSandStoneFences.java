package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorshift.fence.chiseledSandStoneFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.chiseledSandStoneFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genChiseledSandStones.*;
import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.CHISELED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;

public class chiseledSandStoneFences {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<FenceBlock> WHITE_CHISELED_SAND_STONE_FENCE = register("white_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(WHITE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> WHITE_CHISELED_SAND_STONE_FENCE_GATE = register("white_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(WHITE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> ORANGE_CHISELED_SAND_STONE_FENCE = register("orange_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(ORANGE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> ORANGE_CHISELED_SAND_STONE_FENCE_GATE = register("orange_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(ORANGE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> MAGENTA_CHISELED_SAND_STONE_FENCE = register("magenta_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(MAGENTA_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_CHISELED_SAND_STONE_FENCE_GATE = register("magenta_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(MAGENTA_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_CHISELED_SAND_STONE_FENCE = register("light_blue_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(LIGHT_BLUE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_CHISELED_SAND_STONE_FENCE_GATE = register("light_blue_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(LIGHT_BLUE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> YELLOW_CHISELED_SAND_STONE_FENCE = register("yellow_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(YELLOW_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> YELLOW_CHISELED_SAND_STONE_FENCE_GATE = register("yellow_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(YELLOW_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIME_CHISELED_SAND_STONE_FENCE = register("lime_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(LIME_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIME_CHISELED_SAND_STONE_FENCE_GATE = register("lime_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(LIME_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PINK_CHISELED_SAND_STONE_FENCE = register("pink_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(PINK_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PINK_CHISELED_SAND_STONE_FENCE_GATE = register("pink_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(PINK_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GRAY_CHISELED_SAND_STONE_FENCE = register("gray_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(GRAY_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GRAY_CHISELED_SAND_STONE_FENCE_GATE = register("gray_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(GRAY_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_CHISELED_SAND_STONE_FENCE = register("light_gray_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(LIGHT_GRAY_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_CHISELED_SAND_STONE_FENCE_GATE = register("light_gray_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(LIGHT_GRAY_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> CYAN_CHISELED_SAND_STONE_FENCE = register("cyan_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(CYAN_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> CYAN_CHISELED_SAND_STONE_FENCE_GATE = register("cyan_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(CYAN_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PURPLE_CHISELED_SAND_STONE_FENCE = register("purple_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(PURPLE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PURPLE_CHISELED_SAND_STONE_FENCE_GATE = register("purple_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(PURPLE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BLUE_CHISELED_SAND_STONE_FENCE = register("blue_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BLUE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLUE_CHISELED_SAND_STONE_FENCE_GATE = register("blue_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BLUE_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BROWN_CHISELED_SAND_STONE_FENCE = register("brown_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BROWN_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BROWN_CHISELED_SAND_STONE_FENCE_GATE = register("brown_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BROWN_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GREEN_CHISELED_SAND_STONE_FENCE = register("green_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(GREEN_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GREEN_CHISELED_SAND_STONE_FENCE_GATE = register("green_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(GREEN_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> RED_CHISELED_SAND_STONE_FENCE = register("red_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(RED_SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> RED_CHISELED_SAND_STONE_FENCE_GATE = register("red_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(RED_SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLACK_CHISELED_SAND_STONE_FENCE = register("black_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BLACK_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLACK_CHISELED_SAND_STONE_FENCE_GATE = register("black_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BLACK_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> CHISELED_SAND_STONE_FENCE = register("chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(CHISELED_SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> CHISELED_SAND_STONE_FENCE_GATE = register("chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(CHISELED_SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLOOD_CHISELED_SAND_STONE_FENCE = register("blood_chiseled_sand_stone_fence",
            () -> new chiseledSandStoneFence(BLOOD_CHISELED_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLOOD_CHISELED_SAND_STONE_FENCE_GATE = register("blood_chiseled_sand_stone_fence_gate",
            () -> new chiseledSandStoneFenceGate(BLOOD_CHISELED_SAND_STONE.get()));

    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block, int burn) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(), new Item.Properties().stacksTo(64)){
            public int getBurnTime(@NotNull ItemStack stack, @javax.annotation.Nullable RecipeType<?> recipeType) {
                if (burn > 0) { return burn; } else return -1;
            }
        });
        return exit;
    }
    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block) { return register(name, block, 0); }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}