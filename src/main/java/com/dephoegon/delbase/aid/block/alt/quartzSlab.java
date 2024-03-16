package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.slabBlock;

public class quartzSlab extends slabBlock {
    public quartzSlab(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public quartzSlab(Properties properties) {
        super(properties, "", "", "", false, 0, 0, null);
    }
}