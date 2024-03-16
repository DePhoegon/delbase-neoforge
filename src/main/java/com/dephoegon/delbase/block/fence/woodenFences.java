package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.alt.woodFence;
import com.dephoegon.delbase.aid.block.alt.woodFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.fence.strippedWoodenFences.*;
import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class woodenFences {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredBlock<FenceBlock> ACACIA_WOOD_FENCE = register("acacia_wood_fence",
            () -> new woodFence(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> ACACIA_WOOD_FENCE_GATE = register("acacia_wood_fence_gate",
            () -> new woodFenceGate(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> ACACIA_LOG_FENCE = register("acacia_log_fence",
            () -> new woodFence(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> ACACIA_LOG_FENCE_GATE = register("acacia_log_fence_gate",
            () -> new woodFenceGate(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> BIRCH_WOOD_FENCE = register("birch_wood_fence",
            () -> new woodFence(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> BIRCH_WOOD_FENCE_GATE = register("birch_wood_fence_gate",
            () -> new woodFenceGate(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> BIRCH_LOG_FENCE = register("birch_log_fence",
            () -> new woodFence(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> BIRCH_LOG_FENCE_GATE = register("birch_log_fence_gate",
            () -> new woodFenceGate(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> CRIMSON_HYPHAE_FENCE = register("crimson_hyphae_fence",
            () -> new woodFence(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_HYPHAE_FENCE.get().defaultBlockState()));
    public static final DeferredBlock<FenceGateBlock> CRIMSON_HYPHAE_FENCE_GATE = register("crimson_hyphae_fence_gate",
            () -> new woodFenceGate(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get().defaultBlockState()));
    public static final DeferredBlock<FenceBlock> CRIMSON_STEM_FENCE = register("crimson_stem_fence",
            () -> new woodFence(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_STEM_FENCE.get().defaultBlockState()));
    public static final DeferredBlock<FenceGateBlock> CRIMSON_STEM_FENCE_GATE = register("crimson_stem_fence_gate",
            () -> new woodFenceGate(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_STEM_FENCE_GATE.get().defaultBlockState()));
    public static final DeferredBlock<FenceBlock> DARK_OAK_WOOD_FENCE = register("dark_oak_wood_fence",
            () -> new woodFence(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> DARK_OAK_WOOD_FENCE_GATE = register("dark_oak_wood_fence_gate",
            () -> new woodFenceGate(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> DARK_OAK_LOG_FENCE = register("dark_oak_log_fence",
            () -> new woodFence(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> DARK_OAK_LOG_FENCE_GATE = register("dark_oak_log_fence_gate",
            () -> new woodFenceGate(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> JUNGLE_WOOD_FENCE = register("jungle_wood_fence",
            () -> new woodFence(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> JUNGLE_WOOD_FENCE_GATE = register("jungle_wood_fence_gate",
            () -> new woodFenceGate(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> JUNGLE_LOG_FENCE = register("jungle_log_fence",
            () -> new woodFence(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> JUNGLE_LOG_FENCE_GATE = register("jungle_log_fence_gate",
            () -> new woodFenceGate(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> OAK_WOOD_FENCE = register("oak_wood_fence",
            () -> new woodFence(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> OAK_WOOD_FENCE_GATE = register("oak_wood_fence_gate",
            () -> new woodFenceGate(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> OAK_LOG_FENCE = register("oak_log_fence",
            () -> new woodFence(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> OAK_LOG_FENCE_GATE = register("oak_log_fence_gate",
            () -> new woodFenceGate(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> SPRUCE_WOOD_FENCE = register("spruce_wood_fence",
            () -> new woodFence(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> SPRUCE_WOOD_FENCE_GATE = register("spruce_wood_fence_gate",
            () -> new woodFenceGate(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> SPRUCE_LOG_FENCE = register("spruce_log_fence",
            () -> new woodFence(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> SPRUCE_LOG_FENCE_GATE = register("spruce_log_fence_gate",
            () -> new woodFenceGate(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> WARPED_HYPHAE_FENCE = register("warped_hyphae_fence",
            () -> new woodFence(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_HYPHAE_FENCE.get().defaultBlockState()));
    public static final DeferredBlock<FenceGateBlock> WARPED_HYPHAE_FENCE_GATE = register("warped_hyphae_fence_gate",
            () -> new woodFenceGate(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_HYPHAE_FENCE_GATE.get().defaultBlockState()));
    public static final DeferredBlock<FenceBlock> WARPED_STEM_FENCE = register("warped_stem_fence",
            () -> new woodFence(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_STEM_FENCE.get().defaultBlockState()));
    public static final DeferredBlock<FenceGateBlock> WARPED_STEM_FENCE_GATE = register("warped_stem_fence_gate",
            () -> new woodFenceGate(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_STEM_FENCE_GATE.get().defaultBlockState()));
    public static final DeferredBlock<FenceBlock> MANGROVE_WOOD_FENCE = register("mangrove_wood_fence",
            () -> new woodFence(WARPED_HYPHAE, SoundType.WOOD, true, STRIPPED_MANGROVE_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> MANGROVE_WOOD_FENCE_GATE = register("mangrove_wood_fence_gate",
            () -> new woodFenceGate(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> MANGROVE_LOG_FENCE = register("mangrove_log_fence",
            () -> new woodFence(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> MANGROVE_LOG_FENCE_GATE = register("mangrove_log_fence_gate",
            () -> new woodFenceGate(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> CHERRY_WOOD_FENCE = register("cherry_wood_fence",
            () -> new woodFence(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_CHERRY_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> CHERRY_WOOD_FENCE_GATE = register("cherry_wood_fence_gate",
            () -> new woodFenceGate(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, STRIPPED_CHERRY_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> CHERRY_LOG_FENCE = register("cherry_log_fence",
            () -> new woodFence(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, STRIPPED_CHERRY_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> CHERRY_LOG_FENCE_GATE = register("cherry_log_fence_gate",
            () -> new woodFenceGate(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, STRIPPED_CHERRY_LOG_FENCE_GATE.get().defaultBlockState()), 1000);

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