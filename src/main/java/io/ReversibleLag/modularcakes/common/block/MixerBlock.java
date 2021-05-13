package io.ReversibleLag.modularcakes.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.datafix.fixes.ChunkPaletteFormat.Direction;
import net.minecraft.world.IBlockReader;

public class MixerBlock extends Block {

	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

	public MixerBlock(Properties properties) {
		super(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(15f)
				.sound(SoundType.METAL));
		this.registerDefaultState(this.stateDefinition.any().has(FACING, Direction.NORTH));
		//this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
	    //this.registerDefaultState(this.defaultBlockState().getBlockState().setValue(FACING, Direction.NORTH));
		
	
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
