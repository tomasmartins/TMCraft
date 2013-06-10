package com.tomasroda.TMCraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemgemAquamarine extends Item {
    
    public ItemgemAquamarine(int id){
        super(id);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("gemAquamarine");
        
    } 
    
    
    @Override
    public void registerIcons(IconRegister gemGoldenberyl)
    {
             itemIcon = gemGoldenberyl.registerIcon("TMCraft:gemAquamarine");
    }

}