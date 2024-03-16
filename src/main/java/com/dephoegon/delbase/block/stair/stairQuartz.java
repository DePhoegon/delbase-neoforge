package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.alt.quartzStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class stairQuartz {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<StairBlock> CHISELED_QUARTZ_STAIR = register("chiseled_quartz_stair",
            () -> new quartzStair(CHISELED_QUARTZ_BLOCK, BlockBehaviour.Properties.ofFullCopy(CHISELED_QUARTZ_BLOCK).sound(SoundType.STONE)));
    public static final DeferredBlock<StairBlock> QUARTZ_BRICK_STAIR = register("quartz_brick_stair",
            () -> new quartzStair(QUARTZ_BRICKS, BlockBehaviour.Properties.ofFullCopy(QUARTZ_BRICKS).sound(SoundType.STONE)));
    public static final DeferredBlock<StairBlock> QUARTZ_PILLAR_STAIR = register("quartz_pillar_stair",
            () -> new quartzStair(QUARTZ_PILLAR, BlockBehaviour.Properties.ofFullCopy(QUARTZ_PILLAR).sound(SoundType.STONE)));

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