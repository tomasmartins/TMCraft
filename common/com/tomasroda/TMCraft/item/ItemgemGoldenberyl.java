package com.tomasroda.TMCraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemgemGoldenberyl extends Item {
    
    public ItemgemGoldenberyl(int id){
        super(id);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("gemGoldenberyl");
        
    } 
    
    
    public void registerIcons(IconRegister gemGoldenberyl)
    {
             itemIcon = gemGoldenberyl.registerIcon("TMCraft:gemGoldenberyl");
    }

}