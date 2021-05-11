package io.ReversibleLag.modularcakes.core.init;

import io.ReversibleLag.modularcakes.ModularCakes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			ModularCakes.MOD_ID);

	public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties().tab(ModularCakes.MODULAR_CAKE_TAB)));

	public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> new Item(new Item.Properties().tab(ModularCakes.MODULAR_CAKE_TAB)));
	
	public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties().tab(ModularCakes.MODULAR_CAKE_TAB)));
	
	public static final RegistryObject<Item> VANILLA = ITEMS.register("vanilla", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
}
