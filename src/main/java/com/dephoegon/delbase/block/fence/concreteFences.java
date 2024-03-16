package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorshift.fence.concreteFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.concreteFenceGate;
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

public class concreteFences {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<FenceBlock> WHITE_CONCRETE_FENCE = register("white_concrete_fence",
            () -> new concreteFence(WHITE_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> WHITE_CONCRETE_FENCE_GATE = register("white_concrete_fence_gate",
            () -> new concreteFenceGate(WHITE_CONCRETE));
    public static final DeferredBlock<FenceBlock> ORANGE_CONCRETE_FENCE = register("orange_concrete_fence",
            () -> new concreteFence(ORANGE_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> ORANGE_CONCRETE_FENCE_GATE = register("orange_concrete_fence_gate",
            () -> new concreteFenceGate(ORANGE_CONCRETE));
    public static final DeferredBlock<FenceBlock> MAGENTA_CONCRETE_FENCE = register("magenta_concrete_fence",
            () -> new concreteFence(MAGENTA_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_CONCRETE_FENCE_GATE = register("magenta_concrete_fence_gate",
            () -> new concreteFenceGate(MAGENTA_CONCRETE));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_CONCRETE_FENCE = register("light_blue_concrete_fence",
            () -> new concreteFence(LIGHT_BLUE_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_CONCRETE_FENCE_GATE = register("light_blue_concrete_fence_gate",
            () -> new concreteFenceGate(LIGHT_BLUE_CONCRETE));
    public static final DeferredBlock<FenceBlock> YELLOW_CONCRETE_FENCE = register("yellow_concrete_fence",
            () -> new concreteFence(YELLOW_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> YELLOW_CONCRETE_FENCE_GATE = register("yellow_concrete_fence_gate",
            () -> new concreteFenceGate(YELLOW_CONCRETE));
    public static final DeferredBlock<FenceBlock> LIME_CONCRETE_FENCE = register("lime_concrete_fence",
            () -> new concreteFence(LIME_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> LIME_CONCRETE_FENCE_GATE = register("lime_concrete_fence_gate",
            () -> new concreteFenceGate(LIME_CONCRETE));
    public static final DeferredBlock<FenceBlock> PINK_CONCRETE_FENCE = register("pink_concrete_fence",
            () -> new concreteFence(PINK_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> PINK_CONCRETE_FENCE_GATE = register("pink_concrete_fence_gate",
            () -> new concreteFenceGate(PINK_CONCRETE));
    public static final DeferredBlock<FenceBlock> GRAY_CONCRETE_FENCE = register("gray_concrete_fence",
            () -> new concreteFence(GRAY_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> GRAY_CONCRETE_FENCE_GATE = register("gray_concrete_fence_gate",
            () -> new concreteFenceGate(GRAY_CONCRETE));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_CONCRETE_FENCE = register("light_gray_concrete_fence",
            () -> new concreteFence(LIGHT_GRAY_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_CONCRETE_FENCE_GATE = register("light_gray_concrete_fence_gate",
            () -> new concreteFenceGate(LIGHT_GRAY_CONCRETE));
    public static final DeferredBlock<FenceBlock> CYAN_CONCRETE_FENCE = register("cyan_concrete_fence",
            () -> new concreteFence(CYAN_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> CYAN_CONCRETE_FENCE_GATE = register("cyan_concrete_fence_gate",
            () -> new concreteFenceGate(CYAN_CONCRETE));
    public static final DeferredBlock<FenceBlock> PURPLE_CONCRETE_FENCE = register("purple_concrete_fence",
            () -> new concreteFence(PURPLE_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> PURPLE_CONCRETE_FENCE_GATE = register("purple_concrete_fence_gate",
            () -> new concreteFenceGate(PURPLE_CONCRETE));
    public static final DeferredBlock<FenceBlock> BLUE_CONCRETE_FENCE = register("blue_concrete_fence",
            () -> new concreteFence(BLUE_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> BLUE_CONCRETE_FENCE_GATE = register("blue_concrete_fence_gate",
            () -> new concreteFenceGate(BLUE_CONCRETE));
    public static final DeferredBlock<FenceBlock> BROWN_CONCRETE_FENCE = register("brown_concrete_fence",
            () -> new concreteFence(BROWN_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> BROWN_CONCRETE_FENCE_GATE = register("brown_concrete_fence_gate",
            () -> new concreteFenceGate(BROWN_CONCRETE));
    public static final DeferredBlock<FenceBlock> GREEN_CONCRETE_FENCE = register("green_concrete_fence",
            () -> new concreteFence(GREEN_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> GREEN_CONCRETE_FENCE_GATE = register("green_concrete_fence_gate",
            () -> new concreteFenceGate(GREEN_CONCRETE));
    public static final DeferredBlock<FenceBlock> RED_CONCRETE_FENCE = register("red_concrete_fence",
            () -> new concreteFence(RED_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> RED_CONCRETE_FENCE_GATE = register("red_concrete_fence_gate",
            () -> new concreteFenceGate(RED_CONCRETE));
    public static final DeferredBlock<FenceBlock> BLACK_CONCRETE_FENCE = register("black_concrete_fence",
            () -> new concreteFence(BLACK_CONCRETE));
    public static final DeferredBlock<FenceGateBlock> BLACK_CONCRETE_FENCE_GATE = register("black_concrete_fence_gate",
            () -> new concreteFenceGate(BLACK_CONCRETE));

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