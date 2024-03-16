package com.dephoegon.delbase.aid.block.colorshift.axis;

import com.dephoegon.delbase.aid.block.stock.axisBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class cutSandStone extends axisBlock {
    public cutSandStone(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0);
    }
    public cutSandStone(Block block) {
        super(Properties.ofFullCopy(block).sound(SoundType.STONE), "", "", "", false, 0, 0);
    }
}