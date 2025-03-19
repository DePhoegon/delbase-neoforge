package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.slabBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;

public class woodSlab extends slabBlock {
    public woodSlab(Block block, SoundType type, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flame, BlockState strippedState) {
        super(Properties.ofFullCopy(block).sound(type), normToolTip, shiftToolTip, ctrlToolTip, flame, 5, 20, strippedState);
    }
    public woodSlab(Block block, SoundType type, boolean flame, BlockState strippedState) {
        super(Properties.ofFullCopy(block).sound(type), "", "", "", flame, 5, 20, strippedState);
    }
}