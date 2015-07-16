package com.dylann6466.tools;

import com.dylann6466.lib.RefStrings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CopperAxe extends ItemAxe
{
	private final String name = "copperAxe";
	
	public CopperAxe(ToolMaterial copper)
	{
		super(copper);
		setUnlocalizedName(RefStrings.MODID + "_" + "copperAxe");
		setCreativeTab(CreativeTabs.tabTools);
	}
	
	public String getName()
	{
		return name;
	}
}
