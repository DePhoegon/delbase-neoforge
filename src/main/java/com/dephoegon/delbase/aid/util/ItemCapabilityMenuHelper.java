package com.dephoegon.delbase.aid.util;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.items.IItemHandler;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class ItemCapabilityMenuHelper {
    private ItemCapabilityMenuHelper() {}

    public static Optional<IItemHandler> getCapabilityItemHandler(@NotNull Level level, BlockEntity blockEntity) {
        return Optional.ofNullable(level.getCapability(Capabilities.ItemHandler.BLOCK, blockEntity.getBlockPos(),
                blockEntity.getBlockState(), blockEntity, null));
    }
}