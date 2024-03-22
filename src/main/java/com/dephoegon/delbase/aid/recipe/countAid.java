package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.aid.config.commonConfig;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class countAid {
    public static boolean threshHold(int cap, int thresh) { return randomNum(cap) > thresh; }
    private static final int nether_chest = commonConfig.netherriteChestRoll;
    private static final int nether_helmet = commonConfig.netherriteHelmetRoll;
    private static final int nether_legs = commonConfig.netherriteLeggingsRoll;
    private static final int nether_boot = commonConfig.netherriteBootsRoll;
    public static int netherriteDiamondBonus(@NotNull ArmorItem recycle) {
        int count = 1;
        if (recycle.getEquipmentSlot() == EquipmentSlot.CHEST) { count = nether_chest; }
        if (recycle.getEquipmentSlot() == EquipmentSlot.FEET) { count = nether_boot; }
        if (recycle.getEquipmentSlot() == EquipmentSlot.HEAD) { count = nether_helmet; }
        if (recycle.getEquipmentSlot() == EquipmentSlot.LEGS) { count = nether_legs; }
        return count;
    }
    private static int randomNum(int max){
        Random random = new Random();
        return random.nextInt(max)+1;
    }
}