package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.config.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.level.block.state.properties.WallSide;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

import static com.dephoegon.delbase.aid.util.blockArrayList.getVanilla_wood_list;
import static com.dephoegon.delbase.block.general.ashBlocks.*;
import static com.dephoegon.delbase.block.general.miscSpecialCases.ASH_BLOCK;
import static net.minecraft.world.level.block.StairBlock.SHAPE;
import static net.minecraft.world.level.block.state.properties.BlockStateProperties.*;
import static net.minecraft.world.level.block.state.properties.BlockStateProperties.IN_WALL;

public class burnChance {
    private static boolean ashReplaceRNG() {
        return randomNum(Config.BURN_CHANCE_NUMBER_CAP.get()) > Config.BURN_CHANCE_NUMBER.get();
    } //used to control % odds for replacing blocks/spawning fire
    public static boolean threshHold(int cap, int thresh) { return randomNum(cap) > thresh; }
    public static void rngBurn(@NotNull BlockGetter world, @NotNull BlockState burningBlock, BlockPos pos, int burnThreshHold, int burnCap){
        // Double Comparison is used to avoid drastic failure.
        // They should always match, but if for some reason it manages to pull the wrong BlockState, it won't break the game.
        boolean genBlock = true;
        boolean waterlogged = false;
        if (burningBlock.getBlock() instanceof WallBlock) {
            genBlock = false;
            if (threshHold(burnCap, burnThreshHold)) {
                WallSide east = burningBlock.getValue(EAST_WALL);
                WallSide west = burningBlock.getValue(WEST_WALL);
                WallSide north = burningBlock.getValue(NORTH_WALL);
                WallSide south = burningBlock.getValue(SOUTH_WALL);
                boolean up = burningBlock.getValue(WallBlock.UP);
                if (ashReplaceRNG()){

                    ((Level) world).setBlockAndUpdate(pos, ASH_WALL.get().defaultBlockState().setValue(WallBlock.WATERLOGGED, waterlogged).setValue(WallBlock.EAST_WALL, east).setValue(WallBlock.WEST_WALL, west).setValue(WallBlock.NORTH_WALL, north).setValue(WallBlock.SOUTH_WALL, south).setValue(WallBlock.UP, up));
                } // chance to replace block with supplied ashBlock.
            }
        }
        if (burningBlock.getBlock() instanceof StairBlock) {
            genBlock = false;
            if (threshHold(burnCap, burnThreshHold)) {
                Direction facing = burningBlock.getValue(StairBlock.FACING);
                Half half = burningBlock.getValue(StairBlock.HALF);
                StairsShape shape = burningBlock.getValue(SHAPE);
                if (ashReplaceRNG()) {

                    ((Level) world).setBlockAndUpdate(pos, ASH_STAIR.get().defaultBlockState().setValue(StairBlock.FACING, facing).setValue(StairBlock.HALF, half).setValue(SHAPE, shape).setValue(StairBlock.WATERLOGGED, waterlogged));
                }// chance to replace block with supplied ashBlock.
            }
        }
        if (burningBlock.getBlock() instanceof SlabBlock) {
            genBlock = false;
            if (threshHold(burnCap,burnThreshHold)) {
                SlabType type = burningBlock.getValue(SlabBlock.TYPE);
                if (ashReplaceRNG()) {

                    ((Level) world).setBlockAndUpdate(pos, ASH_SLAB.get().defaultBlockState().setValue(SlabBlock.TYPE, type).setValue(SlabBlock.WATERLOGGED, waterlogged));
                } // chance to replace block with supplied ashBlock.
            }
        }
        if (burningBlock.getBlock() instanceof RotatedPillarBlock) {
            genBlock = false;
            if (threshHold(burnCap, burnThreshHold)) {
                Direction.Axis axis = burningBlock.getValue(AXIS);
                BlockState blockState = getVanilla_wood_list().contains(burningBlock.getBlock().defaultBlockState()) ? ASH_BLOCK.get().defaultBlockState() : ASH_LOG.get().defaultBlockState();
                if(ashReplaceRNG()) {
                    ((Level) world).setBlockAndUpdate(pos, blockState.setValue(AXIS, axis));
                } // chance to replace block with supplied ashBlock.
            }
        }
        if (burningBlock.getBlock() instanceof FenceBlock) {
            genBlock = false;
            if (threshHold(burnCap, burnThreshHold)) {
                Boolean east = burningBlock.getValue(CrossCollisionBlock.EAST);
                Boolean west = burningBlock.getValue(CrossCollisionBlock.WEST);
                Boolean south = burningBlock.getValue(CrossCollisionBlock.SOUTH);
                Boolean north = burningBlock.getValue(CrossCollisionBlock.NORTH);
                if (ashReplaceRNG()){
                    ((Level) world).setBlockAndUpdate(pos, ASH_FENCE.get().defaultBlockState().setValue(CrossCollisionBlock.EAST, east).setValue(CrossCollisionBlock.WEST, west).setValue(CrossCollisionBlock.NORTH, north).setValue(CrossCollisionBlock.SOUTH, south));
                }
            }
        }
        if (burningBlock.getBlock() instanceof FenceGateBlock) {
            genBlock = false;
            if (threshHold(burnCap, burnThreshHold)) {
                Boolean open = burningBlock.getValue(OPEN);
                Boolean powered = burningBlock.getValue(POWERED);
                Boolean inWall = burningBlock.getValue(IN_WALL);
                Direction facing = burningBlock.getValue(HorizontalDirectionalBlock.FACING);
                if (ashReplaceRNG()) {
                    ((Level) world).setBlockAndUpdate(pos, ASH_FENCE_GATE.get().defaultBlockState().setValue(OPEN, open).setValue(POWERED, powered).setValue(IN_WALL, inWall).setValue(HorizontalDirectionalBlock.FACING, facing));
                }
            }
        }
        if (genBlock) {
            if (threshHold(burnCap, burnThreshHold)) {
                BlockState defaultBlock = ASH_BLOCK.get().defaultBlockState().getBlock().defaultBlockState();
                ((Level) world).setBlockAndUpdate(pos, defaultBlock);
            } // chance to replace block with supplied ashBlock.
        }
    }
    private static int randomNum(int max){
        Random random = new Random();
        return random.nextInt(max)+1;
    }
}