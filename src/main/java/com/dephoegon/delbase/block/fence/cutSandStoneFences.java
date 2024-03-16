package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.colorshift.fence.cutSandStoneFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.cutSandStoneFenceGate;
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
import static net.minecraft.world.level.block.Blocks.CUT_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;

public class cutSandStoneFences {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<FenceBlock> WHITE_CUT_SAND_STONE_FENCE = register("white_cut_sand_stone_fence",
            () -> new cutSandStoneFence(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> WHITE_CUT_SAND_STONE_FENCE_GATE = register("white_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> ORANGE_CUT_SAND_STONE_FENCE = register("orange_cut_sand_stone_fence",
            () -> new cutSandStoneFence(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> ORANGE_CUT_SAND_STONE_FENCE_GATE = register("orange_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> MAGENTA_CUT_SAND_STONE_FENCE = register("magenta_cut_sand_stone_fence",
            () -> new cutSandStoneFence(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_CUT_SAND_STONE_FENCE_GATE = register("magenta_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_CUT_SAND_STONE_FENCE = register("light_blue_cut_sand_stone_fence",
            () -> new cutSandStoneFence(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_CUT_SAND_STONE_FENCE_GATE = register("light_blue_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> YELLOW_CUT_SAND_STONE_FENCE = register("yellow_cut_sand_stone_fence",
            () -> new cutSandStoneFence(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> YELLOW_CUT_SAND_STONE_FENCE_GATE = register("yellow_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIME_CUT_SAND_STONE_FENCE = register("lime_cut_sand_stone_fence",
            () -> new cutSandStoneFence(LIME_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIME_CUT_SAND_STONE_FENCE_GATE = register("lime_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(LIME_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PINK_CUT_SAND_STONE_FENCE = register("pink_cut_sand_stone_fence",
            () -> new cutSandStoneFence(PINK_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PINK_CUT_SAND_STONE_FENCE_GATE = register("pink_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(PINK_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GRAY_CUT_SAND_STONE_FENCE = register("gray_cut_sand_stone_fence",
            () -> new cutSandStoneFence(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GRAY_CUT_SAND_STONE_FENCE_GATE = register("gray_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_CUT_SAND_STONE_FENCE = register("light_gray_cut_sand_stone_fence",
            () -> new cutSandStoneFence(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_CUT_SAND_STONE_FENCE_GATE = register("light_gray_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> CYAN_CUT_SAND_STONE_FENCE = register("cyan_cut_sand_stone_fence",
            () -> new cutSandStoneFence(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> CYAN_CUT_SAND_STONE_FENCE_GATE = register("cyan_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> PURPLE_CUT_SAND_STONE_FENCE = register("purple_cut_sand_stone_fence",
            () -> new cutSandStoneFence(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> PURPLE_CUT_SAND_STONE_FENCE_GATE = register("purple_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BLUE_CUT_SAND_STONE_FENCE = register("blue_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLUE_CUT_SAND_STONE_FENCE_GATE = register("blue_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> BROWN_CUT_SAND_STONE_FENCE = register("brown_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BROWN_CUT_SAND_STONE_FENCE_GATE = register("brown_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> GREEN_CUT_SAND_STONE_FENCE = register("green_cut_sand_stone_fence",
            () -> new cutSandStoneFence(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> GREEN_CUT_SAND_STONE_FENCE_GATE = register("green_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> RED_CUT_SAND_STONE_FENCE = register("red_cut_sand_stone_fence",
            () -> new cutSandStoneFence(RED_SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> RED_CUT_SAND_STONE_FENCE_GATE = register("red_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(RED_SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLACK_CUT_SAND_STONE_FENCE = register("black_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BLACK_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLACK_CUT_SAND_STONE_FENCE_GATE = register("black_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BLACK_SAND_STONE.get()));
    public static final DeferredBlock<FenceBlock> CUT_SAND_STONE_FENCE = register("cut_sand_stone_fence",
            () -> new cutSandStoneFence(CUT_SANDSTONE));
    public static final DeferredBlock<FenceGateBlock> CUT_SAND_STONE_FENCE_GATE = register("cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(CUT_SANDSTONE));
    public static final DeferredBlock<FenceBlock> BLOOD_CUT_SAND_STONE_FENCE = register("blood_cut_sand_stone_fence",
            () -> new cutSandStoneFence(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<FenceGateBlock> BLOOD_CUT_SAND_STONE_FENCE_GATE = register("blood_cut_sand_stone_fence_gate",
            () -> new cutSandStoneFenceGate(BLOOD_SAND_STONE.get()));

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
