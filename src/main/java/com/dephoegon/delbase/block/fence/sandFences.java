package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorshift.fence.sandFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.sandFenceGate;
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

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

public class sandFences {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<FenceBlock> WHITE_SAND_FENCE = register("white_sand_fence",
            () -> new sandFence(WHITE_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> WHITE_SAND_FENCE_GATE = register("white_sand_fence_gate",
            () -> new sandFenceGate(WHITE_SAND.get()));
    public static final DeferredBlock<FenceBlock> ORANGE_SAND_FENCE = register("orange_sand_fence",
            () -> new sandFence(ORANGE_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> ORANGE_SAND_FENCE_GATE = register("orange_sand_fence_gate",
            () -> new sandFenceGate(ORANGE_SAND.get()));
    public static final DeferredBlock<FenceBlock> MAGENTA_SAND_FENCE = register("magenta_sand_fence",
            () -> new sandFence(MAGENTA_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_SAND_FENCE_GATE = register("magenta_sand_fence_gate",
            () -> new sandFenceGate(MAGENTA_SAND.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_SAND_FENCE = register("light_blue_sand_fence",
            () -> new sandFence(LIGHT_BLUE_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_SAND_FENCE_GATE = register("light_blue_sand_fence_gate",
            () -> new sandFenceGate(LIGHT_BLUE_SAND.get()));
    public static final DeferredBlock<FenceBlock> YELLOW_SAND_FENCE = register("yellow_sand_fence",
            () -> new sandFence(YELLOW_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> YELLOW_SAND_FENCE_GATE = register("yellow_sand_fence_gate",
            () -> new sandFenceGate(YELLOW_SAND.get()));
    public static final DeferredBlock<FenceBlock> LIME_SAND_FENCE = register("lime_sand_fence",
            () -> new sandFence(LIME_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> LIME_SAND_FENCE_GATE = register("lime_sand_fence_gate",
            () -> new sandFenceGate(LIME_SAND.get()));
    public static final DeferredBlock<FenceBlock> PINK_SAND_FENCE = register("pink_sand_fence",
            () -> new sandFence(PINK_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> PINK_SAND_FENCE_GATE = register("pink_sand_fence_gate",
            () -> new sandFenceGate(PINK_SAND.get()));
    public static final DeferredBlock<FenceBlock> GRAY_SAND_FENCE = register("gray_sand_fence",
            () -> new sandFence(GRAY_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> GRAY_SAND_FENCE_GATE = register("gray_sand_fence_gate",
            () -> new sandFenceGate(GRAY_SAND.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_SAND_FENCE = register("light_gray_sand_fence",
            () -> new sandFence(LIGHT_GRAY_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_SAND_FENCE_GATE = register("light_gray_sand_fence_gate",
            () -> new sandFenceGate(LIGHT_GRAY_SAND.get()));
    public static final DeferredBlock<FenceBlock> CYAN_SAND_FENCE = register("cyan_sand_fence",
            () -> new sandFence(CYAN_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> CYAN_SAND_FENCE_GATE = register("cyan_sand_fence_gate",
            () -> new sandFenceGate(CYAN_SAND.get()));
    public static final DeferredBlock<FenceBlock> PURPLE_SAND_FENCE = register("purple_sand_fence",
            () -> new sandFence(PURPLE_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> PURPLE_SAND_FENCE_GATE = register("purple_sand_fence_gate",
            () -> new sandFenceGate(PURPLE_SAND.get()));
    public static final DeferredBlock<FenceBlock> BLUE_SAND_FENCE = register("blue_sand_fence",
            () -> new sandFence(BLUE_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> BLUE_SAND_FENCE_GATE = register("blue_sand_fence_gate",
            () -> new sandFenceGate(BLUE_SAND.get()));
    public static final DeferredBlock<FenceBlock> BROWN_SAND_FENCE = register("brown_sand_fence",
            () -> new sandFence(BROWN_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> BROWN_SAND_FENCE_GATE = register("brown_sand_fence_gate",
            () -> new sandFenceGate(BROWN_SAND.get()));
    public static final DeferredBlock<FenceBlock> GREEN_SAND_FENCE = register("green_sand_fence",
            () -> new sandFence(GREEN_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> GREEN_SAND_FENCE_GATE = register("green_sand_fence_gate",
            () -> new sandFenceGate(GREEN_SAND.get()));
    public static final DeferredBlock<FenceBlock> RED_SAND_FENCE = register("red_sand_fence",
            () -> new sandFence(RED_SAND));
    public static final DeferredBlock<FenceGateBlock> RED_SAND_FENCE_GATE = register("red_sand_fence_gate",
            () -> new sandFenceGate(RED_SAND));
    public static final DeferredBlock<FenceBlock> BLACK_SAND_FENCE = register("black_sand_fence",
            () -> new sandFence(BLACK_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> BLACK_SAND_FENCE_GATE = register("black_sand_fence_gate",
            () -> new sandFenceGate(BLACK_SAND.get()));
    public static final DeferredBlock<FenceBlock> SAND_FENCE = register("sand_fence",
            () -> new sandFence(SAND));
    public static final DeferredBlock<FenceGateBlock> SAND_FENCE_GATE = register("sand_fence_gate",
            () -> new sandFenceGate(SAND));
    public static final DeferredBlock<FenceBlock> BLOOD_SAND_FENCE = register("blood_sand_fence",
            () -> new sandFence(BLOOD_SAND.get()));
    public static final DeferredBlock<FenceGateBlock> BLOOD_SAND_FENCE_GATE = register("blood_sand_fence_gate",
            () -> new sandFenceGate(BLOOD_SAND.get()));


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