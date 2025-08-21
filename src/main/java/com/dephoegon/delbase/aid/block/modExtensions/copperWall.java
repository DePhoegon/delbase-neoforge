package com.dephoegon.delbase.aid.block.modExtensions;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.wallBlock;
import com.dephoegon.delbase.aid.util.weatheringCopper;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WallSide;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.dephoegon.delbase.aid.util.weatherState.getStateByOrder;
import static com.dephoegon.delbase.block.wall.wallCopperWaxed.getWaxedWallCopperBLOCKS;
import static com.dephoegon.delbase.block.wall.wallCoppers.getWallCopperBLOCKS;

public class copperWall extends wallBlock implements weatheringCopper {
    private final int oxidizedStage;
    private final boolean isWaxed;
    public final int mapOrder; // Store the unique MapOrder
    public copperWall(Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, BlockState strippedState, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0, strippedState);
        this.oxidizedStage = oxidizedStage;
        this.isWaxed = isWaxed;
        this.mapOrder = MapOrder; // Set the unique map order
    }
    public copperWall(Properties properties, BlockState strippedState, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(properties, false, 0, 0, strippedState);
        this.oxidizedStage = oxidizedStage;
        this.isWaxed = isWaxed;
        this.mapOrder = MapOrder; // Set the unique map order
    }

    protected void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        this.changeOverTime(state, level, pos, random);
    }
    public BlockState getPlacementState(@NotNull BlockState stateToCopy, @NotNull BlockState defaultStateToPlace) {
        WallSide eSide = stateToCopy.getValue(EAST_WALL);
        WallSide wSide = stateToCopy.getValue(WEST_WALL);
        WallSide nSide = stateToCopy.getValue(NORTH_WALL);
        WallSide sSide = stateToCopy.getValue(SOUTH_WALL);
        boolean wLogged = stateToCopy.getValue(WATERLOGGED);
        boolean iUp = stateToCopy.getValue(UP);
        return defaultStateToPlace.setValue(UP, iUp).setValue(NORTH_WALL, nSide).setValue(SOUTH_WALL, sSide).setValue(EAST_WALL, eSide).setValue(WEST_WALL, wSide).setValue(WATERLOGGED, wLogged);
    }

    public int getMapOrder() { return this.mapOrder; }
    public int getMapOrder(DeferredBlock<? extends Block> thisBlock) { return this.getMapOrder(); }
    public boolean isWaxed() { return this.isWaxed; }
    public int getOxidizedStage() { return this.oxidizedStage; }
    public @NotNull Optional<BlockState> getNext(@NotNull BlockState blockState) { return this.getNextMod(getIntDeferredBlockMap().get(this.mapOrder), blockState); }
    public float getChanceModifier() { return this.getChanceModifier(getStateByOrder(this.oxidizedStage)); }

    public Map<Integer, DeferredBlock<? extends Block>> getIntDeferredBlockMap() {
        Map<Integer, DeferredBlock<? extends Block>> intDeferredBlockMap = new HashMap<>(Map.of());
        getWallCopperBLOCKS().getEntries().forEach((block) -> {
            copperWall copperWall = (copperWall) block.get();
            intDeferredBlockMap.put(copperWall.mapOrder, (DeferredBlock<? extends Block>) block);
        });
        getWaxedWallCopperBLOCKS().getEntries().forEach((block) -> {
            copperWall copperWall = (copperWall) block.get();
            intDeferredBlockMap.put(copperWall.mapOrder, (DeferredBlock<? extends Block>) block);
        });
        return intDeferredBlockMap;
    }
}
