package com.dephoegon.delbase.aid.block.modExtensions;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.stairBlock;
import com.dephoegon.delbase.aid.util.weatheringCopper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.dephoegon.delbase.aid.util.weatherState.getStateByOrder;
import static com.dephoegon.delbase.block.stair.stairCopperWaxed.getWaxedStairCopperBLOCKS;
import static com.dephoegon.delbase.block.stair.stairCoppers.getStairCopperBLOCKS;

public class copperStair extends stairBlock implements weatheringCopper {
    private final int oxidizedStage;
    private final boolean isWaxed;
    public final int mapOrder; // Store the unique MapOrder

    public copperStair(@NotNull Block block, Properties properties, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, BlockState strippedState, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(block, properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0,0, strippedState);
        this.oxidizedStage = oxidizedStage;
        this.isWaxed = isWaxed;
        this.mapOrder = MapOrder; // Set the unique map order
    }

    public copperStair(@NotNull Block block, Properties properties, BlockState strippedState, int oxidizedStage, boolean isWaxed, int MapOrder) {
        super(block, properties, false, 0, 0, strippedState);
        this.oxidizedStage = oxidizedStage;
        this.isWaxed = isWaxed;
        this.mapOrder = MapOrder; // Set the unique map order
    }

    protected void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        this.changeOverTime(state, level, pos, random);
    }
    public BlockState getPlacementState(@NotNull BlockState stateToCopy, @NotNull BlockState defaultStateToPlace) {
        Direction pFacing = stateToCopy.getValue(FACING);
        Half pHalf = stateToCopy.getValue(HALF);
        StairsShape pShape = stateToCopy.getValue(SHAPE);
        boolean wLogged = stateToCopy.getValue(WATERLOGGED);
        return defaultStateToPlace.setValue(FACING, pFacing).setValue(HALF, pHalf).setValue(SHAPE, pShape).setValue(WATERLOGGED, wLogged);
    }

    public boolean isWaxed() { return this.isWaxed; }
    public int getOxidizedStage() { return this.oxidizedStage; }
    public int getMapOrder() { return this.mapOrder; }
    public int getMapOrder(DeferredBlock<? extends Block> thisBlock) { return this.getMapOrder(); }
    public @NotNull Optional<BlockState> getNext(@NotNull BlockState blockState) { return this.getNextMod(getIntDeferredBlockMap().get(this.mapOrder), blockState); }
    public float getChanceModifier() { return this.getChanceModifier(getStateByOrder(this.oxidizedStage)); }

    public Map<Integer, DeferredBlock<? extends Block>> getIntDeferredBlockMap() {
        Map<Integer, DeferredBlock<? extends Block>> intDeferredBlockMap = new HashMap<>(Map.of());
        getStairCopperBLOCKS().getEntries().forEach((block) -> {
            copperStair copperStair = (copperStair) block.get();
            intDeferredBlockMap.put(copperStair.mapOrder, (DeferredBlock<? extends Block>) block);
        });
        getWaxedStairCopperBLOCKS().getEntries().forEach((block) -> {
            copperStair copperStair = (copperStair) block.get();
            intDeferredBlockMap.put(copperStair.mapOrder, (DeferredBlock<? extends Block>) block);
        });
        return intDeferredBlockMap;
    }
}