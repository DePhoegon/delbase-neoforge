package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.aid.config.Config;
import com.dephoegon.delbase.aid.recipe.blockCuttingStationRecipes;
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
        if(hasRecipe(pBlockEntity)) {
            pBlockEntity.progress++;
            setChanged(pLevel, pPos, pState);
            if(pBlockEntity.progress > pBlockEntity.maxProgress) { craftItem(pBlockEntity); }
        } else {
            pBlockEntity.resetProgress();
            setChanged(pLevel, pPos, pState);
        }
    }
    private static boolean hasRecipe(@NotNull blockCuttingStation entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i =0; i < entity.itemHandler.getSlots(); i++) { inventory.setItem(i, entity.itemHandler.getStackInSlot(i)); }
        assert level != null;
        Optional<blockCuttingStationRecipes> match = level.getRecipeManager()
                .getRecipeFor(blockCuttingStationRecipes.Type.INSTANCE, inventory, level);
        if (match.isPresent()){
            Item planSlotItem;
            if (entity.itemHandler.getStackInSlot(planSlot).isEmpty()) { return false; } else { planSlotItem = entity.itemHandler.getStackInSlot(planSlot).getItem(); }
            ItemStack resultItem = match.get().getResultItem();
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
            } // Just because I like to enforce plan usage, and possibly avoid any overlooked items.
            // Counting Aids
            return canInsertAmountIntoOutputSlot(inventory, count) && canInsertItemIntoOutputSlot(inventory, resultItem);
        } else return false;
    }
    // hasRecipe for checking for if an item is in a slot or not.

    private static void craftItem(@NotNull blockCuttingStation entity) {
        Level level = entity.getLevel();
        BlockPos worldPosition = entity.worldPosition;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) { inventory.setItem(i, entity.itemHandler.getStackInSlot(i)); }

        assert level != null;
        Optional<blockCuttingStationRecipes> match = level.getRecipeManager()
                .getRecipeFor(blockCuttingStationRecipes.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            Item resultItem = match.get().getResultItem().getItem();
            String keyString = "none";
            boolean skipOutputSlot = false;
            int count = match.get().getResultItem().getCount();
            if (entity.itemHandler.getStackInSlot(planSlot).getItem() == ARMOR_COMPOUND.get().asItem()) {
                Item le_item = entity.itemHandler.getStackInSlot(inputSlot).getItem();
                int armCompCount = match.get().getPlans().getCount();
                boolean compoundEat = true;
                if (le_item instanceof ArmorItem recycle) {
                    if (recycle.getMaterial() == ArmorMaterials.NETHERITE) {
                        count = 1;
                        int bonusCount = netheriteDiamondBonus(recycle);
                        SimpleContainer bonus = new SimpleContainer(bonusCount);
                        for (int i = 0; i < bonusCount; i++) {
                            bonus.setItem(i, DIAMOND.getDefaultInstance());
                        }
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
                        if (le_item instanceof SwordItem) {
                            count = Config.NETHERRITE_SWORD_BONUS.get();
                        }
                        if (le_item instanceof AxeItem) {
                            count = Config.NETHERRITE_AXE_BONUS.get();
                        }
                        if (le_item instanceof PickaxeItem) {
                            count = Config.NETHERRITE_PICKAXE_BONUS.get();
                        }
                        if (le_item instanceof HoeItem) {
                            count = 1;
                        }
                    }
                    if ((le_item instanceof SwordItem || le_item instanceof AxeItem || le_item instanceof PickaxeItem || le_item instanceof HoeItem) && keyString.equals("none")) {
                        skipOutputSlot = true;
                        keyString = "tools";
                        //Special Behaviors for the Tiers of items
                    }
                }
                if (compoundEat){ entity.itemHandler.extractItem(planSlot, armCompCount, false); }
            }
            entity.itemHandler.extractItem(inputSlot, 1, false);
            if (skipOutputSlot) {
                int returnSize;
                SimpleContainer stone = null;
                if (keyString.equals("stone")) {
                    returnSize = Config.STONE_SALVAGE_ROLLS.get();
                    stone = stoneContainer(returnSize);
                    //stone confetti
                }
                if (keyString.equals("wood")){
                    returnSize = Config.WOOD_SALVAGE_ROLLS.get();
                    stone = woodContainer(returnSize);
                    //wooden confetti
                }
                if (keyString.equals("netherite")) {
                    stone = netheriteToolsBonus(count);
                    entity.itemHandler.setStackInSlot(outputSlot, new ItemStack(resultItem,
                            entity.itemHandler.getStackInSlot(outputSlot).getCount() + 1));
                    //put into the slot, as Netherite is a high tier. diamond(s) still allowed pop out like confetti.
                }
                if (keyString.equals("tools")) {
                    stone = ToolsBonus();
                    entity.itemHandler.setStackInSlot(outputSlot, new ItemStack(resultItem, entity.itemHandler.getStackInSlot(outputSlot).getCount() + count));
                    //pops sticks like confetti, puts the output item
                }
                Containers.dropContents(level, worldPosition, stone);
            } else {
                entity.itemHandler.setStackInSlot(outputSlot, new ItemStack(resultItem, entity.itemHandler.getStackInSlot(outputSlot).getCount() + count));
            }
            entity.resetProgress();
        }
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