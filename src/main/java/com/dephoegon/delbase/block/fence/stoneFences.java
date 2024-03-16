package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class stoneFences {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<FenceBlock> STONE_FENCE = register("stone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(STONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> STONE_FENCE_GATE = register("stone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(STONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> COBBLESTONE_FENCE = register("cobblestone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(COBBLESTONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> COBBLESTONE_FENCE_GATE = register("cobblestone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(COBBLESTONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> DEEPSLATE_FENCE = register("deepslate_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE).sound(SoundType.DEEPSLATE), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> DEEPSLATE_FENCE_GATE = register("deepslate_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE).sound(SoundType.DEEPSLATE), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> COBBLED_DEEPSLATE_FENCE = register("cobbled_deepslate_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(COBBLED_DEEPSLATE).sound(SoundType.DEEPSLATE), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> COBBLED_DEEPSLATE_FENCE_GATE = register("cobbled_deepslate_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(COBBLED_DEEPSLATE).sound(SoundType.DEEPSLATE), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> DEEPSLATE_TILE_FENCE = register("deepslate_tile_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> DEEPSLATE_TILE_FENCE_GATE = register("deepslate_tile_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_TILES).sound(SoundType.DEEPSLATE_TILES), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> POLISHED_DEEPSLATE_FENCE = register("polished_deepslate_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_DEEPSLATE).sound(SoundType.POLISHED_DEEPSLATE), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> POLISHED_DEEPSLATE_FENCE_GATE = register("polished_deepslate_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_DEEPSLATE).sound(SoundType.POLISHED_DEEPSLATE), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> DEEPSLATE_BRICK_FENCE = register("deepslate_brick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> DEEPSLATE_BRICK_FENCE_GATE = register("deepslate_brick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> MUD_BRICK_FENCE = register("mud_brick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS).sound(SoundType.MUD_BRICKS), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> MUD_BRICK_FENCE_GATE = register("mud_brick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(MUD_BRICKS).sound(SoundType.MUD_BRICKS), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> PACKED_MUD_FENCE = register("packed_mud_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(PACKED_MUD).sound(SoundType.PACKED_MUD), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> PACKED_MUD_FENCE_GATE = register("packed_mud_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(PACKED_MUD).sound(SoundType.PACKED_MUD), false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> BRICK_FENCE = register("brick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(BRICKS).sound(SoundType.NETHER_BRICKS), false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> BRICK_FENCE_GATE = register("brick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(BRICKS).sound(SoundType.NETHER_BRICKS), false, 0, 0, null));

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
