package com.dephoegon.delbase.aid.block.stock;

import com.dephoegon.delbase.aid.util.kb;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.dephoegon.delbase.aid.util.burnChance.rngBurn;
import static net.neoforged.neoforge.common.ItemAbilities.AXE_STRIP;

public class fenceGateBlock extends FenceGateBlock {
    private final String tip0;
    private final String tip1;
    private final String tip2;
    private final boolean flame;
    private final int spread;
    private final int flammability;
    private final BlockState stripped;
    public fenceGateBlock(Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, int fireChance, int fireSpread, BlockState strippedState) {
        super(properties, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);
        if(normToolTip.isEmpty()) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.isEmpty()) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.isEmpty()) { tip2 = null; } else { tip2 = ctrlToolTip; }
        flame = flames;
        spread = fireSpread;
        flammability = fireChance;
        stripped = strippedState;
    }
    public fenceGateBlock(Properties properties, boolean flames, int fireChance, int fireSpread, BlockState strippedState) {
        super(properties, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);
        tip0 = null;
        tip1 = null;
        tip2 = null;
        flame = flames;
        spread = fireSpread;
        flammability = fireChance;
        stripped = strippedState;
    }
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Item.TooltipContext worldIn, @NotNull List<Component> toolTip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, worldIn, toolTip, flag);
        if(!(kb.HShift()) && !(kb.HCtrl()) && tip0 != null) { toolTip.add(Component.translatable(tip0)); } //if neither pressed, show tip0 (if not empty)
        if(kb.HCtrl() && tip2 != null) { toolTip.add(Component.translatable(tip2)); } //if ctrl, show tip2 (if not empty), do first
        if(kb.HShift() && tip1 != null) { toolTip.add(Component.translatable(tip1)); }//if shifted, show tip1 (if not empty)
    }
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        if (flame) { rngBurn(world, state, pos, 40, 60); }
        return flame;
    }
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        if (flame) { return spread; }
        return 0;
    }
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        if (flame) { return spread; }
        return 0;
    }
    @Nullable
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility toolAction, boolean simulate) {
        Level world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        boolean safeCheck;
        if (stripped != null) { safeCheck = stripped.getBlock() instanceof FenceGateBlock; } else { safeCheck = false; }
        if (AXE_STRIP == toolAction && context.getItemInHand().canPerformAction(AXE_STRIP) && safeCheck) {
            Direction FACING = world.getBlockState(blockPos).getValue(BlockStateProperties.HORIZONTAL_FACING);
            Boolean OPEN = world.getBlockState(blockPos).getValue(BlockStateProperties.OPEN);
            Boolean POWERED = world.getBlockState(blockPos).getValue(BlockStateProperties.POWERED);
            Boolean IN_WALL = world.getBlockState(blockPos).getValue(BlockStateProperties.IN_WALL);
            return stripped.setValue(BlockStateProperties.HORIZONTAL_FACING, FACING).setValue(BlockStateProperties.OPEN, OPEN).setValue(BlockStateProperties.POWERED, POWERED).setValue(BlockStateProperties.IN_WALL, IN_WALL);
        } else { return null; }
    }
}