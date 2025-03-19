package com.dephoegon.delbase.aid.block.stock;

import com.dephoegon.delbase.aid.util.kb;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.dephoegon.delbase.aid.util.burnChance.rngBurn;
import static net.neoforged.neoforge.common.ItemAbilities.AXE_STRIP;

public class fenceBlock extends FenceBlock {
    private final String tip0;
    private final String tip1;
    private final String tip2;
    private final boolean flame;
    private final int spread;
    private final int flammability;
    private final BlockState stripped;

    public fenceBlock(Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, int fireChance, int fireSpread, BlockState strippedState) {
        super(properties);
        if (normToolTip.isEmpty()) { tip0 = null; } else { tip0 = normToolTip; }
        if (shiftToolTip.isEmpty()) { tip1 = null; } else { tip1 = shiftToolTip; }
        if (ctrlToolTip.isEmpty()) { tip2 = null; } else { tip2 = ctrlToolTip; }
        flame = flames;
        spread = fireSpread;
        flammability = fireChance;
        stripped = strippedState;
    }
    public fenceBlock(Properties properties, boolean flames, int fireChance, int fireSpread, BlockState strippedState) {
        super(properties);
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
        if (!(kb.HShift()) && !(kb.HCtrl()) && tip0 != null) { toolTip.add(Component.translatable(tip0)); } //if neither pressed, show tip0 (if not empty)
        if (kb.HCtrl() && tip2 != null) { toolTip.add(Component.translatable(tip2)); } //if ctrl, show tip2 (if not empty), do first
        if (kb.HShift() && tip1 != null) { toolTip.add(Component.translatable(tip1)); }//if shifted, show tip1 (if not empty)
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
    public BlockState getToolModifiedState(BlockState state, @NotNull UseOnContext context, ItemAbility toolAction, boolean simulate) {
        Level world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        boolean safeCheck;
        if (stripped != null) {
            safeCheck = stripped.getBlock() instanceof FenceBlock;
        } else { safeCheck = false; }
        if (AXE_STRIP == toolAction && context.getItemInHand().canPerformAction(AXE_STRIP) && safeCheck) {
            Boolean NORTH = world.getBlockState(blockPos).getValue(PipeBlock.NORTH);
            Boolean SOUTH = world.getBlockState(blockPos).getValue(PipeBlock.SOUTH);
            Boolean EAST = world.getBlockState(blockPos).getValue(PipeBlock.EAST);
            Boolean WEST = world.getBlockState(blockPos).getValue(PipeBlock.WEST);
            Boolean WATERLOGGED = world.getBlockState(blockPos).getValue(BlockStateProperties.WATERLOGGED);
            return stripped.setValue(PipeBlock.NORTH, NORTH).setValue(PipeBlock.SOUTH, SOUTH).setValue(PipeBlock.EAST, EAST).setValue(PipeBlock.WEST, WEST).setValue(BlockStateProperties.WATERLOGGED, WATERLOGGED);
        } else { return null; }
    }
}