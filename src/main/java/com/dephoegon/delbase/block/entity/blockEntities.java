package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.block.entity.blocks.blockCuttingStation;
import com.dephoegon.delbase.block.general.machineBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;

public class blockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, MODID);

    public static final Supplier<BlockEntityType<blockCuttingStation>> BLOCK_ENTITY_BLOCK_CUTTER = BLOCK_ENTITIES.register("block_cutting_station_block_entity", () ->
            BlockEntityType.Builder.of(blockCuttingStation::new, machineBlocks.BLOCK_CUTTING_STATION.get()).build(null));

    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BLOCK_ENTITY_BLOCK_CUTTER.get(), blockCuttingStation::getItemHandlerCapability);
    }

    public static void register(IEventBus eventBus) { BLOCK_ENTITIES.register(eventBus); }
}