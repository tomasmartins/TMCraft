package com.tomasroda.TMCraft.item;

/**
 * @author Tomás Martins
 */
import universalelectricity.core.item.ItemElectric;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Itemcapacitor10F extends ItemElectric
{
    public Itemcapacitor10F(int id)
    {
        super(id);
        this.setUnlocalizedName("Itemcapacitor10F");
        this.setCreativeTab(CreativeTabs.tabRedstone);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ingotLithium)
    {
            itemIcon = ingotLithium.registerIcon("TMCraft:capacitor10F");
    }

    @Override
    public double getMaxJoules(ItemStack itemStack)
    {
        return 72000;
    }
    @Override
    public double getVoltage(ItemStack itemStack)
    {
        return 120;
 
    }
    
    @Override
    public double getTransferRate(ItemStack itemStack){
        
        
        return 9000;

    }
    
}
