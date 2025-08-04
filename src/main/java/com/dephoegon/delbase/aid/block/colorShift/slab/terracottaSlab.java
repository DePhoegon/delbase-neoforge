package com.dephoegon.delbase.aid.block.colorShift.slab;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.slabBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class terracottaSlab extends slabBlock {
    public terracottaSlab(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block).sound(SoundType.CALCITE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public terracottaSlab(Block block) {
        super(Properties.ofFullCopy(block).sound(SoundType.CALCITE), "", "", "", false, 0, 0, null);
    }
}