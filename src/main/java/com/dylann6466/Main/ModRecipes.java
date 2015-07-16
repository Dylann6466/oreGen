package com.dylann6466.Main;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void addRecipes()
	{
		// Crafting Recipes
		GameRegistry.addRecipe(new ItemStack(MainRegistry.copperAxe), new Object[]{
				"AA ",
				"AB ",
				" B ",
				'A', MainRegistry.copperIngot, 'B', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MainRegistry.copperHoe), new Object[]{
			"AA ",
			" B ",
			" B ",
			'A', MainRegistry.copperIngot, 'B', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MainRegistry.copperPickaxe), new Object[]{
				"AAA",
				" B ",
				" B ",
				'A', MainRegistry.copperIngot, 'B', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MainRegistry.copperSpade), new Object[]{
				" A ",
				" B ",
				" B ",
				'A', MainRegistry.copperIngot, 'B', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MainRegistry.copperSword), new Object[]{
				" A ",
				" A ",
				" B ",
				'A', MainRegistry.copperIngot, 'B', Items.stick
		});
		
		// Smelting
		GameRegistry.addSmelting(MainRegistry.copperOre, new ItemStack(MainRegistry.copperIngot), 0.7F);
	}
}
