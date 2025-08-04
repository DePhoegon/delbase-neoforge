package com.dephoegon.delbase.aid.block.colorShift.wall;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.wallBlock;
import net.minecraft.world.level.block.Block;

public class sandWall extends wallBlock {
    public sandWall(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public sandWall(Block block) {
        super(Properties.ofFullCopy(block), "", "", "", false, 0, 0, null);
    }
}