package io.ReversibleLag.modularcakes.common.te;

import io.ReversibleLag.modularcakes.core.init.TileEntityTypeInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.IBlockReader;

public class ChurnerTileEntity extends TileEntity implements ITickableTileEntity{

	public ChurnerTileEntity(TileEntityType<?> tileEntityTpyeIn) {
		super(tileEntityTpyeIn);
		// TODO Auto-generated constructor stub
	}
	
	public ChurnerTileEntity() {
		this(TileEntityTypeInit.CHURNER_TILE_ENTITY.get());

	}

	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityTypeInit.CHURNER_TILE_ENTITY.get().create();

	}

	@Override
	public void tick() {
		this.world.setBlockState(this.pos.down(), Blocks.AIR.getDefaultState());
		
	}

}
