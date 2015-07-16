package com.dylann6466.tools;

import com.dylann6466.lib.RefStrings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class CopperSpade extends ItemSpade {
	
	private final String name = "copperSpade";

	public CopperSpade(ToolMaterial copper) {
		super(copper);
		setUnlocalizedName(RefStrings.MODID + "_" + "copperSpade");
		setCreativeTab(CreativeTabs.tabTools);
	}

	public String getName()
	{
		return name;
	}
}