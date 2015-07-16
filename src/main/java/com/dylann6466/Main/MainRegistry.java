package com.dylann6466.Main;

import com.dylann6466.blocks.CopperOre;
import com.dylann6466.items.CopperIngot;
import com.dylann6466.lib.RefStrings;
import com.dylann6466.tools.CopperAxe;
import com.dylann6466.tools.CopperHoe;
import com.dylann6466.tools.CopperPickaxe;
import com.dylann6466.tools.CopperSpade;
import com.dylann6466.tools.CopperSword;
import com.dylann6466.world.WorldGen;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class MainRegistry 
{	
	public static Block copperOre;
	
	public static Item copperAxe;
	public static Item copperIngot;
	public static Item copperPickaxe;
	public static Item copperSpade;
	public static Item copperSword;
	public static Item copperHoe;
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void preinit(FMLPreInitializationEvent PreEvent)
	{	
		// Enum Item ToolMaterials
		ToolMaterial copper = EnumHelper.addToolMaterial("copper", 2, 320, 5.5F, 2.5F, 16);
		
		// Blocks
		copperOre = new CopperOre();
		
		// Blocks Language Registry
		LanguageRegistry.addName(copperOre, "Copper Ore");
		
		// Tools
		copperAxe = new CopperAxe(copper);
		copperPickaxe = new CopperPickaxe(copper);
		copperSpade = new CopperSpade(copper);
		copperSword = new CopperSword(copper);
		copperHoe = new CopperHoe(copper);
		
		GameRegistry.registerItem(copperAxe = new CopperAxe (copper), "copperAxe");
		GameRegistry.registerItem(copperPickaxe = new CopperPickaxe (copper), "copperPickaxe");
		GameRegistry.registerItem(copperSpade = new CopperSpade (copper), "copperSpade");
		GameRegistry.registerItem(copperSword = new CopperSword (copper), "copperSword");
		GameRegistry.registerItem(copperHoe = new CopperHoe (copper), "copperHoe");
		
		// Tools Language Registry
		LanguageRegistry.addName(copperAxe, "Copper Axe");
		LanguageRegistry.addName(copperPickaxe, "Copper Pickaxe");
		LanguageRegistry.addName(copperSpade, "Copper Shovel");
		LanguageRegistry.addName(copperHoe, "Copper Hoe");
		LanguageRegistry.addName(copperSword, "Copper Sword");
		
		// Items
		copperIngot = new CopperIngot();
		
		// Items Language Registry
		LanguageRegistry.addName(copperIngot, "Copper Ingot");
		
		// Recipes
		ModRecipes.addRecipes();
		
		// Event Handler Registry
		proxy.registerRenderInfo();
	}	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		if(event.getSide() == Side.CLIENT)
		{
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
			
			// Blocks
			renderItem.getItemModelMesher().register(Item.getItemFromBlock(copperOre), 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((CopperOre) copperOre).getName(), "inventory"));
			
			// Tools, Items
			renderItem.getItemModelMesher().register(copperAxe, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((CopperAxe) copperAxe).getName(), "inventory"));
			renderItem.getItemModelMesher().register(copperIngot, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((CopperIngot) copperIngot).getName(), "inventory"));
			renderItem.getItemModelMesher().register(copperPickaxe, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((CopperPickaxe) copperPickaxe).getName(), "inventory"));
			renderItem.getItemModelMesher().register(copperSword, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((CopperSword) copperSword).getName(), "inventory"));
			renderItem.getItemModelMesher().register(copperHoe, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((CopperHoe) copperHoe).getName(), "inventory"));
			renderItem.getItemModelMesher().register(copperSpade, 0, new ModelResourceLocation(RefStrings.MODID + ":" + ((CopperSpade) copperSpade).getName(), "inventory"));
			
			WorldGen.MainRegistry();
		}
	}
	@EventHandler
	public static void postinit(FMLPostInitializationEvent PostEvent)
	{
		
	}	
}
