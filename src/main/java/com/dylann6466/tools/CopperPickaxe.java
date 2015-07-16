package com.dylann6466.tools;

import com.dylann6466.lib.RefStrings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class CopperPickaxe extends ItemPickaxe {
	
	private final String name = "copperPickaxe";

	public CopperPickaxe(ToolMaterial copper) {
		super(copper);
		setUnlocalizedName(RefStrings.MODID + "_" + "copperPickaxe");
		setCreativeTab(CreativeTabs.tabTools);
	}

	public String getName()
	{
		return name;
	}
}
