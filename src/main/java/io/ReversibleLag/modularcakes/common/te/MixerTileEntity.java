package io.ReversibleLag.modularcakes.common.te;

import io.ReversibleLag.modularcakes.core.init.TileEntityTypeInit;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.IBlockReader;

public class MixerTileEntity extends TileEntity implements ITickableTileEntity{

	public MixerTileEntity(TileEntityType<?> tileEntityTpyeIn) {
		super(tileEntityTpyeIn);
		// TODO Auto-generated constructor stub
	}

	public MixerTileEntity() {
		this(TileEntityTypeInit.MIXER_TILE_ENTITY.get());

	}

	public TileEntity creaTileEntity(BlockState state, IBlockReader world) {
		return TileEntityTypeInit.MIXER_TILE_ENTITY.get().create();

	}

	@Override
	public void tick() {
		return;
		
	}

}
