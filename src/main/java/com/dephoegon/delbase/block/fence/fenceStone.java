package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.fenceBlock;
import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.fenceGateBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class fenceStone {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<FenceBlock> STONE_FENCE = registerBlock("stone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(STONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> STONE_FENCE_GATE = registerBlock("stone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(STONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> COBBLESTONE_FENCE = registerBlock("cobblestone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(COBBLESTONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> COBBLESTONE_FENCE_GATE = registerBlock("cobblestone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(COBBLESTONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> DEEPSLATE_FENCE = registerBlock("deepslate_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE).sound(SoundType.DEEPSLATE), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> DEEPSLATE_FENCE_GATE = registerBlock("deepslate_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE).sound(SoundType.DEEPSLATE), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> COBBLED_DEEPSLATE_FENCE = registerBlock("cobbled_deepslate_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(COBBLED_DEEPSLATE).sound(SoundType.DEEPSLATE), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> COBBLED_DEEPSLATE_FENCE_GATE = registerBlock("cobbled_deepslate_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(COBBLED_DEEPSLATE).sound(SoundType.DEEPSLATE), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> DEEPSLATE_TILE_FENCE = registerBlock("deepslate_tile_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> DEEPSLATE_TILE_FENCE_GATE = registerBlock("deepslate_tile_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> POLISHED_DEEPSLATE_FENCE = registerBlock("polished_deepslate_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_DEEPSLATE).sound(SoundType.POLISHED_DEEPSLATE), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> POLISHED_DEEPSLATE_FENCE_GATE = registerBlock("polished_deepslate_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_DEEPSLATE).sound(SoundType.POLISHED_DEEPSLATE), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> DEEPSLATE_BRICK_FENCE = registerBlock("deepslate_brick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> DEEPSLATE_BRICK_FENCE_GATE = registerBlock("deepslate_brick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> MUD_BRICK_FENCE = registerBlock("mud_brick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS).sound(SoundType.MUD_BRICKS), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> MUD_BRICK_FENCE_GATE = registerBlock("mud_brick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS).sound(SoundType.MUD_BRICKS), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> PACKED_MUD_FENCE = registerBlock("packed_mud_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(PACKED_MUD).sound(SoundType.PACKED_MUD), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> PACKED_MUD_FENCE_GATE = registerBlock("packed_mud_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(PACKED_MUD).sound(SoundType.PACKED_MUD), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> BRICK_FENCE = registerBlock("brick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(BRICKS).sound(SoundType.NETHER_BRICKS), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> BRICK_FENCE_GATE = registerBlock("brick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(BRICKS).sound(SoundType.NETHER_BRICKS), false, 0, 0, null));

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
