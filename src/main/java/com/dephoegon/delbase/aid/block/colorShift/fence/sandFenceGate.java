package com.dephoegon.delbase.aid.block.colorShift.fence;

import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class sandFenceGate extends fenceGateBlock {
    public sandFenceGate(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block).sound(SoundType.SAND), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public sandFenceGate(Block block) {
        super(Properties.ofFullCopy(block).sound(SoundType.SAND), "", "", "", false, 0, 0, null);
    }
}