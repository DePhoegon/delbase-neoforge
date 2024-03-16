package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.event.blockReplacer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.util.dyeList.*;
import static com.dephoegon.delbase.item.shiftingDyes.*;


public class colorMixInteraction {
    @SuppressWarnings("DataFlowIssue")
    public static InteractionResult ColorLogic(Level world, BlockPos blockPos, BlockState TargetBlock, Block baseBlock, Block redBlock, Block darkRedBlock, Block whiteBlock, Block orangeBlock, Block magentaBLock, Block lightBlueBlock, Block yellowBlock, Block limeBlock, Block pinkBlock, Block grayBlock, Block lightGrayBlock, Block cyanBlock, Block purpleBlock, Block blueBlock, Block greenBlock, Block brownBlock, Block blackBlock, int blockIndex, @NotNull Item inHand, Player playerEntity) {
        Block place_me = null;
        boolean place = false;
        boolean lock_cut = false;

        if (inHand.equals(cleanse.getItem()) && baseBlock != null) {
                if (TargetBlock != baseBlock.defaultBlockState() && baseBlock != null) {
                    place = true;
                }
                if (TargetBlock == redBlock.defaultBlockState() && redBlock != null) {
                    playerEntity.addItem(new ItemStack(RED_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == darkRedBlock.defaultBlockState() && darkRedBlock != null) {
                    playerEntity.addItem(new ItemStack(BLOOD_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == whiteBlock.defaultBlockState() && whiteBlock != null) {
                    playerEntity.addItem(new ItemStack(WHITE_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == orangeBlock.defaultBlockState() && orangeBlock != null) {
                    playerEntity.addItem(new ItemStack(ORANGE_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == magentaBLock.defaultBlockState() && magentaBLock != null) {
                    playerEntity.addItem(new ItemStack(MAGENTA_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == lightBlueBlock.defaultBlockState() && lightBlueBlock != null) {
                    playerEntity.addItem(new ItemStack(LIGHT_BLUE_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == yellowBlock.defaultBlockState() && yellowBlock != null) {
                    playerEntity.addItem(new ItemStack(YELLOW_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == limeBlock.defaultBlockState() && limeBlock != null) {
                    playerEntity.addItem(new ItemStack(LIME_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == pinkBlock.defaultBlockState() && pinkBlock != null) {
                    playerEntity.addItem(new ItemStack(PINK_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == grayBlock.defaultBlockState() && grayBlock != null) {
                    playerEntity.addItem(new ItemStack(GRAY_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == lightGrayBlock.defaultBlockState() && lightGrayBlock != null) {
                    playerEntity.addItem(new ItemStack(LIGHT_GRAY_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == cyanBlock.defaultBlockState() && cyanBlock != null) {
                    playerEntity.addItem(new ItemStack(CYAN_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == purpleBlock.defaultBlockState() && purpleBlock != null) {
                    playerEntity.addItem(new ItemStack(PURPLE_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == blueBlock.defaultBlockState() && blueBlock != null) {
                    playerEntity.addItem(new ItemStack(BLUE_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == greenBlock.defaultBlockState() && greenBlock != null) {
                    playerEntity.addItem(new ItemStack(GREEN_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == brownBlock.defaultBlockState() && brownBlock != null) {
                    playerEntity.addItem(new ItemStack(BROWN_SHIFT_DYE.get().asItem()));
                }
                if (TargetBlock == blackBlock.defaultBlockState() && blackBlock != null) {
                    playerEntity.addItem(new ItemStack(BLACK_SHIFT_DYE.get().asItem()));
                }
                if (place) {
                    place_me = baseBlock;
                    lock_cut = true;
                }
        }
        if (inHand.equals(red.getItem())) {
            if (redBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && darkRedBlock != null) {
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
                place_me = darkRedBlock;
                lock_cut = true;
                place = true;
            }
            if (TargetBlock == yellowBlock.defaultBlockState() && orangeBlock != null) {
                place_me = orangeBlock;
                playerEntity.addItem(new ItemStack(ORANGE_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == blueBlock.defaultBlockState() && purpleBlock != null) {
                place_me = purpleBlock;
                playerEntity.addItem(new ItemStack(PURPLE_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == whiteBlock.defaultBlockState() && pinkBlock != null) {
                place_me = pinkBlock;
                playerEntity.addItem(new ItemStack(PINK_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == darkRedBlock.defaultBlockState() && redBlock != null) {
                place_me = redBlock;
                playerEntity.addItem(new ItemStack(RED_SHIFT_DYE.get().asItem()));
                place = true;
                lock_cut = true;
            }
            if (place && place_me == null) {
                place_me = redBlock;
                lock_cut = true;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(blood.getItem())) {
            if (TargetBlock != darkRedBlock.defaultBlockState() && darkRedBlock != null) { place = true; }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == redBlock.defaultBlockState() && darkRedBlock != null) {
                lock_cut = true;
                playerEntity.addItem(new ItemStack(RED_SHIFT_DYE.get().asItem()));
                place_me = darkRedBlock;
                place = true;
            }
            if (TargetBlock == yellowBlock.defaultBlockState() && orangeBlock != null) {
                place_me = orangeBlock;
                playerEntity.addItem(new ItemStack(RED_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == blueBlock.defaultBlockState() && purpleBlock != null) {
                place_me = purpleBlock;
                playerEntity.addItem(new ItemStack(RED_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == whiteBlock.defaultBlockState() && pinkBlock != null) {
                place_me = pinkBlock;
                playerEntity.addItem(new ItemStack(RED_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (place_me == null && place) {
                place_me = darkRedBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(white.getItem())) {
            if (TargetBlock != whiteBlock.defaultBlockState() && whiteBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && pinkBlock != null) {
                lock_cut = true;
                place_me = pinkBlock;
                playerEntity.addItem(new ItemStack(PINK_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == darkRedBlock.defaultBlockState() && pinkBlock != null) {
                place_me = pinkBlock;
                playerEntity.addItem(new ItemStack(PINK_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == greenBlock.defaultBlockState() && limeBlock != null) {
                place_me = limeBlock;
                playerEntity.addItem(new ItemStack(LIME_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == blueBlock.defaultBlockState() && lightBlueBlock != null) {
                place_me = lightBlueBlock;
                playerEntity.addItem(new ItemStack(LIGHT_BLUE_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == blackBlock.defaultBlockState() && grayBlock != null) {
                place_me = grayBlock;
                playerEntity.addItem(new ItemStack(GRAY_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == grayBlock.defaultBlockState() && lightGrayBlock != null) {
                place_me = lightGrayBlock;
                playerEntity.addItem(new ItemStack(LIGHT_GRAY_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = whiteBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(orange.getItem())) {
            if (TargetBlock != orangeBlock.defaultBlockState() && orangeBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (place) {
                place_me = orangeBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(magenta.getItem())) {
            if (TargetBlock != magentaBLock.defaultBlockState() && magentaBLock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (place) {
                place_me = magentaBLock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(light_blue.getItem())) {
            if (TargetBlock != lightBlueBlock.defaultBlockState() && lightBlueBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (place) {
                place_me = lightBlueBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(yellow.getItem())) {
            if (TargetBlock != yellowBlock.defaultBlockState() && yellowBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && orangeBlock != null) {
                lock_cut = true;
                place_me = orangeBlock;
                playerEntity.addItem(new ItemStack(ORANGE_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == darkRedBlock.defaultBlockState() && orangeBlock != null) {
                place_me = orangeBlock;
                playerEntity.addItem(new ItemStack(RED_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = yellowBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(lime.getItem())) {
            if (TargetBlock != limeBlock.defaultBlockState() && limeBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (place) {
                place_me = limeBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(pink.getItem())) {
            if (TargetBlock != pinkBlock.defaultBlockState() && pinkBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == purpleBlock.defaultBlockState() && magentaBLock != null) {
                place_me = magentaBLock;
                playerEntity.addItem(new ItemStack(MAGENTA_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == blackBlock.defaultBlockState() && redBlock != null) {
                place_me = redBlock;
                lock_cut = true;
                playerEntity.addItem(new ItemStack(RED_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = pinkBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(gray.getItem())) {
            if (TargetBlock != grayBlock.defaultBlockState() && grayBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == whiteBlock.defaultBlockState() && lightGrayBlock != null) {
                place_me = lightGrayBlock;
                playerEntity.addItem(new ItemStack(LIGHT_GRAY_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = grayBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(light_gray.getItem())) {
            if (TargetBlock != lightGrayBlock.defaultBlockState() && lightGrayBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == blackBlock.defaultBlockState() && grayBlock != null) {
                place_me = grayBlock;
                playerEntity.addItem(new ItemStack(GRAY_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = lightGrayBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(cyan.getItem())) {
            if (TargetBlock != cyanBlock.defaultBlockState() && cyanBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (place) {
                place_me = cyanBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(purple.getItem())) {
            if (TargetBlock != purpleBlock.defaultBlockState() && purpleBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == pinkBlock.defaultBlockState() && magentaBLock != null) {
                place_me = magentaBLock;
                playerEntity.addItem(new ItemStack(MAGENTA_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = purpleBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(blue.getItem())) {
            if (TargetBlock != blueBlock.defaultBlockState() && blueBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && purpleBlock != null) {
                lock_cut = true;
                place_me = purpleBlock;
                playerEntity.addItem(new ItemStack(PURPLE_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == greenBlock.defaultBlockState() && cyanBlock != null) {
                place_me = cyanBlock;
                playerEntity.addItem(new ItemStack(CYAN_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == whiteBlock.defaultBlockState() && lightBlueBlock != null) {
                place_me = lightBlueBlock;
                playerEntity.addItem(new ItemStack(LIGHT_BLUE_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = blueBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }

        }
        if (inHand.equals(green.getItem())) {
            if (TargetBlock != grayBlock.defaultBlockState() && grayBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == whiteBlock.defaultBlockState() && limeBlock != null) {
                place_me = limeBlock;
                playerEntity.addItem(new ItemStack(LIME_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == blueBlock.defaultBlockState() && purpleBlock != null) {
                place_me = purpleBlock;
                playerEntity.addItem(new ItemStack(PURPLE_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = greenBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(brown.getItem())) {
            if (TargetBlock != brownBlock.defaultBlockState() && brownBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (place) {
                place_me = brownBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (inHand.equals(black.getItem())) {
            if (TargetBlock != blackBlock.defaultBlockState() && blackBlock != null) { place = true; }
            if (TargetBlock == redBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == baseBlock.defaultBlockState() && baseBlock != null) { lock_cut = true; }
            if (TargetBlock == lightGrayBlock.defaultBlockState() && grayBlock != null) {
                place_me = grayBlock;
                playerEntity.addItem(new ItemStack(GRAY_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == lightBlueBlock.defaultBlockState() && blueBlock != null) {
                place_me = blueBlock;
                playerEntity.addItem(new ItemStack(BLUE_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == limeBlock.defaultBlockState() && greenBlock != null) {
                place_me = greenBlock;
                playerEntity.addItem(new ItemStack(GREEN_SHIFT_DYE.get().asItem()));
                place = true;
            }
            if (TargetBlock == pinkBlock.defaultBlockState() && redBlock != null) {
                place_me = redBlock;
                playerEntity.addItem(new ItemStack(RED_SHIFT_DYE.get().asItem()));
                lock_cut = true;
                place = true;
            }
            if (place && place_me == null) {
                place_me = blackBlock;
                playerEntity.addItem(new ItemStack(CLEANSE_SHIFT_DYE.get().asItem()));
            }
        }
        if (place) {
            BlockState to_place = place_me.defaultBlockState();
            switch (blockIndex) {
                case 1 -> blockReplacer.wallPlacement(world, blockPos, to_place); // Walls
                case 2 -> blockReplacer.stairPlacement(world, blockPos, to_place); // Stairs
                case 3 -> blockReplacer.slabPlacement(world, blockPos, to_place); // Slabs
                case 4 -> blockReplacer.gen_AxisPlacement(world, blockPos, to_place, lock_cut); //Axis blocks with, optional lock (for cut_sandstone & red_cut_sandstone)
                case 5 -> blockReplacer.gen_AxisPlacement(world, blockPos, to_place, true);  //AxisPlacement & DefaultBlocks set to do default states on which suits default blocks
                case 6 -> blockReplacer.fencePlacement(world, blockPos, to_place); //Fence Blocks
                case 7 -> blockReplacer.fenceGatePlacement(world, blockPos, to_place); //Fence Gate Blocks
                default -> { return InteractionResult.FAIL; }
            }
            playerEntity.getMainHandItem().setCount(playerEntity.getMainHandItem().getCount()-1);
            return InteractionResult.SUCCESS;
        } else return InteractionResult.FAIL;
    }
}