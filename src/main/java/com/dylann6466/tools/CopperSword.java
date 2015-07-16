package com.dylann6466.tools;

import com.dylann6466.lib.RefStrings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CopperSword extends ItemSword {
	
	private final String name = "copperSword";

	public CopperSword(ToolMaterial copper) {
		super(copper);
		setUnlocalizedName(RefStrings.MODID + "_" + "copperPickaxe");
		setCreativeTab(CreativeTabs.tabCombat);
	}

	public String getName()
	{
		return name;
	}
}