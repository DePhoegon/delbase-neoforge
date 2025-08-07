package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.recipe.modRecipes;
import com.dephoegon.delbase.block.axis.axiCutSandStones;
import com.dephoegon.delbase.block.entity.base.machineBlocks;
import com.dephoegon.delbase.block.entity.menuTypes;
import com.dephoegon.delbase.block.entity.modBlockEntities;
import com.dephoegon.delbase.block.fence.*;
import com.dephoegon.delbase.block.general.*;
import com.dephoegon.delbase.block.gravity.gravColorSands;
import com.dephoegon.delbase.block.gravity.solidSandColors;
import com.dephoegon.delbase.block.slab.*;
import com.dephoegon.delbase.block.stair.*;
import com.dephoegon.delbase.block.wall.*;
import com.dephoegon.delbase.item.blockCutterPlans;
import com.dephoegon.delbase.item.shiftingDyes;
import net.neoforged.bus.api.IEventBus;

public class regList {
    public static void firstList(IEventBus eventBus) {
        //aid
        blockArrayList.setBlockArrays();
        //Special block
        miscSpecialCases.registerBlock(eventBus);
        // Sand
        gravColorSands.registerBlock(eventBus);
        // SandStone
        genSandStones.registerBlock(eventBus);
        // Stripped Wood, called for in non-stripped versions
        slabStrippedWood.registerBlock(eventBus);
        stairStrippedWood.registerBlock(eventBus);
        wallStrippedWood.registerBlock(eventBus);
        strippedWoodenFences.registerBlock(eventBus);
    }
    public static void listOrder(IEventBus eventBus) {
        //Items
        shiftingDyes.register(eventBus);
        blockCutterPlans.register(eventBus);

        //Pillars
        axiCutSandStones.registerBlock(eventBus);

        //Standard Blocks
        genChiseledSandStones.registerBlock(eventBus);
        genSmoothSandStones.registerBlock(eventBus);

        //Gravity Blocks
        solidSandColors.registerBlock(eventBus);

        //Slabs
        slabChiseledSandStones.registerBlock(eventBus);
        slabChiseledSandStonesEnergy.registerBlock(eventBus);
        slabCutSandStones.registerBlock(eventBus);
        slabCutSandStonesEnergy.registerBlock(eventBus);
        slabSands.registerBlock(eventBus);
        slabSandsEnergy.registerBlock(eventBus);
        slabSandStones.registerBlock(eventBus);
        slabSandStonesEnergy.registerBlock(eventBus);
        slabSmoothSandStones.registerBlock(eventBus);
        slabSmoothSandStonesEnergy.registerBlock(eventBus);
        slabQuartz.registerBlock(eventBus);
        slabConcrete.registerBlock(eventBus);
        slabWood.registerBlock(eventBus);
        slabStones.registerBlock(eventBus);
        slabTerracotta.registerBlock(eventBus);
        slabMisc.registerBlock(eventBus);
        slabLeaves.registerBlock(eventBus);

        //Stairs
        stairSands.registerBlock(eventBus);
        stairSmoothSandStones.registerBlock(eventBus);
        stairChiseledSandStones.registerBlock(eventBus);
        stairCutSandStones.registerBlock(eventBus);
        stairLeaves.registerBlock(eventBus);
        stairSandStones.registerBlock(eventBus);
        stairQuartz.registerBlock(eventBus);
        stairConcrete.registerBlock(eventBus);
        stairWood.registerBlock(eventBus);
        stairStones.registerBlock(eventBus);
        stairTerracotta.registerBlock(eventBus);
        stairMisc.registerBlock(eventBus);

        //Walls
        wallChiseledSandStones.registerBlock(eventBus);
        wallCutSandStones.registerBlock(eventBus);
        wallSands.registerBlock(eventBus);
        wallSandStone.registerBlock(eventBus);
        wallSmoothSandStones.registerBlock(eventBus);
        wallQuartz.registerBlock(eventBus);
        wallConcrete.registerBlock(eventBus);
        wallWood.registerBlock(eventBus);
        wallTerracotta.registerBlock(eventBus);
        wallMisc.registerBlock(eventBus);
        wallStones.registerBlock(eventBus);
        hedgeLeaves.registerBlock(eventBus);

        //Fences
        woodenFences.registerBlock(eventBus);
        quartzFences.registerBlock(eventBus);
        sandFences.registerBlock(eventBus);
        concreteFences.registerBlock(eventBus);
        terracottaFences.registerBlock(eventBus);
        smoothSandStoneFences.registerBlock(eventBus);
        sandStoneFences.registerBlock(eventBus);
        fenceMisc.registerBlock(eventBus);
        leafFences.registerBlock(eventBus);
        cutSandStoneFences.registerBlock(eventBus);
        chiseledSandStoneFences.registerBlock(eventBus);
        stoneFences.registerBlock(eventBus);

        // Specials
        ashBlocks.registerBlock(eventBus);
        machineBlocks.registerBlock(eventBus);
        modBlockEntities.registerBlockEntities(eventBus);

        // Special
        menuTypes.registerMenus(eventBus);
        modRecipes.register(eventBus);
        // recipes ->
    }

}