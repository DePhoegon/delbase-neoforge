package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.stock.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.misc.ASH_BLOCK;
import static com.dephoegon.delbase.delbase.MODID;

public class ash {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<SlabBlock> ASH_SLAB = register("ash_slab",
            () -> new slabBlock(BlockBehaviour.Properties.ofFullCopy(ASH_BLOCK.get()),false, 0, 0, null),8000);
    public static final DeferredBlock<StairBlock> ASH_STAIR = register("ash_stair",
            ()-> new stairBlock(ASH_BLOCK.get(), BlockBehaviour.Properties.ofFullCopy(ASH_BLOCK.get()), false, 0, 0, null),12000);
    public static final DeferredBlock<RotatedPillarBlock> ASH_LOG = register("ash_log",
            ()-> new axisBlock(BlockBehaviour.Properties.ofFullCopy(ASH_BLOCK.get()), false, 0, 0),16000);
    public static final DeferredBlock<WallBlock> ASH_WALL = register("ash_wall",
            ()-> new wallBlock(BlockBehaviour.Properties.ofFullCopy(ASH_BLOCK.get()), false, 0, 0, null),10000);
    public static final DeferredBlock<FenceBlock> ASH_FENCE = register("ash_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(ASH_BLOCK.get()), false, 0, 0, null), 5000);
    public static final DeferredBlock<FenceGateBlock> ASH_FENCE_GATE = register("ash_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(ASH_BLOCK.get()), false, 0, 0, null), 5000);

    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block) { return register(name, block, 0); }
    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block, int burn) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(), new Item.Properties().stacksTo(64)){
            public int getBurnTime(@NotNull ItemStack stack, @Nullable RecipeType<?> recipeType) { return burn; }
        });
        return exit;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
