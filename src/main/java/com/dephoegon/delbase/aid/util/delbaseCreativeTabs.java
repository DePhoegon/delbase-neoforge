package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.Delbase;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.function.Supplier;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.*;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.getAllLeaves;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setAshBlocks;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setAxisCutSandStone;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setChiseledSandStoneEnergySlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setChiseledSandStoneFences;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setChiseledSandStoneFencesGates;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setChiseledSandStoneSlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setChiseledSandStoneStairs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setChiseledSandStoneWalls;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setChiseledSandStones;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setConcreteFenceGates;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setConcreteFences;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setConcreteSlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setConcreteStairs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setConcreteWalls;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setCutSandStoneEnergySlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setCutSandStoneFenceGates;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setCutSandStoneFences;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setCutSandStoneSlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setCutSandStoneStairs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setCutSandStoneWalls;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setFenceGateMisc;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setFenceMisc;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setMiscSlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setMiscStairs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setMiscWalls;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setQuartzFenceGates;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setQuartzFences;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setQuartzSlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setQuartzStairs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setQuartzWalls;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSandEnergySlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSandFenceGates;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSandFences;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSandSlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSandStairs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSandStoneEnergySlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSandStoneFenceGates;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSandStoneFences;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSandStoneSlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSandStoneStairs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSandStoneWalls;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSandStones;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSandWalls;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSmoothSandStoneEnergySlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSmoothSandStoneFenceGates;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSmoothSandStoneFences;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSmoothSandStoneSlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSmoothSandStoneStairs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSmoothSandStoneWalls;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setSmoothSandStones;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setStoneFenceGate;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setStoneFences;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setStoneStairs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setStoneWalls;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setStonesSlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setStrippedWoodSlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setStrippedWoodStairs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setStrippedWoodWalls;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setStrippedWoodenFenceGates;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setStrippedWoodenFences;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setTerracottaFenceGates;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setTerracottaFences;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setTerracottaSlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setTerracottaStairs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setTerracottaWalls;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setWoodSlabs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setWoodStairs;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setWoodWalls;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setWoodenFenceGates;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.setWoodenFences;
import static com.dephoegon.delbase.block.entity.base.machineBlocks.BLOCK_CUTTING_STATION;
import static com.dephoegon.delbase.block.general.miscSpecialCases.HARDENED_OAK_PLANKS;
import static com.dephoegon.delbase.item.blockCutterPlans.WALL_PLANS;

