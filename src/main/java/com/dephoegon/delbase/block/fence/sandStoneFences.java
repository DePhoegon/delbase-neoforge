package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorshift.fence.sandStoneFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.sandStoneFenceGate;
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

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class sandStoneFences {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<FenceBlock> WHITE_SAND_STONE_FENCE = register("white_sand_stone_fence",
            () -> new sandStoneFence(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> WHITE_SAND_STONE_FENCE_GATE = register("white_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> ORANGE_SAND_STONE_FENCE = register("orange_sand_stone_fence",
            () -> new sandStoneFence(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> ORANGE_SAND_STONE_FENCE_GATE = register("orange_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> MAGENTA_SAND_STONE_FENCE = register("magenta_sand_stone_fence",
            () -> new sandStoneFence(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_SAND_STONE_FENCE_GATE = register("magenta_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_SAND_STONE_FENCE = register("light_blue_sand_stone_fence",
            () -> new sandStoneFence(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_SAND_STONE_FENCE_GATE = register("light_blue_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> YELLOW_SAND_STONE_FENCE = register("yellow_sand_stone_fence",
            () -> new sandStoneFence(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> YELLOW_SAND_STONE_FENCE_GATE = register("yellow_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIME_SAND_STONE_FENCE = register("lime_sand_stone_fence",
            () -> new sandStoneFence(LIME_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIME_SAND_STONE_FENCE_GATE = register("lime_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(LIME_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PINK_SAND_STONE_FENCE = register("pink_sand_stone_fence",
            () -> new sandStoneFence(PINK_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PINK_SAND_STONE_FENCE_GATE = register("pink_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(PINK_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GRAY_SAND_STONE_FENCE = register("gray_sand_stone_fence",
            () -> new sandStoneFence(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GRAY_SAND_STONE_FENCE_GATE = register("gray_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_SAND_STONE_FENCE = register("light_gray_sand_stone_fence",
            () -> new sandStoneFence(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_SAND_STONE_FENCE_GATE = register("light_gray_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> CYAN_SAND_STONE_FENCE = register("cyan_sand_stone_fence",
            () -> new sandStoneFence(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> CYAN_SAND_STONE_FENCE_GATE = register("cyan_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PURPLE_SAND_STONE_FENCE = register("purple_sand_stone_fence",
            () -> new sandStoneFence(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PURPLE_SAND_STONE_FENCE_GATE = register("purple_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BLUE_SAND_STONE_FENCE = register("blue_sand_stone_fence",
            () -> new sandStoneFence(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLUE_SAND_STONE_FENCE_GATE = register("blue_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BROWN_SAND_STONE_FENCE = register("brown_sand_stone_fence",
            () -> new sandStoneFence(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BROWN_SAND_STONE_FENCE_GATE = register("brown_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GREEN_SAND_STONE_FENCE = register("green_sand_stone_fence",
            () -> new sandStoneFence(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GREEN_SAND_STONE_FENCE_GATE = register("green_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> RED_SAND_STONE_FENCE = register("red_sand_stone_fence",
            () -> new sandStoneFence(RED_SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> RED_SAND_STONE_FENCE_GATE = register("red_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(RED_SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLACK_SAND_STONE_FENCE = register("black_sand_stone_fence",
            () -> new sandStoneFence(BLACK_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLACK_SAND_STONE_FENCE_GATE = register("black_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BLACK_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> SAND_STONE_FENCE = register("sand_stone_fence",
            () -> new sandStoneFence(SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> SAND_STONE_FENCE_GATE = register("sand_stone_fence_gate",
            () -> new sandStoneFenceGate(SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLOOD_SAND_STONE_FENCE = register("blood_sand_stone_fence",
            () -> new sandStoneFence(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLOOD_SAND_STONE_FENCE_GATE = register("blood_sand_stone_fence_gate",
            () -> new sandStoneFenceGate(BLOOD_SAND_STONE.get()));

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
