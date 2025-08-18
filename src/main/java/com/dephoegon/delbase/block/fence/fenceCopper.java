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
import static com.dephoegon.delbase.aid.util.weatherState.*;
import static net.minecraft.world.level.block.Blocks.*;

public class fenceCopper {
    private static final DeferredRegister.Blocks FENCE_BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Blocks FENCE_GATE_BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static DeferredRegister.Blocks getFenceCopperBLOCKS() { return FENCE_BLOCKS; }
    public static DeferredRegister.Blocks getFenceGateCopperBLOCKS() { return FENCE_GATE_BLOCKS; }

    public static final DeferredBlock<FenceBlock> RAW_COPPER_FENCE = registerAid("raw_copper_fence", RAW_COPPER_BLOCK, UNAFFECTED.getOrder(), 0);
    public static final DeferredBlock<FenceGateBlock> RAW_COPPER_FENCE_GATE = registerGateAid("raw_copper_fence_gate", RAW_COPPER_BLOCK, UNAFFECTED.getOrder(), 0);
    public static final DeferredBlock<FenceBlock> RAW_EXPOSED_COPPER_FENCE = registerAid("raw_exposed_copper_fence", RAW_COPPER_BLOCK, EXPOSED.getOrder(), 1);
    public static final DeferredBlock<FenceGateBlock> RAW_EXPOSED_COPPER_FENCE_GATE = registerGateAid("raw_exposed_copper_fence_gate", RAW_COPPER_BLOCK, EXPOSED.getOrder(), 1);
    public static final DeferredBlock<FenceBlock> RAW_WEATHERED_COPPER_FENCE = registerAid("raw_weathered_copper_fence", RAW_COPPER_BLOCK, WEATHERED.getOrder(), 2);
    public static final DeferredBlock<FenceGateBlock> RAW_WEATHERED_COPPER_FENCE_GATE = registerGateAid("raw_weathered_copper_fence_gate", RAW_COPPER_BLOCK, WEATHERED.getOrder(), 2);
    public static final DeferredBlock<FenceBlock> RAW_OXIDIZED_COPPER_FENCE = registerAid("raw_oxidized_copper_fence", RAW_COPPER_BLOCK, OXIDIZED.getOrder(), 3);
    public static final DeferredBlock<FenceGateBlock> RAW_OXIDIZED_COPPER_FENCE_GATE = registerGateAid("raw_oxidized_copper_fence_gate", RAW_COPPER_BLOCK, OXIDIZED.getOrder(), 3);

    public static final DeferredBlock<FenceBlock> COPPER_FENCE = registerAid("copper_fence", COPPER_BLOCK, UNAFFECTED.getOrder(), 10);
    public static final DeferredBlock<FenceGateBlock> COPPER_FENCE_GATE = registerGateAid("copper_fence_gate", COPPER_BLOCK, UNAFFECTED.getOrder(), 10);
    public static final DeferredBlock<FenceBlock> EXPOSED_COPPER_FENCE = registerAid("exposed_copper_fence", EXPOSED_COPPER, EXPOSED.getOrder(), 11);
    public static final DeferredBlock<FenceGateBlock> EXPOSED_COPPER_FENCE_GATE = registerGateAid("exposed_copper_fence_gate", EXPOSED_COPPER, EXPOSED.getOrder(), 11);
    public static final DeferredBlock<FenceBlock> WEATHERED_COPPER_FENCE = registerAid("weathered_copper_fence", WEATHERED_COPPER, WEATHERED.getOrder(), 12);
    public static final DeferredBlock<FenceGateBlock> WEATHERED_COPPER_FENCE_GATE = registerGateAid("weathered_copper_fence_gate", WEATHERED_COPPER, WEATHERED.getOrder(), 12);
    public static final DeferredBlock<FenceBlock> OXIDIZED_COPPER_FENCE = registerAid("oxidized_copper_fence", OXIDIZED_COPPER, OXIDIZED.getOrder(), 13);
    public static final DeferredBlock<FenceGateBlock> OXIDIZED_COPPER_FENCE_GATE = registerGateAid("oxidized_copper_fence_gate", OXIDIZED_COPPER, OXIDIZED.getOrder(), 13);

    public static final DeferredBlock<FenceBlock> CHISELED_COPPER_FENCE = registerAid("chiseled_copper_fence", CHISELED_COPPER, UNAFFECTED.getOrder(), 20);
    public static final DeferredBlock<FenceGateBlock> CHISELED_COPPER_FENCE_GATE = registerGateAid("chiseled_copper_fence_gate", CHISELED_COPPER, UNAFFECTED.getOrder(), 20);
    public static final DeferredBlock<FenceBlock> CHISELED_EXPOSED_COPPER_FENCE = registerAid("chiseled_exposed_copper_fence", EXPOSED_CHISELED_COPPER, EXPOSED.getOrder(), 21);
    public static final DeferredBlock<FenceGateBlock> CHISELED_EXPOSED_COPPER_FENCE_GATE = registerGateAid("chiseled_exposed_copper_fence_gate", EXPOSED_CHISELED_COPPER, EXPOSED.getOrder(), 21);
    public static final DeferredBlock<FenceBlock> CHISELED_WEATHERED_COPPER_FENCE = registerAid("chiseled_weathered_copper_fence", WEATHERED_CHISELED_COPPER, WEATHERED.getOrder(), 22);
    public static final DeferredBlock<FenceGateBlock> CHISELED_WEATHERED_COPPER_FENCE_GATE = registerGateAid("chiseled_weathered_copper_fence_gate", WEATHERED_CHISELED_COPPER, WEATHERED.getOrder(), 22);
    public static final DeferredBlock<FenceBlock> CHISELED_OXIDIZED_COPPER_FENCE = registerAid("chiseled_oxidized_copper_fence", OXIDIZED_CHISELED_COPPER, OXIDIZED.getOrder(), 23);
    public static final DeferredBlock<FenceGateBlock> CHISELED_OXIDIZED_COPPER_FENCE_GATE = registerGateAid("chiseled_oxidized_copper_fence_gate", OXIDIZED_CHISELED_COPPER, OXIDIZED.getOrder(), 23);

