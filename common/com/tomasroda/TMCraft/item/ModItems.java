package com.tomasroda.TMCraft.item;
import com.tomasroda.TMCraft.lib.ItemIds;

import cpw.mods.fml.common.registry.LanguageRegistry;


import net.minecraft.item.Item;

public class ModItems {

    public static Item ingotLithium;
   
    
    
    public static void init() {
        
    ingotLithium = new ingotLithium(ItemIds.ingotLithium).setUnlocalizedName("ingotLithium");
    LanguageRegistry.addName(ingotLithium, "Lithium Ingot");    
        
    }
}
