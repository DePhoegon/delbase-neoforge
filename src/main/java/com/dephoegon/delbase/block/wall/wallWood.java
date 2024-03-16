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

import static com.dephoegon.delbase.block.wall.wallStrippedWood.*;
import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class wallWood {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<WallBlock> SPRUCE_WOOD_WALL = register("spruce_wood_wall",
            () -> new woodWall(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> SPRUCE_LOG_WALL = register("spruce_log_wall",
            () -> new woodWall(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> OAK_WOOD_WALL = register("oak_wood_wall",
            () -> new woodWall(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> OAK_LOG_WALL = register("oak_log_wall",
            () -> new woodWall(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> WARPED_HYPHAE_WALL = register("warped_hyphae_wall",
            () -> new woodWall(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_HYPHAE_WALL.get().defaultBlockState()));
    public static final DeferredBlock<WallBlock> WARPED_STEM_WALL = register("warped_stem_wall",
            () -> new woodWall(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_STEM_WALL.get().defaultBlockState()));
    public static final DeferredBlock<WallBlock> CRIMSON_HYPHAE_WALL = register("crimson_hyphae_wall",
            () -> new woodWall(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_HYPHAE_WALL.get().defaultBlockState()));
    public static final DeferredBlock<WallBlock> CRIMSON_STEM_WALL = register("crimson_stem_wall",
            () -> new woodWall(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_STEM_WALL.get().defaultBlockState()));
    public static final DeferredBlock<WallBlock> DARK_OAK_WOOD_WALL = register("dark_oak_wood_wall",
            () -> new woodWall(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> DARK_OAK_LOG_WALL = register("dark_oak_log_wall",
            () -> new woodWall(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> ACACIA_WOOD_WALL = register("acacia_wood_wall",
            () -> new woodWall(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> ACACIA_LOG_WALL = register("acacia_log_wall",
            () -> new woodWall(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> JUNGLE_WOOD_WALL = register("jungle_wood_wall",
            () -> new woodWall(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> JUNGLE_LOG_WALL = register("jungle_log_wall",
            () -> new woodWall(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> BIRCH_WOOD_WALL = register("birch_wood_wall",
            () -> new woodWall(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> BIRCH_LOG_WALL = register("birch_log_wall",
            () -> new woodWall(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> MANGROVE_WOOD_WALL = register("mangrove_wood_wall",
            () -> new woodWall(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> MANGROVE_LOG_WALL = register("mangrove_log_wall",
            () -> new woodWall(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> BAMBOO_WALL = register("bamboo_wall",
            () -> new woodWall(BAMBOO_PLANKS, SoundType.BAMBOO_WOOD, true, STRIPPED_BAMBOO_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> BAMBOO_PLANK_WALL = register("bamboo_plank_wall",
            () -> new woodWall(BAMBOO_PLANKS, SoundType.BAMBOO_WOOD, true, STRIPPED_BAMBOO_PLANK_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> BAMBOO_MOSAIC_WALL = register("bamboo_mosaic_wall",
            () -> new woodWall(BAMBOO_PLANKS, SoundType.BAMBOO_WOOD, true, STRIPPED_BAMBOO_MOSAIC_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> CHERRY_WOOD_WALL = register("cherry_wood_wall",
            () -> new woodWall(CHERRY_WOOD, SoundType.WOOD, true, STRIPPED_CHERRY_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> CHERRY_LOG_WALL = register("cherry_log_wall",
            () -> new woodWall(CHERRY_WOOD, SoundType.WOOD, true, STRIPPED_CHERRY_LOG_WALL.get().defaultBlockState()), 5001);

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
