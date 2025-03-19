package com.dephoegon.delbase.aid.block.colorShift.fence;

import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.world.level.block.Block;

public class cutSandStoneFenceGate extends fenceGateBlock {
    public cutSandStoneFenceGate(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public cutSandStoneFenceGate(Block block) {
        super(Properties.ofFullCopy(block), "", "", "", false, 0, 0, null);
    }
}