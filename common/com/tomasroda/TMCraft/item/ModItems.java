package com.tomasroda.TMCraft.item;
import com.tomasroda.TMCraft.lib.ItemIds;

import cpw.mods.fml.common.registry.LanguageRegistry;


import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {

    public static Item ingotLithium;
    public static Item ingotBeryllium;
   
    
    
    public static void init() {
        
    ingotLithium = new ItemingotLithium(ItemIds.ingotLithium);
    LanguageRegistry.addName(ingotLithium, "Lithium Ingot");    
    ingotBeryllium = new ItemingotBerylium(ItemIds.ingotBerylium);
    LanguageRegistry.addName(ingotBeryllium, "Beryllium Ingot");    
        
    }
    
    
    public static void oreRegistration()
    {
            OreDictionary.registerOre("ingotLithium", new ItemStack(ingotLithium));
            OreDictionary.registerOre("ingotBeryllium", new ItemStack(ingotBeryllium));
    }
    
    
}
