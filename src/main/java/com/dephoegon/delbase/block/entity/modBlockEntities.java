package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.block.entity.bEntity.blockCuttingStation;
import com.dephoegon.delbase.block.entity.base.machineBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class modBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE_DEFERRED_REGISTER = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Delbase.Mod_ID);

    public static final Supplier<BlockEntityType<blockCuttingStation>> BLOCK_CUTTING_STATION_BE = BLOCK_ENTITY_TYPE_DEFERRED_REGISTER.register("block_cutting_station_block_entity", () -> BlockEntityType.Builder.of(blockCuttingStation::new, machineBlocks.BLOCK_CUTTING_STATION.get()).build(null));

    public static void registerBlockEntities(IEventBus eventBus) {
        BLOCK_ENTITY_TYPE_DEFERRED_REGISTER.register(eventBus);
    }
}