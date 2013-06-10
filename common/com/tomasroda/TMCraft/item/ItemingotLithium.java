package com.tomasroda.TMCraft.item;

/**
 * @author Tomás Martins
 */
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class ItemingotLithium extends Item {
    
    public ItemingotLithium(int id){
        super(id);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("ingotLithium");
        
    } 
    
    
    @Override
    public void registerIcons(IconRegister ingotLithium)
    {
             itemIcon = ingotLithium.registerIcon("TMCraft:ingotLithium");
    }

}
