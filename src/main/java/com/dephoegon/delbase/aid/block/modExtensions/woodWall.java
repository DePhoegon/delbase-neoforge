package com.dephoegon.delbase.aid.block.modExtensions;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.genBlock;
import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.wallBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;

public class woodWall extends wallBlock {
    public woodWall(Block block, SoundType type, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flame, BlockState strippedState) {
        super(Properties.ofFullCopy(block).sound(type).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(), normToolTip, shiftToolTip, ctrlToolTip, flame, 5, 20, strippedState);
    }
    public woodWall(Block block, SoundType type, boolean flame, BlockState strippedState) {
        super(Properties.ofFullCopy(block).sound(type).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(), "", "", "", flame, 5, 20, strippedState);
    }
}