package com.dephoegon.delbase.aid.block.colorShift.stair;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.stairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class chiseledSandStoneStair extends stairBlock {
    public chiseledSandStoneStair(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(block, Properties.ofFullCopy(block).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public chiseledSandStoneStair(Block block) {
        super(block, Properties.ofFullCopy(block).sound(SoundType.STONE), "", "", "", false, 0, 0, null);
    }
}