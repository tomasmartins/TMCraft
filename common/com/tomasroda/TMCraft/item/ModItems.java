package com.tomasroda.TMCraft.item;
import com.tomasroda.TMCraft.lib.ItemIds;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {

    public static Item ingotLithium;
    public static Item ingotBeryllium;
    public static Item gemMorganite;
    public static Item gemGoldenberyl;
    public static Item gemAquamarine;
    public static Item gemMorgan;
    public static Item gemMorgaite;
    public static Item gemRedberyl;
    
    
    public static void init() {
    ingotBeryllium = new ItemingotBerylium(ItemIds.ingotBerylium);
    ingotLithium = new ItemingotLithium(ItemIds.ingotLithium);
    gemMorganite = new ItemgemMorganite(ItemIds.gemMorganite);
    gemGoldenberyl  = new ItemgemGoldenberyl(ItemIds.gemGoldenberyl);
    gemAquamarine = new ItemgemAquamarine(ItemIds.gemAquamarine);
    gemRedberyl = new ItemgemRedberyl(ItemIds.gemRedberyl);
    LanguageRegistry.addName(ingotLithium, "Lithium Ingot");    
    LanguageRegistry.addName(ingotBeryllium, "Beryllium Ingot");
    LanguageRegistry.addName(gemMorganite, "Morganite");
    LanguageRegistry.addName(gemGoldenberyl, "Golden Beryl");
    LanguageRegistry.addName(gemAquamarine, "Aquamarine");
    LanguageRegistry.addName(gemRedberyl, "Red beryl");
  }
    
    
    public static void oreRegistration()
    {
            OreDictionary.registerOre("ingotLithium", new ItemStack(ingotLithium));
            OreDictionary.registerOre("ingotBeryllium", new ItemStack(ingotBeryllium));
    }
    
    
}
