package com.dephoegon.delbase.aid.block.alt;
import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;

public class quartzGateBlock extends fenceGateBlock {
    public quartzGateBlock(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public quartzGateBlock(Properties properties) {
        super(properties, "", "", "", false, 0, 0, null);
    }
}