package com.dephoegon.delbase.aid.block.modExtensions;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.stairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class concreteStair extends stairBlock {
    public concreteStair(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(block, Properties.ofFullCopy(block).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public concreteStair(Block block) {
        super(block, Properties.ofFullCopy(block).sound(SoundType.STONE), "", "", "", false, 0, 0, null);
    }
}