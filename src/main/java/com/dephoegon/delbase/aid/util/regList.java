package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.recipe.modRecipes;
import com.dephoegon.delbase.block.axis.axiCutSandStones;
import com.dephoegon.delbase.block.general.ash;
import com.dephoegon.delbase.block.general.genSandStones;
import com.dephoegon.delbase.block.general.misc;
import com.dephoegon.delbase.block.slab.slabMisc;
import com.dephoegon.delbase.item.blockCutterPlans;
import com.dephoegon.delbase.item.shiftingDyes;
import net.neoforged.bus.api.IEventBus;

public class regList {
    public static void firstList(IEventBus eventBus) {
        //aid
        blockArrayList.setBlockArrays();
        //Special block
        miscSpecialCases.register(eventBus);
        // Sand
        gravColorSands.register(eventBus);
        // SandStone
        genSandStones.register(eventBus);
        // Stripped Wood, called for in non-stripped versions
        slabStrippedWood.register(eventBus);
        stairStrippedWood.register(eventBus);
        wallStrippedWood.register(eventBus);
        strippedWoodenFences.register(eventBus);
    }
    public static void listOrder(IEventBus eventBus) {
        //Items
        shiftingDyes.register(eventBus);
        blockCutterPlans.register(eventBus);

        //Pillars
        axiCutSandStones.register(eventBus);

        //Standard Blocks
        genChiseledSandStones.register(eventBus);
        genSmoothSandStones.register(eventBus);

        //Gravity Blocks
        solidSandColors.register(eventBus);

        //Slabs
        slabChiseledSandStones.register(eventBus);
        slabChiseledSandStonesEnergy.register(eventBus);
        slabCutSandStones.register(eventBus);
        slabCutSandStonesEnergy.register(eventBus);
        slabSands.register(eventBus);
        slabSandsEnergy.register(eventBus);
        slabSandStones.register(eventBus);
        slabSandStonesEnergy.register(eventBus);
        slabSmoothSandStones.register(eventBus);
        slabSmoothSandStonesEnergy.register(eventBus);
        slabQuartz.register(eventBus);
        slabConcrete.register(eventBus);
        slabWood.register(eventBus);
        slabStones.register(eventBus);
        slabTerracotta.register(eventBus);
        slabMisc.register(eventBus);
        slabLeaves.register(eventBus);

        //Stairs
        stairSands.register(eventBus);
        stairSmoothSandStones.register(eventBus);
        stairChiseledSandStones.register(eventBus);
        stairCutSandStones.register(eventBus);
        stairLeaves.register(eventBus);
        stairSandStones.register(eventBus);
        stairQuartz.register(eventBus);
        stairConcrete.register(eventBus);
        stairWood.register(eventBus);
        stairStones.register(eventBus);
        stairTerracotta.register(eventBus);
        stairMisc.register(eventBus);

        //Walls
        wallChiseledSandStones.register(eventBus);
        wallCutSandStones.register(eventBus);
        wallSands.register(eventBus);
        wallSandStone.register(eventBus);
        wallSmoothSandStones.register(eventBus);
        wallQuartz.register(eventBus);
        wallConcrete.register(eventBus);
        wallWood.register(eventBus);
        wallTerracotta.register(eventBus);
        wallMisc.register(eventBus);
        wallStones.register(eventBus);
        hedgeLeaves.register(eventBus);

        //Fences
        woodenFences.register(eventBus);
        quartzFences.register(eventBus);
        sandFences.register(eventBus);
        concreteFences.register(eventBus);
        terracottaFences.register(eventBus);
        smoothSandStoneFences.register(eventBus);
        sandStoneFences.register(eventBus);
        fenceMisc.register(eventBus);
        leafFences.register(eventBus);
        cutSandStoneFences.register(eventBus);
        chiseledSandStoneFences.register(eventBus);
        stoneFences.register(eventBus);

        // Specials
        ashBlocks.register(eventBus);
        machineBlocks.register(eventBus);
        blockEntities.register(eventBus);

        //Special
        menuTypes.register(eventBus);
        modRecipes.register(eventBus);
    }
}
