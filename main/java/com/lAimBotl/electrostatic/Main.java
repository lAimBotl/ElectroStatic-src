package com.lAimBotl.electrostatic;

import com.lAimBotl.electrostatic.proxy.CommonProxy;
import com.lAimBotl.electrostatic.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
// the stuff just below this registers stuff I think
@Mod(modid = Reference.MOD_ID, name = Reference.NAME,version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
//	this is here just to separate stuff :P 
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
// this is also just here to make stuff separate
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
	}
// same thing here too	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
}
