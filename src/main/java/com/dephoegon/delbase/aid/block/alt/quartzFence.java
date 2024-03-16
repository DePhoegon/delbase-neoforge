package com.dephoegon.delbase.aid.block.alt;
import com.dephoegon.delbase.aid.block.stock.fenceBlock;

public class quartzFence extends fenceBlock {
    public quartzFence(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public quartzFence(Properties properties) {
        super(properties, "", "", "", false, 0, 0, null);
    }
}