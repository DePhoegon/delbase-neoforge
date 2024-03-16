package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.alt.leafFence;
import com.dephoegon.delbase.aid.block.alt.leafFenceGate;
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

public class leafFences {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<FenceBlock> OAK_LEAF_FENCE = register("oak_leaf_fence",
            () -> new leafFence(OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> OAK_LEAF_FENCE_GATE = register("oak_leaf_fence_gate",
            () -> new leafFenceGate(OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> SPRUCE_LEAF_FENCE = register("spruce_leaf_fence",
            () -> new leafFence(SPRUCE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> SPRUCE_LEAF_FENCE_GATE = register("spruce_leaf_fence_gate",
            () -> new leafFenceGate(SPRUCE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> BIRCH_LEAF_FENCE = register("birch_leaf_fence",
            () -> new leafFence(BIRCH_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> BIRCH_LEAF_FENCE_GATE = register("birch_leaf_fence_gate",
            () -> new leafFenceGate(BIRCH_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> ACACIA_LEAF_FENCE = register("acacia_leaf_fence",
            () -> new leafFence(ACACIA_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> ACACIA_LEAF_FENCE_GATE = register("acacia_leaf_fence_gate",
            () -> new leafFenceGate(ACACIA_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> JUNGLE_LEAF_FENCE = register("jungle_leaf_fence",
            () -> new leafFence(JUNGLE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> JUNGLE_LEAF_FENCE_GATE = register("jungle_leaf_fence_gate",
            () -> new leafFenceGate(JUNGLE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> DARK_OAK_LEAF_FENCE = register("dark_oak_leaf_fence",
            () -> new leafFence(DARK_OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> DARK_OAK_LEAF_FENCE_GATE = register("dark_oak_leaf_fence_gate",
            () -> new leafFenceGate(DARK_OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> MANGROVE_LEAF_FENCE = register("mangrove_leaf_fence",
            () -> new leafFence(MANGROVE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> MANGROVE_LEAF_FENCE_GATE = register("mangrove_leaf_fence_gate",
            () -> new leafFenceGate(MANGROVE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> AZALEA_LEAF_FENCE = register("azalea_leaf_fence",
            () -> new leafFence(AZALEA_LEAVES, SoundType.AZALEA_LEAVES, true, null));
    public static final DeferredBlock<FenceGateBlock> AZALEA_LEAF_FENCE_GATE = register("azalea_leaf_fence_gate",
            () -> new leafFenceGate(AZALEA_LEAVES, SoundType.AZALEA_LEAVES, true, null));
    public static final DeferredBlock<FenceBlock> FLOWERING_AZALEA_LEAF_FENCE = register("flowering_azalea_leaf_fence",
            () -> new leafFence(FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA, true, null));
    public static final DeferredBlock<FenceGateBlock> FLOWERING_AZALEA_LEAF_FENCE_GATE = register("flowering_azalea_leaf_fence_gate",
            () -> new leafFenceGate(FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA, true, null));
    public static final DeferredBlock<FenceBlock> CHERRY_LEAF_FENCE = register("cherry_leaf_fence",
            () -> new leafFence(CHERRY_LEAVES, SoundType.CHERRY_LEAVES, true, null));
    public static final DeferredBlock<FenceGateBlock> CHERRY_LEAF_FENCE_GATE = register("cherry_leaf_fence_gate",
            () -> new leafFenceGate(CHERRY_LEAVES, SoundType.CHERRY_LEAVES, true, null));

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