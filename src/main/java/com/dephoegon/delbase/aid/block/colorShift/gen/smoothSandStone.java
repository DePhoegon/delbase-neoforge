package com.dephoegon.delbase.aid.block.colorShift.gen;

import com.dephoegon.delbase.aid.block.stock.genBlock;
import net.minecraft.world.level.block.Block;

public class smoothSandStone extends genBlock {
    public smoothSandStone(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0 ,0);
    }
    public smoothSandStone(Block block) {
        super(Properties.ofFullCopy(block), "", "", "", false, 0 ,0);
    }
}