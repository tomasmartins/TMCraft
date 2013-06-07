package com.tomasroda.TMCraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

import com.tomasroda.TMCraft.item.ModItems;

public class BlockoreMorganite extends Block {

    public BlockoreMorganite (int id) {
        super(id, Material.rock);
        setHardness(2.0F); 
        setStepSound(Block.soundStoneFootstep);
        this.setUnlocalizedName("oreMorganite");
        setCreativeTab(CreativeTabs.tabBlock);
    }
    @Override
    public void registerIcons(IconRegister oreBeryl) {
        blockIcon = oreBeryl.registerIcon("TMCraft:oreMorganite");
    }
    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return ModItems.gemMorganite.itemID;
    }
    @Override
    public int quantityDropped(Random par1Random) {
        return 1 + par1Random.nextInt(2);
    }
}
