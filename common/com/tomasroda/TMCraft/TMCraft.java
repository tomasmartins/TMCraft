package com.tomasroda.TMCraft;

import com.tomasroda.TMCraft.block.ModBlocks;
import com.tomasroda.TMCraft.core.handlers.WorldGenerator;
import com.tomasroda.TMCraft.core.proxy.CommonProxy;
import com.tomasroda.TMCraft.item.ModItems;
import com.tomasroda.TMCraft.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class TMCraft {

    public static final String RESOURCE_PATH = "/mods/TMCraft/";
    public static String CHANNEL = "";
    public static final String TEXTURE_DIRECTORY = RESOURCE_PATH + "textures/";
    public static final String GUI_DIRECTORY = TEXTURE_DIRECTORY + "gui/";
    public static final String BLOCK_TEXTURE_DIRECTORY = TEXTURE_DIRECTORY
            + "blocks/";
    public static final String ITEM_TEXTURE_DIRECTORY = TEXTURE_DIRECTORY
            + "items/";
    public static final String MODEL_TEXTURE_DIRECTORY = TEXTURE_DIRECTORY
            + "models/";
    public static final String TEXTURE_NAME_PREFIX = "TMCraft:";

    @Instance(Reference.MOD_ID)
    public static TMCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        // Stub Method
        ModItems.init();
        ModBlocks.init();

    }

    @Init
    public void init(FMLInitializationEvent event) {

        GameRegistry.registerWorldGenerator(new WorldGenerator());

    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        // Stub Method
    }

}
