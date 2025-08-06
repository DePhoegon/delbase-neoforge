package com.dephoegon.delbase.aid.block.colorShift.grav;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.gravBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class sandBlock extends gravBlock {
    public sandBlock(int dustColorIn, MapColor color, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean falls) {
        super(dustColorIn, Properties.of().mapColor(color).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND), normToolTip, shiftToolTip, ctrlToolTip, falls);
    }
    public sandBlock(int dustColorIn, MapColor color, boolean falls) {
        super(dustColorIn, Properties.of().mapColor(color).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND), "", "", "", falls);
    }
    protected boolean isSand() { return true; }
}