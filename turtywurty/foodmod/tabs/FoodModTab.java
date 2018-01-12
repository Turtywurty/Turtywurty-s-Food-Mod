package com.turtywurty.foodmod.tabs;

import com.turtywurty.foodmod.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FoodModTab extends CreativeTabs
{
	
	public FoodModTab(String label) 
	{ 
		super("foodmodtab");
		this.setBackgroundImageName("foodmod.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.TOMATO);
	}
	
}