    public static final DeferredBlock<FenceBlock> COPPER_GRATING_FENCE = registerAid("copper_grating_fence", COPPER_GRATE, UNAFFECTED.getOrder(), 30);
    public static final DeferredBlock<FenceGateBlock> COPPER_GRATING_FENCE_GATE = registerGateAid("copper_grating_fence_gate", COPPER_GRATE, UNAFFECTED.getOrder(), 30);
    public static final DeferredBlock<FenceBlock> EXPOSED_COPPER_GRATING_FENCE = registerAid("exposed_copper_grating_fence", EXPOSED_COPPER_GRATE, EXPOSED.getOrder(), 31);
    public static final DeferredBlock<FenceGateBlock> EXPOSED_COPPER_GRATING_FENCE_GATE = registerGateAid("exposed_copper_grating_fence_gate", EXPOSED_COPPER_GRATE, EXPOSED.getOrder(), 31);
    public static final DeferredBlock<FenceBlock> WEATHERED_COPPER_GRATING_FENCE = registerAid("weathered_copper_grating_fence", WEATHERED_COPPER_GRATE, WEATHERED.getOrder(), 32);
    public static final DeferredBlock<FenceGateBlock> WEATHERED_COPPER_GRATING_FENCE_GATE = registerGateAid("weathered_copper_grating_fence_gate", WEATHERED_COPPER_GRATE, WEATHERED.getOrder(), 32);
    public static final DeferredBlock<FenceBlock> OXIDIZED_COPPER_GRATING_FENCE = registerAid("oxidized_copper_grating_fence", OXIDIZED_COPPER_GRATE, OXIDIZED.getOrder(), 33);
    public static final DeferredBlock<FenceGateBlock> OXIDIZED_COPPER_GRATING_FENCE_GATE = registerGateAid("oxidized_copper_grating_fence_gate", OXIDIZED_COPPER_GRATE, OXIDIZED.getOrder(), 33);
/*
    public static final DeferredBlock<FenceBlock> COPPER_BULB_FENCE = registerBulbAid("copper_bulb_fence", COPPER_BULB, UNAFFECTED.getOrder(), 40);
    public static final DeferredBlock<FenceGateBlock> COPPER_BULB_FENCE_GATE = registerBulbGateAid("copper_bulb_fence_gate", COPPER_BULB, UNAFFECTED.getOrder(), 40);
    public static final DeferredBlock<FenceBlock> EXPOSED_COPPER_BULB_FENCE = registerBulbAid("exposed_copper_bulb_fence", EXPOSED_COPPER_BULB, EXPOSED.getOrder(), 41);
    public static final DeferredBlock<FenceGateBlock> EXPOSED_COPPER_BULB_FENCE_GATE = registerBulbGateAid("exposed_copper_bulb_fence_gate", EXPOSED_COPPER_BULB, EXPOSED.getOrder(), 41);
    public static final DeferredBlock<FenceBlock> WEATHERED_COPPER_BULB_FENCE = registerBulbAid("weathered_copper_bulb_fence", WEATHERED_COPPER_BULB, WEATHERED.getOrder(), 42);
    public static final DeferredBlock<FenceGateBlock> WEATHERED_COPPER_BULB_FENCE_GATE = registerBulbGateAid("weathered_copper_bulb_fence_gate", WEATHERED_COPPER_BULB, WEATHERED.getOrder(), 42);
    public static final DeferredBlock<FenceBlock> OXIDIZED_COPPER_BULB_FENCE = registerBulbAid("oxidized_copper_bulb_fence", OXIDIZED_COPPER_BULB, OXIDIZED.getOrder(), 43);
    public static final DeferredBlock<FenceGateBlock> OXIDIZED_COPPER_BULB_FENCE_GATE = registerBulbGateAid("oxidized_copper_bulb_fence_gate", OXIDIZED_COPPER_BULB, OXIDIZED.getOrder(), 43);
*/
    public static void registerBlock(IEventBus eventBus) {
        FENCE_BLOCKS.register(eventBus);
        FENCE_GATE_BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    public static <T extends Block> DeferredBlock<FenceBlock> registerBulbAid(String name, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperBulbFence(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), null, order, false, mapOrder));
    }
    public static <T extends Block> DeferredBlock<FenceGateBlock> registerBulbGateAid(String name, Block copyBlock, int order, int mapOrder) {
        return registerGateBlock(name, () -> new copperBulbFenceGate(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), null, order, false, mapOrder));
    }
    private static <T extends Block> DeferredBlock<FenceBlock> registerAid(String name, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperFence(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), null, order, false, mapOrder));
    }
    private static <T extends Block> DeferredBlock<FenceGateBlock> registerGateAid(String name, Block copyBlock, int order, int mapOrder) {
        return registerGateBlock(name, () -> new copperFenceGate(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), null, order, false, mapOrder));
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
