package com.dephoegon.delbase.block.entity_old;

import com.dephoegon.delbase.block.entity.base.machineBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.dephoegon.delbase.Delabse.Mod_ID;

public class blockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Mod_ID);

    @SuppressWarnings("ConstantConditions")
    public static final DeferredBlock<BlockEntityType<blockCuttingStation>> BLOCK_CUTTING_STATION_BLOCK_ENTITY =
            BLOCK_ENTITIES.registerBlock("block_cutting_station_block_entity", () ->
                    BlockEntityType.Builder.of(blockCuttingStation::new, machineBlocks.BLOCK_CUTTING_STATION.get()).build(null));

    public static void registerBlock(IEventBus eventBus) {
        BLOCK_ENTITIES.registerBlock(eventBus);
    }
}