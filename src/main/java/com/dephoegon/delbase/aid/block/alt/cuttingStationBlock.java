package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.horizontalFacingBlocksBaseEntities;
import com.dephoegon.delbase.block.entity.blockEntities;
import com.dephoegon.delbase.block.entity.blocks.blockCuttingStation;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
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
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;


@SuppressWarnings("RedundantMethodOverride")
public class cuttingStationBlock extends horizontalFacingBlocksBaseEntities {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public cuttingStationBlock(Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(properties, normToolTip, shiftToolTip, ctrlToolTip, false, 0, 0);
    }
    @SuppressWarnings("deprecation")
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

    public @NotNull RenderShape getRenderShape(@NotNull BlockState pState) {
        return RenderShape.MODEL;
    }
    public void onRemove(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull BlockState pNewState, boolean pIsMoving) {
        if (pState.getBlock() != pNewState.getBlock()) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if(blockEntity instanceof blockCuttingStation) {
                ((blockCuttingStation) blockEntity).drops();
            }
        }
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }
    public @NotNull InteractionResult use(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos,
                                          @NotNull Player pPlayer, @NotNull InteractionHand pHand, @NotNull BlockHitResult pHit) {
        if(!pLevel.isClientSide()) {
            BlockEntity entity = pLevel.getBlockEntity(pPos);
            if(entity instanceof blockCuttingStation) {
                NetworkHooks.openScreen(((ServerPlayer) pPlayer), (blockCuttingStation)entity, pPos);
            } else {
                throw new IllegalStateException("Delbase Container Provider is Missing - Block Cutting Station");
            }
        }
        return InteractionResult.sidedSuccess(pLevel.isClientSide());
    }
    @Nullable
    public BlockEntity newBlockEntity(@NotNull BlockPos pPos, @NotNull BlockState pState) {
        return new blockCuttingStation(pPos, pState);
    }
    @Nullable
    public <T extends BlockEntity>BlockEntityTicker<T> getTicker(@NotNull Level pLevel, @NotNull BlockState pState, @NotNull BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, blockEntities.BLOCK_CUTTING_STATION_BLOCK_ENTITY.get(), blockCuttingStation::tick);
    }
}