package io.ReversibleLag.modularcakes.core.init;

import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeatureInit {
	
	public static void addOres(final BiomeLoadingEvent event)
	{
		addOre(event, new TagMatchRuleTest(BlockTags.BIRCH_LOGS), BlockInit.VANILLA_BLOCK.get().getDefaultState(), 4, 60, 100, 200);
		addOre(event, new TagMatchRuleTest(BlockTags.LEAVES), BlockInit.VANILLA_BLOCK.get().getDefaultState(), 10, 0, 200, 200);
		//addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.VANILLA_BLOCK.get().getDefaultState(), 4, 0, 100, 60);
		
	}
	
	

	public static void addOre(final BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize, int minHeight, int maxHeight, int amount)
	{
		event.getGeneration().withFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, 
			Feature.ORE.withConfiguration(new OreFeatureConfig(rule, state, veinSize))
			.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
			.square().func_242731_b(amount));
	}

}