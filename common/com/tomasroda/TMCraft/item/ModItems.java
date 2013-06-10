package com.tomasroda.TMCraft.item;
/**
 * @author Tomás Martins
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import universalelectricity.core.item.ItemElectric;

import com.tomasroda.TMCraft.lib.ItemIds;

import cpw.mods.fml.common.registry.GameRegistry;
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
    public static Item ingotCopper;
    public static Item ingotTin;

    public static void init() {

        cap10F = new Itemcapacitor10F(ItemIds.capacitor10F);
        ingotBeryllium = new ItemingotBerylium(ItemIds.ingotBerylium);
        ingotLithium = new ItemingotLithium(ItemIds.ingotLithium);
        gemMorganite = new ItemgemMorganite(ItemIds.gemMorganite);
        gemGoldenberyl = new ItemgemGoldenberyl(ItemIds.gemGoldenberyl);
        gemAquamarine = new ItemgemAquamarine(ItemIds.gemAquamarine);
        gemRedberyl = new ItemgemRedberyl(ItemIds.gemRedberyl);
        ingotCopper = new ItemingotCopper(ItemIds.ingotCopper);
        ingotTin = new ItemingotTin(ItemIds.ingotTin);
        LanguageRegistry.addName(ingotLithium, "Lithium Ingot");
        LanguageRegistry.addName(cap10F, "Capacitor 10Farads");
        LanguageRegistry.addName(ingotBeryllium, "Beryllium Ingot");
        LanguageRegistry.addName(gemMorganite, "Morganite");
        LanguageRegistry.addName(gemGoldenberyl, "Golden Beryl");
        LanguageRegistry.addName(gemAquamarine, "Aquamarine");
        LanguageRegistry.addName(gemRedberyl, "Red beryl");
        LanguageRegistry.addName(ingotCopper, "Copper Ingot");
        LanguageRegistry.addName(ingotTin, "Tin Ingot");

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cap10F),
                new Object[] { "ipi", 'p', Item.paper, 'i', Item.ingotIron }));

    }

    public static void oreRegistration() {
        OreDictionary.registerOre("ingotLithium", new ItemStack(ingotLithium));
        OreDictionary.registerOre("ingotBeryllium", new ItemStack(
                ingotBeryllium));
        OreDictionary.registerOre("ingotCopper", new ItemStack(ingotCopper));
        OreDictionary.registerOre("ingotTin", new ItemStack(ingotTin));
    }

}
