package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.Delbase;
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

@SuppressWarnings("PatternVariableCanBeUsed")
public interface weatheringCopper extends ChangeOverTimeBlock<weatherState> {
    int getMapOrder();
    boolean isWaxed();
    int getOxidizedStage();
    int getMapOrder(DeferredBlock<? extends Block> thisBlock);
    Map<Integer, DeferredBlock<? extends Block>> getIntDeferredBlockMap();
    BlockState getPlacementState(@NotNull BlockState stateToCopy, @NotNull BlockState defaultStateToPlace);

    default @NotNull weatherState getAge() {
        return weatherState.getStateByOrder(this.getCurrentAge());
    }
    default int getCurrentAge() {
        return this.getOxidizedStage();
    }
    default @NotNull Optional<BlockState> getNextMod(DeferredBlock<? extends Block> thisBlock, BlockState state) {
        Block outBlock = thisBlock.get();

        Block out = getNextByBlockMapping().get().get(thisBlock.get());
        Delbase.LOGGER.info("getNextMod: {} for DeferredBlock : {}", outBlock, thisBlock);
        BlockState blockState = out != null ? out.defaultBlockState() : state;
        return Optional.of(blockState);
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

    default Supplier<BiMap<Block, Block>> getPreviousByBlockMapping() { return Suppliers.memoize(() -> getNextByBlockMapping().get().inverse()); }
    default float getChanceModifier(weatherState weatherState) { return weatherState == com.dephoegon.delbase.aid.util.weatherState.UNAFFECTED ? 0.75F : 1.0F; }
    default  Block getFirstInSet(DeferredBlock<? extends Block> block) {
        final Block[] blockout = {block.get()};
        if (!getPreviousByBlockMapping().get().containsKey(block.get())) { return blockout[0]; }
        Map<Integer, DeferredBlock<? extends Block>> map = getIntDeferredBlockMap();
        map.forEach((a, b) -> {
            boolean recurse = false;
            DeferredBlock<? extends Block> nextDB = null;
            if (b == block) {
                if (map.containsKey(a-1)) {
                    recurse = true;
                    int nextKey = a - 1;
                    nextDB = map.get(nextKey);
                }
            }
            if (recurse) { blockout[0] = getFirstInSet(nextDB); }
        });
        return blockout[0];
    }
    default Block getLastInSet(DeferredBlock<? extends Block> block) {
        final Block[] blockout = {block.get()};
        if (!getPreviousByBlockMapping().get().containsKey(block.get())) { return blockout[0]; }
        Map<Integer, DeferredBlock<? extends Block>> map = getIntDeferredBlockMap();
        map.forEach((a, b) -> {
            boolean recurse = false;
            DeferredBlock<? extends Block> nextDB = null;
            if (b == block) {
                if (map.containsKey(a+1)) {
                    recurse = true;
                    int nextKey = a + 1;
                    nextDB = map.get(nextKey);
                }
            }
            if (recurse) { blockout[0] = getFirstInSet(nextDB); }
        });
        return blockout[0];
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
    default void changeOverTime(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, RandomSource random) {
        float f = 0.05688889F;
        if (random.nextFloat() < f) {
            this.getNextState(state, level, pos, random).ifPresent(NextState -> level.setBlockAndUpdate(pos, this.getPlacementState(state, NextState)));
        }
    }

    default @NotNull Optional<BlockState> getNextState(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        if (this.isWaxed()) { return Optional.empty(); }
        Optional<BlockState> nextState = this.getNextMod(getIntDeferredBlockMap().get(this.getMapOrder()), state);
        if (nextState.isPresent()) {
            int selfOxidizedStage = this.getOxidizedStage();
            int OlderNeighborOxidizationCount = 0;
            int sameAgeNeighborOxidiationCount = 0;
            for (BlockPos blockPos : BlockPos.withinManhattan(pos, 4, 4, 4)) {
                int dist = blockPos.distManhattan(pos);
                if (dist > 4) { break; }

                if (!blockPos.equals(pos) && level.getBlockState(blockPos).getBlock() instanceof ChangeOverTimeBlock<?> changeOverTimeBlock) {
                    Enum<?> neighborAge = changeOverTimeBlock.getAge();
                    int neighborOxidizedStage = level.getBlockState(blockPos).getBlock() instanceof weatheringCopper weatheringCopper ? weatheringCopper.getOxidizedStage() : neighborAge.ordinal();
                    if (neighborOxidizedStage < selfOxidizedStage) { return Optional.empty(); }
                    if (neighborOxidizedStage > selfOxidizedStage) { OlderNeighborOxidizationCount++; }
                    else { sameAgeNeighborOxidiationCount++; }
                }
                float chanceMod = (float) (OlderNeighborOxidizationCount + 1) / (float) (OlderNeighborOxidizationCount + sameAgeNeighborOxidiationCount + 1);
                float chance = chanceMod * chanceMod * this.getChanceModifier();
                return random.nextFloat() < chance ? nextState : Optional.empty();
            }
        }
        return Optional.empty();
    }
}