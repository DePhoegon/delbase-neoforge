package com.dephoegon.delbase.aid.block.modExtensions;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.slabBlock;
import com.dephoegon.delbase.aid.util.weatheringCopper;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.dephoegon.delbase.aid.util.weatherState.getStateByOrder;
import static com.dephoegon.delbase.block.slab.slabCopperWaxed.getWaxedSlabCopperBLOCKS;
import static com.dephoegon.delbase.block.slab.slabCoppers.getSlabCopperBLOCKS;
import static net.minecraft.world.level.block.state.properties.BlockStateProperties.SLAB_TYPE;

public class copperSlab extends slabBlock implements weatheringCopper {
    private final int oxidizedStage;
    private final boolean isWaxed;
    public final int mapOrder; // Store the unique MapOrder

    public copperSlab(Properties properties, BlockState strippedState, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, strippedState);
        this.oxidizedStage = oxidizedStage;
        this.isWaxed = isWaxed;
        this.mapOrder = MapOrder; // Set the unique map order
    }
    public copperSlab(Properties properties, BlockState strippedState, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(properties, false, 0, 0, strippedState);
        this.oxidizedStage = oxidizedStage;
        this.isWaxed = isWaxed;
        this.mapOrder = MapOrder; // Set the unique map order
    }

    protected void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        this.changeOverTime(state, level, pos, random);
    }
    public BlockState getPlacementState(@NotNull BlockState stateToCopy, @NotNull BlockState defaultStateToPlace) {
        SlabType slabType = stateToCopy.getValue(SLAB_TYPE);
        boolean wLogged = stateToCopy.getValue(WATERLOGGED);
        return defaultStateToPlace.setValue(SLAB_TYPE, slabType).setValue(WATERLOGGED, wLogged);
    }

    public boolean isWaxed() { return this.isWaxed; }
    public int getOxidizedStage() { return this.oxidizedStage; }
    public int getMapOrder() { return this.mapOrder; }
    public int getMapOrder(DeferredBlock<? extends Block> thisBlock) { return this.getMapOrder(); }
    public @NotNull Optional<BlockState> getNext(@NotNull BlockState blockState) { return this.getNextMod(getIntDeferredBlockMap().get(this.mapOrder), blockState); }
    public float getChanceModifier() { return this.getChanceModifier(getStateByOrder(this.oxidizedStage)); }
    public Map<Integer, DeferredBlock<? extends Block>> getIntDeferredBlockMap() {
        Map<Integer, DeferredBlock<? extends Block>> intDeferredBlockMap = new HashMap<>(Map.of());
        getSlabCopperBLOCKS().getEntries().forEach((block) -> {
            copperSlab copperSlab = (copperSlab) block.get();
            intDeferredBlockMap.put(copperSlab.mapOrder, (DeferredBlock<? extends Block>) block);
        });
        getWaxedSlabCopperBLOCKS().getEntries().forEach((block) -> {
            copperSlab copperSlab = (copperSlab) block.get();
            intDeferredBlockMap.put(copperSlab.mapOrder, (DeferredBlock<? extends Block>) block);
        });
        return intDeferredBlockMap;
    }
}