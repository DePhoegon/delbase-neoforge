package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.alt.quartzFence;
import com.dephoegon.delbase.aid.block.alt.quartzGateBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class quartzFences {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<FenceBlock> QUARTZ_BRICKS_FENCE = register("quartz_bricks_fence",
            () -> new quartzFence(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BRICKS)));
    public static final DeferredBlock<FenceGateBlock> QUARTZ_BRICKS_FENCE_GATE = register("quartz_bricks_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BRICKS)));
    public static final DeferredBlock<FenceBlock> QUARTZ_BLOCK_FENCE = register("quartz_block_fence",
            () -> new quartzFence(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK)));
    public static final DeferredBlock<FenceGateBlock> QUARTZ_BLOCK_FENCE_GATE = register("quartz_block_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK)));
    public static final DeferredBlock<FenceBlock> SMOOTH_QUARTZ_FENCE = register("smooth_quartz_fence",
            () -> new quartzFence(BlockBehaviour.Properties.ofFullCopy(SMOOTH_QUARTZ)));
    public static final DeferredBlock<FenceGateBlock> SMOOTH_QUARTZ_FENCE_GATE = register("smooth_quartz_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_QUARTZ)));
    public static final DeferredBlock<FenceBlock> CHISELED_QUARTZ_BLOCK_FENCE = register("chiseled_quartz_block_fence",
            () -> new quartzFence(BlockBehaviour.Properties.ofFullCopy(CHISELED_QUARTZ_BLOCK)));
    public static final DeferredBlock<FenceGateBlock> CHISELED_QUARTZ_BLOCK_FENCE_GATE = register("chiseled_quartz_block_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.ofFullCopy(CHISELED_QUARTZ_BLOCK)));
    public static final DeferredBlock<FenceBlock> QUARTZ_PILLAR_FENCE = register("quartz_pillar_fence",
            () -> new quartzFence(BlockBehaviour.Properties.ofFullCopy(QUARTZ_PILLAR)));
    public static final DeferredBlock<FenceGateBlock> QUARTZ_PILLAR_FENCE_GATE = register("quartz_pillar_fence_gate",
            () -> new quartzGateBlock(BlockBehaviour.Properties.ofFullCopy(QUARTZ_PILLAR)));

    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block, int burn) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(), new Item.Properties().stacksTo(64)){
            public int getBurnTime(@NotNull ItemStack stack, @javax.annotation.Nullable RecipeType<?> recipeType) {
                if (burn > 0) { return burn; } else return -1;
            }
        });
        return exit;
    }
    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block) { return register(name, block, 0); }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
