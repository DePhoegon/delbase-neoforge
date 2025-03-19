package com.dephoegon.delbase.aid.block.stock;

import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class energySlab extends slabBlock {
    public energySlab(Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, int fireChance, int fireSpread, BlockState strippedState) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, flames, fireChance, fireSpread, strippedState);
    }
    public energySlab(Properties properties, boolean flames, int fireChance, int fireSpread, BlockState strippedState) {
        super(properties, flames, fireChance, fireSpread, strippedState);
    }
}