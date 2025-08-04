package com.dephoegon.delbase.aid.block.colorShift.slab;

import com.dephoegon.delbase.aid.block.modExtensions.energySlab;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.NotNull;

public class sandSlabEnergy extends energySlab {
    public sandSlabEnergy(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block).lightLevel((blockState)-> 5), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public sandSlabEnergy(Block block) {
        super(Properties.ofFullCopy(block).lightLevel((blockState)-> 5), "", "", "", false, 0, 0, null);
    }
    @Override
    public boolean canSustainPlant(@NotNull BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull Direction facing, net.minecraftforge.common.@NotNull IPlantable iPlantable) {
        BlockState plant = iPlantable.getPlant(world, pos.relative(facing));
        SlabType s_type = state.getValue(TYPE);
        boolean w_logged = state.getValue(SlabBlock.WATERLOGGED);
        net.minecraftforge.common.PlantType type = iPlantable.getPlantType(world, pos.relative(facing));
        if (s_type != SlabType.BOTTOM) {
            if (plant.getBlock() == Blocks.CACTUS) { return true; }
            if (plant.getBlock() == Blocks.SUGAR_CANE) {
                for (Direction direction : Direction.Plane.HORIZONTAL) {
                    BlockState blockState = world.getBlockState(pos.relative(direction));
                    FluidState fluidState = world.getFluidState(pos.relative(direction));
                    if (w_logged || fluidState.is(FluidTags.WATER) || blockState.is(Blocks.FROSTED_ICE)) { return true; }
                }
            }
            return net.minecraftforge.common.PlantType.DESERT.equals(type);
        }
        return false;
    }
}