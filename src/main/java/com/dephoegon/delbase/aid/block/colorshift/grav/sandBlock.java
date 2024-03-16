package com.dephoegon.delbase.aid.block.colorshift.grav;

import com.dephoegon.delbase.aid.block.stock.gravBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.common.PlantType;
import org.jetbrains.annotations.NotNull;

public class sandBlock extends gravBlock {
    public sandBlock(int dustColorIn, MapColor color, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean falls) {
        super(dustColorIn, BlockBehaviour.Properties.of().mapColor(color).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND), normToolTip, shiftToolTip, ctrlToolTip, falls);
    }
    public sandBlock(int dustColorIn, MapColor color, boolean falls) {
        super(dustColorIn, BlockBehaviour.Properties.of().mapColor(color).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND), "", "", "", falls);
    }
    @Override
    public boolean canSustainPlant(@NotNull BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull Direction facing, net.neoforged.neoforge.common.@NotNull IPlantable plantable) {
        PlantType type = plantable.getPlantType(world, pos.relative(facing));
        if (PlantType.BEACH.equals(type)) {
            for (Direction direction : Direction.Plane.HORIZONTAL) {
                BlockState blockState1 = world.getBlockState(pos.relative(direction));
                FluidState fluidstate = world.getFluidState(pos.relative(direction));
                if (fluidstate.is(FluidTags.WATER) || blockState1.is(Blocks.FROSTED_ICE)) { return true; }
            }
        }
        return PlantType.DESERT.equals(type);
    }
}