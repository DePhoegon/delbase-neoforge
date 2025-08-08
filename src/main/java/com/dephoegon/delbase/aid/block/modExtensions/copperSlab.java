package com.dephoegon.delbase.aid.block.modExtensions;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.slabBlock;
import com.dephoegon.delbase.aid.util.weatheringCopper;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;

import static com.dephoegon.delbase.aid.util.WeatherState.getStateByOrder;
import static com.dephoegon.delbase.block.slab.slabCopers.*;

public class copperSlab extends slabBlock implements weatheringCopper {
    private final int oxidizedStage;
    private final boolean isWaxed;
    public final int mapOrder; // Store the unique MapOrder

    public copperSlab(Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames, int fireChance, int fireSpread, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, flames, fireChance, fireSpread, null);
        this.oxidizedStage = oxidizedStage;
        this.isWaxed = isWaxed;
        this.mapOrder = MapOrder; // Set the unique map order
    }

    public copperSlab(Properties properties, boolean flames, int fireChance, int fireSpread, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(properties, flames, fireChance, fireSpread, null);
        this.oxidizedStage = oxidizedStage;
        this.isWaxed = isWaxed;
        this.mapOrder = MapOrder; // Set the unique map order
    }


    public boolean isWaxed() { return this.isWaxed; }
    public int getOxidizedStage() { return this.oxidizedStage; }
    public int getMapOrder() { return this.mapOrder; }
    public @NotNull Optional<BlockState> getNext(@NotNull BlockState blockState) { return this.getNextMod(getIntDeferredBlockMap().get(this.mapOrder)); }
    public float getChanceModifier() { return this.getChanceModifier(getStateByOrder(this.oxidizedStage)); }

    public List<DeferredBlock<? extends Block>> getWeatheredSetList() {
        return List.of(RAW_COPPER_SLAB, RAW_EXPOSED_COPPER_SLAB, RAW_WEATHERED_COPPER_SLAB, RAW_OXIDIZED_COPPER_SLAB,
                RAW_WAXED_COPPER_SLAB, RAW_WAXED_EXPOSED_COPPER_SLAB, RAW_WAXED_WEATHERED_COPPER_SLAB, RAW_WAXED_OXIDIZED_COPPER_SLAB);
    }
}
