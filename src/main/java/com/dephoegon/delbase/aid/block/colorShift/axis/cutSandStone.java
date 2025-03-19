package com.dephoegon.delbase.aid.block.colorShift.axis;

import com.dephoegon.delbase.aid.block.stock.axisBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class cutSandStone extends axisBlock {
    public cutSandStone(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(BlockBehaviour.Properties.ofFullCopy(block).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0);
    }
    public cutSandStone(Block block) {
        super(BlockBehaviour.Properties.ofFullCopy(block).sound(SoundType.STONE), "", "", "", false, 0, 0);
    }
}