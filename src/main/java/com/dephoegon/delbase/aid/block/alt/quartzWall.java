package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.wallBlock;

public class quartzWall extends wallBlock {
    public quartzWall(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public quartzWall(Properties properties) {
        super(properties, "", "", "", false, 0, 0, null);
    }
}