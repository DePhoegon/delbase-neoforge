package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.block.colorShift.grav.solidSandBlock;
import com.dephoegon.delbase.aid.block.modExtensions.energySlab;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static com.dephoegon.delbase.block.slab.slabMisc.GLOWSTONE_SLAB;
import static com.dephoegon.delbase.block.stair.stairMisc.GLOWSTONE_STAIR;
import static com.dephoegon.delbase.block.wall.wallMisc.GLOWSTONE_WALL;
import static net.minecraft.world.level.block.Blocks.*;

public class blockArrayList {
    private static ArrayList<Object> terracotta_list = new ArrayList<>();
    private static ArrayList<Object> concrete_list = new ArrayList<>();
    private static ArrayList<Object> slab_list = new ArrayList<>();
    private static ArrayList<Object> stair_list = new ArrayList<>();
    private static ArrayList<Object> general_list = new ArrayList<>();
    private static ArrayList<Object> gravity_list = new ArrayList<>();
    private static ArrayList<Object> wall_list = new ArrayList<>();
    private static ArrayList<Object> vanilla_wood_list = new ArrayList<>();
    private static ArrayList<Object> axis_list = new ArrayList<>();
    private static ArrayList<Object> fall_hold = new ArrayList<>();
    private static ArrayList<Object> concretePowder_list = new ArrayList<>();
    private static ArrayList<Object> sand_list = new ArrayList<>();

    // Blocks for holding up falling blocks, outside custom classes
    private static void setFall_hold() {
        ArrayList<Object> fall_set = new ArrayList<>();
        fall_set.add(REDSTONE_ORE.defaultBlockState());
        fall_set.add(REDSTONE_BLOCK.defaultBlockState());
        fall_set.add(REDSTONE_LAMP.defaultBlockState());
        fall_set.add(GLOWSTONE.defaultBlockState());
        fall_hold = fall_set;
    }
    private static ArrayList<Object> getFall_hold() { return fall_hold; }
    public static boolean checkFallLock(@NotNull Block block) { return
            block.defaultBlockState() == GLOWSTONE_SLAB.get().defaultBlockState() ||
                    block.defaultBlockState() == GLOWSTONE_STAIR.get().defaultBlockState() ||
                    block.defaultBlockState() == GLOWSTONE_WALL.get().defaultBlockState() ||
                    block instanceof energySlab ||
                    block instanceof solidSandBlock ||
                    getFall_hold().contains(block.defaultBlockState());
    }

    // Color swapping matching list
    private static void setTerracotta_list() {
        ArrayList<Object> terracotta_set = new ArrayList<>();
        terracotta_set.add(WHITE_TERRACOTTA.defaultBlockState());
        terracotta_set.add(TERRACOTTA.defaultBlockState());
        terracotta_set.add(RED_TERRACOTTA.defaultBlockState());
        terracotta_set.add(ORANGE_TERRACOTTA.defaultBlockState());
        terracotta_set.add(MAGENTA_TERRACOTTA.defaultBlockState());
        terracotta_set.add(LIGHT_BLUE_TERRACOTTA.defaultBlockState());
        terracotta_set.add(YELLOW_TERRACOTTA.defaultBlockState());
        terracotta_set.add(LIME_TERRACOTTA.defaultBlockState());
        terracotta_set.add(PINK_TERRACOTTA.defaultBlockState());
        terracotta_set.add(GRAY_TERRACOTTA.defaultBlockState());
        terracotta_set.add(LIGHT_GRAY_TERRACOTTA.defaultBlockState());
        terracotta_set.add(CYAN_TERRACOTTA.defaultBlockState());
        terracotta_set.add(PURPLE_TERRACOTTA.defaultBlockState());
        terracotta_set.add(BLUE_TERRACOTTA.defaultBlockState());
        terracotta_set.add(GREEN_TERRACOTTA.defaultBlockState());
        terracotta_set.add(BROWN_TERRACOTTA.defaultBlockState());
        terracotta_set.add(BLACK_TERRACOTTA.defaultBlockState());
        terracotta_list = terracotta_set;
    }
    public static ArrayList<Object> getTerracotta_list() { return terracotta_list; }

