package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.modExtensions.copperBulbFence;
import com.dephoegon.delbase.aid.block.modExtensions.copperBulbFenceGate;
import com.dephoegon.delbase.aid.block.modExtensions.copperFence;
import com.dephoegon.delbase.aid.block.modExtensions.copperFenceGate;
import com.dephoegon.delbase.aid.util.weatherState;
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

    public static final DeferredBlock<FenceBlock> RAW_COPPER_FENCE = registerAid("raw_copper_fence", RAW_COPPER_BLOCK, UNAFFECTED, 0);
    public static final DeferredBlock<FenceGateBlock> RAW_COPPER_FENCE_GATE = registerGateAid("raw_copper_fence_gate", RAW_COPPER_BLOCK, UNAFFECTED, 0);
    public static final DeferredBlock<FenceBlock> RAW_EXPOSED_COPPER_FENCE = registerAid("raw_exposed_copper_fence", RAW_COPPER_BLOCK, EXPOSED, 1);
    public static final DeferredBlock<FenceGateBlock> RAW_EXPOSED_COPPER_FENCE_GATE = registerGateAid("raw_exposed_copper_fence_gate", RAW_COPPER_BLOCK, EXPOSED, 1);
    public static final DeferredBlock<FenceBlock> RAW_WEATHERED_COPPER_FENCE = registerAid("raw_weathered_copper_fence", RAW_COPPER_BLOCK, WEATHERED, 2);
    public static final DeferredBlock<FenceGateBlock> RAW_WEATHERED_COPPER_FENCE_GATE = registerGateAid("raw_weathered_copper_fence_gate", RAW_COPPER_BLOCK, WEATHERED, 2);
    public static final DeferredBlock<FenceBlock> RAW_OXIDIZED_COPPER_FENCE = registerAid("raw_oxidized_copper_fence", RAW_COPPER_BLOCK, OXIDIZED, 3);
    public static final DeferredBlock<FenceGateBlock> RAW_OXIDIZED_COPPER_FENCE_GATE = registerGateAid("raw_oxidized_copper_fence_gate", RAW_COPPER_BLOCK, OXIDIZED, 3);

    public static final DeferredBlock<FenceBlock> COPPER_FENCE = registerAid("copper_fence", COPPER_BLOCK, UNAFFECTED, 10);
    public static final DeferredBlock<FenceGateBlock> COPPER_FENCE_GATE = registerGateAid("copper_fence_gate", COPPER_BLOCK, UNAFFECTED, 10);
    public static final DeferredBlock<FenceBlock> EXPOSED_COPPER_FENCE = registerAid("exposed_copper_fence", EXPOSED_COPPER, EXPOSED, 11);
    public static final DeferredBlock<FenceGateBlock> EXPOSED_COPPER_FENCE_GATE = registerGateAid("exposed_copper_fence_gate", EXPOSED_COPPER, EXPOSED, 11);
    public static final DeferredBlock<FenceBlock> WEATHERED_COPPER_FENCE = registerAid("weathered_copper_fence", WEATHERED_COPPER, WEATHERED, 12);
    public static final DeferredBlock<FenceGateBlock> WEATHERED_COPPER_FENCE_GATE = registerGateAid("weathered_copper_fence_gate", WEATHERED_COPPER, WEATHERED, 12);
    public static final DeferredBlock<FenceBlock> OXIDIZED_COPPER_FENCE = registerAid("oxidized_copper_fence", OXIDIZED_COPPER, OXIDIZED, 13);
    public static final DeferredBlock<FenceGateBlock> OXIDIZED_COPPER_FENCE_GATE = registerGateAid("oxidized_copper_fence_gate", OXIDIZED_COPPER, OXIDIZED, 13);

    public static final DeferredBlock<FenceBlock> CHISELED_COPPER_FENCE = registerAid("chiseled_copper_fence", CHISELED_COPPER, UNAFFECTED, 20);
    public static final DeferredBlock<FenceGateBlock> CHISELED_COPPER_FENCE_GATE = registerGateAid("chiseled_copper_fence_gate", CHISELED_COPPER, UNAFFECTED, 20);
    public static final DeferredBlock<FenceBlock> CHISELED_EXPOSED_COPPER_FENCE = registerAid("chiseled_exposed_copper_fence", EXPOSED_CHISELED_COPPER, EXPOSED, 21);
    public static final DeferredBlock<FenceGateBlock> CHISELED_EXPOSED_COPPER_FENCE_GATE = registerGateAid("chiseled_exposed_copper_fence_gate", EXPOSED_CHISELED_COPPER, EXPOSED, 21);
    public static final DeferredBlock<FenceBlock> CHISELED_WEATHERED_COPPER_FENCE = registerAid("chiseled_weathered_copper_fence", WEATHERED_CHISELED_COPPER, WEATHERED, 22);
    public static final DeferredBlock<FenceGateBlock> CHISELED_WEATHERED_COPPER_FENCE_GATE = registerGateAid("chiseled_weathered_copper_fence_gate", WEATHERED_CHISELED_COPPER, WEATHERED, 22);
    public static final DeferredBlock<FenceBlock> CHISELED_OXIDIZED_COPPER_FENCE = registerAid("chiseled_oxidized_copper_fence", OXIDIZED_CHISELED_COPPER, OXIDIZED, 23);
    public static final DeferredBlock<FenceGateBlock> CHISELED_OXIDIZED_COPPER_FENCE_GATE = registerGateAid("chiseled_oxidized_copper_fence_gate", OXIDIZED_CHISELED_COPPER, OXIDIZED, 23);

    public static final DeferredBlock<FenceBlock> COPPER_GRATE_FENCE = registerAid("copper_grate_fence", COPPER_GRATE, UNAFFECTED, 30);
    public static final DeferredBlock<FenceGateBlock> COPPER_GRATE_FENCE_GATE = registerGateAid("copper_grate_fence_gate", COPPER_GRATE, UNAFFECTED, 30);
    public static final DeferredBlock<FenceBlock> EXPOSED_COPPER_GRATE_FENCE = registerAid("exposed_copper_grate_fence", EXPOSED_COPPER_GRATE, EXPOSED, 31);
    public static final DeferredBlock<FenceGateBlock> EXPOSED_COPPER_GRATE_FENCE_GATE = registerGateAid("exposed_copper_grate_fence_gate", EXPOSED_COPPER_GRATE, EXPOSED, 31);
    public static final DeferredBlock<FenceBlock> WEATHERED_COPPER_GRATE_FENCE = registerAid("weathered_copper_grate_fence", WEATHERED_COPPER_GRATE, WEATHERED, 32);
    public static final DeferredBlock<FenceGateBlock> WEATHERED_COPPER_GRATE_FENCE_GATE = registerGateAid("weathered_copper_grate_fence_gate", WEATHERED_COPPER_GRATE, WEATHERED, 32);
    public static final DeferredBlock<FenceBlock> OXIDIZED_COPPER_GRATE_FENCE = registerAid("oxidized_copper_grate_fence", OXIDIZED_COPPER_GRATE, OXIDIZED, 33);
    public static final DeferredBlock<FenceGateBlock> OXIDIZED_COPPER_GRATE_FENCE_GATE = registerGateAid("oxidized_copper_grate_fence_gate", OXIDIZED_COPPER_GRATE, OXIDIZED, 33);
