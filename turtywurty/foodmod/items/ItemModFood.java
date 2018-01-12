package com.turtywurty.foodmod.items;

import com.turtywurty.foodmod.Main;
import com.turtywurty.foodmod.init.ItemInit;
import com.turtywurty.foodmod.util.interfaces.IHasModel;

import net.minecraft.item.ItemFood;

public class ItemModFood extends ItemFood implements IHasModel
{

	public ItemModFood(String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		ItemInit.ITEMS.add(this);
	}
	
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
