package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.slabBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class concreteSlab extends slabBlock {
    public concreteSlab(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public concreteSlab(Block block) {
        super(Properties.ofFullCopy(block).sound(SoundType.STONE), "", "", "", false, 0, 0, null);
    }
}