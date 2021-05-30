package io.ReversibleLag.modularcakes.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class VanillaBlock extends LeavesBlock {

	public VanillaBlock() {
		super(AbstractBlock.Properties.
				create(Material.LEAVES, MaterialColor.GRASS)
				.sound(SoundType.PLANT)
				.hardnessAndResistance(0f, 0f).setOpaque(null));
	}
	
	

	
	
}
