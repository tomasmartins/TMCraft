package com.tomasroda.TMCraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

import com.tomasroda.TMCraft.item.ModItems;

public class BlockoreGoldenberyl extends Block {

    public BlockoreGoldenberyl(int id) {
        super(id, Material.rock);
        setHardness(2.0F); 
        setStepSound(Block.soundStoneFootstep);
        this.setUnlocalizedName("oreGoldenberyl");
        setCreativeTab(CreativeTabs.tabBlock);
    }
    @Override
    public void registerIcons(IconRegister oreGoldenberyl) {
        blockIcon = oreGoldenberyl.registerIcon("TMCraft:oreGoldenberyl");
    }
    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return ModItems.gemGoldenberyl.itemID;
    }
    @Override
    public int quantityDropped(Random par1Random) {
        return 1 + par1Random.nextInt(2);
    }
}
