package io.ReversibleLag.modularcakes.common.block;

import java.util.stream.Stream;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class MixerBlock extends Block {

	public MixerBlock() {
		super(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY).sound(SoundType.METAL).hardnessAndResistance(3f,3f));

		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
	}
	
	
	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

	private static final VoxelShape SHAPE_E = Stream.of(Block.makeCuboidShape(13, 0, 5, 16, 9, 11),
			Block.makeCuboidShape(1, 0, 2, 13, 9, 14), Block.makeCuboidShape(2, 9, 5, 16, 16, 11)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	private static final VoxelShape SHAPE_S = Stream.of(Block.makeCuboidShape(5, 0, 13, 11, 9, 16),
			Block.makeCuboidShape(2, 0, 1, 14, 9, 13), Block.makeCuboidShape(5, 9, 2, 11, 16, 16)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	private static final VoxelShape SHAPE_N = Stream.of(Block.makeCuboidShape(5, 0, 0, 11, 9, 3),
			Block.makeCuboidShape(2, 0, 3, 14, 9, 15), Block.makeCuboidShape(5, 9, 0, 11, 16, 14)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	private static final VoxelShape SHAPE_W = Stream.of(Block.makeCuboidShape(0, 0, 5, 3, 9, 11),
			Block.makeCuboidShape(3, 0, 2, 15, 9, 14), Block.makeCuboidShape(0, 9, 5, 14, 16, 11)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	
	

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		switch (state.get(FACING)) {
		case SOUTH:
			return SHAPE_S;
		case EAST:
			return SHAPE_E;
		case WEST:
			return SHAPE_W;
		default:
			return SHAPE_N;
		}
	}

	@Override
	public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
		return state.with(FACING, direction.rotate(state.get(FACING)));
	}

	@SuppressWarnings("deprecation")
	@Override
	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.toRotation(state.get(FACING)));
	}

	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing());
	}

	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		super.fillStateContainer(builder);
		builder.add(FACING);
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		// TODO Auto-generated method stub
		return super.hasTileEntity(state);
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		// TODO Auto-generated method stub
		return super.createTileEntity(state, world);
	}

}
