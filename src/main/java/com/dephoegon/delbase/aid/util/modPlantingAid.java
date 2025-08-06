package com.dephoegon.delbase.aid.util;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CactusBlock;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class modPlantingAid {
    /**
     * Determines if the block is plantable on sand or dirt-like blocks.
     * Currently, only Supports Sugar Cane and Cactus.
     * @param state The BlockState of the block being checked.
     * @param isSand Whether the block is sand Mod Block.
     * @param isDirtLike Whether the block is dirt-like Mod Block.
     * @param pos The position of the block being checked.
     * @param level The BlockGetter for the level.
     * @param typeInString The type of block being checked (top,double,up), can be null.
     * @return True if the block can be planted on, false otherwise.
     */
    public static boolean isPlantable(@NotNull BlockState state, boolean isSand, boolean isDirtLike, BlockPos pos, BlockGetter level, @Nullable String typeInString) {
        boolean isValidType = typeInString == null || typeInString.equals("top") || typeInString.equals("double") || typeInString.equals("up");
        if (!(isSand || isDirtLike) || !isValidType) { return false; }
        return isSandPlant(state, isSand, pos, level) || isDirtLike(state, isDirtLike, pos, level);
    }
    private static boolean isSandPlant(BlockState state, boolean isSand, BlockPos soilPosition, BlockGetter level) {
        if (!isSand) { return false; }
        if (state.getBlock() instanceof CactusBlock) { return true; }
        if (state.getBlock() instanceof SugarCaneBlock) { return viableSugarCane(state, soilPosition, level); }
        return false;
    }
    private static boolean isDirtLike(@NotNull BlockState state, boolean isDirtLike, BlockPos soilPosition, BlockGetter level) {
        if (!isDirtLike) { return false; }
        if (state.getBlock() instanceof SugarCaneBlock) { return viableSugarCane(state, soilPosition, level); }
        return false;
    }
    private static boolean viableSugarCane(BlockState state, BlockPos pos, BlockGetter level) {
        if (state.getBlock() instanceof SugarCaneBlock) {
            for (Direction direction: Direction.Plane.HORIZONTAL) {
                BlockState blockState1 = level.getBlockState(pos.relative(direction));
                FluidState fluidState = level.getFluidState(pos.relative(direction));
                if (fluidState.is(FluidTags.WATER) || blockState1.is(Blocks.FROSTED_ICE)) { return true; }
            }
        }
        return false;
    }
}