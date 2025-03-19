package com.dephoegon.delbase.aid.event;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.*;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.world.level.block.RotatedPillarBlock.AXIS;
import static net.minecraft.world.level.block.SlabBlock.TYPE;
import static net.minecraft.world.level.block.StairBlock.*;
import static net.minecraft.world.level.block.WallBlock.*;

public class blockReplacer {
    public static void wallPlacement(@NotNull Level world, BlockPos blockPos, @NotNull BlockState defaultBlockState) {
        WallSide east = world.getBlockState(blockPos).getValue(EAST_WALL);
        WallSide west = world.getBlockState(blockPos).getValue(WEST_WALL);
        WallSide north = world.getBlockState(blockPos).getValue(NORTH_WALL);
        WallSide south = world.getBlockState(blockPos).getValue(SOUTH_WALL);
        boolean up = world.getBlockState(blockPos).getValue(UP);
        boolean waterLogged = world.getBlockState(blockPos).getValue(WallBlock.WATERLOGGED);

        world.setBlockAndUpdate(blockPos,defaultBlockState.setValue(WallBlock.WATERLOGGED, waterLogged).setValue(WallBlock.UP, up).setValue(SOUTH_WALL, south).setValue(NORTH_WALL, north).setValue(WEST_WALL, west).setValue(EAST_WALL, east));
    }
    public static void stairPlacement(@NotNull Level world, BlockPos blockPos, @NotNull BlockState defaultBlockState) {
        Direction facing = world.getBlockState(blockPos).getValue(FACING);
        Half half = world.getBlockState(blockPos).getValue(HALF);
        StairsShape shape = world.getBlockState(blockPos).getValue(SHAPE);
        Boolean waterlogged = world.getBlockState(blockPos).getValue(StairBlock.WATERLOGGED);

        world.setBlockAndUpdate(blockPos, defaultBlockState.setValue(FACING, facing).setValue(HALF, half).setValue(StairBlock.WATERLOGGED, waterlogged).setValue(SHAPE, shape));
    }
    public static void slabPlacement(@NotNull Level world, BlockPos blockPos, @NotNull BlockState defaultBlockState) {
        SlabType type = world.getBlockState(blockPos).getValue(TYPE);
        Boolean waterlogged = world.getBlockState(blockPos).getValue(SlabBlock.WATERLOGGED);

        world.setBlockAndUpdate(blockPos, defaultBlockState.setValue(TYPE, type).setValue(SlabBlock.WATERLOGGED, waterlogged));
    }
    public static void axisPlacement(Level world, BlockPos blockPos, BlockState defaultBlockState, boolean cut_lock) {
        if(cut_lock) { world.setBlockAndUpdate(blockPos, defaultBlockState); } else {
            Direction.Axis axis = world.getBlockState(blockPos).getValue(AXIS);
            world.setBlockAndUpdate(blockPos, defaultBlockState.setValue(AXIS, axis));
        }
    }
    public static void fencePlacement(@NotNull Level world, BlockPos blockPos, @NotNull BlockState defaultBlockState) {
        Boolean NORTH = world.getBlockState(blockPos).getValue(PipeBlock.NORTH);
        Boolean SOUTH = world.getBlockState(blockPos).getValue(PipeBlock.SOUTH);
        Boolean EAST = world.getBlockState(blockPos).getValue(PipeBlock.EAST);
        Boolean WEST = world.getBlockState(blockPos).getValue(PipeBlock.WEST);
        Boolean WATERLOGGED = world.getBlockState(blockPos).getValue(BlockStateProperties.WATERLOGGED);

        world.setBlockAndUpdate(blockPos, defaultBlockState.setValue(PipeBlock.WEST, WEST).setValue(PipeBlock.EAST, EAST).setValue(PipeBlock.SOUTH, SOUTH).setValue(PipeBlock.NORTH, NORTH).setValue(BlockStateProperties.WATERLOGGED, WATERLOGGED));
    }
    public static void fenceGatePlacement(@NotNull Level world, BlockPos blockPos, @NotNull BlockState defaultBlockState) {
        Direction FACING = world.getBlockState(blockPos).getValue(BlockStateProperties.HORIZONTAL_FACING);
        Boolean OPEN = world.getBlockState(blockPos).getValue(BlockStateProperties.OPEN);
        Boolean POWERED = world.getBlockState(blockPos).getValue(BlockStateProperties.POWERED);
        Boolean IN_WALL = world.getBlockState(blockPos).getValue(BlockStateProperties.IN_WALL);

        world.setBlockAndUpdate(blockPos, defaultBlockState.setValue(BlockStateProperties.HORIZONTAL_FACING, FACING).setValue(BlockStateProperties.OPEN, OPEN).setValue(BlockStateProperties.POWERED, POWERED).setValue(BlockStateProperties.IN_WALL, IN_WALL));
    }
}
