package com.dephoegon.delbase.aid.util;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.getAllLeaves;
import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

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
    private static void add(float pChance, @NotNull ItemLike pItem) { if (!COMPOSTABLES.containsKey(pItem.asItem())) { COMPOSTABLES.put(pItem.asItem(), pChance); } }
    public static void addToList() { compost(); }
}