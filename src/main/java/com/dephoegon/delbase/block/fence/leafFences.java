package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.alt.leafFence;
import com.dephoegon.delbase.aid.block.alt.leafFenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class leafFences {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<FenceBlock> OAK_LEAF_FENCE = registerBlock("oak_leaf_fence",
            () -> new leafFence(OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> OAK_LEAF_FENCE_GATE = registerBlock("oak_leaf_fence_gate",
            () -> new leafFenceGate(OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> SPRUCE_LEAF_FENCE = registerBlock("spruce_leaf_fence",
            () -> new leafFence(SPRUCE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> SPRUCE_LEAF_FENCE_GATE = registerBlock("spruce_leaf_fence_gate",
            () -> new leafFenceGate(SPRUCE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> BIRCH_LEAF_FENCE = registerBlock("birch_leaf_fence",
            () -> new leafFence(BIRCH_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> BIRCH_LEAF_FENCE_GATE = registerBlock("birch_leaf_fence_gate",
            () -> new leafFenceGate(BIRCH_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> ACACIA_LEAF_FENCE = registerBlock("acacia_leaf_fence",
            () -> new leafFence(ACACIA_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> ACACIA_LEAF_FENCE_GATE = registerBlock("acacia_leaf_fence_gate",
            () -> new leafFenceGate(ACACIA_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> JUNGLE_LEAF_FENCE = registerBlock("jungle_leaf_fence",
            () -> new leafFence(JUNGLE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> JUNGLE_LEAF_FENCE_GATE = registerBlock("jungle_leaf_fence_gate",
            () -> new leafFenceGate(JUNGLE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> DARK_OAK_LEAF_FENCE = registerBlock("dark_oak_leaf_fence",
            () -> new leafFence(DARK_OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> DARK_OAK_LEAF_FENCE_GATE = registerBlock("dark_oak_leaf_fence_gate",
            () -> new leafFenceGate(DARK_OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> MANGROVE_LEAF_FENCE = registerBlock("mangrove_leaf_fence",
            () -> new leafFence(MANGROVE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceGateBlock> MANGROVE_LEAF_FENCE_GATE = registerBlock("mangrove_leaf_fence_gate",
            () -> new leafFenceGate(MANGROVE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<FenceBlock> AZALEA_LEAF_FENCE = registerBlock("azalea_leaf_fence",
            () -> new leafFence(AZALEA_LEAVES, SoundType.AZALEA_LEAVES, true, null));
    public static final DeferredBlock<FenceGateBlock> AZALEA_LEAF_FENCE_GATE = registerBlock("azalea_leaf_fence_gate",
            () -> new leafFenceGate(AZALEA_LEAVES, SoundType.AZALEA_LEAVES, true, null));
    public static final DeferredBlock<FenceBlock> FLOWERING_AZALEA_LEAF_FENCE = registerBlock("flowering_azalea_leaf_fence",
            () -> new leafFence(FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA, true, null));
    public static final DeferredBlock<FenceGateBlock> FLOWERING_AZALEA_LEAF_FENCE_GATE = registerBlock("flowering_azalea_leaf_fence_gate",
            () -> new leafFenceGate(FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA, true, null));
    public static final DeferredBlock<FenceBlock> CHERRY_LEAF_FENCE = registerBlock("cherry_leaf_fence",
            () -> new leafFence(CHERRY_LEAVES, SoundType.CHERRY_LEAVES, true, null));
    public static final DeferredBlock<FenceGateBlock> CHERRY_LEAF_FENCE_GATE = registerBlock("cherry_leaf_fence_gate",
            () -> new leafFenceGate(CHERRY_LEAVES, SoundType.CHERRY_LEAVES, true, null));

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void  registerBlockItem(String name, DeferredBlock<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(64)));
    }
}