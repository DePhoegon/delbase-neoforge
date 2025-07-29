package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.event.blockReplacer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.util.dyeList.*;
import static com.dephoegon.delbase.aid.util.dyeList.black;
import static com.dephoegon.delbase.item.shiftingDyes.*;

public class colorMixInteraction {
    @SuppressWarnings("DataFlowIssue")
    public static InteractionResult ColorLogic(Level world, BlockPos blockPos, BlockState TargetBlock, BlockState BaseDefaultBlock, BlockState RedBaseDefaultBlock, BlockState DarkRedDefaultBlock, BlockState WhiteDefaultBlock, BlockState OrangeDefaultBlock, BlockState MagentaDefaultBlock, BlockState LightBlueDefaultBlock, BlockState YellowDefaultBlock, BlockState LimeDefaultBlock, BlockState PinkDefaultBlock, BlockState GrayDefaultBlock, BlockState LightGrayDefaultBlock, BlockState CyanDefaultBlock, BlockState PurpleDefaultBlock, BlockState BlueDefaultBlock, BlockState GreenDefaultBlock, BlockState BrownDefaultBlock, BlockState BlackDefaultBlock, int DefaultBlockIndex, @NotNull Item inHand, Player playerEntity) {
        ItemStack pHand = playerEntity.getMainHandItem();
        if (TargetBlock == null || inHand != pHand.getItem()) { return InteractionResult.FAIL; }
        BlockState place_me = null;
        boolean place = false;
        boolean lock_cut = false;
        ItemStack returnItem = null; 

        if (inHand.equals(cleanse.getItem()) && BaseDefaultBlock != null) {
            if (TargetBlock != BaseDefaultBlock) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock) { returnItem = new ItemStack(RED_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == DarkRedDefaultBlock) { returnItem = new ItemStack(BLOOD_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == WhiteDefaultBlock) { returnItem = new ItemStack(WHITE_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == OrangeDefaultBlock) { returnItem = new ItemStack(ORANGE_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == MagentaDefaultBlock) { returnItem = new ItemStack(MAGENTA_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == LightBlueDefaultBlock) { returnItem = new ItemStack(LIGHT_BLUE_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == YellowDefaultBlock) { returnItem = new ItemStack(YELLOW_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == LimeDefaultBlock) { returnItem = new ItemStack(LIME_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == PinkDefaultBlock) { returnItem = new ItemStack(PINK_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == GrayDefaultBlock) { returnItem = new ItemStack(GRAY_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == LightGrayDefaultBlock) { returnItem = new ItemStack(LIGHT_GRAY_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == CyanDefaultBlock) { returnItem = new ItemStack(CYAN_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == PurpleDefaultBlock) { returnItem = new ItemStack(PURPLE_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == BlueDefaultBlock) { returnItem = new ItemStack(BLUE_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == GreenDefaultBlock) { returnItem = new ItemStack(GREEN_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == BrownDefaultBlock) { returnItem = new ItemStack(BROWN_SHIFT_DYE.get().asItem()); }
            if (TargetBlock == BlackDefaultBlock) { returnItem = new ItemStack(BLACK_SHIFT_DYE.get().asItem()); }
            if (place) {
                place_me = BaseDefaultBlock;
                lock_cut = true;
            }
        }
        if (inHand.equals(red.getItem())) {
            if (RedBaseDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && DarkRedDefaultBlock != null) {
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
                place_me = DarkRedDefaultBlock;
                lock_cut = true;
                place = true;
            }
            if (TargetBlock == YellowDefaultBlock && OrangeDefaultBlock != null) {
                place_me = OrangeDefaultBlock;
                returnItem = new ItemStack(ORANGE_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == BlueDefaultBlock && PurpleDefaultBlock != null) {
                place_me = PurpleDefaultBlock;
                returnItem = new ItemStack(PURPLE_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == WhiteDefaultBlock && PinkDefaultBlock != null) {
                place_me = PinkDefaultBlock;
                returnItem = new ItemStack(PINK_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == DarkRedDefaultBlock && RedBaseDefaultBlock != null) {
                place_me = RedBaseDefaultBlock;
                returnItem = new ItemStack(RED_SHIFT_DYE.get().asItem());
                place = true;
                lock_cut = true;
            }
            if (place && place_me == null) {
                place_me = RedBaseDefaultBlock;
                lock_cut = true;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(blood.getItem())) {
            if (TargetBlock != DarkRedDefaultBlock && DarkRedDefaultBlock != null) { place = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == RedBaseDefaultBlock && DarkRedDefaultBlock != null) {
                lock_cut = true;
                returnItem = new ItemStack(RED_SHIFT_DYE.get().asItem());
                place_me = DarkRedDefaultBlock;
                place = true;
            }
            if (TargetBlock == YellowDefaultBlock && OrangeDefaultBlock != null) {
                place_me = OrangeDefaultBlock;
                returnItem = new ItemStack(RED_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == BlueDefaultBlock && PurpleDefaultBlock != null) {
                place_me = PurpleDefaultBlock;
                returnItem = new ItemStack(RED_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == WhiteDefaultBlock && PinkDefaultBlock != null) {
                place_me = PinkDefaultBlock;
                returnItem = new ItemStack(RED_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (place_me == null && place) {
                place_me = DarkRedDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(white.getItem())) {
            if (TargetBlock != WhiteDefaultBlock && WhiteDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && PinkDefaultBlock != null) {
                lock_cut = true;
                place_me = PinkDefaultBlock;
                returnItem = new ItemStack(PINK_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == DarkRedDefaultBlock && PinkDefaultBlock != null) {
                place_me = PinkDefaultBlock;
                returnItem = new ItemStack(PINK_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == GreenDefaultBlock && LimeDefaultBlock != null) {
                place_me = LimeDefaultBlock;
                returnItem = new ItemStack(LIME_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == BlueDefaultBlock && LightBlueDefaultBlock != null) {
                place_me = LightBlueDefaultBlock;
                returnItem = new ItemStack(LIGHT_BLUE_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == BlackDefaultBlock && GrayDefaultBlock != null) {
                place_me = GrayDefaultBlock;
                returnItem = new ItemStack(GRAY_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == GrayDefaultBlock && LightGrayDefaultBlock != null) {
                place_me = LightGrayDefaultBlock;
                returnItem = new ItemStack(LIGHT_GRAY_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (place && place_me == null) {
                place_me = WhiteDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(orange.getItem())) {
            if (TargetBlock != OrangeDefaultBlock && OrangeDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (place) {
                place_me = OrangeDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(magenta.getItem())) {
            if (TargetBlock != MagentaDefaultBlock && MagentaDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (place) {
                place_me = MagentaDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(light_blue.getItem())) {
            if (TargetBlock != LightBlueDefaultBlock && LightBlueDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (place) {
                place_me = LightBlueDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(yellow.getItem())) {
            if (TargetBlock != YellowDefaultBlock && YellowDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && OrangeDefaultBlock != null) {
                lock_cut = true;
                place_me = OrangeDefaultBlock;
                returnItem = new ItemStack(ORANGE_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == DarkRedDefaultBlock && OrangeDefaultBlock != null) {
                place_me = OrangeDefaultBlock;
                returnItem = new ItemStack(RED_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (place && place_me == null) {
                place_me = YellowDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(lime.getItem())) {
            if (TargetBlock != LimeDefaultBlock && LimeDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (place) {
                place_me = LimeDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(pink.getItem())) {
            if (TargetBlock != PinkDefaultBlock && PinkDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == PurpleDefaultBlock && MagentaDefaultBlock != null) {
                place_me = MagentaDefaultBlock;
                returnItem = new ItemStack(MAGENTA_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == BlackDefaultBlock && RedBaseDefaultBlock != null) {
                place_me = RedBaseDefaultBlock;
                lock_cut = true;
                returnItem = new ItemStack(RED_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (place && place_me == null) {
                place_me = PinkDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(gray.getItem())) {
            if (TargetBlock != GrayDefaultBlock && GrayDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == WhiteDefaultBlock && LightGrayDefaultBlock != null) {
                place_me = LightGrayDefaultBlock;
                returnItem = new ItemStack(LIGHT_GRAY_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (place && place_me == null) {
                place_me = GrayDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(light_gray.getItem())) {
            if (TargetBlock != LightGrayDefaultBlock && LightGrayDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BlackDefaultBlock && GrayDefaultBlock != null) {
                place_me = GrayDefaultBlock;
                returnItem = new ItemStack(GRAY_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (place && place_me == null) {
                place_me = LightGrayDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(cyan.getItem())) {
            if (TargetBlock != CyanDefaultBlock && CyanDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (place) {
                place_me = CyanDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(purple.getItem())) {
            if (TargetBlock != PurpleDefaultBlock && PurpleDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == PinkDefaultBlock && MagentaDefaultBlock != null) {
                place_me = MagentaDefaultBlock;
                returnItem = new ItemStack(MAGENTA_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (place && place_me == null) {
                place_me = PurpleDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(blue.getItem())) {
            if (TargetBlock != BlueDefaultBlock && BlueDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && PurpleDefaultBlock != null) {
                lock_cut = true;
                place_me = PurpleDefaultBlock;
                returnItem = new ItemStack(PURPLE_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == GreenDefaultBlock && CyanDefaultBlock != null) {
                place_me = CyanDefaultBlock;
                returnItem = new ItemStack(CYAN_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == WhiteDefaultBlock && LightBlueDefaultBlock != null) {
                place_me = LightBlueDefaultBlock;
                returnItem = new ItemStack(LIGHT_BLUE_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (place && place_me == null) {
                place_me = BlueDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }

        }
        if (inHand.equals(green.getItem())) {
            if (TargetBlock != GrayDefaultBlock && GrayDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == WhiteDefaultBlock && LimeDefaultBlock != null) {
                place_me = LimeDefaultBlock;
                returnItem = new ItemStack(LIME_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == BlueDefaultBlock && PurpleDefaultBlock != null) {
                place_me = PurpleDefaultBlock;
                returnItem = new ItemStack(PURPLE_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (place && place_me == null) {
                place_me = GreenDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(brown.getItem())) {
            if (TargetBlock != BrownDefaultBlock && BrownDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (place) {
                place_me = BrownDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (inHand.equals(black.getItem())) {
            if (TargetBlock != BlackDefaultBlock && BlackDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == LightGrayDefaultBlock && GrayDefaultBlock != null) {
                place_me = GrayDefaultBlock;
                returnItem = new ItemStack(GRAY_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == LightBlueDefaultBlock && BlueDefaultBlock != null) {
                place_me = BlueDefaultBlock;
                returnItem = new ItemStack(BLUE_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == LimeDefaultBlock && GreenDefaultBlock != null) {
                place_me = GreenDefaultBlock;
                returnItem = new ItemStack(GREEN_SHIFT_DYE.get().asItem());
                place = true;
            }
            if (TargetBlock == PinkDefaultBlock && RedBaseDefaultBlock != null) {
                place_me = RedBaseDefaultBlock;
                returnItem = new ItemStack(RED_SHIFT_DYE.get().asItem());
                lock_cut = true;
                place = true;
            }
            if (place && place_me == null) {
                place_me = BlackDefaultBlock;
                returnItem = new ItemStack(CLEANSE_SHIFT_DYE.get().asItem());
            }
        }
        if (place && place_me != null) {
            switch (DefaultBlockIndex) {
                case 1 ->
                    //walls
                        blockReplacer.wallPlacement(world, blockPos, place_me);
                case 2 ->
                    //Stairs
                        blockReplacer.stairPlacement(world, blockPos, place_me);
                case 3 ->
                    //Slabs
                        blockReplacer.slabPlacement(world, blockPos, place_me);
                case 4 ->
                    //Axis, lock_cut used to mix 'non-axis' default blocks with axis blocks in the set (cut_sandstone // cut_red_sandstone) as example
                    //Is triggered only one base block and red block, (dumb method) possible to rework stack to allow cutLocking on any... but no reason to atm
                        blockReplacer.axisPlacement(world, blockPos, place_me, lock_cut);
                case 5 ->
                    //DefaultBocks with no special placements
                    //AxisPlacement set to do default states on which suits default blocks
                        blockReplacer.axisPlacement(world, blockPos, place_me, true);
                case 6 ->
                    //Fence Blocks
                        blockReplacer.fencePlacement(world, blockPos, place_me);
                case 7 ->
                    //Fence Gate Blocks
                        blockReplacer.fenceGatePlacement(world, blockPos, place_me);
                default -> {
                    //catch all, return fail
                    return InteractionResult.FAIL;
                }
            }
            playerEntity.getMainHandItem().setCount(pHand.getCount()-1);
            if (returnItem != null) { playerEntity.addItem(returnItem); }
            return InteractionResult.SUCCESS;

        } else return InteractionResult.FAIL;
    }
}