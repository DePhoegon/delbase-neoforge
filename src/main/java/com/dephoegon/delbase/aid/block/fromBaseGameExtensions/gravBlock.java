package com.dephoegon.delbase.aid.block.fromBaseGameExtensions;

import com.dephoegon.delbase.aid.util.blockArrayList;
import com.dephoegon.delbase.aid.util.kb;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.ColorRGBA;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.util.TriState;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.dephoegon.delbase.aid.util.modPlantingAid.isPlantable;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

@SuppressWarnings("unused")
public class gravBlock extends ColoredFallingBlock {
    private final String tip0;
    private final String tip1;
    private final String tip2;
    private final boolean fall;
    public gravBlock(int dustColorIn, Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean falls) {
        super(new ColorRGBA(dustColorIn), properties);
        if (normToolTip.isEmpty()) { tip0 = null; } else { tip0 = normToolTip; }
        if (shiftToolTip.isEmpty()) { tip1 = null; } else { tip1 = shiftToolTip; }
        if (ctrlToolTip.isEmpty()) { tip2 = null; } else { tip2 = ctrlToolTip; }
        fall = falls;
    }
    public gravBlock(int dustColorIn, Properties properties, boolean falls) {
        super(new ColorRGBA(dustColorIn), properties);
        tip0 = null;
        tip1 = null;
        tip2 = null;
        fall = falls;
    }
    public void appendHoverText(@NotNull ItemStack stack, Item.@NotNull TooltipContext worldIn, @NotNull List<Component> toolTip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, worldIn, toolTip, flag);
        if(!(kb.HShift()) && !(kb.HCtrl()) && tip0 != null) { toolTip.add(Component.translatable(tip0)); } //if neither pressed, show tip0 (if not empty)
        if(kb.HCtrl() && tip2 != null) { toolTip.add(Component.translatable(tip2)); } //if ctrl, show tip2 (if not empty), do first
        if(kb.HShift() && tip1 != null) { toolTip.add(Component.translatable(tip1)); } //if shifted, show tip1 (if not empty)
    }
    public void tick(@NotNull BlockState state, @NotNull ServerLevel worldIn, @NotNull BlockPos pos, @NotNull RandomSource pRandom) {
        if (gravity(worldIn, pos) && pos.getY() >= -164) {
            FallingBlockEntity fallingblockentity = FallingBlockEntity.fall(worldIn, pos, state);
            this.falling(fallingblockentity);
            worldIn.addFreshEntity(fallingblockentity);
        }
    }

    private boolean gravity(ServerLevel worldIn, BlockPos pos) {
        boolean t_fall;
        boolean airOrFallthrough;
        boolean hld;
        if (fall) {
            hld = spider(pos.above(), worldIn, 0);
            airOrFallthrough = worldIn.getBlockState(pos.below()).isAir() || isFree(worldIn.getBlockState(pos.below()));
            if (hld) { t_fall = false; } else { t_fall = airOrFallthrough; }
        } else { t_fall = false; }
        return t_fall;
    }
    private boolean spider(BlockPos pos, @NotNull ServerLevel worldIn, int count) {
        boolean last;
        int l_count = count+1;
        Block bob = worldIn.getBlockState(pos).getBlock();
        if (blockArrayList.checkFallLock(bob)) { last = true; }
        else if (
            // Recursive call as it allows for go up through custom gravity block class
            // includes checks for sand and red sand
            // Will expand exceptions if gravBlock also expands beyond sand & solid sand
                bob instanceof gravBlock && l_count < 7 ||
                        bob.defaultBlockState() == SAND.defaultBlockState() && l_count < 7 ||
                        bob.defaultBlockState() == RED_SAND.defaultBlockState() && l_count < 7
        ) { last = spider(pos.above(), worldIn, l_count); }
        else { last = false; }
        return last;
    }
    public @NotNull TriState canSustainPlant(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos soilPosition, @NotNull Direction facing, @NotNull BlockState plant) {
        if (isPlantable(state, isSand(), isDirtLike(), soilPosition, level, null)) { return TriState.TRUE; }
        return TriState.DEFAULT;
    }
    protected boolean isSand() { return false; }
    protected boolean isDirtLike() { return false; }
}