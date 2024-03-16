package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.aid.block.alt.concreteStair;
import com.dephoegon.delbase.aid.block.alt.concreteWall;
import com.dephoegon.delbase.aid.block.colorshift.axis.cutSandStone;
import com.dephoegon.delbase.aid.block.colorshift.fence.*;
import com.dephoegon.delbase.aid.block.colorshift.gen.chiseledSandStone;
import com.dephoegon.delbase.aid.block.colorshift.gen.smoothSandStone;
import com.dephoegon.delbase.aid.block.colorshift.grav.sandBlock;
import com.dephoegon.delbase.aid.block.colorshift.grav.solidSandBlock;
import com.dephoegon.delbase.aid.block.colorshift.slab.*;
import com.dephoegon.delbase.aid.block.colorshift.stair.*;
import com.dephoegon.delbase.aid.block.colorshift.wall.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import static com.dephoegon.delbase.aid.util.blockArrayList.*;
import static com.dephoegon.delbase.aid.util.colorMixInteraction.ColorLogic;
import static com.dephoegon.delbase.block.axis.axiCutSandStones.*;
import static com.dephoegon.delbase.block.fence.chiseledSandStoneFences.*;
import static com.dephoegon.delbase.block.fence.concreteFences.*;
import static com.dephoegon.delbase.block.fence.cutSandStoneFences.*;
import static com.dephoegon.delbase.block.fence.sandFences.*;
import static com.dephoegon.delbase.block.fence.sandStoneFences.*;
import static com.dephoegon.delbase.block.fence.smoothSandStoneFences.*;
import static com.dephoegon.delbase.block.fence.terracottaFences.*;
import static com.dephoegon.delbase.block.general.genChiseledSandStones.*;
import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.block.general.genSmoothSandStones.*;
import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.block.gravity.solidSandColors.*;
import static com.dephoegon.delbase.block.slab.slabChiseledSandStones.*;
import static com.dephoegon.delbase.block.slab.slabChiseledSandStonesEnergy.*;
import static com.dephoegon.delbase.block.slab.slabCutSandStones.*;
import static com.dephoegon.delbase.block.slab.slabCutSandStonesEnergy.*;
import static com.dephoegon.delbase.block.slab.slabSandStones.*;
import static com.dephoegon.delbase.block.slab.slabSandStonesEnergy.*;
import static com.dephoegon.delbase.block.slab.slabSands.*;
import static com.dephoegon.delbase.block.slab.slabSandsEnergy.*;
import static com.dephoegon.delbase.block.slab.slabSmoothSandStones.*;
import static com.dephoegon.delbase.block.slab.slabSmoothSandStonesEnergy.*;
import static com.dephoegon.delbase.block.slab.slabTerracotta.*;
import static com.dephoegon.delbase.block.stair.stairChiseledSandStones.*;
import static com.dephoegon.delbase.block.stair.stairConcrete.*;
import static com.dephoegon.delbase.block.stair.stairCutSandStones.*;
import static com.dephoegon.delbase.block.stair.stairSandStones.*;
import static com.dephoegon.delbase.block.stair.stairSands.*;
import static com.dephoegon.delbase.block.stair.stairSmoothSandStones.*;
import static com.dephoegon.delbase.block.stair.stairTerracotta.*;
import static com.dephoegon.delbase.block.wall.wallChiseledSandStones.*;
import static com.dephoegon.delbase.block.wall.wallConcrete.*;
import static com.dephoegon.delbase.block.wall.wallCutSandStones.*;
import static com.dephoegon.delbase.block.wall.wallSandStone.*;
import static com.dephoegon.delbase.block.wall.wallSands.*;
import static com.dephoegon.delbase.block.wall.wallSmoothSandStones.*;
import static com.dephoegon.delbase.block.wall.wallTerracotta.*;
import static net.minecraft.world.level.block.Blocks.*;

