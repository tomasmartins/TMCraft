package com.tomasroda.TMCraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemingotCopper extends Item {

    public ItemingotCopper(int par1) {
        super(par1);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("ingotCopper");
        // TODO Auto-generated constructor stub
    }
    @Override
    public void registerIcons(IconRegister ingotLithium)
    {
             itemIcon = ingotLithium.registerIcon("TMCraft:ingotCopper");
    }    
    

}
