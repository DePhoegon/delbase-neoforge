package com.dephoegon.delbase.aid.block.colorShift.fence;
import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class terracottaFence extends fenceBlock {
    public terracottaFence(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block).sound(SoundType.CALCITE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public terracottaFence(Block block) {
        super(Properties.ofFullCopy(block).sound(SoundType.CALCITE), "", "", "", false, 0, 0, null);
    }
}