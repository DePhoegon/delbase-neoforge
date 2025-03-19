package com.dephoegon.delbase.aid.block.colorShift.slab;

import com.dephoegon.delbase.aid.block.stock.energySlab;
import net.minecraft.world.level.block.Block;

public class sandStoneSlabEnergy extends energySlab {
    public sandStoneSlabEnergy(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block).lightLevel((blockState)-> 5), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public sandStoneSlabEnergy(Block block) {
        super(Properties.ofFullCopy(block).lightLevel((blockState)-> 5), "", "", "", false, 0, 0, null);
    }
}