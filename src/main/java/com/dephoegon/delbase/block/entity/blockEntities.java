package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.block.entity.blocks.blockCuttingStation;
import com.dephoegon.delbase.block.general.machineBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;

import static com.dephoegon.delbase.Delabse.MOD_ID;

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