/*
    public static final DeferredBlock<FenceBlock> COPPER_BULB_FENCE = registerBulbAid("copper_bulb_fence", COPPER_BULB, UNAFFECTED, 40);
    public static final DeferredBlock<FenceGateBlock> COPPER_BULB_FENCE_GATE = registerBulbGateAid("copper_bulb_fence_gate", COPPER_BULB, UNAFFECTED, 40);
    public static final DeferredBlock<FenceBlock> EXPOSED_COPPER_BULB_FENCE = registerBulbAid("exposed_copper_bulb_fence", EXPOSED_COPPER_BULB, EXPOSED, 41);
    public static final DeferredBlock<FenceGateBlock> EXPOSED_COPPER_BULB_FENCE_GATE = registerBulbGateAid("exposed_copper_bulb_fence_gate", EXPOSED_COPPER_BULB, EXPOSED, 41);
    public static final DeferredBlock<FenceBlock> WEATHERED_COPPER_BULB_FENCE = registerBulbAid("weathered_copper_bulb_fence", WEATHERED_COPPER_BULB, WEATHERED, 42);
    public static final DeferredBlock<FenceGateBlock> WEATHERED_COPPER_BULB_FENCE_GATE = registerBulbGateAid("weathered_copper_bulb_fence_gate", WEATHERED_COPPER_BULB, WEATHERED, 42);
    public static final DeferredBlock<FenceBlock> OXIDIZED_COPPER_BULB_FENCE = registerBulbAid("oxidized_copper_bulb_fence", OXIDIZED_COPPER_BULB, OXIDIZED, 43);
    public static final DeferredBlock<FenceGateBlock> OXIDIZED_COPPER_BULB_FENCE_GATE = registerBulbGateAid("oxidized_copper_bulb_fence_gate", OXIDIZED_COPPER_BULB, OXIDIZED, 43);
*/
    public static final DeferredBlock<FenceBlock> CUT_COPPER_FENCE = registerAid("cut_copper_fence", CUT_COPPER, UNAFFECTED, 50);
    public static final DeferredBlock<FenceGateBlock> CUT_COPPER_FENCE_GATE = registerGateAid("cut_copper_fence_gate", CUT_COPPER, UNAFFECTED, 50);
    public static final DeferredBlock<FenceBlock> EXPOSED_CUT_COPPER_FENCE = registerAid("exposed_cut_copper_fence", EXPOSED_CUT_COPPER, EXPOSED, 51);
    public static final DeferredBlock<FenceGateBlock> EXPOSED_CUT_COPPER_FENCE_GATE = registerGateAid("exposed_cut_copper_fence_gate", EXPOSED_CUT_COPPER, EXPOSED, 51);
    public static final DeferredBlock<FenceBlock> WEATHERED_CUT_COPPER_FENCE = registerAid("weathered_cut_copper_fence", WEATHERED_CUT_COPPER, WEATHERED, 52);
    public static final DeferredBlock<FenceGateBlock> WEATHERED_CUT_COPPER_FENCE_GATE = registerGateAid("weathered_cut_copper_fence_gate", WEATHERED_CUT_COPPER, WEATHERED, 52);
    public static final DeferredBlock<FenceBlock> OXIDIZED_CUT_COPPER_FENCE = registerAid("oxidized_cut_copper_fence", OXIDIZED_CUT_COPPER, OXIDIZED, 53);
    public static final DeferredBlock<FenceGateBlock> OXIDIZED_CUT_COPPER_FENCE_GATE = registerGateAid("oxidized_cut_copper_fence_gate", OXIDIZED_CUT_COPPER, OXIDIZED, 53);

    public static void registerBlock(IEventBus eventBus) {
        FENCE_BLOCKS.register(eventBus);
        FENCE_GATE_BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    public static <T extends Block> DeferredBlock<FenceBlock> registerBulbAid(String name, Block copyBlock, weatherState order, int mapOrder) {
        BlockBehaviour.Properties properties = order == OXIDIZED ? BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL) : BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL).randomTicks();
        return registerBlock(name, () -> new copperBulbFence(properties, null, order.getOrder(), false, mapOrder));
    }
    public static <T extends Block> DeferredBlock<FenceGateBlock> registerBulbGateAid(String name, Block copyBlock, weatherState order, int mapOrder) {
        BlockBehaviour.Properties properties = order == OXIDIZED ? BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL) : BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL).randomTicks();
        return registerGateBlock(name, () -> new copperBulbFenceGate(properties, null, order.getOrder(), false, mapOrder));
    }
    private static <T extends Block> DeferredBlock<FenceBlock> registerAid(String name, Block copyBlock, weatherState order, int mapOrder) {
        BlockBehaviour.Properties properties = order == OXIDIZED ? BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL) : BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL).randomTicks();
        return registerBlock(name, () -> new copperFence(properties, null, order.getOrder(), false, mapOrder));
    }
    private static <T extends Block> DeferredBlock<FenceGateBlock> registerGateAid(String name, Block copyBlock, weatherState order, int mapOrder) {
        BlockBehaviour.Properties properties = order == OXIDIZED ? BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL) : BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL).randomTicks();
        return registerGateBlock(name, () -> new copperFenceGate(properties, null, order.getOrder(), false, mapOrder));
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
