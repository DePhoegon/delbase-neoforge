package com.dephoegon.delbase.aid.util;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

@SuppressWarnings("PatternVariableCanBeUsed")
public interface weatheringCopper extends ChangeOverTimeBlock<weatherState> {
    int getMapOrder();
    List<DeferredBlock<? extends Block>> getWeatheredSetList();
    boolean isWaxed();
    int getOxidizedStage();
    int getMapOrder(DeferredBlock<? extends Block> thisBlock);

    default @NotNull weatherState getAge() {
        return weatherState.getStateByOrder(this.getCurrentAge());
    }
    default int getCurrentAge() {
        return this.getOxidizedStage();
    }
    default @NotNull Optional<BlockState> getNextMod(DeferredBlock<? extends Block> thisBlock) {
        Block out = getNextByBlockMapping().get().get(thisBlock.get());
        BlockState blockState = out == null ? null : out.defaultBlockState();
        return blockState == null ? Optional.empty() : Optional.of(blockState);
    }
    /**
     * Returns a mapping of the next weathered block by the current block.
     * The mapping is memoized to avoid recalculating it multiple times.
     * Requires #getWeatheredSetList() to be implemented.
     */
    default Supplier<BiMap<Block, Block>> getNextByBlockMapping() {
        return Suppliers.memoize(() -> {
            ImmutableBiMap.Builder<Block, Block> biMapBuilder = ImmutableBiMap.builder();
            getIntDeferredBlockMap().forEach((entry, value) -> {
                if (getIntDeferredBlockMap().containsKey(entry + 1)) { biMapBuilder.put(value.get(), getIntDeferredBlockMap().get(entry + 1).get()); }
            });
            return biMapBuilder.build();
        });
    }
    default Map<Integer, DeferredBlock<? extends Block>> getIntDeferredBlockMap() {
        Map<Integer, DeferredBlock<? extends Block>> outMap = new java.util.HashMap<>(Map.of());
        getWeatheredSetList().forEach((entry) -> outMap.put(getMapOrder(entry), entry));
        return outMap;
    }
    default Supplier<BiMap<Block, Block>> getPreviousByBlockMapping() { return Suppliers.memoize(() -> getNextByBlockMapping().get().inverse()); }
    default float getChanceModifier(weatherState weatherState) { return weatherState == com.dephoegon.delbase.aid.util.weatherState.UNAFFECTED ? 0.75F : 1.0F; }
    default Block getFirstInSet(DeferredBlock<? extends Block> block) {
        if (!getPreviousByBlockMapping().get().containsKey(block.get())) { return block.get(); }
        return getFirstInSet(
                getWeatheredSetList().stream().filter(b -> b.get().equals(getPreviousByBlockMapping().get().get(block.get()))).findFirst().orElse(block)
        );
    }
    default Block getLastInSet(DeferredBlock<? extends Block> block) {
        if (!getNextByBlockMapping().get().containsKey(block.get())) { return block.get(); }
        return getLastInSet(
                getWeatheredSetList().stream().filter(b -> b.get().equals(getNextByBlockMapping().get().get(block.get()))).findFirst().orElse(block)
        );
    }
    default Block getFirstUnwaxedInSet(DeferredBlock<? extends Block> block) {
        Block blockInstance = block.get();
        if (!(blockInstance instanceof weatheringCopper)) { return blockInstance; }
        weatheringCopper weatheringBlock = (weatheringCopper) blockInstance;
        if (!weatheringBlock.isWaxed()) { return getFirstInSet(block); }

        Integer currentKey = getCurrentKey(block);
        if (currentKey == null) { return block.get(); }

        return lookupBlockLoop(block, false, true, currentKey);
    }
    default Block getLastUnwaxedInSet(DeferredBlock<? extends Block> block) {
        // If the block is already unwaxed, use the regular getLastInSet method
        Block blockInstance = block.get();
        if (!(blockInstance instanceof weatheringCopper)) { return blockInstance; }
        weatheringCopper weatheringBlock = (weatheringCopper) blockInstance;
        if (!weatheringBlock.isWaxed()) { return getLastInSet(block); }

        Integer currentKey = getCurrentKey(block);
        if (currentKey == null) { return block.get(); }

        return lookupBlockLoop(block, false, false, currentKey);
    }
    default Block getFirstWaxedInSet(DeferredBlock<? extends Block> block) {
        Block blockInstance = block.get();
        if (!(blockInstance instanceof weatheringCopper)) { return blockInstance; }
        weatheringCopper weatheringBlock = (weatheringCopper) blockInstance;
        if (weatheringBlock.isWaxed()) { return getFirstInSet(block); }

        Integer currentKey = getCurrentKey(block);
        if (currentKey == null) { return block.get(); }

        return lookupBlockLoop(block, true, true, currentKey);
    }
    default Block getLastWaxedInSet(DeferredBlock<? extends Block> block) {
        Block blockInstance = block.get();
        if (!(blockInstance instanceof weatheringCopper)) { return blockInstance; }
        weatheringCopper weatheringBlock = (weatheringCopper) blockInstance;
        if (weatheringBlock.isWaxed()) { return getLastInSet(block); }

        Integer currentKey = getCurrentKey(block);
        if (currentKey == null) { return block.get(); }

        return lookupBlockLoop(block, true, false, currentKey);
    }
    private Block lookupBlockLoop(DeferredBlock<? extends Block> fallBackBlock, boolean waxedTarget, boolean getFirst, int Key) {
        for (int key = Key; key >= 0 && key < getIntDeferredBlockMap().size(); key += getFirst ? -1 : 1) {
            DeferredBlock<? extends Block> candidate = getIntDeferredBlockMap().get(key);
            if (candidate != null) {
                Block candidateBlock = candidate.get();
                if (candidateBlock instanceof weatheringCopper) {
                    weatheringCopper weatheringCandidate = (weatheringCopper) candidateBlock;
                    if (weatheringCandidate.isWaxed() == waxedTarget) {
                        return getFirst ? getFirstInSet(candidate) : getLastInSet(candidate);
                    }
                }
            }
        }
        return fallBackBlock.get();
    }
    private @Nullable Integer getCurrentKey(DeferredBlock<? extends Block> block) {
        for (Map.Entry<Integer, DeferredBlock<? extends Block>> entry : getIntDeferredBlockMap().entrySet()) {
            if (entry.getValue().equals(block)) { return entry.getKey(); }
        }
        return null;
    }
}