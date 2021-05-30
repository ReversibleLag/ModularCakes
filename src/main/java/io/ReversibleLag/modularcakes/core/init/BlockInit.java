package io.ReversibleLag.modularcakes.core.init;

import io.ReversibleLag.modularcakes.ModularCakes;
import io.ReversibleLag.modularcakes.common.block.MixerBlock;
import io.ReversibleLag.modularcakes.common.block.MixerBlockGreen;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			ModularCakes.MOD_ID);

	public static final RegistryObject<Block> MIXER_BLOCK = BLOCKS.register("mixer_block", () -> new MixerBlock());

	
	public static final RegistryObject<Block> MIXER_BLOCK_GREEN = BLOCKS.register("mixer_block_green", () -> new MixerBlockGreen());

	public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
					.hardnessAndResistance(5f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(2)));
	
	public static final RegistryObject<Block> VANILLA_BLOCK = BLOCKS
			.register("vanilla_block", 
					() -> new Block(AbstractBlock.Properties.from(Blocks.BIRCH_LEAVES)));
	
	
	//public static final RegistryObject<LeavesBlock> VANILLA_BLOCK = BLOCKS.register("vanilla_block", () -> new VanillaBlock());
	
}
