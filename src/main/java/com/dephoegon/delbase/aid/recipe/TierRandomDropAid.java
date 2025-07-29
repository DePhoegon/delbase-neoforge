package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.aid.config.Config;
import net.minecraft.world.SimpleContainer;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

import static net.minecraft.world.item.Items.*;

public class TierRandomDropAid {
    public static @NotNull SimpleContainer stoneContainer(int size) {
        SimpleContainer stone = new SimpleContainer(size);
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int RNGs = random.nextInt(5);
            switch (RNGs) {
                case 0 -> stone.setItem(i, STICK.getDefaultInstance());
                case 2 -> stone.setItem(i, BLACKSTONE.getDefaultInstance());
                case 3 -> stone.setItem(i, COBBLED_DEEPSLATE.getDefaultInstance());
                default -> stone.setItem(i, COBBLESTONE.getDefaultInstance());
            }
        }
        return stone;
    }
    public static @NotNull SimpleContainer woodContainer(int size) {
        SimpleContainer stone = new SimpleContainer(size);
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int RNGs = random.nextInt(11);
            switch (RNGs) {
                case 0 -> stone.setItem(i, STICK.getDefaultInstance());
                case 1 -> stone.setItem(i, ACACIA_PLANKS.getDefaultInstance());
                case 2 -> stone.setItem(i, DARK_OAK_PLANKS.getDefaultInstance());
                case 4 -> stone.setItem(i, JUNGLE_PLANKS.getDefaultInstance());
                case 5 -> stone.setItem(i, BIRCH_PLANKS.getDefaultInstance());
                case 6 -> stone.setItem(i, SPRUCE_PLANKS.getDefaultInstance());
                case 8 -> stone.setItem(i, CRIMSON_PLANKS.getDefaultInstance());
                case 9 -> stone.setItem(i, WARPED_PLANKS.getDefaultInstance());
                default -> stone.setItem(i, OAK_PLANKS.getDefaultInstance());
            }
        }
        return stone;
    }
    public static @NotNull SimpleContainer netheriteToolsBonus(int diamond) {
        int bonusSize = Config.NETHERRITE_BONUS_ROLLS.get();
        SimpleContainer stone = new SimpleContainer(bonusSize+diamond);
        for (int i = 0; i < diamond; i++) { stone.setItem(i, DIAMOND.getDefaultInstance()); }
        for (int i = 0; i < bonusSize; i++) {
            Random random = new Random();
            int RNGs = random.nextInt(5);
            if (RNGs > 2) { stone.setItem(i+diamond, STICK.getDefaultInstance()); }
        }
        return stone;
    }
    public static @NotNull SimpleContainer ToolsBonus() {
        int bonusSize = Config.NETHERRITE_BONUS_ROLLS.get();
        SimpleContainer stone = new SimpleContainer(bonusSize);
        for (int i = 0; i < bonusSize; i++) {
            Random random = new Random();
            int RNGs = random.nextInt(5);
            if (RNGs > 2) { stone.setItem(i, STICK.getDefaultInstance()); }
        }
        return stone;
    }
}