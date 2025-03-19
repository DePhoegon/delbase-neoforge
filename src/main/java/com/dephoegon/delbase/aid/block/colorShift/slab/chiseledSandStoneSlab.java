package com.dephoegon.delbase.aid.block.colorShift.slab;

import com.dephoegon.delbase.aid.block.stock.slabBlock;
import net.minecraft.world.level.block.Block;

public class chiseledSandStoneSlab extends slabBlock {
    public chiseledSandStoneSlab(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public chiseledSandStoneSlab(Block block) {
        super(Properties.ofFullCopy(block), "", "", "", false, 0, 0, null);
    }
}