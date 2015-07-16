package com.dylann6466.world;

import java.util.Random;

import com.dylann6466.Main.MainRegistry;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGen 
{
	public static void MainRegistry()
	{
		registerWorldGen(new WorldOreGen(),1);
	}
	
	public static void registerWorldGen(IWorldGenerator iGenerator, int weightedProbability)
	{
		GameRegistry.registerWorldGenerator(iGenerator, weightedProbability);
	}
}