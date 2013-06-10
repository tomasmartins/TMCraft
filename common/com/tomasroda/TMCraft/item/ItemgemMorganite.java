package com.tomasroda.TMCraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemgemMorganite extends Item {
    
    public ItemgemMorganite(int id){
        super(id);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("gemMorganite");
        
    } 
    
    
    @Override
    public void registerIcons(IconRegister gemMorganite)
    {
             itemIcon = gemMorganite.registerIcon("TMCraft:gemMorganite");
    }

}