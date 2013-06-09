package com.tomasroda.TMCraft.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import universalelectricity.core.item.ItemElectric;

import com.tomasroda.TMCraft.lib.ItemIds;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems {

    public static Item ingotLithium;
    public static Item ingotBeryllium;
    public static Item gemMorganite;
    public static Item gemGoldenberyl;
    public static Item gemAquamarine;
    public static Item gemMorgan;
    public static Item gemMorgaite;
    public static Item gemRedberyl;
    public static ItemElectric cap10F;

    public static void init() {

        cap10F = new Itemcapacitor10F(ItemIds.capacitor10F);
        ingotBeryllium = new ItemingotBerylium(ItemIds.ingotBerylium);
        ingotLithium = new ItemingotLithium(ItemIds.ingotLithium);
        gemMorganite = new ItemgemMorganite(ItemIds.gemMorganite);
        gemGoldenberyl = new ItemgemGoldenberyl(ItemIds.gemGoldenberyl);
        gemAquamarine = new ItemgemAquamarine(ItemIds.gemAquamarine);
        gemRedberyl = new ItemgemRedberyl(ItemIds.gemRedberyl);

        LanguageRegistry.addName(ingotLithium, "Lithium Ingot");
        LanguageRegistry.addName(cap10F, "Capacitor 10Farads");
        LanguageRegistry.addName(ingotBeryllium, "Beryllium Ingot");
        LanguageRegistry.addName(gemMorganite, "Morganite");
        LanguageRegistry.addName(gemGoldenberyl, "Golden Beryl");
        LanguageRegistry.addName(gemAquamarine, "Aquamarine");
        LanguageRegistry.addName(gemRedberyl, "Red beryl");

    }

    public static void oreRegistration() {
        OreDictionary.registerOre("ingotLithium", new ItemStack(ingotLithium));
        OreDictionary.registerOre("ingotBeryllium", new ItemStack(
                ingotBeryllium));
    }

}
