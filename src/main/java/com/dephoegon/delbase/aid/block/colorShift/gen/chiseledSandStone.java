package com.dephoegon.delbase.aid.block.colorShift.gen;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.genBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class chiseledSandStone extends genBlock {
    public chiseledSandStone(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0);
    }
    public chiseledSandStone(Block block) {
        super(Properties.ofFullCopy(block).sound(SoundType.STONE), "", "", "", false, 0, 0);
    }
}