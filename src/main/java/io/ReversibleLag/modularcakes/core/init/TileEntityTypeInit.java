package io.ReversibleLag.modularcakes.core.init;

import io.ReversibleLag.modularcakes.ModularCakes;
import io.ReversibleLag.modularcakes.common.te.MixerTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeInit {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
			.create(ForgeRegistries.TILE_ENTITIES, ModularCakes.MOD_ID);

	public static final RegistryObject<TileEntityType<MixerTileEntity>> MIXER_TILE_ENTITY = TILE_ENTITY_TYPE
			.register("mixer", () -> TileEntityType.Builder.of(MixerTileEntity::new, BlockInit.MIXER_BLOCK.get()).build(null));

}
