package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.alt.leafStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class stairLeaves {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<StairBlock> OAK_LEAF_STAIR = register("oak_leaf_stair",
            ()-> new leafStair(OAK_STAIRS, OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> SPRUCE_LEAF_STAIR = register("spruce_leaf_stair",
            ()-> new leafStair(SPRUCE_STAIRS, SPRUCE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> JUNGLE_LEAF_STAIR = register("jungle_leaf_stair",
            ()-> new leafStair(JUNGLE_STAIRS, JUNGLE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> BIRCH_LEAF_STAIR = register("birch_leaf_stair",
            ()-> new leafStair(BIRCH_STAIRS, BIRCH_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> ACACIA_LEAF_STAIR = register("acacia_leaf_stair",
            ()-> new leafStair(ACACIA_STAIRS, ACACIA_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> DARK_OAK_LEAF_STAIR = register("dark_oak_leaf_stair",
            ()-> new leafStair(DARK_OAK_STAIRS, DARK_OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> MANGROVE_LEAF_STAIR = register("mangrove_leaf_stair",
            ()-> new leafStair(MANGROVE_STAIRS, MANGROVE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> CHERRY_LEAF_STAIR = register("cherry_leaf_stair",
            ()-> new leafStair(CHERRY_STAIRS, CHERRY_LEAVES, SoundType.CHERRY_LEAVES, true, null));
    public static final DeferredBlock<StairBlock> AZALEA_LEAF_STAIR = register("azalea_leaf_stair",
            ()-> new leafStair(OAK_STAIRS, AZALEA_LEAVES, SoundType.AZALEA_LEAVES, true, null));
    public static final DeferredBlock<StairBlock> FLOWERING_AZALEA_LEAF_STAIR = register("flowering_azalea_leaf_stair",
            ()-> new leafStair(OAK_STAIRS, FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA, true, null));

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