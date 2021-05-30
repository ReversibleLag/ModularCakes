package io.ReversibleLag.modularcakes.core.init;

import io.ReversibleLag.modularcakes.ModularCakes;
import io.ReversibleLag.modularcakes.common.te.MixerTileEntity;
import io.ReversibleLag.modularcakes.common.te.MixerTileEntityGreen;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeInit {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
			.create(ForgeRegistries.TILE_ENTITIES, ModularCakes.MOD_ID);

	public static final RegistryObject<TileEntityType<MixerTileEntity>> MIXER_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
			.register("mixer_entity",
			() -> TileEntityType.Builder.create(MixerTileEntity::new, BlockInit.MIXER_BLOCK.get()).build(null));
	
	public static final RegistryObject<TileEntityType<MixerTileEntityGreen>> MIXER_TILE_ENTITY_TYPE_GREEN = TILE_ENTITY_TYPE
			.register("mixer_entity_green",
			() -> TileEntityType.Builder.create(MixerTileEntityGreen::new, BlockInit.MIXER_BLOCK_GREEN.get()).build(null));

	
}
