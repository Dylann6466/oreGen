package com.dylann6466.items;

import com.dylann6466.lib.RefStrings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CopperIngot extends Item 
{
	private final String name = "copperIngot";
	
	public CopperIngot()
	{
		GameRegistry.registerItem(this,  name);
		setUnlocalizedName(RefStrings.MODID + "_" + "copperIngot");
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public String getName()
	{
		return name;
	}
}
