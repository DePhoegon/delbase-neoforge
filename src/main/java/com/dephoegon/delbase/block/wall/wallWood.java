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

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.block.wall.wallStrippedWood.*;
import static com.dephoegon.delbase.Delabse.MOD_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class wallWood {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<WallBlock> SPRUCE_WOOD_WALL = registerBlock("spruce_wood_wall",
            () -> new woodWall(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> SPRUCE_LOG_WALL = registerBlock("spruce_log_wall",
            () -> new woodWall(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> OAK_WOOD_WALL = registerBlock("oak_wood_wall",
            () -> new woodWall(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> OAK_LOG_WALL = registerBlock("oak_log_wall",
            () -> new woodWall(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> WARPED_HYPHAE_WALL = registerBlock("warped_hyphae_wall",
            () -> new woodWall(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_HYPHAE_WALL.get().defaultBlockState()));
    public static final DeferredBlock<WallBlock> WARPED_STEM_WALL = registerBlock("warped_stem_wall",
            () -> new woodWall(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_STEM_WALL.get().defaultBlockState()));
    public static final DeferredBlock<WallBlock> CRIMSON_HYPHAE_WALL = registerBlock("crimson_hyphae_wall",
            () -> new woodWall(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_HYPHAE_WALL.get().defaultBlockState()));
    public static final DeferredBlock<WallBlock> CRIMSON_STEM_WALL = registerBlock("crimson_stem_wall",
            () -> new woodWall(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_STEM_WALL.get().defaultBlockState()));
    public static final DeferredBlock<WallBlock> DARK_OAK_WOOD_WALL = registerBlock("dark_oak_wood_wall",
            () -> new woodWall(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> DARK_OAK_LOG_WALL = registerBlock("dark_oak_log_wall",
            () -> new woodWall(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> ACACIA_WOOD_WALL = registerBlock("acacia_wood_wall",
            () -> new woodWall(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> ACACIA_LOG_WALL = registerBlock("acacia_log_wall",
            () -> new woodWall(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> JUNGLE_WOOD_WALL = registerBlock("jungle_wood_wall",
            () -> new woodWall(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> JUNGLE_LOG_WALL = registerBlock("jungle_log_wall",
            () -> new woodWall(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> BIRCH_WOOD_WALL = registerBlock("birch_wood_wall",
            () -> new woodWall(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> BIRCH_LOG_WALL = registerBlock("birch_log_wall",
            () -> new woodWall(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> MANGROVE_WOOD_WALL = registerBlock("mangrove_wood_wall",
            () -> new woodWall(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> MANGROVE_LOG_WALL = registerBlock("mangrove_log_wall",
            () -> new woodWall(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_LOG_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> BAMBOO_WALL = registerBlock("bamboo_wall",
            () -> new woodWall(BAMBOO_PLANKS, SoundType.BAMBOO_WOOD, true, STRIPPED_BAMBOO_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> BAMBOO_PLANK_WALL = registerBlock("bamboo_plank_wall",
            () -> new woodWall(BAMBOO_PLANKS, SoundType.BAMBOO_WOOD, true, STRIPPED_BAMBOO_PLANK_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> BAMBOO_MOSAIC_WALL = registerBlock("bamboo_mosaic_wall",
            () -> new woodWall(BAMBOO_PLANKS, SoundType.BAMBOO_WOOD, true, STRIPPED_BAMBOO_MOSAIC_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> CHERRY_WOOD_WALL = registerBlock("cherry_wood_wall",
            () -> new woodWall(CHERRY_WOOD, SoundType.WOOD, true, STRIPPED_CHERRY_WOOD_WALL.get().defaultBlockState()), 5001);
    public static final DeferredBlock<WallBlock> CHERRY_LOG_WALL = registerBlock("cherry_log_wall",
            () -> new woodWall(CHERRY_WOOD, SoundType.WOOD, true, STRIPPED_CHERRY_LOG_WALL.get().defaultBlockState()), 5001);

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    @SuppressWarnings("SameParameterValue")
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block, int burn) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)){
            public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burn;
            }
        });
        return exit;
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)));
        return exit;
    }
}
