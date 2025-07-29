package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.aid.config.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import org.jetbrains.annotations.NotNull;

public class countAid {
    private static final int nether_chest = Config.NETHERRITE_CHEST_DIAMOND_BONUS.get();
    private static final int nether_helmet = Config.NETHERRITE_HELMET_DIAMOND_BONUS.get();
    private static final int nether_legs = Config.NETHERRITE_LEGGINGS_DIAMOND_BONUS.get();
    private static final int nether_boot = Config.NETHERRITE_BOOTS_DIAMOND_BONUS.get();
    public static int netheriteDiamondBonus(@NotNull ArmorItem recycle) {
        int count = 1;
            if (recycle.getEquipmentSlot() == EquipmentSlot.CHEST) { count = nether_chest; }
            if (recycle.getEquipmentSlot() == EquipmentSlot.FEET) { count = nether_boot; }
            if (recycle.getEquipmentSlot() == EquipmentSlot.HEAD) { count = nether_helmet; }
            if (recycle.getEquipmentSlot() == EquipmentSlot.LEGS) { count = nether_legs; }
        return count;
    }
}
