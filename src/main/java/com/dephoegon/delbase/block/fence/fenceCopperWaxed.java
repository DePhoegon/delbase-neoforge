package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.modExtensions.copperBulbFence;
import com.dephoegon.delbase.aid.block.modExtensions.copperBulbFenceGate;
import com.dephoegon.delbase.aid.block.modExtensions.copperFence;
import com.dephoegon.delbase.aid.block.modExtensions.copperFenceGate;
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
import static com.dephoegon.delbase.aid.util.weatherState.EXPOSED;
import static com.dephoegon.delbase.aid.util.weatherState.UNAFFECTED;
import static com.dephoegon.delbase.block.fence.fenceCopper.*;
import static net.minecraft.world.level.block.Blocks.RAW_COPPER_BLOCK;

public class fenceCopperWaxed {
    private static final DeferredRegister.Blocks FENCE_BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Blocks FENCE_GATE_BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static DeferredRegister.Blocks getFenceWaxedCopperBLOCKS() { return FENCE_BLOCKS; }
    public static DeferredRegister.Blocks getFenceWaxedGateCopperBLOCKS() { return FENCE_GATE_BLOCKS; }

    public static DeferredBlock<FenceBlock> RAW_WAXED_COPPER_FENCE = registerAid("raw_waxed_copper_fence", RAW_COPPER_BLOCK, RAW_COPPER_FENCE, UNAFFECTED.getOrder(), 5);
    public static DeferredBlock<FenceGateBlock> RAW_WAXED_COPPER_FENCE_GATE = registerGateAid("raw_waxed_copper_fence_gate", RAW_COPPER_BLOCK, RAW_COPPER_FENCE_GATE, UNAFFECTED.getOrder(), 5);
    public static DeferredBlock<FenceBlock> RAW_WAXED_EXPOSED_COPPER_FENCE = registerAid("raw_waxed_exposed_copper_fence", RAW_COPPER_BLOCK, RAW_EXPOSED_COPPER_FENCE, EXPOSED.getOrder(), 6);
    public static DeferredBlock<FenceGateBlock> RAW_WAXED_EXPOSED_COPPER_FENCE_GATE = registerGateAid("raw_waxed_exposed_copper_fence_gate", RAW_COPPER_BLOCK, RAW_EXPOSED_COPPER_FENCE_GATE, EXPOSED.getOrder(), 6);
    public static DeferredBlock<FenceBlock> RAW_WAXED_WEATHERED_COPPER_FENCE = registerAid("raw_waxed_weathered_copper_fence", RAW_COPPER_BLOCK, RAW_WEATHERED_COPPER_FENCE, EXPOSED.getOrder(), 7);
    public static DeferredBlock<FenceGateBlock> RAW_WAXED_WEATHERED_COPPER_FENCE_GATE = registerGateAid("raw_waxed_weathered_copper_fence_gate", RAW_COPPER_BLOCK, RAW_WEATHERED_COPPER_FENCE_GATE, EXPOSED.getOrder(), 7);
    public static DeferredBlock<FenceBlock> RAW_WAXED_OXIDIZED_COPPER_FENCE = registerAid("raw_waxed_oxidized_copper_fence", RAW_COPPER_BLOCK, RAW_OXIDIZED_COPPER_FENCE, UNAFFECTED.getOrder(), 8);
    public static DeferredBlock<FenceGateBlock> RAW_WAXED_OXIDIZED_COPPER_FENCE_GATE = registerGateAid("raw_waxed_oxidized_copper_fence_gate", RAW_COPPER_BLOCK, RAW_OXIDIZED_COPPER_FENCE_GATE, UNAFFECTED.getOrder(), 8);

    

    public static void registerBlock(IEventBus eventBus) {
        FENCE_BLOCKS.register(eventBus);
        FENCE_GATE_BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    public static <T extends Block> DeferredBlock<FenceBlock> registerBulbAid(String name, Block copyBlock, DeferredBlock<? extends Block> strippedState, int order, int mapOrder) {
        return registerBlock(name, () -> new copperBulbFence(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), strippedState.get().defaultBlockState(), order, true, mapOrder));
    }
    public static <T extends Block> DeferredBlock<FenceGateBlock> registerBulbGateAid(String name, Block copyBlock, DeferredBlock<? extends Block> strippedState, int order, int mapOrder) {
        return registerGateBlock(name, () -> new copperBulbFenceGate(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), strippedState.get().defaultBlockState(), order, true, mapOrder));
    }
    private static <T extends Block> DeferredBlock<FenceBlock> registerAid(String name, Block copyBlock, DeferredBlock<? extends Block> strippedState, int order, int mapOrder) {
        return registerBlock(name, () -> new copperFence(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), strippedState.get().defaultBlockState(), order, true, mapOrder));
    }
    private static <T extends Block> DeferredBlock<FenceGateBlock> registerGateAid(String name, Block copyBlock, DeferredBlock<? extends Block> strippedState, int order, int mapOrder) {
        return registerGateBlock(name, () -> new copperFenceGate(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), strippedState.get().defaultBlockState(), order, true, mapOrder));
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = FENCE_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> DeferredBlock<T> registerGateBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = FENCE_GATE_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void  registerBlockItem(String name, DeferredBlock<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(64)));
    }
}