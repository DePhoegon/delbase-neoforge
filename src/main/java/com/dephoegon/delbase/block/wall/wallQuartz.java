package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.alt.quartzWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class wallQuartz {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<WallBlock> QUARTZ_WALL = register("quartz_wall",
            () -> new quartzWall(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK).sound(SoundType.STONE)));
    public static final DeferredBlock<WallBlock> SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall",
            () -> new quartzWall(BlockBehaviour.Properties.ofFullCopy(SMOOTH_QUARTZ).sound(SoundType.STONE)));
    public static final DeferredBlock<WallBlock> CHISELED_QUARTZ_WALL = register("chiseled_quartz_wall",
            () -> new quartzWall(BlockBehaviour.Properties.ofFullCopy(CHISELED_QUARTZ_BLOCK).sound(SoundType.STONE)));
    public static final DeferredBlock<WallBlock> QUARTZ_BRICK_WALL = register("quartz_brick_wall",
            () -> new quartzWall(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BRICKS).sound(SoundType.STONE)));
    public static final DeferredBlock<WallBlock> QUARTZ_PILLAR_WALL = register("quartz_pillar_wall",
            () -> new quartzWall(BlockBehaviour.Properties.ofFullCopy(QUARTZ_PILLAR).sound(SoundType.STONE)));

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