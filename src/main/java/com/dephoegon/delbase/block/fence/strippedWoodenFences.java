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

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class strippedWoodenFences {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<FenceBlock> STRIPPED_ACACIA_WOOD_FENCE = register("stripped_acacia_wood_fence",
            () -> new woodFence(STRIPPED_ACACIA_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_ACACIA_WOOD_FENCE_GATE = register("stripped_acacia_wood_fence_gate",
            () -> new woodFenceGate(STRIPPED_ACACIA_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_ACACIA_LOG_FENCE = register("stripped_acacia_log_fence",
            () -> new woodFence(STRIPPED_ACACIA_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_ACACIA_LOG_FENCE_GATE = register("stripped_acacia_log_fence_gate",
            () -> new woodFenceGate(STRIPPED_ACACIA_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_BIRCH_WOOD_FENCE = register("stripped_birch_wood_fence",
            () -> new woodFence(STRIPPED_BIRCH_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_BIRCH_WOOD_FENCE_GATE = register("stripped_birch_wood_fence_gate",
            () -> new woodFenceGate(STRIPPED_BIRCH_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_BIRCH_LOG_FENCE = register("stripped_birch_log_fence",
            () -> new woodFence(STRIPPED_BIRCH_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_BIRCH_LOG_FENCE_GATE = register("stripped_birch_log_fence_gate",
            () -> new woodFenceGate(STRIPPED_BIRCH_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_CRIMSON_HYPHAE_FENCE = register("stripped_crimson_hyphae_fence",
            () -> new woodFence(STRIPPED_CRIMSON_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_CRIMSON_HYPHAE_FENCE_GATE = register("stripped_crimson_hyphae_fence_gate",
            () -> new woodFenceGate(STRIPPED_CRIMSON_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<FenceBlock> STRIPPED_CRIMSON_STEM_FENCE = register("stripped_crimson_stem_fence",
            () -> new woodFence(STRIPPED_CRIMSON_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_CRIMSON_STEM_FENCE_GATE = register("stripped_crimson_stem_fence_gate",
            () -> new woodFenceGate(STRIPPED_CRIMSON_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<FenceBlock> STRIPPED_DARK_OAK_WOOD_FENCE = register("stripped_dark_oak_wood_fence",
            () -> new woodFence(STRIPPED_DARK_OAK_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_DARK_OAK_WOOD_FENCE_GATE = register("stripped_dark_oak_wood_fence_gate",
            () -> new woodFenceGate(STRIPPED_DARK_OAK_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_DARK_OAK_LOG_FENCE = register("stripped_dark_oak_log_fence",
            () -> new woodFence(STRIPPED_DARK_OAK_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_DARK_OAK_LOG_FENCE_GATE = register("stripped_dark_oak_log_fence_gate",
            () -> new woodFenceGate(STRIPPED_DARK_OAK_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_JUNGLE_WOOD_FENCE = register("stripped_jungle_wood_fence",
            () -> new woodFence(STRIPPED_JUNGLE_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_JUNGLE_WOOD_FENCE_GATE = register("stripped_jungle_wood_fence_gate",
            () -> new woodFenceGate(STRIPPED_JUNGLE_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_JUNGLE_LOG_FENCE = register("stripped_jungle_log_fence",
            () -> new woodFence(STRIPPED_JUNGLE_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_JUNGLE_LOG_FENCE_GATE = register("stripped_jungle_log_fence_gate",
            () -> new woodFenceGate(STRIPPED_JUNGLE_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_OAK_WOOD_FENCE = register("stripped_oak_wood_fence",
            () -> new woodFence(STRIPPED_OAK_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_OAK_WOOD_FENCE_GATE = register("stripped_oak_wood_fence_gate",
            () -> new woodFenceGate(STRIPPED_OAK_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_OAK_LOG_FENCE = register("stripped_oak_log_fence",
            () -> new woodFence(STRIPPED_OAK_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_OAK_LOG_FENCE_GATE = register("stripped_oak_log_fence_gate",
            () -> new woodFenceGate(STRIPPED_OAK_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_SPRUCE_WOOD_FENCE = register("stripped_spruce_wood_fence",
            () -> new woodFence(STRIPPED_SPRUCE_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_SPRUCE_WOOD_FENCE_GATE = register("stripped_spruce_wood_fence_gate",
            () -> new woodFenceGate(STRIPPED_SPRUCE_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_SPRUCE_LOG_FENCE = register("stripped_spruce_log_fence",
            () -> new woodFence(STRIPPED_SPRUCE_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_SPRUCE_LOG_FENCE_GATE = register("stripped_spruce_log_fence_gate",
            () -> new woodFenceGate(STRIPPED_SPRUCE_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_WARPED_HYPHAE_FENCE = register("stripped_warped_hyphae_fence",
            () -> new woodFence(STRIPPED_WARPED_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_WARPED_HYPHAE_FENCE_GATE = register("stripped_warped_hyphae_fence_gate",
            () -> new woodFenceGate(STRIPPED_WARPED_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<FenceBlock> STRIPPED_WARPED_STEM_FENCE = register("stripped_warped_stem_fence",
            () -> new woodFence(STRIPPED_WARPED_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_WARPED_STEM_FENCE_GATE = register("stripped_warped_stem_fence_gate",
            () -> new woodFenceGate(STRIPPED_WARPED_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<FenceBlock> STRIPPED_MANGROVE_WOOD_FENCE = register("stripped_mangrove_wood_fence",
            () -> new woodFence(STRIPPED_OAK_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_MANGROVE_WOOD_FENCE_GATE = register("stripped_mangrove_wood_fence_gate",
            () -> new woodFenceGate(STRIPPED_OAK_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_MANGROVE_LOG_FENCE = register("stripped_mangrove_log_fence",
            () -> new woodFence(STRIPPED_OAK_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_MANGROVE_LOG_FENCE_GATE = register("stripped_mangrove_log_fence_gate",
            () -> new woodFenceGate(STRIPPED_OAK_WOOD, SoundType.WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_CHERRY_WOOD_FENCE = register("stripped_cherry_wood_fence",
            () -> new woodFence(STRIPPED_CHERRY_WOOD, SoundType.CHERRY_WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_CHERRY_WOOD_FENCE_GATE = register("stripped_cherry_wood_fence_gate",
            () -> new woodFenceGate(STRIPPED_CHERRY_WOOD, SoundType.CHERRY_WOOD, true, null), 1000);
    public static final DeferredBlock<FenceBlock> STRIPPED_CHERRY_LOG_FENCE = register("stripped_cherry_log_fence",
            () -> new woodFence(STRIPPED_CHERRY_WOOD, SoundType.CHERRY_WOOD, true, null), 1000);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_CHERRY_LOG_FENCE_GATE = register("stripped_cherry_log_fence_gate",
            () -> new woodFenceGate(STRIPPED_CHERRY_WOOD, SoundType.CHERRY_WOOD, true, null), 1000);


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
