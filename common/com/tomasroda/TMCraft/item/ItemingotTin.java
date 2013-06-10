package com.tomasroda.TMCraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemingotTin extends Item {

    public ItemingotTin(int par1) {
        super(par1);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("ingotTin");
        // TODO Auto-generated constructor stub
    }
    @Override
    public void registerIcons(IconRegister ingotLithium)
    {
             itemIcon = ingotLithium.registerIcon("TMCraft:ingotTin");
    }    
    

}
