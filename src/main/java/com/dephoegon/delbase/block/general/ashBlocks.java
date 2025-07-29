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

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.miscSpecialCases.ASH_BLOCK;
import static com.dephoegon.delbase.Delabse.Mod_ID;

public class ashBlocks {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<SlabBlock> ASH_SLAB = registerBlock("ash_slab",
            () -> new slabBlock(BlockBehaviour.Properties.ofFullCopy(ASH_BLOCK.get()),false, 0, 0, null),8000);
    public static final DeferredBlock<StairBlock> ASH_STAIR = registerBlock("ash_stair",
            ()-> new stairBlock(ASH_BLOCK.get(), BlockBehaviour.Properties.ofFullCopy(ASH_BLOCK.get()), false, 0, 0, null),12000);
    public static final DeferredBlock<RotatedPillarBlock> ASH_LOG = registerBlock("ash_log",
            ()-> new axisBlock(BlockBehaviour.Properties.ofFullCopy(ASH_BLOCK.get()), false, 0, 0),16000);
    public static final DeferredBlock<WallBlock> ASH_WALL = registerBlock("ash_wall",
            ()-> new wallBlock(BlockBehaviour.Properties.ofFullCopy(ASH_BLOCK.get()), false, 0, 0, null),10000);
    public static final DeferredBlock<FenceBlock> ASH_FENCE = registerBlock("ash_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(ASH_BLOCK.get()), false, 0, 0, null), 5000);
    public static final DeferredBlock<FenceGateBlock> ASH_FENCE_GATE = registerBlock("ash_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(ASH_BLOCK.get()), false, 0, 0, null), 5000);
    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block, int burn) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)){
            public int getBurnTime(@NotNull ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burn;
            }
        });
        return exit;
    }
}
