package com.dephoegon.delbase.aid.block.modExtensions;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.fenceBlock;
import com.dephoegon.delbase.aid.util.weatheringCopper;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.dephoegon.delbase.aid.util.weatherState.getStateByOrder;
import static com.dephoegon.delbase.block.fence.fenceCopper.getFenceCopperBLOCKS;
import static com.dephoegon.delbase.block.fence.fenceCopperWaxed.getFenceWaxedCopperBLOCKS;

public class copperFence extends fenceBlock implements weatheringCopper {
    private final int oxidizedStage;
    private final boolean isWaxed;
    public final int mapOrder; // Store the unique MapOrder
    public copperFence(Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, BlockState strippedState, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, strippedState);
        this.oxidizedStage = oxidizedStage;
        this.isWaxed = isWaxed;
        this.mapOrder = MapOrder; // Set the unique map order
    }
    public copperFence(Properties properties, BlockState strippedState, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(properties, "", "", "", false, 0, 0, strippedState);
        this.oxidizedStage = oxidizedStage;
        this.isWaxed = isWaxed;
        this.mapOrder = MapOrder; // Set the unique map order
    }

    protected void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        this.changeOverTime(state, level, pos, random);
    }
    public BlockState getPlacementState(@NotNull BlockState stateToCopy, @NotNull BlockState defaultStateToPlace) {
        Boolean nState = stateToCopy.getValue(NORTH);
        Boolean sState = stateToCopy.getValue(SOUTH);
        Boolean eState = stateToCopy.getValue(EAST);
        Boolean wState = stateToCopy.getValue(WEST);
        Boolean wLogged = stateToCopy.getValue(WATERLOGGED);
        return defaultStateToPlace.setValue(NORTH, nState).setValue(SOUTH, sState).setValue(EAST, eState).setValue(WEST, wState).setValue(WATERLOGGED, wLogged);
    }
    public boolean isWaxed() { return this.isWaxed; }
    public int getOxidizedStage() { return this.oxidizedStage; }
    public int getMapOrder() { return this.mapOrder; }
    public int getMapOrder(DeferredBlock<? extends Block> thisBlock) { return this.getMapOrder(); }
    public @NotNull Optional<BlockState> getNext(@NotNull BlockState blockState) { return this.getNextMod(getIntDeferredBlockMap().get(this.mapOrder), blockState); }
    public float getChanceModifier() { return this.getChanceModifier(getStateByOrder(this.oxidizedStage)); }

    public Map<Integer, DeferredBlock<? extends Block>> getIntDeferredBlockMap() {
        Map<Integer, DeferredBlock<? extends Block>> intDeferredBlockMap = new HashMap<>(Map.of());
        getFenceCopperBLOCKS().getEntries().forEach((block) -> {
            copperFence copperFence = (copperFence) block.get();
            intDeferredBlockMap.put(copperFence.mapOrder, (DeferredBlock<? extends Block>) block);
        });
        getFenceWaxedCopperBLOCKS().getEntries().forEach((block) -> {
            copperFence copperFence = (copperFence) block.get();
            intDeferredBlockMap.put(copperFence.mapOrder, (DeferredBlock<? extends Block>) block);
        });
        return intDeferredBlockMap;
    }
}