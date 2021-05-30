package io.ReversibleLag.modularcakes.common.te;

import io.ReversibleLag.modularcakes.core.init.TileEntityTypeInit;
import net.minecraft.block.Blocks;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class MixerTileEntity extends TileEntity implements ITickableTileEntity{

	public MixerTileEntity(TileEntityType<?> tileEntityTpyeIn) {
		super(tileEntityTpyeIn);
		// TODO Auto-generated constructor stub
	}
	
	public MixerTileEntity() {
		this(TileEntityTypeInit.MIXER_TILE_ENTITY_TYPE.get());
	}

	@Override
	public void tick() {
		this.world.setBlockState(this.pos.down(), Blocks.AIR.getDefaultState());
		
	}

}
