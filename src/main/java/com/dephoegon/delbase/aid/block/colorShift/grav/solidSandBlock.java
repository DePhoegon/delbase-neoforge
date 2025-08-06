package com.dephoegon.delbase.aid.block.colorShift.grav;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.gravBlock;
import net.minecraft.world.level.block.Block;

public class solidSandBlock extends gravBlock {
    public solidSandBlock(int dustColorIn, Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(dustColorIn, Properties.ofFullCopy(block), normToolTip, shiftToolTip, ctrlToolTip, false);
    }
    public solidSandBlock(int dustColorIn, Block block) {
        super(dustColorIn, Properties.ofFullCopy(block), "", "", "", false);
    }
    protected boolean isSand() { return true; }
}