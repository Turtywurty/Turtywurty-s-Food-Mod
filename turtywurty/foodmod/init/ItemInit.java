package com.turtywurty.foodmod.init;

import java.util.ArrayList;
import java.util.List;

import com.turtywurty.foodmod.Main;
import com.turtywurty.foodmod.items.ItemBase;
import com.turtywurty.foodmod.items.ItemModFood;

import net.minecraft.item.Item;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item TOMATO = new ItemModFood("tomato", 5, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
}
