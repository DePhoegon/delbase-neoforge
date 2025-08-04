package com.dephoegon.delbase.aid.block.modExtensions;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.genBlock;
import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.slabBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class leafSlab extends slabBlock {
    public leafSlab(Block block, SoundType type, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, BlockState strippedState) {
        super(Properties.ofFullCopy(block).sound(type).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(), normToolTip, shiftToolTip, ctrlToolTip, flames, 30, 60, strippedState);
    }
    public leafSlab(Block block, SoundType type, boolean flames, BlockState strippedState) {
        super(Properties.ofFullCopy(block).sound(type).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(), "", "", "", flames, 30, 60, strippedState);
    }
}