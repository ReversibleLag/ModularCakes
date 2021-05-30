package io.ReversibleLag.modularcakes.core.init;

import io.ReversibleLag.modularcakes.ModularCakes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			ModularCakes.MOD_ID);

	public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
			() -> new Item(new Item.Properties().group(ModularCakes.MODULAR_CAKE_TAB)));

	public static final RegistryObject<Item> SALT = ITEMS.register("salt",
			() -> new Item(new Item.Properties().group(ModularCakes.MODULAR_CAKE_TAB)));

	public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
			() -> new Item(new Item.Properties().group(ModularCakes.MODULAR_CAKE_TAB)));

	public static final RegistryObject<Item> VANILLA = ITEMS.register("vanilla",
			() -> new Item(new Item.Properties().group(ModularCakes.MODULAR_CAKE_TAB)));

	public static final RegistryObject<BlockItem> TEST_BLOCK = ITEMS.register("test_block",
			() -> new BlockItem(BlockInit.TEST_BLOCK.get(),
					new Item.Properties().group(ModularCakes.MODULAR_CAKE_TAB)));

	public static final RegistryObject<BlockItem> MIXER_BLOCK = ITEMS.register("mixer_block",
			() -> new BlockItem(BlockInit.MIXER_BLOCK.get(),
					new Item.Properties().group(ModularCakes.MODULAR_CAKE_TAB)));
	
	public static final RegistryObject<BlockItem> MIXER_BLOCK_GREEN = ITEMS.register("mixer_block_green",
			() -> new BlockItem(BlockInit.MIXER_BLOCK_GREEN.get(),
					new Item.Properties().group(ModularCakes.MODULAR_CAKE_TAB)));
	
	
	public static final RegistryObject<BlockItem> VANILLA_BLOCK = ITEMS.register("vanilla_block",
			() -> new BlockItem(BlockInit.VANILLA_BLOCK.get(),
					new Item.Properties().group(ModularCakes.MODULAR_CAKE_TAB)));

}
