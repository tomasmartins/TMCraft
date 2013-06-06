package com.tomasroda.TMCraft.core.proxy;

import net.minecraftforge.client.MinecraftForgeClient;
import com.tomasroda.TMCraft.core.proxy.CommonProxy;
public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
            
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        }
        
        
}