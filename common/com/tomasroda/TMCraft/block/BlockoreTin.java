package com.tomasroda.TMCraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockoreTin extends Block {

    public BlockoreTin(int id) {
        super(id, Material.rock);
        setHardness(2.0F); 
        setStepSound(Block.soundStoneFootstep);
        this.setUnlocalizedName("oreTin");
        setCreativeTab(CreativeTabs.tabBlock);
    }
    @Override
    public void registerIcons(IconRegister oreBeryl) {
        blockIcon = oreBeryl.registerIcon("TMCraft:oreTin");
    }
    
}