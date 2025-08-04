package com.dephoegon.delbase.aid.block.fromBaseGameExtensions;

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
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WallSide;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.dephoegon.delbase.aid.util.burnChance.rngBurn;
import static net.neoforged.neoforge.common.ItemAbilities.AXE_STRIP;

public class wallBlock extends WallBlock {
    private final String tip0;
    private final String tip1;
    private final String tip2;
    private final boolean flame;
    private final int spread;
    private final int flammability;
    private final BlockState stripped;
    public wallBlock(Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, int fireChance, int fireSpread, BlockState strippedState) {
        super(properties);
        if(normToolTip.isEmpty()) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.isEmpty()) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.isEmpty()) { tip2 = null; } else { tip2 = ctrlToolTip; }
        flame = flames;
        spread = fireSpread;
        flammability = fireChance;
        stripped = strippedState;
    }
    public wallBlock(Properties properties, boolean flames, int fireChance, int fireSpread, BlockState strippedState) {
        super(properties);
        tip0 = null;
        tip1 = null;
        tip2 = null;
        flame = flames;
        spread = fireSpread;
        flammability = fireChance;
        stripped = strippedState;
    }
    public void appendHoverText(@NotNull ItemStack stack, Item.@NotNull TooltipContext worldIn, @NotNull List<Component> toolTip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, worldIn, toolTip, flag);
        if(!(kb.HShift()) && !(kb.HCtrl()) && tip0 != null) { toolTip.add(Component.translatable(tip0)); } //if neither pressed, show tip0 (if not empty)
        if(kb.HCtrl() && tip2 != null) { toolTip.add(Component.translatable(tip2)); } //if ctrl, show tip2 (if not empty), do first
        if(kb.HShift() && tip1 != null) { toolTip.add(Component.translatable(tip1)); }//if shifted, show tip1 (if not empty)
    }
    public boolean isFlammable(@NotNull BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull Direction face) {
        if (flame && !state.getValue(WATERLOGGED)) {
            rngBurn(world, state, pos, 40, 60);
        }
        return flame && !state.getValue(WATERLOGGED);
    }
    public int getFlammability(@NotNull BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull Direction face) {
        if (flame) { return flammability; }
        return 0;
    }
    public int getFireSpreadSpeed(@NotNull BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull Direction face) {
        if (flame) { return spread; }
        return 0;
    }
    public BlockState getToolModifiedState(@NotNull BlockState state, @NotNull UseOnContext context, @NotNull ItemAbility toolAction, boolean simulate) {
        Level world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        boolean safeCheck;
        if (stripped != null) { safeCheck = stripped.getBlock() instanceof WallBlock; } else { safeCheck = false; }
        if (AXE_STRIP == toolAction && context.getItemInHand().canPerformAction(AXE_STRIP) && safeCheck) {
            WallSide east = world.getBlockState(blockPos).getValue(EAST_WALL);
            WallSide west = world.getBlockState(blockPos).getValue(WEST_WALL);
            WallSide north = world.getBlockState(blockPos).getValue(NORTH_WALL);
            WallSide south = world.getBlockState(blockPos).getValue(SOUTH_WALL);
            boolean up = world.getBlockState(blockPos).getValue(UP);
            boolean waterLogged = world.getBlockState(blockPos).getValue(WallBlock.WATERLOGGED);
            return stripped.setValue(EAST_WALL, east).setValue(WATERLOGGED, waterLogged).setValue(UP, up).setValue(WEST_WALL, west).setValue(NORTH_WALL, north).setValue(SOUTH_WALL, south);
        } else { return null; }
    }
}
