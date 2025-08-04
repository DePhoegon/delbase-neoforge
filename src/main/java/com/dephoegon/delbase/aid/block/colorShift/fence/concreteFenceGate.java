package com.dephoegon.delbase.aid.block.colorShift.fence;
import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.fenceGateBlock;
import net.minecraft.world.level.block.Block;

public class concreteFenceGate extends fenceGateBlock {
    public concreteFenceGate(Block block, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.ofFullCopy(block), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, null);
    }
    public concreteFenceGate(Block block) {
        super(Properties.ofFullCopy(block), "", "", "", false, 0, 0, null);
    }
}