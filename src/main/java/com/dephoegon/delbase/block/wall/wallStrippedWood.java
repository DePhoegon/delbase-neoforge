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

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class wallStrippedWood {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<WallBlock> STRIPPED_SPRUCE_WOOD_WALL = registerBlock("stripped_spruce_wood_wall",
            () -> new woodWall(STRIPPED_SPRUCE_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_SPRUCE_LOG_WALL = registerBlock("stripped_spruce_log_wall",
            () -> new woodWall(STRIPPED_SPRUCE_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_OAK_WOOD_WALL = registerBlock("stripped_oak_wood_wall",
            () -> new woodWall(STRIPPED_OAK_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_OAK_LOG_WALL = registerBlock("stripped_oak_log_wall",
            () -> new woodWall(STRIPPED_OAK_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_WARPED_HYPHAE_WALL = registerBlock("stripped_warped_hyphae_wall",
            () -> new woodWall(STRIPPED_WARPED_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<WallBlock> STRIPPED_WARPED_STEM_WALL = registerBlock("stripped_warped_stem_wall",
            () -> new woodWall(STRIPPED_WARPED_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<WallBlock> STRIPPED_CRIMSON_HYPHAE_WALL = registerBlock("stripped_crimson_hyphae_wall",
            () -> new woodWall(STRIPPED_CRIMSON_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<WallBlock> STRIPPED_CRIMSON_STEM_WALL = registerBlock("stripped_crimson_stem_wall",
            () -> new woodWall(STRIPPED_CRIMSON_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<WallBlock> STRIPPED_DARK_OAK_WOOD_WALL = registerBlock("stripped_dark_oak_wood_wall",
            () -> new woodWall(STRIPPED_DARK_OAK_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_DARK_OAK_LOG_WALL = registerBlock("stripped_dark_oak_log_wall",
            () -> new woodWall(STRIPPED_DARK_OAK_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_ACACIA_WOOD_WALL = registerBlock("stripped_acacia_wood_wall",
            () -> new woodWall(STRIPPED_ACACIA_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_ACACIA_LOG_WALL = registerBlock("stripped_acacia_log_wall",
            () -> new woodWall(STRIPPED_ACACIA_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_JUNGLE_WOOD_WALL = registerBlock("stripped_jungle_wood_wall",
            () -> new woodWall(STRIPPED_JUNGLE_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_JUNGLE_LOG_WALL = registerBlock("stripped_jungle_log_wall",
            () -> new woodWall(STRIPPED_JUNGLE_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_BIRCH_WOOD_WALL = registerBlock("stripped_birch_wood_wall",
            () -> new woodWall(STRIPPED_BIRCH_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_BIRCH_LOG_WALL = registerBlock("stripped_birch_log_wall",
            () -> new woodWall(STRIPPED_BIRCH_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_MANGROVE_WOOD_WALL = registerBlock("stripped_mangrove_wood_wall",
            () -> new woodWall(MANGROVE_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_MANGROVE_LOG_WALL = registerBlock("stripped_mangrove_log_wall",
            () -> new woodWall(MANGROVE_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_BAMBOO_WALL = registerBlock("stripped_bamboo_wall",
            () -> new woodWall(BAMBOO_PLANKS, SoundType.BAMBOO_WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_BAMBOO_PLANK_WALL = registerBlock("stripped_bamboo_plank_wall",
            () -> new woodWall(BAMBOO_PLANKS, SoundType.BAMBOO_WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_BAMBOO_MOSAIC_WALL = registerBlock("stripped_bamboo_mosaic_wall",
            () -> new woodWall(BAMBOO_PLANKS, SoundType.BAMBOO_WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_CHERRY_WOOD_WALL = registerBlock("stripped_cherry_wood_wall",
            () -> new woodWall(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, null), 5001);
    public static final DeferredBlock<WallBlock> STRIPPED_CHERRY_LOG_WALL = registerBlock("stripped_cherry_log_wall",
            () -> new woodWall(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, null), 5001);

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    @SuppressWarnings("SameParameterValue")
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
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)));
        return exit;
    }
}