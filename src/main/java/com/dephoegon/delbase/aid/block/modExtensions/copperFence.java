package com.dephoegon.delbase.aid.block.modExtensions;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.fenceBlock;
import com.dephoegon.delbase.aid.util.weatheringCopper;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
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

    public boolean isWaxed() { return this.isWaxed; }
    public int getOxidizedStage() { return this.oxidizedStage; }
    public int getMapOrder() { return this.mapOrder; }
    public @NotNull Optional<BlockState> getNext(@NotNull BlockState blockState) { return this.getNextMod(getIntDeferredBlockMap().get(this.mapOrder)); }
    public float getChanceModifier() { return this.getChanceModifier(getStateByOrder(this.oxidizedStage)); }

    public List<DeferredBlock<? extends Block>> getWeatheredSetList() {
        List<DeferredBlock<? extends Block>> outList = new ArrayList<>();
        getFenceCopperBLOCKS().getEntries().forEach(entry -> outList.add((DeferredBlock<? extends Block>) entry));
        getFenceWaxedCopperBLOCKS().getEntries().forEach(entry -> outList.add((DeferredBlock<? extends Block>) entry));
        return outList;
    }
}