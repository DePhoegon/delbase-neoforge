package com.dephoegon.delbase.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

import static com.dephoegon.delbase.aid.util.burnChance.rngBurn;

@Mixin(StairBlock.class)
public class StairBlockMixin extends Block {
    public StairBlockMixin(Properties p_49795_) {
        super(p_49795_);
    }
    public boolean isFlammable(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction direction) {
        boolean flame = state.getFlammability(level, pos, direction) > 0;
        if (flame) { rngBurn(level, state, pos, 40, 60); }
        return flame;
    }
}