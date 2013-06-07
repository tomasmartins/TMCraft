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
    public final static Block oreAquamarine  = new BlockoreAquamarine(BlockIds.oreAquamarine) ;
    public final static Block oreMorganite  = new BlockoreMorganite(BlockIds.oreMorganite) ;
    public final static Block oreGoldenberyl  = new BlockoreGoldenberyl(BlockIds.oreGoldenberyl) ;
    
    public static void init() {
    LanguageRegistry.addName(oreMorganite, "Morganite Ore");
    MinecraftForge.setBlockHarvestLevel(oreMorganite, "pickaxe", 2);
    GameRegistry.registerBlock(oreMorganite, "oreMorganite");
        
    LanguageRegistry.addName(oreAquamarine, "Aquamarine Ore");
    MinecraftForge.setBlockHarvestLevel(oreAquamarine, "pickaxe", 2);
    GameRegistry.registerBlock(oreAquamarine, "oreAquamarine");     
        
    LanguageRegistry.addName(oreRedberyl, "Redberyl Ore");
    MinecraftForge.setBlockHarvestLevel(oreRedberyl, "pickaxe", 2);
    GameRegistry.registerBlock(oreRedberyl, "oreBeryl");
    
    LanguageRegistry.addName(oreGoldenberyl, "Goldenberyl Ore");
    MinecraftForge.setBlockHarvestLevel(oreGoldenberyl, "pickaxe", 2);
    GameRegistry.registerBlock(oreGoldenberyl, "oreGoldenberyl");
    }  
    
    public static void oreRegistration()
    {
            OreDictionary.registerOre("oreRedberyl", new ItemStack(oreRedberyl));
            OreDictionary.registerOre("oreAquamarine", new ItemStack(oreAquamarine));
            OreDictionary.registerOre("oreMorganite", new ItemStack(oreMorganite));
            OreDictionary.registerOre("oreGoldenberyl", new ItemStack(oreGoldenberyl));
          
    }

}
