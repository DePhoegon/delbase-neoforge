package com.dephoegon.delbase.aid.block.colorShift.stair;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.stairBlock;
import net.minecraft.world.level.block.Block;

public class sandStair extends stairBlock {
    public sandStair(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(block, Properties.ofFullCopy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public sandStair(Block block) {
        super(block, Properties.ofFullCopy(block), "", "", "", false, 0, 0, null);
    }
}