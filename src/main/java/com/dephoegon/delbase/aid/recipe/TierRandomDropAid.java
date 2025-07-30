package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.aid.config.Config;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

import static net.minecraft.world.item.Items.*;

public class TierRandomDropAid {
    public static @NotNull SimpleContainer stoneContainer(int size) {
        SimpleContainer stone = new SimpleContainer(size);
        for (int i = 0; i < size; i++) {
            int RNGs = getSize(0, 0, 5);
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
            int RNGs = getSize(0, 0, 11);
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
        SimpleContainer stickContainer = ToolsBonus();
        SimpleContainer containerConfetti = new SimpleContainer(diamond + stickContainer.getContainerSize());
        for (int i = 0; i < diamond; i++) { containerConfetti.setItem(i, DIAMOND.getDefaultInstance()); }
        for (int j = 0; j < stickContainer.getContainerSize(); j++) { containerConfetti.setItem(diamond + j, stickContainer.getItem(j)); }
        return containerConfetti;
    }
    public static @NotNull SimpleContainer ToolsBonus() {
        int size = getSize(Config.NETHERRITE_BONUS_ROLLS.get(), 2, 5);
        SimpleContainer confettiContainer = new SimpleContainer(size);

        for (int i = 0; i < size; i++) { confettiContainer.setItem(i, STICK.getDefaultInstance()); }
        return confettiContainer;
    }
    /**
     * Returns a random size based on the bonus size, threshold, and upper limit.
     * If bonusSize is 0, it returns a random number between 1 and upperLimit.
     * Otherwise, it counts how many times a random number exceeds the threshold.
     *
     * @param bonusSize   The number of rolls to perform.
     * @param threshold   The threshold to compare against.
     * @param upperLimit  The upper limit for the random number generation.
     * @return           The calculated size/Random Number. Lowest Return Value is 1.
     */
    private static int getSize(int bonusSize, int threshold, int upperLimit) {
        int size = 0;
        Random random = new Random();
        if (bonusSize == 0) { return random.nextInt(upperLimit); }
        for (int i = 0; i < bonusSize; i++) {
            int RNGs = random.nextInt(upperLimit);
            if (RNGs > threshold) { size++; }
        }
        if (size < 1) { size = 1; }
        return size;
    }
}