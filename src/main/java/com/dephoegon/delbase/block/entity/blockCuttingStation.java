package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.aid.config.Config;
import com.dephoegon.delbase.aid.recipe.blockCutterRecipe;
import com.dephoegon.delbase.aid.recipe.blockCutterRecipeInput;
import com.dephoegon.delbase.aid.recipe.modRecipes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.BlockCapability;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

import static com.dephoegon.delbase.aid.config.Config.BLOCK_CUTTING_STATION_CRAFT_TIME;
import static com.dephoegon.delbase.aid.recipe.TierRandomDropAid.*;
import static com.dephoegon.delbase.aid.recipe.countAid.netheriteDiamondBonus;
import static com.dephoegon.delbase.aid.slots.planSlots.isPlansSlotItem;
import static com.dephoegon.delbase.aid.util.burnChance.threshHold;
import static com.dephoegon.delbase.item.blockCutterPlans.*;
import static net.minecraft.world.item.Items.DIAMOND;

@SuppressWarnings("RedundantMethodOverride")
public class blockCuttingStation extends BlockEntity implements MenuProvider {
    public static final int outputSlot = 1;
    public static final int inputSlot = 0;
    public static final int planSlot = 2;
    public static final int blockCuttingStationSlotCount = 3;
    private static final ItemStackHandler blockPlans = new ItemStackHandler(1) {
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return false;
        }
        protected void onContentsChanged(int slot) {  }
    };
    public static ItemStackHandler iHandler = null;
    private final ItemStackHandler itemHandler = new ItemStackHandler(blockCuttingStationSlotCount) {
        @Override
        protected void onContentsChanged(int slot) {
            if (slot == inputSlot) {
                if(inputHandle.getStackInSlot(0) != itemHandler.getStackInSlot(inputSlot)) {
                    inputHandle.setStackInSlot(0, itemHandler.getStackInSlot(inputSlot));
                }
            }
            if (slot == outputSlot) {
                if (outputHandle.getStackInSlot(0) != itemHandler.getStackInSlot(outputSlot)) {
                    outputHandle.setStackInSlot(0, itemHandler.getStackInSlot(outputSlot));
                }
            }
            if (slot == planSlot) {
                if (planHandle.getStackInSlot(0) != itemHandler.getStackInSlot(planSlot)) {
                    planHandle.setStackInSlot(0, itemHandler.getStackInSlot(planSlot));
                    blockPlans.setStackInSlot(0, itemHandler.getStackInSlot(planSlot));
                }
            }
            iHandler = itemHandler;
            setChanged();
        }
    };
    private final ItemStackHandler inputHandle = new ItemStackHandler(1) {
        public boolean isItemValid(int slot, @NotNull ItemStack stack) { return !isPlansSlotItem(stack.getItem()); }
        protected void onContentsChanged(int slot) {
            if (inputHandle.getStackInSlot(slot) != itemHandler.getStackInSlot(inputSlot)) {
                itemHandler.setStackInSlot(inputSlot, inputHandle.getStackInSlot(slot));
            }
        }
    };
    private final ItemStackHandler outputHandle = new ItemStackHandler(1){
        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) { return false; }
        @Override
        protected void onContentsChanged(int slot) {
            if (outputHandle.getStackInSlot(slot) != itemHandler.getStackInSlot(outputSlot)) {
                itemHandler.setStackInSlot(outputSlot, outputHandle.getStackInSlot(slot));
            }
        }
    };
    private final ItemStackHandler planHandle = new ItemStackHandler(1){
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return isPlansSlotItem(stack.getItem().asItem());
        }
        @Override
        protected void onContentsChanged(int slot) {
            if (planHandle.getStackInSlot(slot) != itemHandler.getStackInSlot(planSlot)) {
                itemHandler.setStackInSlot(planSlot, planHandle.getStackInSlot(slot));
                blockPlans.setStackInSlot(slot, planHandle.getStackInSlot(slot));
            }
        }
    };

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = BLOCK_CUTTING_STATION_CRAFT_TIME.get();
    public blockCuttingStation(BlockPos pWorldPosition, BlockState pBlockState) {
        super(blockEntities.BLOCK_CUTTING_STATION_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        // Crafting Progress Container
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> blockCuttingStation.this.progress;
                    case 1 -> blockCuttingStation.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0 -> blockCuttingStation.this.progress = pValue;
                    case 1 -> blockCuttingStation.this.maxProgress = pValue;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }
    @Override
    public @NotNull Component getDisplayName() { return Component.literal("Block Cutting Station"); }
    public static @NotNull Item getPlanSlotItem() { return blockPlans.getStackInSlot(0).getItem(); }
    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, @NotNull Inventory pInventory, @NotNull Player pPlayer) {
        return new blockCuttingStationMenu(pContainerId, pInventory,this, this.data);
    }
    public @Nullable IItemHandler getCapability(BlockCapability<IItemHandler, @Nullable Direction> cap, @Nullable Direction side) {
        if (cap == Capabilities.ItemHandler.BLOCK) {
            if (side == Direction.UP) return inputHandle;
            if (side == Direction.DOWN) return outputHandle;
            if (side == Direction.SOUTH || side == Direction.EAST || side == Direction.WEST || side == Direction.NORTH) return planHandle;
            return itemHandler;
        }
        return null;
    }
    @Override
    public void onLoad() {
        super.onLoad();
    }
    @Override
    protected void saveAdditional(@NotNull CompoundTag tag, HolderLookup.@NotNull Provider registries) {
        tag.put("inventory", itemHandler.serializeNBT(registries));
        tag.putInt("block_cutting_station.progress", progress);
        super.saveAdditional(tag, registries);
    }
    @Override
    public void loadAdditional(@NotNull CompoundTag nbt, HolderLookup.@NotNull Provider registries) {
        super.loadAdditional(nbt, registries);
        itemHandler.deserializeNBT(registries, nbt.getCompound("inventory"));
        blockPlans.setStackInSlot(0, itemHandler.getStackInSlot(planSlot));
        progress = nbt.getInt("block_cutting_station.progress");
    }

    public void drops(){
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i =0; i < itemHandler.getSlots(); i++) { inventory.setItem(i, itemHandler.getStackInSlot(i)); }
        assert this.level != null;
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }
    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, blockCuttingStation pBlockEntity) {
        if(pBlockEntity.hasRecipe()) {
            pBlockEntity.progress++;
            setChanged(pLevel, pPos, pState);
            if(pBlockEntity.progress > pBlockEntity.maxProgress) { craftItem(pBlockEntity); }
        } else {
            pBlockEntity.resetProgress();
            setChanged(pLevel, pPos, pState);
        }
    }
    private Optional<RecipeHolder<blockCutterRecipe>> getCurrentRecipe() {
        if (this.getLevel() == null) { return Optional.empty(); }
        return this.getLevel().getRecipeManager().getRecipeFor(modRecipes.BLOCK_CUTTER_TYPE.get(), new blockCutterRecipeInput(inputHandle.getStackInSlot(inputSlot), planHandle.getStackInSlot(planSlot)), this.getLevel());
    }

    private boolean hasRecipe() {
        Level level = this.level;
        if (level == null) { return false; } // If the level is null, exit the method.
        SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
        for (int i =0; i < this.itemHandler.getSlots(); i++) { inventory.setItem(i, this.itemHandler.getStackInSlot(i)); }

        Optional<RecipeHolder<blockCutterRecipe>> recipe = getCurrentRecipe();
        if (recipe.isEmpty()) { return false; }

        Item planSlotItem;
        if (this.itemHandler.getStackInSlot(planSlot).isEmpty()) { return false; } else { planSlotItem = this.itemHandler.getStackInSlot(planSlot).getItem(); }
        ItemStack resultItem = recipe.get().value().getResultItem(null);
        int count = resultItem.getCount();
        if (resultItem.getItem() instanceof BlockItem tOutput) {
            if (tOutput.getBlock() instanceof SlabBlock) {
                count = 1;
                if (planSlotItem != SLAB_PLANS.get().asItem()) { return false; }
            }
            if (tOutput.getBlock() instanceof WallBlock && planSlotItem != WALL_PLANS.get().asItem()) { return false; }
            if (tOutput.getBlock() instanceof StairBlock && planSlotItem != STAIR_PLANS.get().asItem()) { return false; }
            if (tOutput.getBlock() instanceof FenceBlock && planSlotItem != FENCE_PLANS.get().asItem()) { return false; }
            if (tOutput.getBlock() instanceof FenceGateBlock && planSlotItem != FENCE_GATE_PLANS.get().asItem()) { return false; }
        } // hard coded checks for the plans slot item, as it is not a recipe input. Prevents custom recipes from being used in the block cutting station for the intended types of blocks.
        // Counting Aids
        return canInsertAmountIntoOutputSlot(inventory, count) && canInsertItemIntoOutputSlot(inventory, resultItem);
    }
    // hasRecipe for checking for if an item is in a slot or not.

    private static void craftItem(@NotNull blockCuttingStation entity) {
        Optional<RecipeHolder<blockCutterRecipe>> recipe = entity.getCurrentRecipe();
        Level level = entity.getLevel();
        BlockPos worldPosition = entity.worldPosition;
        if (recipe.isEmpty() || level == null) { return; } // If no recipe is found, exit the method. Should not happen, but just in case.

        // container for output items
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) { inventory.setItem(i, entity.itemHandler.getStackInSlot(i)); }

        ItemStack outputStack = recipe.get().value().output();
        Item resultItem = outputStack.getItem();
        String keyString = "none";
        boolean skipOutputSlot = false;
        int outputStackCount = outputStack.getCount();
        int inputCount = recipe.get().value().getInputCount();
        if (inputCount < 1) { inputCount = 1; } // prevent stack overflow, as the input count is used to determine how many items are in the input slot.
        if (inputCount > entity.itemHandler.getStackInSlot(inputSlot).getMaxStackSize()) { inputCount = entity.itemHandler.getStackInSlot(inputSlot).getMaxStackSize(); } // prevents invalid input counts, as the input count is used to determine how many items are in the input slot.
        if (entity.itemHandler.getStackInSlot(planSlot).getItem() == ARMOR_COMPOUND.get().asItem()) {
            Item le_item = entity.itemHandler.getStackInSlot(inputSlot).getItem();
            int armCompCount = recipe.get().value().getPlanCount();
            boolean compoundEat = true;
            if (le_item instanceof ArmorItem recycle) {
                if (recycle.getMaterial() == ArmorMaterials.NETHERITE) {
                    int bonusCount = outputStackCount;
                    outputStackCount = 1;
                    SimpleContainer bonus = new SimpleContainer(bonusCount);
                    for (int i = 0; i < bonusCount; i++) { bonus.setItem(i, DIAMOND.getDefaultInstance()); }
                    Containers.dropContents(level, worldPosition, bonus);
                }
            }
            if (le_item instanceof TieredItem tieredItem) {
                if (tieredItem.getTier() == Tiers.STONE) {
                    skipOutputSlot = true;
                    compoundEat = threshHold(100, 25);
                    keyString = "stone";
                }
                if (tieredItem.getTier() == Tiers.WOOD) {
                    skipOutputSlot = true;
                    compoundEat = threshHold(100, 50);
                    keyString = "wood";
                }
                if (tieredItem.getTier() == Tiers.NETHERITE) {
                    skipOutputSlot = true;
                    compoundEat = threshHold(100, 10);
                    keyString = "netherite";
                }
                if ((le_item instanceof SwordItem || le_item instanceof AxeItem || le_item instanceof PickaxeItem || le_item instanceof HoeItem) && keyString.equals("none")) {
                    skipOutputSlot = true;
                    keyString = "tools";
                    //Special Behaviors for the Tiers of items
                }
            }
            if (compoundEat){ entity.itemHandler.extractItem(planSlot, armCompCount, false); }
        }
        entity.itemHandler.extractItem(inputSlot, inputCount, false);
        int outputCountTmp = entity.itemHandler.getStackInSlot(outputSlot).getCount();
        if (skipOutputSlot) {
            int returnSize;
            SimpleContainer confettiDropper = null;
            if (keyString.equals("stone")) {
                returnSize = Config.STONE_SALVAGE_ROLLS.get();
                confettiDropper = stoneContainer(returnSize);
                //stone confetti
            }
            if (keyString.equals("wood")){
                returnSize = Config.WOOD_SALVAGE_ROLLS.get();
                confettiDropper = woodContainer(returnSize);
                //wooden confetti
            }
            if (keyString.equals("netherite")) {
                confettiDropper = netheriteToolsBonus(outputStackCount);
                entity.itemHandler.setStackInSlot(outputSlot, new ItemStack(resultItem, entity.itemHandler.getStackInSlot(outputSlot).getCount() + 1));
                //put into the slot, as Netherite is a high tier. diamond(s) still allowed pop out like confetti.
            }
            if (keyString.equals("tools")) {
                confettiDropper = ToolsBonus();
                entity.itemHandler.setStackInSlot(outputSlot, new ItemStack(resultItem, entity.itemHandler.getStackInSlot(outputSlot).getCount() + outputStackCount));
                //pops sticks like confetti, puts the output item
            }
            Containers.dropContents(level, worldPosition, confettiDropper);
        } else { entity.itemHandler.setStackInSlot(outputSlot, new ItemStack(resultItem, entity.itemHandler.getStackInSlot(outputSlot).getCount() + outputStackCount)); }
        entity.resetProgress();
    }
    private void resetProgress() {
        this.progress = 0;
    }
    private static boolean canInsertItemIntoOutputSlot(@NotNull SimpleContainer inventory, @NotNull ItemStack output) {
        return inventory.getItem(blockCuttingStation.outputSlot).getItem() == output.getItem() || inventory.getItem(blockCuttingStation.outputSlot).isEmpty();
    }
    private static boolean canInsertAmountIntoOutputSlot(@NotNull SimpleContainer inventory, int variableOut) {
        return inventory.getItem(blockCuttingStation.outputSlot).getMaxStackSize() >= inventory.getItem(blockCuttingStation.outputSlot).getCount()+variableOut;
    }
}