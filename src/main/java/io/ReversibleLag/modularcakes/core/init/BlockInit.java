package io.ReversibleLag.modularcakes.core.init;

import io.ReversibleLag.modularcakes.ModularCakes;
import io.ReversibleLag.modularcakes.common.block.MixerBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			ModularCakes.MOD_ID);

	public static final RegistryObject<Block> MIXER_BLOCK = BLOCKS.register("mixer_block", () -> new MixerBlock());

	public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block",
			() -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(5f)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2)));
}
