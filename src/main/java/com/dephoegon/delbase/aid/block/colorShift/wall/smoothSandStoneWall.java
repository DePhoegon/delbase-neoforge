package com.dephoegon.delbase.aid.block.colorShift.wall;

import com.dephoegon.delbase.aid.block.stock.wallBlock;
import net.minecraft.world.level.block.Block;

public class smoothSandStoneWall extends wallBlock {
    public smoothSandStoneWall(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public smoothSandStoneWall(Block block) {
        super(Properties.ofFullCopy(block), "", "", "", false, 0, 0, null);
    }
}