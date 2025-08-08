package com.dephoegon.delbase.aid.block.unique;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.horizontalFacingBlockEntities;
import com.dephoegon.delbase.block.entity.bEntity.blockCuttingStation;
import com.dephoegon.delbase.block.entity.modBlockEntities;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

import static com.dephoegon.delbase.aid.slots.planSlots.isPlansSlotItem;

@SuppressWarnings("RedundantMethodOverride")
public class cuttingStationBlock extends horizontalFacingBlockEntities {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final MapCodec<cuttingStationBlock> CODEC = simpleCodec(cuttingStationBlock::new);
    public cuttingStationBlock(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0);
    }
    public cuttingStationBlock(Properties properties) { this(properties, "", "", ""); }
    public @NotNull VoxelShape getShape(@NotNull BlockState pState, @NotNull BlockGetter pLevel, @NotNull BlockPos pPos, @NotNull CollisionContext pContext) {
        Direction direction = pState.getValue(FACING);
        return switch (direction) {
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            case NORTH -> NORTH_SHAPE;
            case EAST -> EAST_SHAPE;
            default -> FAIL_DEFAULT;
        };
    }
    private static final VoxelShape NORTH_SHAPE = Stream.of(
            Block.box(2, 0, 11, 14, 12, 14),
            Block.box(2, 0, 0.5, 14, 2, 10.5),
            Block.box(15, 0, 15, 16, 16, 16),
            Block.box(0, 0, 15, 1, 16, 16),
            Block.box(0, 0, 0, 1, 16, 1),
            Block.box(15, 0, 0, 16, 16, 1),
            Block.box(1, 13, 15, 15, 14, 16),
            Block.box(1, 13, 0, 15, 14, 10),
            Block.box(1, 4, 0, 15, 4.5, 10),
            Block.box(15, 13, 1, 16, 14, 15),
            Block.box(0, 13, 1, 1, 14, 15),
            Block.box(15, 0, 9, 16, 6, 10),
            Block.box(0, 0, 9, 1, 6, 10)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape SOUTH_SHAPE = Stream.of(
            Block.box(2, 0, 2, 14, 12, 5),
            Block.box(2, 0, 5.5, 14, 2, 15.5),
            Block.box(0, 0, 0, 1, 16, 1),
            Block.box(15, 0, 0, 16, 16, 1),
            Block.box(15, 0, 15, 16, 16, 16),
            Block.box(0, 0, 15, 1, 16, 16),
            Block.box(1, 13, 0, 15, 14, 1),
            Block.box(1, 13, 6, 15, 14, 16),
            Block.box(1, 4, 6, 15, 4.5, 16),
            Block.box(0, 13, 1, 1, 14, 15),
            Block.box(15, 13, 1, 16, 14, 15),
            Block.box(0, 0, 6, 1, 6, 7),
            Block.box(15, 0, 6, 16, 6, 7)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape EAST_SHAPE = Stream.of(
            Block.box(2, 0, 2, 5, 12, 14),
            Block.box(5.5, 0, 2, 15.5, 2, 14),
            Block.box(0, 0, 15, 1, 16, 16),
            Block.box(0, 0, 0, 1, 16, 1),
            Block.box(15, 0, 0, 16, 16, 1),
            Block.box(15, 0, 15, 16, 16, 16),
            Block.box(0, 13, 1, 1, 14, 15),
            Block.box(6, 13, 1, 16, 14, 15),
            Block.box(6, 4, 1, 16, 4.5, 15),
            Block.box(1, 13, 15, 15, 14, 16),
            Block.box(1, 13, 0, 15, 14, 1),
            Block.box(6, 0, 15, 7, 6, 16),
            Block.box(6, 0, 0, 7, 6, 1)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape WEST_SHAPE = Stream.of(
            Block.box(11, 0, 2, 14, 12, 14),
            Block.box(0.5, 0, 2, 10.5, 2, 14),
            Block.box(15, 0, 0, 16, 16, 1),
            Block.box(15, 0, 15, 16, 16, 16),
            Block.box(0, 0, 15, 1, 16, 16),
            Block.box(0, 0, 0, 1, 16, 1),
            Block.box(15, 13, 1, 16, 14, 15),
            Block.box(0, 13, 1, 10, 14, 15),
            Block.box(0, 4, 1, 10, 4.5, 15),
            Block.box(1, 13, 0, 15, 14, 1),
            Block.box(1, 13, 15, 15, 14, 16),
            Block.box(9, 0, 0, 10, 6, 1),
            Block.box(9, 0, 15, 10, 6, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape FAIL_DEFAULT = Stream.of(
            Block.box(0,0,0,16,14,16),
            Block.box(0,14,0,1,16,1),
            Block.box(15,14,0,16,16,1),
            Block.box(0,14,15,1,16,16),
            Block.box(15, 14,15, 16,16,16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    @Override
    protected @NotNull MapCodec<? extends BaseEntityBlock> codec() { return CODEC; }

    public @NotNull RenderShape getRenderShape(@NotNull BlockState pState) { return RenderShape.MODEL; }
    public void onRemove(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull BlockState pNewState, boolean pIsMoving) {
        if (pState.getBlock() != pNewState.getBlock()) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if(blockEntity instanceof blockCuttingStation) { ((blockCuttingStation) blockEntity).drops(); }
            pLevel.updateNeighbourForOutputSignal(pPos, this);
        }
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }
    @SuppressWarnings("RedundantCast")
    public @NotNull InteractionResult use(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos,
                                          @NotNull Player pPlayer, @NotNull InteractionHand pHand, @NotNull BlockHitResult pHit) {
        if(!pLevel.isClientSide()) {
            BlockEntity entity = pLevel.getBlockEntity(pPos);
            if(entity instanceof blockCuttingStation) {
                ((ServerPlayer) pPlayer).openMenu(new SimpleMenuProvider((blockCuttingStation) entity, Component.translatable("gui.delbase.block_cutter")), pPos);
            } else {
                throw new IllegalStateException("DelBase Container Provider is Missing - Block Cutting Station");
            }
        }
        return InteractionResult.sidedSuccess(pLevel.isClientSide());
    }
    protected @NotNull InteractionResult useWithoutItem(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult hitResult) {
        if (!level.isClientSide()) {
            BlockEntity entity = level.getBlockEntity(pos);
            if (entity instanceof blockCuttingStation) {
                ((ServerPlayer) player).openMenu(new SimpleMenuProvider((blockCuttingStation) entity, Component.translatable("gui.delbase.block_cutter")), pos);
            } else { throw new IllegalStateException("DelBase Container Provider is Missing - Block Cutting Station"); }
        }
        return InteractionResult.sidedSuccess(level.isClientSide());
    }
    protected @NotNull ItemInteractionResult useItemOn(@NotNull ItemStack stack, @NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hit) {
        BlockEntity entity = level.getBlockEntity(pos);
        if (entity instanceof blockCuttingStation) {
            if (((blockCuttingStation) entity).getPlanSlotItem().isEmpty()) {
                if (!stack.isEmpty() && isPlansSlotItem(stack.getItem(), level)) {
                    int maxStackSize = stack.getMaxStackSize();
                    int copyCount = stack.getCount() > maxStackSize ? maxStackSize : stack.getCount() < 1 ? 0 : stack.getCount();
                    if (copyCount < 1) { return ItemInteractionResult.FAIL; }
                    ItemStack copy = stack.copyWithCount(Math.min(stack.getCount(), maxStackSize));
                    ((blockCuttingStation) entity).setPlanSlotItem(copy);
                    stack.shrink(copyCount);
                    level.playSound(player, pos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1.0F, 2.0F);
                    return ItemInteractionResult.SUCCESS;
                }
            } else {
                if (!level.isClientSide()) {
                    ((ServerPlayer) player).openMenu(new SimpleMenuProvider((blockCuttingStation) entity, Component.translatable("gui.delbase.block_cutter")), pos);
                    return ItemInteractionResult.SUCCESS;
                }
            }
        }
        return super.useItemOn(stack, state, level, pos, player, hand, hit);
    }
    @Nullable
    public BlockEntity newBlockEntity(@NotNull BlockPos pPos, @NotNull BlockState pState) { return new blockCuttingStation(pPos, pState); }
    @Nullable
    public <T extends BlockEntity>BlockEntityTicker<T> getTicker(@NotNull Level pLevel, @NotNull BlockState pState, @NotNull BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, modBlockEntities.BLOCK_CUTTING_STATION_BE.get(), blockCuttingStation::tick);
    }
}