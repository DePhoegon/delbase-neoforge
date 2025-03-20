package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.alt.quartzFence;
import com.dephoegon.delbase.aid.block.alt.quartzGateBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.MOD_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class quartzFences {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<FenceBlock> QUARTZ_BRICKS_FENCE = registerBlock("quartz_bricks_fence",
            () -> new quartzFence(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BRICKS)));
    public static final DeferredBlock<FenceGateBlock> QUARTZ_BRICKS_FENCE_GATE = registerBlock("quartz_bricks_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BRICKS)));
    public static final DeferredBlock<FenceBlock> QUARTZ_BLOCK_FENCE = registerBlock("quartz_block_fence",
            () -> new quartzFence(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK)));
    public static final DeferredBlock<FenceGateBlock> QUARTZ_BLOCK_FENCE_GATE = registerBlock("quartz_block_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK)));
    public static final DeferredBlock<FenceBlock> SMOOTH_QUARTZ_FENCE = registerBlock("smooth_quartz_fence",
            () -> new quartzFence(BlockBehaviour.Properties.ofFullCopy(SMOOTH_QUARTZ)));
    public static final DeferredBlock<FenceGateBlock> SMOOTH_QUARTZ_FENCE_GATE = registerBlock("smooth_quartz_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_QUARTZ)));
    public static final DeferredBlock<FenceBlock> CHISELED_QUARTZ_BLOCK_FENCE = registerBlock("chiseled_quartz_block_fence",
            () -> new quartzFence(BlockBehaviour.Properties.ofFullCopy(CHISELED_QUARTZ_BLOCK)));
    public static final DeferredBlock<FenceGateBlock> CHISELED_QUARTZ_BLOCK_FENCE_GATE = registerBlock("chiseled_quartz_block_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.ofFullCopy(CHISELED_QUARTZ_BLOCK)));
    public static final DeferredBlock<FenceBlock> QUARTZ_PILLAR_FENCE = registerBlock("quartz_pillar_fence",
            () -> new quartzFence(BlockBehaviour.Properties.ofFullCopy(QUARTZ_PILLAR)));
    public static final DeferredBlock<FenceGateBlock> QUARTZ_PILLAR_FENCE_GATE = registerBlock("quartz_pillar_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.ofFullCopy(QUARTZ_PILLAR)));

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