public class typeSelector {
    public static InteractionResult axis_select(Level world, BlockPos blockPos, BlockState state, Block block, Player playerEntity, Item inHand) {
        int blockIndex = 4;
        if (block instanceof cutSandStone || state == CUT_SANDSTONE.defaultBlockState() || state == CUT_RED_SANDSTONE.defaultBlockState()) {
            return ColorLogic(world, blockPos, state, CUT_SANDSTONE, CUT_RED_SANDSTONE, BLOOD_CUT_SAND_STONE.get(), WHITE_CUT_SAND_STONE.get(), ORANGE_CUT_SAND_STONE.get(), MAGENTA_CUT_SAND_STONE.get(), LIGHT_BLUE_CUT_SAND_STONE.get(), YELLOW_CUT_SAND_STONE.get(), LIME_CUT_SAND_STONE.get(), PINK_CUT_SAND_STONE.get(), GRAY_CUT_SAND_STONE.get(), LIGHT_GRAY_CUT_SAND_STONE.get(), CYAN_CUT_SAND_STONE.get(), PURPLE_CUT_SAND_STONE.get(), BLUE_CUT_SAND_STONE.get(), GREEN_CUT_SAND_STONE.get(), BROWN_CUT_SAND_STONE.get(), BLACK_CUT_SAND_STONE.get(), blockIndex, inHand, playerEntity);
        }
        return InteractionResult.FAIL;
    }
    public static InteractionResult slab_select(Level world, BlockPos blockPos, BlockState state, Block block, Player playerEntity, Item inHand) {
        int blockIndex = 3;
        if (block instanceof chiseledSandStoneSlab) {
            return ColorLogic(world, blockPos, state, OVERRIDE_CHISELED_SAND_STONE_SLAB.get(), OVERRIDE_RED_CHISELED_SAND_STONE_SLAB.get(), BLOOD_CHISELED_SAND_STONE_SLAB.get(), WHITE_CHISELED_SAND_STONE_SLAB.get(), ORANGE_CHISELED_SAND_STONE_SLAB.get(), MAGENTA_CHISELED_SAND_STONE_SLAB.get(), LIGHT_BLUE_CHISELED_SAND_STONE_SLAB.get(), YELLOW_CHISELED_SAND_STONE_SLAB.get(), LIME_CHISELED_SAND_STONE_SLAB.get(), PINK_CHISELED_SAND_STONE_SLAB.get(), GRAY_CHISELED_SAND_STONE_SLAB.get(), LIGHT_GRAY_CHISELED_SAND_STONE_SLAB.get(), CYAN_CHISELED_SAND_STONE_SLAB.get(), PURPLE_CHISELED_SAND_STONE_SLAB.get(), BLUE_CHISELED_SAND_STONE_SLAB.get(), GREEN_CHISELED_SAND_STONE_SLAB.get(), BROWN_CHISELED_SAND_STONE_SLAB.get(), BLACK_CHISELED_SAND_STONE_SLAB.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof chiseledSandStoneSlabEnergy) {
            return ColorLogic(world, blockPos, state, OVERRIDE_CHISELED_SAND_STONE_SLAB_ENERGY.get(), OVERRIDE_RED_CHISELED_SAND_STONE_SLAB_ENERGY.get(), BLOOD_CHISELED_SAND_STONE_SLAB_ENERGY.get(), WHITE_CHISELED_SAND_STONE_SLAB_ENERGY.get(), ORANGE_CHISELED_SAND_STONE_SLAB_ENERGY.get(), MAGENTA_CHISELED_SAND_STONE_SLAB_ENERGY.get(), LIGHT_BLUE_CHISELED_SAND_STONE_SLAB_ENERGY.get(), YELLOW_CHISELED_SAND_STONE_SLAB_ENERGY.get(), LIME_CHISELED_SAND_STONE_SLAB_ENERGY.get(), PINK_CHISELED_SAND_STONE_SLAB_ENERGY.get(), GRAY_CHISELED_SAND_STONE_SLAB_ENERGY.get(), LIGHT_GRAY_CHISELED_SAND_STONE_SLAB_ENERGY.get(), CYAN_CHISELED_SAND_STONE_SLAB_ENERGY.get(), PURPLE_CHISELED_SAND_STONE_SLAB_ENERGY.get(), BLUE_CHISELED_SAND_STONE_SLAB_ENERGY.get(), GREEN_CHISELED_SAND_STONE_SLAB_ENERGY.get(), BROWN_CHISELED_SAND_STONE_SLAB_ENERGY.get(), BLACK_CHISELED_SAND_STONE_SLAB_ENERGY.get(), blockIndex, inHand,playerEntity);
        }
        if (block instanceof cutSandStoneSlab || CUT_SANDSTONE_SLAB.defaultBlockState() == state || CUT_RED_SANDSTONE_SLAB.defaultBlockState() == state) {
            return ColorLogic(world, blockPos, state, CUT_SANDSTONE_SLAB, CUT_RED_SANDSTONE_SLAB, BLOOD_CUT_SAND_STONE_SLAB.get(), WHITE_CUT_SAND_STONE_SLAB.get(), ORANGE_CUT_SAND_STONE_SLAB.get(), MAGENTA_CUT_SAND_STONE_SLAB.get(), LIGHT_BLUE_CUT_SAND_STONE_SLAB.get(), YELLOW_CUT_SAND_STONE_SLAB.get(), LIME_CUT_SAND_STONE_SLAB.get(), PINK_CUT_SAND_STONE_SLAB.get(), GRAY_CUT_SAND_STONE_SLAB.get(), LIGHT_GRAY_CUT_SAND_STONE_SLAB.get(), CYAN_CUT_SAND_STONE_SLAB.get(), PURPLE_CUT_SAND_STONE_SLAB.get(), BLUE_CUT_SAND_STONE_SLAB.get(), GREEN_CUT_SAND_STONE_SLAB.get(), BROWN_CUT_SAND_STONE_SLAB.get(), BLACK_CUT_SAND_STONE_SLAB.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof cutSandStoneSlabEnergy) {
            return ColorLogic(world, blockPos, state, OVERRIDE_CUT_SAND_STONE_SLAB_ENERGY.get(), OVERRIDE_RED_CUT_SAND_STONE_SLAB_ENERGY.get(), BLOOD_CUT_SAND_STONE_SLAB_ENERGY.get(), WHITE_CUT_SAND_STONE_SLAB_ENERGY.get(), ORANGE_CUT_SAND_STONE_SLAB_ENERGY.get(), MAGENTA_CUT_SAND_STONE_SLAB_ENERGY.get(), LIGHT_BLUE_CUT_SAND_STONE_SLAB_ENERGY.get(), YELLOW_CUT_SAND_STONE_SLAB_ENERGY.get(), LIME_CUT_SAND_STONE_SLAB_ENERGY.get(), PINK_CUT_SAND_STONE_SLAB_ENERGY.get(), GRAY_CUT_SAND_STONE_SLAB_ENERGY.get(), LIGHT_GRAY_CUT_SAND_STONE_SLAB_ENERGY.get(), CYAN_CUT_SAND_STONE_SLAB_ENERGY.get(), PURPLE_CUT_SAND_STONE_SLAB_ENERGY.get(), BLUE_CUT_SAND_STONE_SLAB_ENERGY.get(), GREEN_CUT_SAND_STONE_SLAB_ENERGY.get(), BROWN_CUT_SAND_STONE_SLAB_ENERGY.get(), BLACK_CUT_SAND_STONE_SLAB_ENERGY.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof sandSlab) {
            return ColorLogic(world, blockPos, state, OVERRIDE_SAND_SLAB.get(), OVERRIDE_RED_SAND_SLAB.get(), BLOOD_SAND_SLAB.get(), WHITE_SAND_SLAB.get(), ORANGE_SAND_SLAB.get(), MAGENTA_SAND_SLAB.get(), LIGHT_BLUE_SAND_SLAB.get(), YELLOW_SAND_SLAB.get(), LIME_SAND_SLAB.get(), PINK_SAND_SLAB.get(), GRAY_SAND_SLAB.get(), LIGHT_GRAY_SAND_SLAB.get(), CYAN_SAND_SLAB.get(), PURPLE_SAND_SLAB.get(), BLUE_SAND_SLAB.get(), GREEN_SAND_SLAB.get(), BROWN_SAND_SLAB.get(), BLACK_SAND_SLAB.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof sandSlabEnergy) {
            return ColorLogic(world, blockPos, state, OVERRIDE_SAND_SLAB_ENERGY.get(), OVERRIDE_RED_SAND_SLAB_ENERGY.get(), BLOOD_SAND_SLAB_ENERGY.get(), WHITE_SAND_SLAB_ENERGY.get(), ORANGE_SAND_SLAB_ENERGY.get(), MAGENTA_SAND_SLAB_ENERGY.get(), LIGHT_BLUE_SAND_SLAB_ENERGY.get(), YELLOW_SAND_SLAB_ENERGY.get(), LIME_SAND_SLAB_ENERGY.get(), PINK_SAND_SLAB_ENERGY.get(), GRAY_SAND_SLAB_ENERGY.get(), LIGHT_GRAY_SAND_SLAB_ENERGY.get(), CYAN_SAND_SLAB_ENERGY.get(), PURPLE_SAND_SLAB_ENERGY.get(), BLUE_SAND_SLAB_ENERGY.get(), GREEN_SAND_SLAB_ENERGY.get(), BROWN_SAND_SLAB_ENERGY.get(), BLACK_SAND_SLAB_ENERGY.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof sandStoneSlab || SANDSTONE_SLAB.defaultBlockState() == state || RED_SANDSTONE_SLAB.defaultBlockState() == state) {
            return ColorLogic(world, blockPos, state, SANDSTONE_SLAB, RED_SANDSTONE_SLAB, BLOOD_SAND_STONE_SLAB.get(), WHITE_SAND_STONE_SLAB.get(), ORANGE_SAND_STONE_SLAB.get(), MAGENTA_SAND_STONE_SLAB.get(), LIGHT_BLUE_SAND_STONE_SLAB.get(), YELLOW_SAND_STONE_SLAB.get(), LIME_SAND_STONE_SLAB.get(), PINK_SAND_STONE_SLAB.get(), GRAY_SAND_STONE_SLAB.get(), LIGHT_GRAY_SAND_STONE_SLAB.get(), CYAN_SAND_STONE_SLAB.get(), PURPLE_SAND_STONE_SLAB.get(), BLUE_SAND_STONE_SLAB.get(), GREEN_SAND_STONE_SLAB.get(), BROWN_SAND_STONE_SLAB.get(), BLACK_SAND_STONE_SLAB.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof sandStoneSlabEnergy) {
            return ColorLogic(world, blockPos, state, OVERRIDE_SAND_STONE_SLAB_ENERGY.get(), OVERRIDE_RED_SAND_STONE_SLAB_ENERGY.get(), BLOOD_SAND_STONE_SLAB_ENERGY.get(), WHITE_SAND_STONE_SLAB_ENERGY.get(), ORANGE_SAND_STONE_SLAB_ENERGY.get(), MAGENTA_SAND_STONE_SLAB_ENERGY.get(), LIGHT_BLUE_SAND_STONE_SLAB_ENERGY.get(), YELLOW_SAND_STONE_SLAB_ENERGY.get(), LIME_SAND_STONE_SLAB_ENERGY.get(), PINK_SAND_STONE_SLAB_ENERGY.get(), GRAY_SAND_STONE_SLAB_ENERGY.get(), LIGHT_GRAY_SAND_STONE_SLAB_ENERGY.get(), CYAN_SAND_STONE_SLAB_ENERGY.get(), PURPLE_SAND_STONE_SLAB_ENERGY.get(), BLUE_SAND_STONE_SLAB_ENERGY.get(), GREEN_SAND_STONE_SLAB_ENERGY.get(), BROWN_SAND_STONE_SLAB_ENERGY.get(), BLACK_SAND_STONE_SLAB_ENERGY.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof smoothSandStoneSlab || SMOOTH_SANDSTONE_SLAB.defaultBlockState() == state || SMOOTH_RED_SANDSTONE_SLAB.defaultBlockState() == state) {
            return ColorLogic(world, blockPos, state, SMOOTH_SANDSTONE_SLAB, SMOOTH_RED_SANDSTONE_SLAB, BLOOD_SMOOTH_SAND_STONE_SLAB.get(), WHITE_SMOOTH_SAND_STONE_SLAB.get(), ORANGE_SMOOTH_SAND_STONE_SLAB.get(), MAGENTA_SMOOTH_SAND_STONE_SLAB.get(), LIGHT_BLUE_SMOOTH_SAND_STONE_SLAB.get(), YELLOW_SMOOTH_SAND_STONE_SLAB.get(), LIME_SMOOTH_SAND_STONE_SLAB.get(), PINK_SMOOTH_SAND_STONE_SLAB.get(), GRAY_SMOOTH_SAND_STONE_SLAB.get(), LIGHT_GRAY_SMOOTH_SAND_STONE_SLAB.get(), CYAN_SMOOTH_SAND_STONE_SLAB.get(), PURPLE_SMOOTH_SAND_STONE_SLAB.get(), BLUE_SMOOTH_SAND_STONE_SLAB.get(), GREEN_SMOOTH_SAND_STONE_SLAB.get(), BROWN_SMOOTH_SAND_STONE_SLAB.get(), BLACK_SMOOTH_SAND_STONE_SLAB.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof smoothSandStoneSlabEnergy) {
            return ColorLogic(world, blockPos, state, OVERRIDE_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), OVERRIDE_RED_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), BLOOD_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), WHITE_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), ORANGE_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), MAGENTA_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), LIGHT_BLUE_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), YELLOW_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), LIME_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), PINK_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), GRAY_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), LIGHT_GRAY_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), CYAN_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), PURPLE_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), BLUE_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), GREEN_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), BROWN_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), BLACK_SMOOTH_SAND_STONE_SLAB_ENERGY.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof terracottaSlab) {
            return ColorLogic(world, blockPos, state, TERRACOTTA_SLAB.get(), RED_TERRACOTTA_SLAB.get(), null, WHITE_TERRACOTTA_SLAB.get(), ORANGE_TERRACOTTA_SLAB.get(), MAGENTA_TERRACOTTA_SLAB.get(), LIGHT_BLUE_TERRACOTTA_SLAB.get(), YELLOW_TERRACOTTA_SLAB.get(), LIME_TERRACOTTA_SLAB.get(), PINK_TERRACOTTA_SLAB.get(), GRAY_TERRACOTTA_SLAB.get(), LIGHT_GRAY_TERRACOTTA_SLAB.get(), CYAN_TERRACOTTA_SLAB.get(), PURPLE_TERRACOTTA_SLAB.get(), BLUE_TERRACOTTA_SLAB.get(), GREEN_TERRACOTTA_SLAB.get(), BROWN_TERRACOTTA_SLAB.get(), BLACK_TERRACOTTA_SLAB.get(), blockIndex, inHand, playerEntity);
        }
        return InteractionResult.FAIL;
    }
    public static InteractionResult gen_select(Level world, BlockPos blockPos, BlockState state, Block block, Player playerEntity, Item inHand) {
        int blockIndex = 5;
        if (getTerracotta_list().contains(state)) {
            return ColorLogic(world, blockPos, state, TERRACOTTA, RED_TERRACOTTA, null, WHITE_TERRACOTTA, ORANGE_TERRACOTTA, MAGENTA_TERRACOTTA, LIGHT_BLUE_TERRACOTTA, YELLOW_TERRACOTTA, LIME_TERRACOTTA, PINK_TERRACOTTA, GRAY_TERRACOTTA, LIGHT_GRAY_TERRACOTTA, CYAN_TERRACOTTA, PURPLE_TERRACOTTA, BLUE_TERRACOTTA, GREEN_TERRACOTTA, BROWN_TERRACOTTA, BLACK_TERRACOTTA, blockIndex, inHand, playerEntity);
        }
        if (getConcrete_list().contains(state)) {
            return ColorLogic(world, blockPos, state, null, RED_CONCRETE, null, WHITE_CONCRETE, ORANGE_CONCRETE, MAGENTA_CONCRETE, LIGHT_BLUE_CONCRETE, YELLOW_CONCRETE, LIME_CONCRETE, PINK_CONCRETE, GRAY_CONCRETE, LIGHT_GRAY_CONCRETE, CYAN_CONCRETE, PURPLE_CONCRETE, BLUE_CONCRETE, GREEN_CONCRETE, BROWN_CONCRETE, BLACK_CONCRETE, blockIndex, inHand, playerEntity);
        }
        if (block instanceof chiseledSandStone || state == CHISELED_SANDSTONE.defaultBlockState() || state == CHISELED_RED_SANDSTONE.defaultBlockState()) {
            return ColorLogic(world, blockPos, state, CHISELED_SANDSTONE, CHISELED_RED_SANDSTONE, BLOOD_CHISELED_SAND_STONE.get(), WHITE_CHISELED_SAND_STONE.get(), ORANGE_CHISELED_SAND_STONE.get(), MAGENTA_CHISELED_SAND_STONE.get(), LIGHT_BLUE_CHISELED_SAND_STONE.get(), YELLOW_CHISELED_SAND_STONE.get(), LIME_CHISELED_SAND_STONE.get(), PINK_CHISELED_SAND_STONE.get(), GRAY_CHISELED_SAND_STONE.get(), LIGHT_GRAY_CHISELED_SAND_STONE.get(), CYAN_CHISELED_SAND_STONE.get(), PURPLE_CHISELED_SAND_STONE.get(), BLUE_CHISELED_SAND_STONE.get(), GREEN_CHISELED_SAND_STONE.get(), BROWN_CHISELED_SAND_STONE.get(), BLACK_CHISELED_SAND_STONE.get(), blockIndex, inHand, playerEntity);
        }
        if (state == SANDSTONE.defaultBlockState() || state == RED_SANDSTONE.defaultBlockState()) {
            return ColorLogic(world, blockPos, state, SANDSTONE, RED_SANDSTONE, BLOOD_SAND_STONE.get(), WHITE_SAND_STONE.get(), ORANGE_SAND_STONE.get(), MAGENTA_SAND_STONE.get(), LIGHT_BLUE_SAND_STONE.get(), YELLOW_SAND_STONE.get(), LIME_SAND_STONE.get(), PINK_SAND_STONE.get(), GRAY_SAND_STONE.get(), LIGHT_GRAY_SAND_STONE.get(), CYAN_SAND_STONE.get(), PURPLE_SAND_STONE.get(), BLUE_SAND_STONE.get(), GREEN_SAND_STONE.get(), BROWN_SAND_STONE.get(), BLACK_SAND_STONE.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof smoothSandStone || state == SMOOTH_SANDSTONE.defaultBlockState() || state == SMOOTH_RED_SANDSTONE.defaultBlockState()) {
            return ColorLogic(world, blockPos, state, SMOOTH_SANDSTONE, SMOOTH_RED_SANDSTONE, BLOOD_SMOOTH_SAND_STONE.get(), WHITE_SMOOTH_SAND_STONE.get(), ORANGE_SMOOTH_SAND_STONE.get(), MAGENTA_SMOOTH_SAND_STONE.get(), LIGHT_BLUE_SMOOTH_SAND_STONE.get(), YELLOW_SMOOTH_SAND_STONE.get(), LIME_SMOOTH_SAND_STONE.get(), PINK_SMOOTH_SAND_STONE.get(), GRAY_SMOOTH_SAND_STONE.get(), LIGHT_GRAY_SMOOTH_SAND_STONE.get(), CYAN_SMOOTH_SAND_STONE.get(), PURPLE_SMOOTH_SAND_STONE.get(), BLUE_SMOOTH_SAND_STONE.get(), GREEN_SMOOTH_SAND_STONE.get(), BROWN_SMOOTH_SAND_STONE.get(), BLACK_SMOOTH_SAND_STONE.get(), blockIndex, inHand, playerEntity);
        }
        return InteractionResult.FAIL;
    }
    public static InteractionResult grav_select(Level world, BlockPos blockPos, BlockState state, Block block, Player playerEntity, Item inHand) {
        int blockIndex = 5;
        if (block instanceof sandBlock || getSand_list().contains(state)) {
            return ColorLogic(world, blockPos, state, SAND, RED_SAND, BLOOD_SAND.get(), WHITE_SAND.get(), ORANGE_SAND.get(), MAGENTA_SAND.get(), LIGHT_BLUE_SAND.get(), YELLOW_SAND.get(), LIME_SAND.get(), PINK_SAND.get(), GRAY_SAND.get(), LIGHT_GRAY_SAND.get(), CYAN_SAND.get(), PURPLE_SAND.get(), BLUE_SAND.get(), GREEN_SAND.get(), BROWN_SAND.get(), BLACK_SAND.get(),blockIndex, inHand, playerEntity);
        }
        if (block instanceof solidSandBlock) {
            return ColorLogic(world, blockPos, state, OVERRIDE_SOLID_SAND.get(), OVERRIDE_RED_SOLID_SAND.get(), BLOOD_SOLID_SAND.get(), WHITE_SOLID_SAND.get(), ORANGE_SOLID_SAND.get(), MAGENTA_SOLID_SAND.get(), LIGHT_BLUE_SOLID_SAND.get(), YELLOW_SOLID_SAND.get(), LIME_SOLID_SAND.get(), PINK_SOLID_SAND.get(), GRAY_SOLID_SAND.get(), LIGHT_GRAY_SOLID_SAND.get(), CYAN_SOLID_SAND.get(), PURPLE_SOLID_SAND.get(), BLUE_SOLID_SAND.get(), GREEN_SOLID_SAND.get(), BROWN_SOLID_SAND.get(), BLACK_SOLID_SAND.get(), blockIndex, inHand, playerEntity);
        }
        if (getConcretePowder_list().contains(state)) {
            return ColorLogic(world, blockPos, state, null, RED_CONCRETE_POWDER, null, WHITE_CONCRETE_POWDER, ORANGE_CONCRETE_POWDER, MAGENTA_CONCRETE_POWDER, LIGHT_BLUE_CONCRETE_POWDER, YELLOW_CONCRETE_POWDER, LIME_CONCRETE_POWDER, PINK_CONCRETE_POWDER, GRAY_CONCRETE_POWDER, LIGHT_GRAY_CONCRETE_POWDER, CYAN_CONCRETE_POWDER, PURPLE_CONCRETE_POWDER, BLUE_CONCRETE_POWDER, GREEN_CONCRETE_POWDER, BROWN_CONCRETE_POWDER, BLACK_CONCRETE_POWDER, blockIndex, inHand, playerEntity);
        }
        return InteractionResult.FAIL;
    }
    public static InteractionResult stair_select(Level world, BlockPos blockPos, BlockState state, Block block, Player playerEntity, Item inHand) {
        int blockIndex = 2;
        if (block instanceof chiseledSandStoneStair) {
            return ColorLogic(world, blockPos, state, CHISELED_SAND_STONE_STAIR.get(), RED_CHISELED_SAND_STONE_STAIR.get(), BLOOD_CHISELED_SAND_STONE_STAIR.get(), WHITE_CHISELED_SAND_STONE_STAIR.get(), ORANGE_CHISELED_SAND_STONE_STAIR.get(), MAGENTA_CHISELED_SAND_STONE_STAIR.get(), LIGHT_BLUE_CHISELED_SAND_STONE_STAIR.get(), YELLOW_CHISELED_SAND_STONE_STAIR.get(), LIME_CHISELED_SAND_STONE_STAIR.get(), PINK_CHISELED_SAND_STONE_STAIR.get(), GRAY_CHISELED_SAND_STONE_STAIR.get(), LIGHT_GRAY_CHISELED_SAND_STONE_STAIR.get(), CYAN_CHISELED_SAND_STONE_STAIR.get(), PURPLE_CHISELED_SAND_STONE_STAIR.get(), BLUE_CHISELED_SAND_STONE_STAIR.get(), GREEN_CHISELED_SAND_STONE_STAIR.get(), BROWN_CHISELED_SAND_STONE_STAIR.get(), BLACK_CHISELED_SAND_STONE_STAIR.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof cutSandStoneStair) {
            return ColorLogic(world, blockPos, state, CUT_SAND_STONE_STAIR.get(), RED_CUT_SAND_STONE_STAIR.get(), BLOOD_CUT_SAND_STONE_STAIR.get(), WHITE_CUT_SAND_STONE_STAIR.get(), ORANGE_CUT_SAND_STONE_STAIR.get(), MAGENTA_CUT_SAND_STONE_STAIR.get(), LIGHT_BLUE_CUT_SAND_STONE_STAIR.get(), YELLOW_CUT_SAND_STONE_STAIR.get(), LIME_CUT_SAND_STONE_STAIR.get(), PINK_CUT_SAND_STONE_STAIR.get(), GRAY_CUT_SAND_STONE_STAIR.get(), LIGHT_GRAY_CUT_SAND_STONE_STAIR.get(), CYAN_CUT_SAND_STONE_STAIR.get(), PURPLE_CUT_SAND_STONE_STAIR.get(), BLUE_CUT_SAND_STONE_STAIR.get(), GREEN_CUT_SAND_STONE_STAIR.get(), BROWN_CUT_SAND_STONE_STAIR.get(), BLACK_CUT_SAND_STONE_STAIR.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof sandStair) {
            return ColorLogic(world, blockPos, state, SAND_STAIR.get(), RED_SAND_STAIR.get(), BLOOD_SAND_STAIR.get(), WHITE_SAND_STAIR.get(), ORANGE_SAND_STAIR.get(), MAGENTA_SAND_STAIR.get(), LIGHT_BLUE_SAND_STAIR.get(), YELLOW_SAND_STAIR.get(), LIME_SAND_STAIR.get(), PINK_SAND_STAIR.get(), GRAY_SAND_STAIR.get(), LIGHT_GRAY_SAND_STAIR.get(), CYAN_SAND_STAIR.get(), PURPLE_SAND_STAIR.get(), BLUE_SAND_STAIR.get(), GREEN_SAND_STAIR.get(), BROWN_SAND_STAIR.get(), BLACK_SAND_STAIR.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof sandStoneStair || state == SANDSTONE_STAIRS.defaultBlockState() || state == RED_SANDSTONE_STAIRS.defaultBlockState()) {
            return ColorLogic(world, blockPos, state, SANDSTONE_STAIRS, RED_SANDSTONE_STAIRS, BLOOD_SAND_STONE_STAIR.get(), WHITE_SAND_STONE_STAIR.get(), ORANGE_SAND_STONE_STAIR.get(), MAGENTA_SAND_STONE_STAIR.get(), LIGHT_BLUE_SAND_STONE_STAIR.get(), YELLOW_SAND_STONE_STAIR.get(), LIME_SAND_STONE_STAIR.get(), PINK_SAND_STONE_STAIR.get(), GRAY_SAND_STONE_STAIR.get(), LIGHT_GRAY_SAND_STONE_STAIR.get(), CYAN_SAND_STONE_STAIR.get(), PURPLE_SAND_STONE_STAIR.get(), BLUE_SAND_STONE_STAIR.get(), GREEN_SAND_STONE_STAIR.get(), BROWN_SAND_STONE_STAIR.get(), BLACK_SAND_STONE_STAIR.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof smoothSandStoneStair || state == SMOOTH_SANDSTONE_STAIRS.defaultBlockState() || state == SMOOTH_RED_SANDSTONE_STAIRS.defaultBlockState()) {
            return ColorLogic(world, blockPos, state, SMOOTH_SANDSTONE_STAIRS, SMOOTH_RED_SANDSTONE_STAIRS, BLOOD_SMOOTH_SAND_STONE_STAIR.get(), WHITE_SMOOTH_SAND_STONE_STAIR.get(), ORANGE_SMOOTH_SAND_STONE_STAIR.get(), MAGENTA_SMOOTH_SAND_STONE_STAIR.get(), LIGHT_BLUE_SMOOTH_SAND_STONE_STAIR.get(), YELLOW_SMOOTH_SAND_STONE_STAIR.get(), LIME_SMOOTH_SAND_STONE_STAIR.get(), PINK_SMOOTH_SAND_STONE_STAIR.get(), GRAY_SMOOTH_SAND_STONE_STAIR.get(), LIGHT_GRAY_SMOOTH_SAND_STONE_STAIR.get(), CYAN_SMOOTH_SAND_STONE_STAIR.get(), PURPLE_SMOOTH_SAND_STONE_STAIR.get(), BLUE_SMOOTH_SAND_STONE_STAIR.get(), GREEN_SMOOTH_SAND_STONE_STAIR.get(), BROWN_SMOOTH_SAND_STONE_STAIR.get(), BLACK_SMOOTH_SAND_STONE_STAIR.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof terracottaStair) {
            return ColorLogic(world, blockPos, state, TERRACOTTA_STAIR.get(), RED_TERRACOTTA_STAIR.get(), null, WHITE_TERRACOTTA_STAIR.get(), ORANGE_TERRACOTTA_STAIR.get(), MAGENTA_TERRACOTTA_STAIR.get(), LIGHT_BLUE_TERRACOTTA_STAIR.get(), YELLOW_TERRACOTTA_STAIR.get(), LIME_TERRACOTTA_STAIR.get(), PINK_TERRACOTTA_STAIR.get(), GRAY_TERRACOTTA_STAIR.get(), LIGHT_GRAY_TERRACOTTA_STAIR.get(), CYAN_TERRACOTTA_STAIR.get(), PURPLE_TERRACOTTA_STAIR.get(), BLUE_TERRACOTTA_STAIR.get(), GREEN_TERRACOTTA_STAIR.get(), BROWN_TERRACOTTA_STAIR.get(), BLACK_TERRACOTTA_STAIR.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof concreteStair) {
            return  ColorLogic(world, blockPos, state, null, RED_CONCRETE_STAIR.get(), null, WHITE_CONCRETE_STAIR.get(), ORANGE_CONCRETE_STAIR.get(), MAGENTA_CONCRETE_STAIR.get(), LIGHT_BLUE_CONCRETE_STAIR.get(), YELLOW_CONCRETE_STAIR.get(), LIME_CONCRETE_STAIR.get(), PINK_CONCRETE_STAIR.get(), GRAY_CONCRETE_STAIR.get(), LIGHT_GRAY_CONCRETE_STAIR.get(), CYAN_CONCRETE_STAIR.get(), PURPLE_CONCRETE_STAIR.get(), BLUE_CONCRETE_STAIR.get(), GREEN_CONCRETE_STAIR.get(), BROWN_CONCRETE_STAIR.get(), BLACK_CONCRETE_STAIR.get(), blockIndex, inHand, playerEntity);
        }
        return InteractionResult.FAIL;
    }
    public static InteractionResult wall_select(Level world, BlockPos blockPos, BlockState state, Block block, Player playerEntity, Item inHand) {
        int blockIndex = 1;
        if (block instanceof chiseledSandStoneWall) {
            return ColorLogic(world, blockPos, state, OVERRIDE_CHISELED_SAND_STONE_WALL.get(), OVERRIDE_RED_CHISELED_SAND_STONE_WALL.get(), BLOOD_CHISELED_SAND_STONE_WALL.get(), WHITE_CHISELED_SAND_STONE_WALL.get(), ORANGE_CHISELED_SAND_STONE_WALL.get(), MAGENTA_CHISELED_SAND_STONE_WALL.get(), LIGHT_BLUE_CHISELED_SAND_STONE_WALL.get(), YELLOW_CHISELED_SAND_STONE_WALL.get(), LIME_CHISELED_SAND_STONE_WALL.get(), PINK_CHISELED_SAND_STONE_WALL.get(), GRAY_CHISELED_SAND_STONE_WALL.get(), LIGHT_GRAY_CHISELED_SAND_STONE_WALL.get(), CYAN_CHISELED_SAND_STONE_WALL.get(), PURPLE_CHISELED_SAND_STONE_WALL.get(), BLUE_CHISELED_SAND_STONE_WALL.get(), GREEN_CHISELED_SAND_STONE_WALL.get(), BROWN_CHISELED_SAND_STONE_WALL.get(), BLACK_CHISELED_SAND_STONE_WALL.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof cutSandStoneWall) {
            return ColorLogic(world, blockPos, state, OVERRIDE_CUT_SAND_STONE_WALL.get(), OVERRIDE_RED_CUT_SAND_STONE_WALL.get(), BLOOD_CUT_SAND_STONE_WALL.get(), WHITE_CUT_SAND_STONE_WALL.get(), ORANGE_CUT_SAND_STONE_WALL.get(), MAGENTA_CUT_SAND_STONE_WALL.get(), LIGHT_BLUE_CUT_SAND_STONE_WALL.get(), YELLOW_CUT_SAND_STONE_WALL.get(), LIME_CUT_SAND_STONE_WALL.get(), PINK_CUT_SAND_STONE_WALL.get(), GRAY_CUT_SAND_STONE_WALL.get(), LIGHT_GRAY_CUT_SAND_STONE_WALL.get(), CYAN_CUT_SAND_STONE_WALL.get(), PURPLE_CUT_SAND_STONE_WALL.get(), BLUE_CUT_SAND_STONE_WALL.get(), GREEN_CUT_SAND_STONE_WALL.get(), BROWN_CUT_SAND_STONE_WALL.get(), BLACK_CUT_SAND_STONE_WALL.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof sandStoneWall || state == SANDSTONE_WALL.defaultBlockState() || state == RED_SANDSTONE_WALL.defaultBlockState()) {
            return ColorLogic(world, blockPos, state, SANDSTONE_WALL, RED_SANDSTONE_WALL, BLOOD_SAND_STONE_WALL.get(), WHITE_SAND_STONE_WALL.get(), ORANGE_SAND_STONE_WALL.get(), MAGENTA_SAND_STONE_WALL.get(), LIGHT_BLUE_SAND_STONE_WALL.get(), YELLOW_SAND_STONE_WALL.get(), LIME_SAND_STONE_WALL.get(), PINK_SAND_STONE_WALL.get(), GRAY_SAND_STONE_WALL.get(), LIGHT_GRAY_SAND_STONE_WALL.get(), CYAN_SAND_STONE_WALL.get(), PURPLE_SAND_STONE_WALL.get(), BLUE_SAND_STONE_WALL.get(), GREEN_SAND_STONE_WALL.get(), BROWN_SAND_STONE_WALL.get(), BLACK_SAND_STONE_WALL.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof sandWall) {
            return ColorLogic(world, blockPos, state, OVERRIDE_SAND_WALL.get(), OVERRIDE_RED_SAND_WALL.get(), BLOOD_SAND_WALL.get(), WHITE_SAND_WALL.get(), ORANGE_SAND_WALL.get(), MAGENTA_SAND_WALL.get(), LIGHT_BLUE_SAND_WALL.get(), YELLOW_SAND_WALL.get(), LIME_SAND_WALL.get(), PINK_SAND_WALL.get(), GRAY_SAND_WALL.get(), LIGHT_GRAY_SAND_WALL.get(), CYAN_SAND_WALL.get(), PURPLE_SAND_WALL.get(), BLUE_SAND_WALL.get(), GREEN_SAND_WALL.get(), BROWN_SAND_WALL.get(), BLACK_SAND_WALL.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof smoothSandStoneWall) {
            return ColorLogic(world, blockPos, state, SMOOTH_SAND_STONE_WALL.get(), RED_SMOOTH_SAND_STONE_WALL.get(), BLOOD_SMOOTH_SAND_STONE_WALL.get(), WHITE_SMOOTH_SAND_STONE_WALL.get(), ORANGE_SMOOTH_SAND_STONE_WALL.get(), MAGENTA_SMOOTH_SAND_STONE_WALL.get(), LIGHT_BLUE_SMOOTH_SAND_STONE_WALL.get(), YELLOW_SMOOTH_SAND_STONE_WALL.get(), LIME_SMOOTH_SAND_STONE_WALL.get(), PINK_SMOOTH_SAND_STONE_WALL.get(), GRAY_SMOOTH_SAND_STONE_WALL.get(), LIGHT_GRAY_SMOOTH_SAND_STONE_WALL.get(), CYAN_SMOOTH_SAND_STONE_WALL.get(), PURPLE_SMOOTH_SAND_STONE_WALL.get(), BLUE_SMOOTH_SAND_STONE_WALL.get(), GREEN_SMOOTH_SAND_STONE_WALL.get(), BROWN_SMOOTH_SAND_STONE_WALL.get(), BLACK_SMOOTH_SAND_STONE_WALL.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof terracottaWall) {
            return ColorLogic(world, blockPos, state, TERRACOTTA_WALL.get(), RED_TERRACOTTA_WALL.get(), null, WHITE_TERRACOTTA_WALL.get(), ORANGE_TERRACOTTA_WALL.get(), MAGENTA_TERRACOTTA_WALL.get(), LIGHT_BLUE_TERRACOTTA_WALL.get(), YELLOW_TERRACOTTA_WALL.get(), LIME_TERRACOTTA_WALL.get(), PINK_TERRACOTTA_WALL.get(), GRAY_TERRACOTTA_WALL.get(), LIGHT_GRAY_TERRACOTTA_WALL.get(), CYAN_TERRACOTTA_WALL.get(), PURPLE_TERRACOTTA_WALL.get(), BLUE_TERRACOTTA_WALL.get(), GREEN_TERRACOTTA_WALL.get(), BROWN_TERRACOTTA_WALL.get(), BLACK_TERRACOTTA_WALL.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof concreteWall) {
            return ColorLogic(world, blockPos, state, null, RED_CONCRETE_WALL.get(), null, WHITE_CONCRETE_WALL.get(), ORANGE_CONCRETE_WALL.get(), MAGENTA_CONCRETE_WALL.get(), LIGHT_BLUE_CONCRETE_WALL.get(), YELLOW_CONCRETE_WALL.get(), LIME_CONCRETE_WALL.get(), PINK_CONCRETE_WALL.get(), GRAY_CONCRETE_WALL.get(), LIGHT_GRAY_CONCRETE_WALL.get(), CYAN_CONCRETE_WALL.get(), PURPLE_CONCRETE_WALL.get(), BLUE_CONCRETE_WALL.get(), GREEN_CONCRETE_WALL.get(), BROWN_CONCRETE_WALL.get(), BLACK_CONCRETE_WALL.get(), blockIndex, inHand, playerEntity);
        }
        return InteractionResult.FAIL;
    }
    public static InteractionResult fence_select(Level world, BlockPos blockPos, BlockState state, Block block, Player playerEntity, Item inHand) {
        int blockIndex = 6;
        if (block instanceof chiseledSandStoneFence) {
            return ColorLogic(world, blockPos, state, CHISELED_SAND_STONE_FENCE.get(),RED_CHISELED_SAND_STONE_FENCE.get(), BLOOD_CHISELED_SAND_STONE_FENCE.get(), WHITE_CHISELED_SAND_STONE_FENCE.get(), ORANGE_CHISELED_SAND_STONE_FENCE.get(), MAGENTA_CHISELED_SAND_STONE_FENCE.get(), LIGHT_BLUE_CHISELED_SAND_STONE_FENCE.get(), YELLOW_CHISELED_SAND_STONE_FENCE.get(), LIME_CHISELED_SAND_STONE_FENCE.get(), PINK_CHISELED_SAND_STONE_FENCE.get(), GRAY_CHISELED_SAND_STONE_FENCE.get(), LIGHT_GRAY_CHISELED_SAND_STONE_FENCE.get(), CYAN_CHISELED_SAND_STONE_FENCE.get(), PURPLE_CHISELED_SAND_STONE_FENCE.get(), BLUE_CHISELED_SAND_STONE_FENCE.get(), GREEN_CHISELED_SAND_STONE_FENCE.get(), BROWN_CHISELED_SAND_STONE_FENCE.get(), BLACK_CHISELED_SAND_STONE_FENCE.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof concreteFence) {
            return ColorLogic(world, blockPos, state, null, RED_CONCRETE_FENCE.get(), null, WHITE_CONCRETE_FENCE.get(), ORANGE_CONCRETE_FENCE.get(), MAGENTA_CONCRETE_FENCE.get(), LIGHT_BLUE_CONCRETE_FENCE.get(), YELLOW_CONCRETE_FENCE.get(), LIME_CONCRETE_FENCE.get(), PINK_CONCRETE_FENCE.get(), GRAY_CONCRETE_FENCE.get(), LIGHT_GRAY_CONCRETE_FENCE.get(), CYAN_CONCRETE_FENCE.get(), PURPLE_CONCRETE_FENCE.get(), BLUE_CONCRETE_FENCE.get(), GREEN_CONCRETE_FENCE.get(), BROWN_CONCRETE_FENCE.get(), BLACK_CONCRETE_FENCE.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof cutSandStoneFence) {
            return ColorLogic(world, blockPos, state, CUT_SAND_STONE_FENCE.get(), RED_CUT_SAND_STONE_FENCE.get(), BLOOD_CUT_SAND_STONE_FENCE.get(), WHITE_CUT_SAND_STONE_FENCE.get(), ORANGE_CUT_SAND_STONE_FENCE.get(), MAGENTA_CUT_SAND_STONE_FENCE.get(), LIGHT_BLUE_CUT_SAND_STONE_FENCE.get(), YELLOW_CUT_SAND_STONE_FENCE.get(), LIME_CUT_SAND_STONE_FENCE.get(), PINK_CUT_SAND_STONE_FENCE.get(), GRAY_CUT_SAND_STONE_FENCE.get(), LIGHT_GRAY_CUT_SAND_STONE_FENCE.get(), CYAN_CUT_SAND_STONE_FENCE.get(), PURPLE_CUT_SAND_STONE_FENCE.get(), BLUE_CUT_SAND_STONE_FENCE.get(), GREEN_CUT_SAND_STONE_FENCE.get(), BROWN_CUT_SAND_STONE_FENCE.get(), BLACK_CUT_SAND_STONE_FENCE.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof sandFence) {
            return ColorLogic(world, blockPos, state, SAND_FENCE.get(), RED_SAND_FENCE.get(), BLOOD_SAND_FENCE.get(), WHITE_SAND_FENCE.get(), ORANGE_SAND_FENCE.get(), MAGENTA_SAND_FENCE.get(), LIGHT_BLUE_SAND_FENCE.get(), YELLOW_SAND_FENCE.get(), LIME_SAND_FENCE.get(), PINK_SAND_FENCE.get(), GRAY_SAND_FENCE.get(), LIGHT_GRAY_SAND_FENCE.get(), CYAN_SAND_FENCE.get(), PURPLE_SAND_FENCE.get(), BLUE_SAND_FENCE.get(), GREEN_SAND_FENCE.get(), BROWN_SAND_FENCE.get(), BLACK_SAND_FENCE.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof sandStoneFence) {
            return ColorLogic(world, blockPos, state, SAND_STONE_FENCE.get(), RED_SAND_STONE_FENCE.get(), BLOOD_SAND_STONE_FENCE.get(), WHITE_SAND_STONE_FENCE.get(), ORANGE_SAND_STONE_FENCE.get(), MAGENTA_SAND_STONE_FENCE.get(), LIGHT_BLUE_SAND_STONE_FENCE.get(), YELLOW_SAND_STONE_FENCE.get(), LIME_SAND_STONE_FENCE.get(), PINK_SAND_STONE_FENCE.get(), GRAY_SAND_STONE_FENCE.get(), LIGHT_GRAY_SAND_STONE_FENCE.get(), CYAN_SAND_STONE_FENCE.get(), PURPLE_SAND_STONE_FENCE.get(), BLUE_SAND_STONE_FENCE.get(), GREEN_SAND_STONE_FENCE.get(), BROWN_SAND_STONE_FENCE.get(), BLACK_SAND_STONE_FENCE.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof smoothSandStoneFence) {
            return ColorLogic(world, blockPos, state, SMOOTH_SAND_STONE_FENCE.get(), RED_SMOOTH_SAND_STONE_FENCE.get(), BLOOD_SMOOTH_SAND_STONE_FENCE.get(), WHITE_SMOOTH_SAND_STONE_FENCE.get(), ORANGE_SMOOTH_SAND_STONE_FENCE.get(), MAGENTA_SMOOTH_SAND_STONE_FENCE.get(), LIGHT_BLUE_SMOOTH_SAND_STONE_FENCE.get(), YELLOW_SMOOTH_SAND_STONE_FENCE.get(), LIME_SMOOTH_SAND_STONE_FENCE.get(), PINK_SMOOTH_SAND_STONE_FENCE.get(), GRAY_SMOOTH_SAND_STONE_FENCE.get(), LIGHT_GRAY_SMOOTH_SAND_STONE_FENCE.get(), CYAN_SMOOTH_SAND_STONE_FENCE.get(), PURPLE_SMOOTH_SAND_STONE_FENCE.get(), BLUE_SMOOTH_SAND_STONE_FENCE.get(), GREEN_SMOOTH_SAND_STONE_FENCE.get(), BROWN_SMOOTH_SAND_STONE_FENCE.get(), BLACK_SMOOTH_SAND_STONE_FENCE.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof terracottaFence) {
            return ColorLogic(world, blockPos, state, TERRACOTTA_FENCE.get(), RED_TERRACOTTA_FENCE.get(), null, WHITE_TERRACOTTA_FENCE.get(), ORANGE_TERRACOTTA_FENCE.get(), MAGENTA_TERRACOTTA_FENCE.get(), LIGHT_BLUE_TERRACOTTA_FENCE.get(), YELLOW_TERRACOTTA_FENCE.get(), LIME_TERRACOTTA_FENCE.get(), PINK_TERRACOTTA_FENCE.get(), GRAY_TERRACOTTA_FENCE.get(), LIGHT_GRAY_TERRACOTTA_FENCE.get(), CYAN_TERRACOTTA_FENCE.get(), PURPLE_TERRACOTTA_FENCE.get(), BLUE_TERRACOTTA_FENCE.get(), GREEN_TERRACOTTA_FENCE.get(), BROWN_TERRACOTTA_FENCE.get(), BLACK_TERRACOTTA_FENCE.get(), blockIndex, inHand, playerEntity);
        }
        return InteractionResult.FAIL;
    }
    public static InteractionResult fenceGate_select(Level world, BlockPos blockPos, BlockState state, Block block, Player playerEntity, Item inHand) {
        int blockIndex = 7;
        if (block instanceof chiseledSandStoneFenceGate) {
            return ColorLogic(world, blockPos, state, CHISELED_SAND_STONE_FENCE_GATE.get(), RED_CHISELED_SAND_STONE_FENCE_GATE.get(), BLOOD_CHISELED_SAND_STONE_FENCE_GATE.get(), WHITE_CHISELED_SAND_STONE_FENCE_GATE.get(), ORANGE_CHISELED_SAND_STONE_FENCE_GATE.get(), MAGENTA_CHISELED_SAND_STONE_FENCE_GATE.get(), LIGHT_BLUE_CHISELED_SAND_STONE_FENCE_GATE.get(), YELLOW_CHISELED_SAND_STONE_FENCE_GATE.get(), LIME_CHISELED_SAND_STONE_FENCE_GATE.get(), PINK_CHISELED_SAND_STONE_FENCE_GATE.get(), GRAY_CHISELED_SAND_STONE_FENCE_GATE.get(), LIGHT_GRAY_CHISELED_SAND_STONE_FENCE_GATE.get(), CYAN_CHISELED_SAND_STONE_FENCE_GATE.get(), PURPLE_CHISELED_SAND_STONE_FENCE_GATE.get(), BLUE_CHISELED_SAND_STONE_FENCE_GATE.get(), GREEN_CHISELED_SAND_STONE_FENCE_GATE.get(), BROWN_CHISELED_SAND_STONE_FENCE_GATE.get(), BLACK_CHISELED_SAND_STONE_FENCE_GATE.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof concreteFenceGate) {
            return ColorLogic(world, blockPos, state, null, RED_CONCRETE_FENCE_GATE.get(), null, WHITE_CONCRETE_FENCE_GATE.get(), ORANGE_CONCRETE_FENCE_GATE.get(), MAGENTA_CONCRETE_FENCE_GATE.get(), LIGHT_BLUE_CONCRETE_FENCE_GATE.get(), YELLOW_CONCRETE_FENCE_GATE.get(), LIME_CONCRETE_FENCE_GATE.get(), PINK_CONCRETE_FENCE_GATE.get(), GRAY_CONCRETE_FENCE_GATE.get(), LIGHT_GRAY_CONCRETE_FENCE_GATE.get(), CYAN_CONCRETE_FENCE_GATE.get(), PURPLE_CONCRETE_FENCE_GATE.get(), BLUE_CONCRETE_FENCE_GATE.get(), GREEN_CONCRETE_FENCE_GATE.get(), BROWN_CONCRETE_FENCE_GATE.get(), BLACK_CONCRETE_FENCE_GATE.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof cutSandStoneFenceGate) {
            return ColorLogic(world, blockPos, state, CUT_SAND_STONE_FENCE_GATE.get(), RED_CUT_SAND_STONE_FENCE_GATE.get(), BLOOD_CUT_SAND_STONE_FENCE_GATE.get(), WHITE_CUT_SAND_STONE_FENCE_GATE.get(), ORANGE_CUT_SAND_STONE_FENCE_GATE.get(), MAGENTA_CUT_SAND_STONE_FENCE_GATE.get(), LIGHT_BLUE_CUT_SAND_STONE_FENCE_GATE.get(), YELLOW_CUT_SAND_STONE_FENCE_GATE.get(), LIME_CUT_SAND_STONE_FENCE_GATE.get(), PINK_CUT_SAND_STONE_FENCE_GATE.get(), GRAY_CUT_SAND_STONE_FENCE_GATE.get(), LIGHT_GRAY_CUT_SAND_STONE_FENCE_GATE.get(), CYAN_CUT_SAND_STONE_FENCE_GATE.get(), PURPLE_CUT_SAND_STONE_FENCE_GATE.get(), BLUE_CUT_SAND_STONE_FENCE_GATE.get(), GREEN_CUT_SAND_STONE_FENCE_GATE.get(), BROWN_CUT_SAND_STONE_FENCE_GATE.get(), BLACK_CUT_SAND_STONE_FENCE_GATE.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof sandFenceGate) {
            return ColorLogic(world, blockPos, state, SAND_FENCE_GATE.get(), RED_SAND_FENCE_GATE.get(), BLOOD_SAND_FENCE_GATE.get(), WHITE_SAND_FENCE_GATE.get(), ORANGE_SAND_FENCE_GATE.get(), MAGENTA_SAND_FENCE_GATE.get(), LIGHT_BLUE_SAND_FENCE_GATE.get(), YELLOW_SAND_FENCE_GATE.get(), LIME_SAND_FENCE_GATE.get(), PINK_SAND_FENCE_GATE.get(), GRAY_SAND_FENCE_GATE.get(), LIGHT_GRAY_SAND_FENCE_GATE.get(), CYAN_SAND_FENCE_GATE.get(), PURPLE_SAND_FENCE_GATE.get(), BLUE_SAND_FENCE_GATE.get(), GREEN_SAND_FENCE_GATE.get(), BROWN_SAND_FENCE_GATE.get(), BLACK_SAND_FENCE_GATE.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof sandStoneFenceGate) {
            return ColorLogic(world, blockPos, state, SAND_STONE_FENCE_GATE.get(), RED_SAND_STONE_FENCE_GATE.get(), BLOOD_SAND_STONE_FENCE_GATE.get(), WHITE_SAND_STONE_FENCE_GATE.get(), ORANGE_SAND_STONE_FENCE_GATE.get(), MAGENTA_SAND_STONE_FENCE_GATE.get(), LIGHT_BLUE_SAND_STONE_FENCE_GATE.get(), YELLOW_SAND_STONE_FENCE_GATE.get(), LIME_SAND_STONE_FENCE_GATE.get(), PINK_SAND_STONE_FENCE_GATE.get(), GRAY_SAND_STONE_FENCE_GATE.get(), LIGHT_GRAY_SAND_STONE_FENCE_GATE.get(), CYAN_SAND_STONE_FENCE_GATE.get(), PURPLE_SAND_STONE_FENCE_GATE.get(), BLUE_SAND_STONE_FENCE_GATE.get(), GREEN_SAND_STONE_FENCE_GATE.get(), BROWN_SAND_STONE_FENCE_GATE.get(), BLACK_SAND_STONE_FENCE_GATE.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof smoothSandStoneFenceGate) {
            return ColorLogic(world, blockPos, state, SMOOTH_SAND_STONE_FENCE_GATE.get(), RED_SMOOTH_SAND_STONE_FENCE_GATE.get(), BLOOD_SMOOTH_SAND_STONE_FENCE_GATE.get(), WHITE_SMOOTH_SAND_STONE_FENCE_GATE.get(), ORANGE_SMOOTH_SAND_STONE_FENCE_GATE.get(), MAGENTA_SMOOTH_SAND_STONE_FENCE_GATE.get(), LIGHT_BLUE_SMOOTH_SAND_STONE_FENCE_GATE.get(), YELLOW_SMOOTH_SAND_STONE_FENCE_GATE.get(), LIME_SMOOTH_SAND_STONE_FENCE_GATE.get(), PINK_SMOOTH_SAND_STONE_FENCE_GATE.get(), GRAY_SMOOTH_SAND_STONE_FENCE_GATE.get(), LIGHT_GRAY_SMOOTH_SAND_STONE_FENCE_GATE.get(), CYAN_SMOOTH_SAND_STONE_FENCE_GATE.get(), PURPLE_SMOOTH_SAND_STONE_FENCE_GATE.get(), BLUE_SMOOTH_SAND_STONE_FENCE_GATE.get(), GREEN_SMOOTH_SAND_STONE_FENCE_GATE.get(), BROWN_SMOOTH_SAND_STONE_FENCE_GATE.get(), BLACK_SMOOTH_SAND_STONE_FENCE_GATE.get(), blockIndex, inHand, playerEntity);
        }
        if (block instanceof terracottaFenceGate) {
            return ColorLogic(world, blockPos, state, TERRACOTTA_FENCE_GATE.get(), RED_TERRACOTTA_FENCE_GATE.get(), null, WHITE_TERRACOTTA_FENCE_GATE.get(), ORANGE_TERRACOTTA_FENCE_GATE.get(), MAGENTA_TERRACOTTA_FENCE_GATE.get(), LIGHT_BLUE_TERRACOTTA_FENCE_GATE.get(), YELLOW_TERRACOTTA_FENCE_GATE.get(), LIME_TERRACOTTA_FENCE_GATE.get(), PINK_TERRACOTTA_FENCE_GATE.get(), GRAY_TERRACOTTA_FENCE_GATE.get(), LIGHT_GRAY_TERRACOTTA_FENCE_GATE.get(), CYAN_TERRACOTTA_FENCE_GATE.get(), PURPLE_TERRACOTTA_FENCE_GATE.get(), BLUE_TERRACOTTA_FENCE_GATE.get(), GREEN_TERRACOTTA_FENCE_GATE.get(), BROWN_TERRACOTTA_FENCE_GATE.get(), BLACK_TERRACOTTA_FENCE_GATE.get(), blockIndex, inHand, playerEntity);
        }
        return InteractionResult.FAIL;
    }
}