package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.alt.woodWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class hedgeLeaves {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<WallBlock> OAK_HEDGE = register("oak_hedge",
            () -> new woodWall(OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> SPRUCE_HEDGE = register("spruce_hedge",
            () -> new woodWall(SPRUCE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> BIRCH_HEDGE = register("birch_hedge",
            () -> new woodWall(BIRCH_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> JUNGLE_HEDGE = register("jungle_hedge",
            () -> new woodWall(JUNGLE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> ACACIA_HEDGE = register("acacia_hedge",
            () -> new woodWall(ACACIA_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> DARK_OAK_HEDGE = register("dark_oak_hedge",
            () -> new woodWall(DARK_OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> MANGROVE_HEDGE = register("mangrove_hedge",
            () -> new woodWall(MANGROVE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> CHERRY_HEDGE = register("cherry_hedge",
            () -> new woodWall(CHERRY_LEAVES, SoundType.CHERRY_LEAVES, true, null));
    public static final DeferredBlock<WallBlock> AZALEA_HEDGE = register("azalea_hedge",
            () -> new woodWall(AZALEA_LEAVES, SoundType.AZALEA_LEAVES, true, null));
    public static final DeferredBlock<WallBlock> FLOWERING_AZALEA_HEDGE = register("flowering_azalea_hedge",
            () -> new woodWall(FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA, true, null));

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