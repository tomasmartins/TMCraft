package com.tomasroda.TMCraft.core.proxy;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import com.tomasroda.TMCraft.TMCraft;;

public class CommonProxy implements IGuiHandler{ //THIS IS IMPORTANT, CANNOT BE A PROXY/GUI HANDLER WITHOUT THIS!!
public void registerRenderInformation() //Client side texture registering
{
}
@Override
public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
return null;
}
@Override
public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
return null;
}
public void registerTiles(){ //For registering TileEntities
    
}
public void registerBlocks(){   //For registering Blocks
    
}
public void addNames(){ 
   
                           //For adding Item's ingame names
    
}
public void addRecipes(){ //For adding your Item's recipes
 
}
}