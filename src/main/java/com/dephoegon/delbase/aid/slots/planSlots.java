package com.dephoegon.delbase.aid.slots;

import com.dephoegon.delbase.aid.block.item.compoundPlans;
import com.dephoegon.delbase.aid.block.item.cutterPlans;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.recipe.modRecipes.*;

public class planSlots extends SlotItemHandler {

    private final Level level;

    public planSlots(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        this(itemHandler, index, xPosition, yPosition, null);
    }

    public planSlots(IItemHandler itemHandler, int index, int xPosition, int yPosition, Level level) {
        super(itemHandler, index, xPosition, yPosition);
        this.level = level;
    }

    public static boolean isPlansSlotItem(Item item) {
        return item instanceof cutterPlans || item instanceof compoundPlans;
    }

    /**
     * Checks if the item is valid for the plans slot, including default plans and any recipe-defined plans.
     * @param item The item to check.
     * @param level The level to access recipes.
     * @return true if valid for plans slot.
     */
    public static boolean isPlansSlotItem(Item item, Level level) {
        if (isPlansSlotItem(item)) { return true; }
        if (level == null) { return false; }

        // Check all blockCutterRecipe recipes for a matching planItem
        for (var recipeHolder : level.getRecipeManager().getAllRecipesFor(BLOCK_CUTTER_TYPE.get())) {
            var cutterRecipe = recipeHolder.value();
            var planIngredient = cutterRecipe.planItem().ingredient();
            // Check if the ingredient matches the item
            if (planIngredient.test(new ItemStack(item))) { return true; }
        }
        return false;
    }

    /**
     * Intended to only be used for checking if an item is a plans item, excluding Compounds used in the planSlots.
     * @return true if the item is a plans item, false otherwise.
     */
    public static boolean isPlansItem(Item item) { return item instanceof cutterPlans; }

    public boolean mayPlace(@NotNull ItemStack itemStack) {
        // Use the recipe-aware version if we have level access, otherwise fall back to basic check
        if (level != null) { return isPlansSlotItem(itemStack.getItem(), level); }
        return isPlansSlotItem(itemStack.getItem());
    }

    public int getMaxStackSize() { return 64; }
}
