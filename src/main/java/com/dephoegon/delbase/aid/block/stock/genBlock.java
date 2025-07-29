package com.dephoegon.delbase.aid.block.stock;

import com.dephoegon.delbase.aid.util.kb;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.dephoegon.delbase.aid.util.burnChance.rngBurn;

public class genBlock extends Block {
    private final String tip0;
    private final String tip1;
    private final String tip2;
    private final boolean flame;
    private final int spread;
    private final int flammability;
    public genBlock(Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, int fireChance, int fireSpread) {
        super(properties);
        if(normToolTip.isEmpty()) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.isEmpty()) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.isEmpty()) { tip2 = null; } else { tip2 = ctrlToolTip; }
        flame = flames;
        spread = fireSpread;
        flammability = fireChance;
    }
    public genBlock(Properties properties, boolean flames, int fireChance, int fireSpread) {
        super(properties);
        tip0 = null;
        tip1 = null;
        tip2 = null;
        flame = flames;
        spread = fireSpread;
        flammability = fireChance;
    }
    public void appendHoverText(@NotNull ItemStack stack, Item.@NotNull TooltipContext worldIn, @NotNull List<Component> toolTip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, worldIn, toolTip, flag);
        if(!(kb.HShift()) && !(kb.HCtrl()) && tip0 != null) { toolTip.add(Component.translatable(tip0)); } //if neither pressed, show tip0 (if not empty)
        if(kb.HCtrl() && tip2 != null) { toolTip.add(Component.translatable(tip2)); } //if ctrl, show tip2 (if not empty), do first
        if(kb.HShift() && tip1 != null) { toolTip.add(Component.translatable(tip1)); }//if shifted, show tip1 (if not empty)
    }
    public boolean isFlammable(@NotNull BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull Direction face) {
        if (flame) { rngBurn(world, state, pos, 40, 60); }
        return flame;
    }
    public int getFlammability(@NotNull BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull Direction face) {
        if (flame) { return flammability; }
        return 0;
    }
    public int getFireSpreadSpeed(@NotNull BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull Direction face) {
        if (flame) { return spread; }
        return 0;
    }
    @SuppressWarnings({"SameReturnValue", "unused"})
    public static boolean never(BlockState state, BlockGetter blockGetter, BlockPos pos) { return false; }
}