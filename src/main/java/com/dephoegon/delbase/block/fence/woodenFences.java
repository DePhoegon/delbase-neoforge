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

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.block.fence.strippedWoodenFences.*;
import static com.dephoegon.delbase.Delabse.MOD_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class woodenFences {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    public static final DeferredBlock<FenceBlock> ACACIA_WOOD_FENCE = registerBlock("acacia_wood_fence",
            () -> new woodFence(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> ACACIA_WOOD_FENCE_GATE = registerBlock("acacia_wood_fence_gate",
            () -> new woodFenceGate(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> ACACIA_LOG_FENCE = registerBlock("acacia_log_fence",
            () -> new woodFence(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> ACACIA_LOG_FENCE_GATE = registerBlock("acacia_log_fence_gate",
            () -> new woodFenceGate(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> BIRCH_WOOD_FENCE = registerBlock("birch_wood_fence",
            () -> new woodFence(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> BIRCH_WOOD_FENCE_GATE = registerBlock("birch_wood_fence_gate",
            () -> new woodFenceGate(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> BIRCH_LOG_FENCE = registerBlock("birch_log_fence",
            () -> new woodFence(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> BIRCH_LOG_FENCE_GATE = registerBlock("birch_log_fence_gate",
            () -> new woodFenceGate(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> CRIMSON_HYPHAE_FENCE = registerBlock("crimson_hyphae_fence",
            () -> new woodFence(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_HYPHAE_FENCE.get().defaultBlockState()));
    public static final DeferredBlock<FenceGateBlock> CRIMSON_HYPHAE_FENCE_GATE = registerBlock("crimson_hyphae_fence_gate",
            () -> new woodFenceGate(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get().defaultBlockState()));
    public static final DeferredBlock<FenceBlock> CRIMSON_STEM_FENCE = registerBlock("crimson_stem_fence",
            () -> new woodFence(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_STEM_FENCE.get().defaultBlockState()));
    public static final DeferredBlock<FenceGateBlock> CRIMSON_STEM_FENCE_GATE = registerBlock("crimson_stem_fence_gate",
            () -> new woodFenceGate(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_STEM_FENCE_GATE.get().defaultBlockState()));
    public static final DeferredBlock<FenceBlock> DARK_OAK_WOOD_FENCE = registerBlock("dark_oak_wood_fence",
            () -> new woodFence(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> DARK_OAK_WOOD_FENCE_GATE = registerBlock("dark_oak_wood_fence_gate",
            () -> new woodFenceGate(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> DARK_OAK_LOG_FENCE = registerBlock("dark_oak_log_fence",
            () -> new woodFence(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> DARK_OAK_LOG_FENCE_GATE = registerBlock("dark_oak_log_fence_gate",
            () -> new woodFenceGate(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> JUNGLE_WOOD_FENCE = registerBlock("jungle_wood_fence",
            () -> new woodFence(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> JUNGLE_WOOD_FENCE_GATE = registerBlock("jungle_wood_fence_gate",
            () -> new woodFenceGate(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> JUNGLE_LOG_FENCE = registerBlock("jungle_log_fence",
            () -> new woodFence(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> JUNGLE_LOG_FENCE_GATE = registerBlock("jungle_log_fence_gate",
            () -> new woodFenceGate(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> OAK_WOOD_FENCE = registerBlock("oak_wood_fence",
            () -> new woodFence(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> OAK_WOOD_FENCE_GATE = registerBlock("oak_wood_fence_gate",
            () -> new woodFenceGate(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> OAK_LOG_FENCE = registerBlock("oak_log_fence",
            () -> new woodFence(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> OAK_LOG_FENCE_GATE = registerBlock("oak_log_fence_gate",
            () -> new woodFenceGate(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> SPRUCE_WOOD_FENCE = registerBlock("spruce_wood_fence",
            () -> new woodFence(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> SPRUCE_WOOD_FENCE_GATE = registerBlock("spruce_wood_fence_gate",
            () -> new woodFenceGate(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> SPRUCE_LOG_FENCE = registerBlock("spruce_log_fence",
            () -> new woodFence(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> SPRUCE_LOG_FENCE_GATE = registerBlock("spruce_log_fence_gate",
            () -> new woodFenceGate(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> WARPED_HYPHAE_FENCE = registerBlock("warped_hyphae_fence",
            () -> new woodFence(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_HYPHAE_FENCE.get().defaultBlockState()));
    public static final DeferredBlock<FenceGateBlock> WARPED_HYPHAE_FENCE_GATE = registerBlock("warped_hyphae_fence_gate",
            () -> new woodFenceGate(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_HYPHAE_FENCE_GATE.get().defaultBlockState()));
    public static final DeferredBlock<FenceBlock> WARPED_STEM_FENCE = registerBlock("warped_stem_fence",
            () -> new woodFence(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_STEM_FENCE.get().defaultBlockState()));
    public static final DeferredBlock<FenceGateBlock> WARPED_STEM_FENCE_GATE = registerBlock("warped_stem_fence_gate",
            () -> new woodFenceGate(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_STEM_FENCE_GATE.get().defaultBlockState()));
    public static final DeferredBlock<FenceBlock> MANGROVE_WOOD_FENCE = registerBlock("mangrove_wood_fence",
            () -> new woodFence(WARPED_HYPHAE, SoundType.WOOD, true, STRIPPED_MANGROVE_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> MANGROVE_WOOD_FENCE_GATE = registerBlock("mangrove_wood_fence_gate",
            () -> new woodFenceGate(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> MANGROVE_LOG_FENCE = registerBlock("mangrove_log_fence",
            () -> new woodFence(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> MANGROVE_LOG_FENCE_GATE = registerBlock("mangrove_log_fence_gate",
            () -> new woodFenceGate(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_LOG_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> CHERRY_WOOD_FENCE = registerBlock("cherry_wood_fence",
            () -> new woodFence(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_CHERRY_WOOD_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> CHERRY_WOOD_FENCE_GATE = registerBlock("cherry_wood_fence_gate",
            () -> new woodFenceGate(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, STRIPPED_CHERRY_WOOD_FENCE_GATE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceBlock> CHERRY_LOG_FENCE = registerBlock("cherry_log_fence",
            () -> new woodFence(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, STRIPPED_CHERRY_LOG_FENCE.get().defaultBlockState()), 1000);
    public static final DeferredBlock<FenceGateBlock> CHERRY_LOG_FENCE_GATE = registerBlock("cherry_log_fence_gate",
            () -> new woodFenceGate(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, STRIPPED_CHERRY_LOG_FENCE_GATE.get().defaultBlockState()), 1000);

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    @SuppressWarnings("SameParameterValue")
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block, int burn) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)){
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burn;
            }
        });
        return exit;
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)));
        return exit;
    }
}