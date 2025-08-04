package com.dephoegon.delbase.aid.block.colorShift.stair;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.stairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class terracottaStair extends stairBlock {
    public terracottaStair(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(block, Properties.ofFullCopy(block).sound(SoundType.CALCITE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public terracottaStair(Block block) {
        super(block, Properties.ofFullCopy(block).sound(SoundType.CALCITE), "", "", "", false, 0, 0, null);
    }
}