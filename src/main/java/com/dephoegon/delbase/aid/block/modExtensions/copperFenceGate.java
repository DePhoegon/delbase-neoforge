package com.dephoegon.delbase.aid.block.modExtensions;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.fenceGateBlock;
import com.dephoegon.delbase.aid.util.weatheringCopper;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.*;

import static com.dephoegon.delbase.aid.util.weatherState.getStateByOrder;
import static com.dephoegon.delbase.block.fence.fenceCopper.getFenceGateCopperBLOCKS;
import static com.dephoegon.delbase.block.fence.fenceCopperWaxed.getFenceWaxedGateCopperBLOCKS;

public class copperFenceGate extends fenceGateBlock implements weatheringCopper {
    private final int oxidizedStage;
    private final boolean isWaxed;
    public final int mapOrder; // Store the unique MapOrder

    public copperFenceGate(Properties properties, BlockState strippedState, String normToolTip, String shiftToolTip, String ctrlToolTip, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, strippedState);
        this.oxidizedStage = oxidizedStage;
        this.isWaxed = isWaxed;
        this.mapOrder = MapOrder; // Set the unique map order
    }
    public copperFenceGate(Properties properties, BlockState strippedState, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(properties, "", "", "", false, 0, 0, strippedState);
        this.oxidizedStage = oxidizedStage;
        this.isWaxed = isWaxed;
        this.mapOrder = MapOrder; // Set the unique map order
    }

    protected void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        this.changeOverTime(state, level, pos, random);
    }
    public BlockState getPlacementState(@NotNull BlockState stateToCopy, @NotNull BlockState defaultStateToPlace) {
        boolean isOpen = stateToCopy.getValue(OPEN);
        boolean isPowered = stateToCopy.getValue(POWERED);
        boolean inWall = stateToCopy.getValue(IN_WALL);
        return defaultStateToPlace.setValue(OPEN, isOpen).setValue(POWERED, isPowered).setValue(IN_WALL, inWall);
    }

    public boolean isWaxed() { return this.isWaxed; }
    public int getOxidizedStage() { return this.oxidizedStage; }
    public int getMapOrder() { return this.mapOrder; }
    public int getMapOrder(DeferredBlock<? extends Block> thisBlock) { return this.getMapOrder(); }
    public @NotNull Optional<BlockState> getNext(@NotNull BlockState blockState) { return this.getNextMod(getIntDeferredBlockMap().get(this.mapOrder), blockState); }
    public float getChanceModifier() { return this.getChanceModifier(getStateByOrder(this.oxidizedStage)); }

    public Map<Integer, DeferredBlock<? extends Block>> getIntDeferredBlockMap() {
        Map<Integer, DeferredBlock<? extends Block>> intDeferredBlockMap = new HashMap<>(Map.of());
        getFenceGateCopperBLOCKS().getEntries().forEach((block) -> {
            copperFenceGate copperFenceGate = (copperFenceGate) block.get();
            intDeferredBlockMap.put(copperFenceGate.mapOrder, (DeferredBlock<? extends Block>) block);
        });
        getFenceWaxedGateCopperBLOCKS().getEntries().forEach((block) -> {
            copperFenceGate copperFenceGate = (copperFenceGate) block.get();
            intDeferredBlockMap.put(copperFenceGate.mapOrder, (DeferredBlock<? extends Block>) block);
        });
        return intDeferredBlockMap;
    }
}