public class delbaseCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_DEFERRED_REGISTER =DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, Delbase.Mod_ID);
    public static final Supplier<CreativeModeTab> DELBASE_BLOCK = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("dephoegon_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.dephoegon_blocks"))
            .icon(() -> new ItemStack(BLOCK_CUTTING_STATION.get()))
            .displayItems((displayParameters, output) -> {
                getDelFullBlockList().forEach(output::accept);
            }).build()
    );
    public static final Supplier<CreativeModeTab> DELBASE_ITEM = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("dephoegon_items", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.dephoegon_items"))
            .icon(() -> new ItemStack(WALL_PLANS.get()))
            .displayItems((displayParameters, output) -> {
                getDelItemBlockList().forEach(output::accept);
                getDelItemList().forEach(output::accept);
            }).build()
    );

    public static @NotNull ArrayList<DeferredItem<? extends ItemLike>> getDelItemList() {
        ArrayList<DeferredItem<? extends ItemLike>> out = new ArrayList<>();
        out.addAll(setBlockCutterPlansList());
        out.addAll(setShiftingDyesList());
        return out;
    }

    public static @NotNull ArrayList<DeferredBlock<? extends ItemLike>> getDelItemBlockList() {
        ArrayList<DeferredBlock<? extends ItemLike>> out = new ArrayList<>();
        out.add(BLOCK_CUTTING_STATION);
        return out;
    }

    public static @NotNull ArrayList<DeferredBlock<? extends ItemLike>> getDelNaturalBlockList() {
        return new ArrayList<>(setSands());
    }
    public static @NotNull ArrayList<DeferredBlock<? extends ItemLike>> getDelBlockList() {
        ArrayList<DeferredBlock<? extends ItemLike>> out = new ArrayList<>();
        out.addAll(setAxisCutSandStone());
        out.addAll(setChiseledSandStoneFences());
        out.addAll(setConcreteFences());
        out.addAll(setCutSandStoneFences());
        out.addAll(setFenceMisc());
        out.addAll(setQuartzFences());
        out.addAll(setSandFences());
        out.addAll(setSandStoneFences());
        out.addAll(setSmoothSandStoneFences());
        out.addAll(setStrippedWoodenFences());
        out.addAll(setStoneFences());
        out.addAll(setTerracottaFences());
        out.addAll(setWoodenFences());
        out.addAll(setAshBlocks());
        out.addAll(setChiseledSandStones());
        out.addAll(setSandStones());
        out.addAll(setSmoothSandStones());
        out.add(HARDENED_OAK_PLANKS);
        out.addAll(setChiseledSandStoneSlabs());
        out.addAll(setChiseledSandStoneEnergySlabs());
        out.addAll(setConcreteSlabs());
        out.addAll(setCutSandStoneSlabs());
        out.addAll(setCutSandStoneEnergySlabs());
        out.addAll(setMiscSlabs());
        out.addAll(setQuartzSlabs());
        out.addAll(setSandSlabs());
        out.addAll(setSandEnergySlabs());
        out.addAll(setSandStoneSlabs());
        out.addAll(setSandStoneEnergySlabs());
        out.addAll(setSmoothSandStoneSlabs());
        out.addAll(setSmoothSandStoneEnergySlabs());
        out.addAll(setStonesSlabs());
        out.addAll(setStrippedWoodSlabs());
        out.addAll(setTerracottaSlabs());
        out.addAll(setWoodSlabs());
        out.addAll(setChiseledSandStoneStairs());
        out.addAll(setConcreteStairs());
        out.addAll(setCutSandStoneStairs());
        out.addAll(setMiscStairs());
        out.addAll(setQuartzStairs());
        out.addAll(setSandStairs());
        out.addAll(setSandStoneStairs());
        out.addAll(setSmoothSandStoneStairs());
        out.addAll(setStoneStairs());
        out.addAll(setStrippedWoodStairs());
        out.addAll(setTerracottaStairs());
        out.addAll(setWoodStairs());
        out.addAll(getAllLeaves());
        out.addAll(setChiseledSandStoneWalls());
        out.addAll(setConcreteWalls());
        out.addAll(setCutSandStoneWalls());
        out.addAll(setMiscWalls());
        out.addAll(setQuartzWalls());
        out.addAll(setSandWalls());
        out.addAll(setSandStoneWalls());
        out.addAll(setSmoothSandStoneWalls());
        out.addAll(setStoneWalls());
        out.addAll(setStrippedWoodWalls());
        out.addAll(setTerracottaWalls());
        out.addAll(setWoodWalls());
        return out;
    }
    public static @NotNull ArrayList<DeferredBlock<? extends ItemLike>> getDelFunctionalBlockList() {
        ArrayList<DeferredBlock<? extends ItemLike>> out = new ArrayList<>();
        out.addAll(setChiseledSandStoneFencesGates());
        out.addAll(setConcreteFenceGates());
        out.addAll(setCutSandStoneFenceGates());
        out.addAll(setFenceGateMisc());
        out.addAll(setQuartzFenceGates());
        out.addAll(setSandFenceGates());
        out.addAll(setSandStoneFenceGates());
        out.addAll(setSmoothSandStoneFenceGates());
        out.addAll(setStoneFenceGate());
        out.addAll(setStrippedWoodenFenceGates());
        out.addAll(setTerracottaFenceGates());
        out.addAll(setWoodenFenceGates());
        return out;
    }
    public static @NotNull ArrayList<DeferredBlock<? extends ItemLike>> getDelFullBlockList() {
        ArrayList<DeferredBlock<? extends ItemLike>> out = new ArrayList<>();
        out.addAll(getDelBlockList());
        out.addAll(getDelNaturalBlockList());
        out.addAll(getDelFunctionalBlockList());
        return out;
    }
}