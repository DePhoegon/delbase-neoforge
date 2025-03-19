package com.dephoegon.delbase.aid.block.colorShift.fence;

import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import net.minecraft.world.level.block.Block;

public class cutSandStoneFence extends fenceBlock {
    public cutSandStoneFence(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public cutSandStoneFence(Block block) {
        super(Properties.ofFullCopy(block), "", "", "", false, 0, 0, null);
    }
}