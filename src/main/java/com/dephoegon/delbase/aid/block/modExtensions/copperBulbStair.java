package com.dephoegon.delbase.aid.block.modExtensions;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import org.jetbrains.annotations.NotNull;

public class copperBulbStair extends copperStair {
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public copperBulbStair(@NotNull Block block, Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, BlockState strippedState, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(block, properties, normToolTip, shiftToolTip, ctrlToolTip, strippedState, oxidizedStage, isWaxed, MapOrder);
    }
    public copperBulbStair(@NotNull Block block, Properties properties, BlockState strippedState, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(block, properties, strippedState, oxidizedStage, isWaxed, MapOrder);
    }

    protected void onPlace(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState oldState, boolean movedByPiston) {
        if (oldState.getBlock() != state.getBlock() && level instanceof ServerLevel serverlevel) { this.checkAndFlip(state, serverlevel, pos); }
    }
    protected void neighborChanged(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Block neighborBlock, @NotNull BlockPos neighborPos, boolean movedByPiston) {
        if (level instanceof ServerLevel serverlevel) { this.checkAndFlip(state, serverlevel, pos); }
        super.neighborChanged(state, level, pos, neighborBlock, neighborPos, movedByPiston);
    }
    public void checkAndFlip(@NotNull BlockState state, @NotNull ServerLevel level, BlockPos pos) {
        boolean flag = level.hasNeighborSignal(pos);
        if (flag != (Boolean)state.getValue(BlockStateProperties.POWERED)) {
            BlockState blockstate = state;
            if (flag) { // Only when receiving power (not losing power)
                blockstate = (BlockState)state.cycle(LIT);
                level.playSound((Player)null, pos, (Boolean)blockstate.getValue(LIT) ? SoundEvents.COPPER_BULB_TURN_ON : SoundEvents.COPPER_BULB_TURN_OFF, SoundSource.BLOCKS);
            }
            level.setBlock(pos, (BlockState)blockstate.setValue(BlockStateProperties.POWERED, flag), 3);
        }
    }
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(new Property[]{LIT, POWERED});
    }
    public int getLightEmission(@NotNull BlockState state, net.minecraft.world.level.@NotNull BlockGetter level, @NotNull BlockPos pos) { return state.getValue(LIT) ? 15 : 0; }
    protected boolean hasAnalogOutputSignal(@NotNull BlockState state) {
        return true;
    }
    protected int getAnalogOutputSignal(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos) { return (Boolean)level.getBlockState(pos).getValue(LIT) ? 15 : 0; }
}