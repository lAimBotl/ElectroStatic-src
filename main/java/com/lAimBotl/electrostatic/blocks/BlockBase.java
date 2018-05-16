package com.lAimBotl.electrostatic.blocks;

import com.lAimBotl.electrostatic.Main;
import com.lAimBotl.electrostatic.init.ModBlocks;
import com.lAimBotl.electrostatic.init.ModItems;
import com.lAimBotl.electrostatic.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
	    setUnlocalizedName(name);
	    setRegistryName(name);
	    setCreativeTab(CreativeTabs.REDSTONE);
	    
	    ModBlocks.BLOCKS.add(this);
	    ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
