package com.turtywurty.foodmod.items;

import com.turtywurty.foodmod.Main;
import com.turtywurty.foodmod.init.ItemInit;
import com.turtywurty.foodmod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.FOODMODTAB);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}