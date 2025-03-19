package com.dephoegon.delbase.aid.block.colorShift.wall;

import com.dephoegon.delbase.aid.block.stock.wallBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class terracottaWall extends wallBlock {
    public terracottaWall(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block).sound(SoundType.CALCITE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public terracottaWall(Block block) {
        super(Properties.ofFullCopy(block).sound(SoundType.CALCITE), "", "", "", false, 0, 0, null);
    }
}