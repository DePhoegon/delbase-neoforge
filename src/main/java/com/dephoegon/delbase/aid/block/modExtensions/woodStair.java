package com.dephoegon.delbase.aid.block.modExtensions;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.stairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;

public class woodStair extends stairBlock {
    public woodStair(Block block, SoundType type, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flame, BlockState strippedState) {
        super(block, Properties.ofFullCopy(block).sound(type), normToolTip, shiftToolTip, ctrlToolTip, flame, 5, 20, strippedState);
    }
    public woodStair(Block block, SoundType type, boolean flame, BlockState strippedState) {
        super(block, Properties.ofFullCopy(block).sound(type), "", "", "", flame, 5, 20, strippedState);
    }
}