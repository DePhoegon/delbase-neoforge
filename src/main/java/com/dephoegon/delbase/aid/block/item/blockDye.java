package com.dephoegon.delbase.aid.block.item;

import com.dephoegon.delbase.aid.block.stock.*;
import com.dephoegon.delbase.aid.util.kb;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

import static com.dephoegon.delbase.aid.event.typeSelector.*;
import static com.dephoegon.delbase.aid.util.blockArrayList.*;

public class blockDye extends DyeItem {
    private final String tip0;
    private final String tip1;
    private final String tip2;

    public blockDye(DyeColor dyeColor, Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(dyeColor, properties);
        if(normToolTip.isEmpty()) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.isEmpty()) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.isEmpty()) { tip2 = null; } else { tip2 = ctrlToolTip; }
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> toolTip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, level, toolTip, flag);
        if(!(kb.HShift()) && !(kb.HCtrl()) && tip0 != null) toolTip.add(Component.translatable(tip0)); //if neither pressed, show tip0 (if not empty)
        if(kb.HCtrl() && tip2 != null) toolTip.add(Component.translatable(tip2)); //if ctrl, show tip2 (if not empty), do first
        if(kb.HShift() && tip1 != null) //noinspection GrazieInspection
            toolTip.add(Component.translatable(tip1)); //if shift, show tip1 (if not empty)
    }

    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext context) {
        Level world = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        Block block = world.getBlockState(blockpos).getBlock();
        BlockState defaultBlockState = block.defaultBlockState();
        Player player = context.getPlayer();
        assert player != null;
        Item dye_hand = player.getItemInHand(context.getHand()).getItem();
        boolean m_hand_dye = dye_hand.asItem() == player.getMainHandItem().getItem();
        if (m_hand_dye) {
            if (block instanceof axisBlock || getAxis_list().contains(defaultBlockState)) {
                return axis_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof slabBlock || getSlab_list().contains(defaultBlockState)) {
                return slab_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof genBlock || getGeneral_list().contains(defaultBlockState)) {
                return gen_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof gravBlock || getGravity_list().contains(defaultBlockState)) {
                return grav_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof stairBlock || getStair_list().contains(defaultBlockState)) {
                return stair_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof wallBlock || getWall_list().contains(defaultBlockState)) {
                return wall_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof fenceBlock) {
                return fence_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof fenceGateBlock) {
                return fenceGate_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
        }
        return InteractionResult.FAIL;
    }
}
