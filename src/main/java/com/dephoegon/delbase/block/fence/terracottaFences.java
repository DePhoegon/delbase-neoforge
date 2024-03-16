package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorshift.fence.terracottaFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.terracottaFenceGate;
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

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class terracottaFences {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<FenceBlock> WHITE_TERRACOTTA_FENCE = register("white_terracotta_fence",
            () -> new terracottaFence(WHITE_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> WHITE_TERRACOTTA_FENCE_GATE = register("white_terracotta_fence_gate",
            () -> new terracottaFenceGate(WHITE_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> ORANGE_TERRACOTTA_FENCE = register("orange_terracotta_fence",
            () -> new terracottaFence(ORANGE_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> ORANGE_TERRACOTTA_FENCE_GATE = register("orange_terracotta_fence_gate",
            () -> new terracottaFenceGate(ORANGE_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> MAGENTA_TERRACOTTA_FENCE = register("magenta_terracotta_fence",
            () -> new terracottaFence(MAGENTA_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_TERRACOTTA_FENCE_GATE = register("magenta_terracotta_fence_gate",
            () -> new terracottaFenceGate(MAGENTA_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_TERRACOTTA_FENCE = register("light_blue_terracotta_fence",
            () -> new terracottaFence(LIGHT_BLUE_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_TERRACOTTA_FENCE_GATE = register("light_blue_terracotta_fence_gate",
            () -> new terracottaFenceGate(LIGHT_BLUE_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> YELLOW_TERRACOTTA_FENCE = register("yellow_terracotta_fence",
            () -> new terracottaFence(YELLOW_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> YELLOW_TERRACOTTA_FENCE_GATE = register("yellow_terracotta_fence_gate",
            () -> new terracottaFenceGate(YELLOW_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> LIME_TERRACOTTA_FENCE = register("lime_terracotta_fence",
            () -> new terracottaFence(LIME_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> LIME_TERRACOTTA_FENCE_GATE = register("lime_terracotta_fence_gate",
            () -> new terracottaFenceGate(LIME_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> PINK_TERRACOTTA_FENCE = register("pink_terracotta_fence",
            () -> new terracottaFence(PINK_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> PINK_TERRACOTTA_FENCE_GATE = register("pink_terracotta_fence_gate",
            () -> new terracottaFenceGate(PINK_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> GRAY_TERRACOTTA_FENCE = register("gray_terracotta_fence",
            () -> new terracottaFence(GRAY_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> GRAY_TERRACOTTA_FENCE_GATE = register("gray_terracotta_fence_gate",
            () -> new terracottaFenceGate(GRAY_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_TERRACOTTA_FENCE = register("light_gray_terracotta_fence",
            () -> new terracottaFence(LIGHT_GRAY_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_TERRACOTTA_FENCE_GATE = register("light_gray_terracotta_fence_gate",
            () -> new terracottaFenceGate(LIGHT_GRAY_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> CYAN_TERRACOTTA_FENCE = register("cyan_terracotta_fence",
            () -> new terracottaFence(CYAN_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> CYAN_TERRACOTTA_FENCE_GATE = register("cyan_terracotta_fence_gate",
            () -> new terracottaFenceGate(CYAN_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> PURPLE_TERRACOTTA_FENCE = register("purple_terracotta_fence",
            () -> new terracottaFence(PURPLE_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> PURPLE_TERRACOTTA_FENCE_GATE = register("purple_terracotta_fence_gate",
            () -> new terracottaFenceGate(PURPLE_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> BLUE_TERRACOTTA_FENCE = register("blue_terracotta_fence",
            () -> new terracottaFence(BLUE_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> BLUE_TERRACOTTA_FENCE_GATE = register("blue_terracotta_fence_gate",
            () -> new terracottaFenceGate(BLUE_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> BROWN_TERRACOTTA_FENCE = register("brown_terracotta_fence",
            () -> new terracottaFence(BROWN_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> BROWN_TERRACOTTA_FENCE_GATE = register("brown_terracotta_fence_gate",
            () -> new terracottaFenceGate(BROWN_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> GREEN_TERRACOTTA_FENCE = register("green_terracotta_fence",
            () -> new terracottaFence(GREEN_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> GREEN_TERRACOTTA_FENCE_GATE = register("green_terracotta_fence_gate",
            () -> new terracottaFenceGate(GREEN_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> RED_TERRACOTTA_FENCE = register("red_terracotta_fence",
            () -> new terracottaFence(RED_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> RED_TERRACOTTA_FENCE_GATE = register("red_terracotta_fence_gate",
            () -> new terracottaFenceGate(RED_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> BLACK_TERRACOTTA_FENCE = register("black_terracotta_fence",
            () -> new terracottaFence(BLACK_TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> BLACK_TERRACOTTA_FENCE_GATE = register("black_terracotta_fence_gate",
            () -> new terracottaFenceGate(BLACK_TERRACOTTA));
    public static final DeferredBlock<FenceBlock> TERRACOTTA_FENCE = register("terracotta_fence",
            () -> new terracottaFence(TERRACOTTA));
    public static final DeferredBlock<FenceGateBlock> TERRACOTTA_FENCE_GATE = register("terracotta_fence_gate",
            () -> new terracottaFenceGate(TERRACOTTA));

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