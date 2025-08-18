package com.dephoegon.delbase.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import static com.dephoegon.delbase.aid.util.burnChance.rngBurn;

@Mixin(FenceBlock.class)
public class FenceBlockMixin extends Block {
    public FenceBlockMixin(Properties p_49795_) {
        super(p_49795_);
    }

    public boolean isFlammable(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction direction) {
        boolean flame = state.getFlammability(level, pos, direction) > 0;
        if (flame) { rngBurn(level, state, pos, 40, 60); }
        return flame;
    }

    /**
     * @author dephoegon
     * REASON - Fix fence connection logic for 1.21.1 compatibility - allows all fence types to connect properly
     */
    @Overwrite
    public boolean connectsTo(@NotNull BlockState blockState, boolean isSideSolid, @NotNull Direction direction) {
        Block block = blockState.getBlock();

        boolean isWoodenFence = blockState.is(BlockTags.WOODEN_FENCES);
        boolean isFence = block instanceof FenceBlock || blockState.is(BlockTags.FENCES);
        boolean canConnectToFence = isFence && !isWoodenFence;

        boolean isFenceGate = block instanceof FenceGateBlock && FenceGateBlock.connectsToDirection(blockState, direction);

        boolean canConnectToSolid = isSideSolid && !isExceptionForConnection(blockState);

        return canConnectToFence || isFenceGate || canConnectToSolid;
    }
}