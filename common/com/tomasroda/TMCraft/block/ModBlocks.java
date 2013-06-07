package com.tomasroda.TMCraft.block;

import com.tomasroda.TMCraft.lib.BlockIds;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

public class ModBlocks {
    
    public final static Block oreRedberyl  = new BlockoreRedberyl(BlockIds.oreRedberyl) ;
    public static void init() {
        
    LanguageRegistry.addName(oreRedberyl, "Beryl ore");
    MinecraftForge.setBlockHarvestLevel(oreRedberyl, "pickaxe", 2);
    GameRegistry.registerBlock(oreRedberyl, "oreBeryl");
    }  
    
    public static void oreRegistration()
    {
            OreDictionary.registerOre("oreBeryl", new ItemStack(oreRedberyl));
          
    }

}
