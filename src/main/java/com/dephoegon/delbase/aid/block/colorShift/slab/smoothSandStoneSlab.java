package com.dephoegon.delbase.aid.block.colorShift.slab;

import com.dephoegon.delbase.aid.block.stock.slabBlock;
import net.minecraft.world.level.block.Block;

public class smoothSandStoneSlab extends slabBlock {
    public smoothSandStoneSlab(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public smoothSandStoneSlab(Block block) {
        super(Properties.ofFullCopy(block), "", "", "", false, 0, 0, null);
    }
}