    private static void setConcretePowder_list(){
        ArrayList<Object> concretePowder_set = new ArrayList<>();
        concretePowder_set.add(RED_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(WHITE_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(ORANGE_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(MAGENTA_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(LIGHT_BLUE_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(YELLOW_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(LIME_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(PINK_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(GRAY_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(LIGHT_GRAY_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(CYAN_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(PURPLE_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(BLUE_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(GREEN_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(BROWN_CONCRETE_POWDER.defaultBlockState());
        concretePowder_set.add(BLACK_CONCRETE_POWDER.defaultBlockState());
        concretePowder_list = concretePowder_set;
    }
    public static ArrayList<Object> getConcretePowder_list() { return concretePowder_list; }
    private static void setConcrete_list() {
        ArrayList<Object> concrete_set = new ArrayList<>();
        concrete_set.add(RED_CONCRETE.defaultBlockState());
        concrete_set.add(WHITE_CONCRETE.defaultBlockState());
        concrete_set.add(ORANGE_CONCRETE.defaultBlockState());
        concrete_set.add(MAGENTA_CONCRETE.defaultBlockState());
        concrete_set.add(LIGHT_BLUE_CONCRETE.defaultBlockState());
        concrete_set.add(YELLOW_CONCRETE.defaultBlockState());
        concrete_set.add(LIME_CONCRETE.defaultBlockState());
        concrete_set.add(PINK_CONCRETE.defaultBlockState());
        concrete_set.add(GRAY_CONCRETE.defaultBlockState());
        concrete_set.add(LIGHT_GRAY_CONCRETE.defaultBlockState());
        concrete_set.add(CYAN_CONCRETE.defaultBlockState());
        concrete_set.add(PURPLE_CONCRETE.defaultBlockState());
        concrete_set.add(BLUE_CONCRETE.defaultBlockState());
        concrete_set.add(GREEN_CONCRETE.defaultBlockState());
        concrete_set.add(BROWN_CONCRETE.defaultBlockState());
        concrete_set.add(BLACK_CONCRETE.defaultBlockState());
        concrete_list = concrete_set;
    }
    public static ArrayList<Object> getConcrete_list() { return concrete_list; }

    private static void setSlab_list() {
        ArrayList<Object> slab_set = new ArrayList<>();
        slab_set.add(CUT_SANDSTONE_SLAB.defaultBlockState());
        slab_set.add(CUT_RED_SANDSTONE_SLAB.defaultBlockState());
        slab_set.add(SMOOTH_SANDSTONE_SLAB.defaultBlockState());
        slab_set.add(SMOOTH_RED_SANDSTONE_SLAB.defaultBlockState());
        slab_set.add(SANDSTONE_SLAB.defaultBlockState());
        slab_set.add(RED_SANDSTONE_SLAB.defaultBlockState());
        slab_list = slab_set;
    }
    public static ArrayList<Object> getSlab_list() { return slab_list; }

    private static void setStair_list() {
        ArrayList<Object> stair_set = new ArrayList<>();
        stair_set.add(SANDSTONE_STAIRS.defaultBlockState());
        stair_set.add(RED_SANDSTONE_STAIRS.defaultBlockState());
        stair_set.add(SMOOTH_SANDSTONE_STAIRS.defaultBlockState());
        stair_set.add(SMOOTH_RED_SANDSTONE_STAIRS.defaultBlockState());
        stair_list = stair_set;
    }
    public static ArrayList<Object> getStair_list() { return stair_list; }

    private static void setAxis_list() {
        ArrayList<Object> axis_set = new ArrayList<>();
        axis_set.add(CUT_RED_SANDSTONE.defaultBlockState());
        axis_set.add(CUT_SANDSTONE.defaultBlockState());
        axis_list = axis_set;
    }
    public static ArrayList<Object> getAxis_list() { return axis_list; }

    private static void setGeneral_list() {
        setTerracotta_list();
        setConcrete_list();
        ArrayList<Object> general_set = new ArrayList<>();
        general_set.addAll(terracotta_list);
        general_set.addAll(concrete_list);
        general_set.add(CHISELED_SANDSTONE.defaultBlockState());
        general_set.add(CHISELED_RED_SANDSTONE.defaultBlockState());
        general_set.add(SANDSTONE.defaultBlockState());
        general_set.add(RED_SANDSTONE.defaultBlockState());
        general_set.add(SMOOTH_RED_SANDSTONE.defaultBlockState());
        general_set.add(SMOOTH_SANDSTONE.defaultBlockState());
        general_list = general_set;
    }
    public static ArrayList<Object> getGeneral_list() { return general_list; }

    private static void setGravity_list() {
        setSand_list();
        setConcretePowder_list();
        ArrayList<Object> gravity_set = new ArrayList<>();
        gravity_set.addAll(sand_list);
        gravity_set.addAll(concretePowder_list);
        gravity_list = gravity_set;
    }
    public static ArrayList<Object> getGravity_list() { return gravity_list; }

    private static void setSand_list() {
        ArrayList<Object> sand_set = new ArrayList<>();
        sand_set.add(SAND.defaultBlockState());
        sand_set.add(RED_SAND.defaultBlockState());
        sand_list = sand_set;
    }
    public static ArrayList<Object> getSand_list() { return sand_list; }
    public static ArrayList<Object> getVanilla_wood_list() { return vanilla_wood_list; }
    private static void setVanillaWoodList() {
        ArrayList<Object> setWood_list = new ArrayList<>();
        setWood_list.add(STRIPPED_MANGROVE_WOOD.defaultBlockState());
        setWood_list.add(MANGROVE_WOOD.defaultBlockState());
        setWood_list.add(STRIPPED_DARK_OAK_WOOD.defaultBlockState());
        setWood_list.add(DARK_OAK_WOOD.defaultBlockState());
        setWood_list.add(STRIPPED_CHERRY_WOOD.defaultBlockState());
        setWood_list.add(CHERRY_WOOD.defaultBlockState());
        setWood_list.add(STRIPPED_ACACIA_WOOD.defaultBlockState());
        setWood_list.add(ACACIA_WOOD.defaultBlockState());
        setWood_list.add(STRIPPED_JUNGLE_WOOD.defaultBlockState());
        setWood_list.add(JUNGLE_WOOD.defaultBlockState());
        setWood_list.add(STRIPPED_BIRCH_WOOD.defaultBlockState());
        setWood_list.add(BIRCH_WOOD.defaultBlockState());
        setWood_list.add(STRIPPED_SPRUCE_WOOD.defaultBlockState());
        setWood_list.add(SPRUCE_WOOD.defaultBlockState());
        setWood_list.add(STRIPPED_OAK_WOOD.defaultBlockState());
        setWood_list.add(OAK_WOOD.defaultBlockState());
        vanilla_wood_list = setWood_list;
    }
    private static void setWall_list() {
        ArrayList<Object> wall_set = new ArrayList<>();
        wall_set.add(SANDSTONE_WALL.defaultBlockState());
        wall_set.add(RED_SANDSTONE_WALL.defaultBlockState());
        wall_list = wall_set;
    }
    public static ArrayList<Object> getWall_list() { return wall_list; }

    // call methods to set private lists, called first in a register list to avoid any issue
    public static void setBlockArrays() {
        setFall_hold();
        setGeneral_list();
        setSlab_list();
        setStair_list();
        setGravity_list();
        setVanillaWoodList();
        setWall_list();
        setAxis_list();
    }
}