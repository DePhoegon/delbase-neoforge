package com.dephoegon.delbase.aid.util;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.ComposterBlock;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.getAllLeaves;

// addToList() is called in eventBusEvents class, but is commented out for now under NeoForge 1.21.1 because #COMPOSTABLES is deprecated.
// Left in place for now, so it can be uncommented later if needed, or removed if not needed with the other loaders ports to 1.21.1+ (Fabric) is not needed.
@SuppressWarnings({"deprecation", "unused"})
public class compostable {
    private static void compost() {
        float f = 0.3F;
        float f1 = 0.5F;
        float f2 = 0.65F;
        float f3 = 0.85F;
        float f4 = 1.0F;
        getAllLeaves().forEach((block) -> add(f, block.get()));
        add(f2, Items.ROTTEN_FLESH);
        add(f2, Items.SPIDER_EYE);
        add(f3, Items.COD);
        add(f3, Items.SALMON);
        add(f3, Items.TROPICAL_FISH);
        add(f3, Items.PUFFERFISH);
        add(f3, Items.BEEF);
        add(f3, Items.CHICKEN);
        add(f3, Items.RABBIT);
        add(f3, Items.MUTTON);
        add(f3, Items.COOKED_BEEF);
        add(f3, Items.COOKED_COD);
        add(f3, Items.COOKED_CHICKEN);
        add(f3, Items.COOKED_RABBIT);
        add(f3, Items.COOKED_MUTTON);
    }
    private static void add(float pChance, @NotNull ItemLike pItem) { if (!ComposterBlock.COMPOSTABLES.containsKey(pItem.asItem())) { ComposterBlock.COMPOSTABLES.put(pItem.asItem(), pChance); } }
    public static void addToList() { compost(); }
}