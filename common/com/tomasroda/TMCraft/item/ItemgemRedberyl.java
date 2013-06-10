package com.tomasroda.TMCraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemgemRedberyl extends Item {
    
    public ItemgemRedberyl(int id){
        super(id);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("gemRedBeryl");
        
    } 
    
    
    @Override
    public void registerIcons(IconRegister gemRedBeryl)
    {
             itemIcon = gemRedBeryl.registerIcon("TMCraft:gemRedBeryl");
    }

}