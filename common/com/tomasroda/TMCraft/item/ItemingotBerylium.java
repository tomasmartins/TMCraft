package com.tomasroda.TMCraft.item;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.item.Item;
public class ItemingotBerylium extends Item {
    
    public ItemingotBerylium(int id){
        super(id);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("ingotBerylium");
        
    } 

    
    @Override
    public void registerIcons(IconRegister ingotLithium)
    {
             itemIcon = ingotLithium.registerIcon("TMCraft:ingotBeryllium");
    }

}
