package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.world.level.block.Block;

public class quartzStair extends stairBlock {
    public quartzStair(Block block, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(block, properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public quartzStair(Block block, Properties properties) {
        super(block, properties, "", "", "", false, 0, 0, null);
    }
}