package com.dylann6466.blocks;

import com.dylann6466.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CopperOre extends Block {
	
	private final String name ="copperOre";
	
	public CopperOre()
	{
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(RefStrings.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(5.0F);
		setResistance(15.0F);
	}
	
	public String getName()
	{
		return name;
	}

}
