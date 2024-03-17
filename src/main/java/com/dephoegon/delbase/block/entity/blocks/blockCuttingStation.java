package com.dephoegon.delbase.block.entity.blocks;

import com.dephoegon.delbase.aid.config.commonConfig;
import com.dephoegon.delbase.aid.recipe.blockCuttingStationRecipes;
import com.dephoegon.delbase.block.entity.blockEntities;
import com.dephoegon.delbase.block.entity.screen.blockCuttingStationMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

import static com.dephoegon.delbase.aid.recipe.countAid.netherriteDiamondBonus;
import static com.dephoegon.delbase.aid.recipe.tierRandomDropAid.*;
import static com.dephoegon.delbase.aid.slots.planSlots.isPlansSlotItem;
import static com.dephoegon.delbase.item.blockCutterPlans.*;
import static net.minecraft.world.item.Items.DIAMOND;

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
    private final Optional<IItemHandler> lazyItemHandler = Optional.of(itemHandler);
    private final ItemStackHandler inputHandle = new ItemStackHandler(1) {
        @Override
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
    private final Optional<IItemHandler> lazyInput = Optional.of(inputHandle);
    private final Optional<IItemHandler> lazyOutput = Optional.of(outputHandle);
    private final Optional<IItemHandler> lazyPlan = Optional.of(planHandle);

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = commonConfig.blockCuttingStationCraftTime;
    public blockCuttingStation(BlockPos pWorldPosition, BlockState pBlockState) {
        super(blockEntities.BLOCK_ENTITY_BLOCK_CUTTER.get(), pWorldPosition, pBlockState);
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
    public @Nullable IItemHandler getItemHandlerCapability(@Nullable Direction side) {
        if (side == Direction.UP) {
            return inputHandle;
        }
        if (side == Direction.DOWN) {
            return outputHandle;
        }
        if (side == Direction.SOUTH || side == Direction.EAST || side == Direction.WEST || side == Direction.NORTH) {
            return planHandle;
        }
        if (side == null || level != null && level.getBlockState(getBlockPos()).getBlock() != getBlockState().getBlock()) {
            return itemHandler;
        }
        return null;
    }
    @Override
    public void onLoad() {
        super.onLoad();
    }
    @Override
    protected void saveAdditional(@NotNull CompoundTag tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        tag.putInt("block_cutting_station.progress", progress);
        super.saveAdditional(tag);
    }
    @Override
    public void load(@NotNull CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
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
        Optional<RecipeHolder<blockCuttingStationRecipes>> match = level.getRecipeManager()
                .getRecipeFor(blockCuttingStationRecipes.Type.INSTANCE, inventory, level);
        if (match.isPresent()){
            Item planSlotItem;
            if (entity.itemHandler.getStackInSlot(planSlot).isEmpty()) { return false; } else { planSlotItem = entity.itemHandler.getStackInSlot(planSlot).getItem(); }
            ItemStack resultItem = match.get().value().getOutput();
            int count = resultItem.getCount();
            if (resultItem.getItem() instanceof BlockItem tOutput) {
                if (tOutput.getBlock() instanceof SlabBlock) {
                    count = 1;
                    if (planSlotItem != SLAB_PLANS.get().asItem()) { return false; }
                }
                if (tOutput.getBlock() instanceof WallBlock && planSlotItem != WALL_PLANS.get().asItem()) {
                    return false;
                }
                if (tOutput.getBlock() instanceof StairBlock && planSlotItem != STAIR_PLANS.get().asItem()) {
                    return false;
                }
                if (tOutput.getBlock() instanceof FenceBlock && planSlotItem != FENCE_PLANS.get().asItem()) {
                    return false;
                }
                if (tOutput.getBlock() instanceof FenceGateBlock && planSlotItem != FENCE_GATE_PLANS.get().asItem()) {
                    return false;
                }
            } // Just because I like to enforce plan usage, & possibly avoid any overlooked items.
            // Counting Aids
            return canInsertAmountIntoOutputSlot(inventory, count) && canInsertItemIntoOutputSlot(inventory, resultItem);
        } else return false;
    }
    // hasRecipe for checking for if an item is in a slot or not.

    private static void craftItem(@NotNull blockCuttingStation entity) {
        Level level = entity.level;
        BlockPos worldPosition = entity.worldPosition;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) { inventory.setItem(i, entity.itemHandler.getStackInSlot(i)); }

        assert level != null;
        Optional<RecipeHolder<blockCuttingStationRecipes>> match = level.getRecipeManager()
                .getRecipeFor(blockCuttingStationRecipes.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            Item resultItem = match.get().value().getOutput().getItem();
            String keyString = "none";
            boolean skipOutputSlot = false;
            int count = match.get().value().getOutput().getCount();
            if (entity.itemHandler.getStackInSlot(planSlot).getItem() == ARMOR_COMPOUND.get().asItem()) {
                Item le_item = entity.itemHandler.getStackInSlot(inputSlot).getItem();
                int armCompCount = match.get().value().getPlans().getCount();
                boolean CompoundEat = true;
                if (le_item instanceof ArmorItem recycle) {
                    if (recycle.getMaterial() == ArmorMaterials.NETHERITE) {
                        count = 1;
                        int bonusCount = netherriteDiamondBonus(recycle);
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
                        CompoundEat = false;
                        keyString = "stone";
                    }
                    if (tieredItem.getTier() == Tiers.WOOD) {
                        skipOutputSlot = true;
                        CompoundEat = false;
                        keyString = "wood";
                    }
                    if (tieredItem.getTier() == Tiers.NETHERITE) {
                        skipOutputSlot = true;
                        keyString = "netherite";
                        if (le_item instanceof SwordItem) {
                            count = commonConfig.netherriteSwordRoll;
                        }
                        if (le_item instanceof AxeItem) {
                            count = commonConfig.netherriteAxeRoll;
                        }
                        if (le_item instanceof PickaxeItem) {
                            count = commonConfig.netherritePickAxeRoll;
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
                if (!(CompoundEat)){ entity.itemHandler.extractItem(planSlot, armCompCount, false); }
            }
            entity.itemHandler.extractItem(inputSlot, 1, false);
            if (skipOutputSlot) {
                int returnSize;
                SimpleContainer stone = null;
                if (keyString.equals("stone")) {
                    returnSize = commonConfig.stoneSalvageRolls;
                    stone = stoneContainer(returnSize);
                    //stone confetti
                }
                if (keyString.equals("wood")){
                    returnSize = commonConfig.woodSalvageRolls;
                    stone = woodContainer(returnSize);
                    //wooden confetti
                }
                if (keyString.equals("netherite")) {
                    stone = netherriteToolsBonus(count);
                    entity.itemHandler.setStackInSlot(outputSlot, new ItemStack(resultItem,
                            entity.itemHandler.getStackInSlot(outputSlot).getCount() + 1));
                    //put into the slot, as Netherite is a high tier. diamond(s) still allowed pop out like confetti.
                }
                if (keyString.equals("tools")) {
                    stone = ToolsBonus();
                    entity.itemHandler.setStackInSlot(outputSlot, new ItemStack(resultItem,
                            entity.itemHandler.getStackInSlot(outputSlot).getCount() + count));
                    //pops sticks like confetti, puts the output item
                }
                Containers.dropContents(level, worldPosition, stone);
            } else {
                entity.itemHandler.setStackInSlot(outputSlot, new ItemStack(resultItem,
                        entity.itemHandler.getStackInSlot(outputSlot).getCount() + count));
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