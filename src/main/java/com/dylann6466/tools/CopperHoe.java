package com.dylann6466.tools;

import com.dylann6466.lib.RefStrings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class CopperHoe extends ItemHoe {
	
	private final String name = "copperHoe";

	public CopperHoe(ToolMaterial copper) {
		super(copper);
		setUnlocalizedName(RefStrings.MODID + "_" + "copperPickaxe");
		setCreativeTab(CreativeTabs.tabTools);
	}

	public String getName()
	{
		return name;
	}
}