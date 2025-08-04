package com.dephoegon.delbase.aid.block.colorShift.grav;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.gravBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.NotNull;

public class solidSandBlock extends gravBlock {
    public solidSandBlock(int dustColorIn, Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(dustColorIn, Properties.ofFullCopy(block), normToolTip, shiftToolTip, ctrlToolTip, false);
    }
    public solidSandBlock(int dustColorIn, Block block) {
        super(dustColorIn, Properties.ofFullCopy(block), "", "", "", false);
    }
    @Override
    public boolean canSustainPlant(@NotNull BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull Direction facing, net.minecraftforge.common.@NotNull IPlantable iPlantable) {
        BlockState plant = iPlantable.getPlant(world, pos.relative(facing));
        net.minecraftforge.common.PlantType type = iPlantable.getPlantType(world, pos.relative(facing));
        if (plant.getBlock() == Blocks.CACTUS)
            return true;
        if (plant.getBlock() == Blocks.SUGAR_CANE) {
            for (Direction direction : Direction.Plane.HORIZONTAL) {
                BlockState blockState1 = world.getBlockState(pos.relative(direction));
                FluidState fluidState = world.getFluidState(pos.relative(direction));
                if (fluidState.is(FluidTags.WATER) || blockState1.is(Blocks.FROSTED_ICE)) {
                    return true;
                }
            }
        }
        return net.minecraftforge.common.PlantType.DESERT.equals(type);
    }
}
