package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.alt.leafSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class slabLeaves {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<SlabBlock> OAK_LEAF_SLAB = register("oak_leaf_slab",
            ()-> new leafSlab(OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> SPRUCE_LEAF_SLAB = register("spruce_leaf_slab",
            ()-> new leafSlab(SPRUCE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> JUNGLE_LEAF_SLAB = register("jungle_leaf_slab",
            ()-> new leafSlab(JUNGLE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> BIRCH_LEAF_SLAB = register("birch_leaf_slab",
            ()-> new leafSlab(BIRCH_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> ACACIA_LEAF_SLAB = register("acacia_leaf_slab",
            ()-> new leafSlab(ACACIA_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> DARK_OAK_LEAF_SLAB = register("dark_oak_leaf_slab",
            ()-> new leafSlab(DARK_OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> MANGROVE_LEAF_SLAB = register("mangrove_leaf_slab",
            ()-> new leafSlab(MANGROVE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> CHERRY_LEAF_SLAB = register("cherry_leaf_slab",
            ()-> new leafSlab(CHERRY_LEAVES, SoundType.CHERRY_LEAVES, true, null));
    public static final DeferredBlock<SlabBlock> AZALEA_LEAF_SLAB = register("azalea_leaf_slab",
            ()-> new leafSlab(AZALEA_LEAVES, SoundType.AZALEA_LEAVES, true, null));
    public static final DeferredBlock<SlabBlock> FLOWERING_AZALEA_LEAF_SLAB = register("flowering_azalea_leaf_slab",
            ()-> new leafSlab(FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA, true, null));

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