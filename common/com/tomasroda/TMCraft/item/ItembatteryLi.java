package com.tomasroda.TMCraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import universalelectricity.core.item.ItemElectric;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItembatteryLi extends ItemElectric
{
    public ItembatteryLi(int id)
    {
        super(id);
        this.setUnlocalizedName("batteryLi");
        this.setCreativeTab(CreativeTabs.tabRedstone);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ingotLithium)
    {
            itemIcon = ingotLithium.registerIcon("TMCraft:batteryLi");
    }

    @Override
    public double getMaxJoules(ItemStack itemStack)
    {
        return 3000000;
    }
    @Override
    public double getVoltage(ItemStack itemStack)
    {
        return 3.2;
 
    }
    
    
    @Override
    public double getTransferRate(ItemStack itemStack){
        
        
        return 100000;

    }
    
    
}