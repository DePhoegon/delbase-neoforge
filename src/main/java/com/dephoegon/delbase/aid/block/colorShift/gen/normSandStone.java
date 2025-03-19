package com.dephoegon.delbase.aid.block.colorShift.gen;

import com.dephoegon.delbase.aid.block.stock.genBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class normSandStone extends genBlock {
    public normSandStone(MapColor color, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(Properties.of().mapColor(color).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE), normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0);
    }
    public normSandStone(MapColor color) {
        super(Properties.of().mapColor(color).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE), "", "", "", false, 0, 0);
    }
}