package com.tomasroda.TMCraft.core.handlers;

import java.util.Random;

import com.tomasroda.TMCraft.block.ModBlocks;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenerator implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {
    }

    private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        for(int k = 0; k < 4; k++){
            int oreAquamarineXCoord = chunkX + rand.nextInt(16);
            int oreAquamarineYCoord = rand.nextInt(15);
            int oreAquamarineZCoord = chunkZ + rand.nextInt(16);
            
            int oreGoldenberylXCoord = chunkX + rand.nextInt(16);
            int oreGoldenberylYCoord = rand.nextInt(15);
            int oreGoldenberylZCoord = chunkZ + rand.nextInt(16);
            
            int oreMorganiteXCoord = chunkX + rand.nextInt(16);
            int oreMorganiteYCoord = rand.nextInt(15);
            int oreMorganiteZCoord = chunkZ + rand.nextInt(16);
            
            int oreRedberylXCoord = chunkX + rand.nextInt(16);
            int oreRedberylYCoord = rand.nextInt(15);
            int oreRedberylZCoord = chunkZ + rand.nextInt(16);
                
            new WorldGenMinable(ModBlocks.oreAquamarine.blockID, 5).generate(world, rand, oreAquamarineXCoord, oreAquamarineYCoord, oreAquamarineZCoord);
            new WorldGenMinable(ModBlocks.oreGoldenberyl.blockID, 5).generate(world, rand, oreGoldenberylXCoord, oreGoldenberylYCoord, oreGoldenberylZCoord);
            new WorldGenMinable(ModBlocks.oreMorganite.blockID, 5).generate(world, rand, oreMorganiteXCoord, oreMorganiteYCoord, oreMorganiteZCoord);
            new WorldGenMinable(ModBlocks.oreRedberyl.blockID, 5).generate(world, rand, oreRedberylXCoord, oreRedberylYCoord, oreRedberylZCoord);
       
        }
        
        for(int c = 0; c < 20; c++){
            int oreCopperXCoord = chunkX + rand.nextInt(16);
            int oreCopperYCoord = rand.nextInt(50);
            int oreCopperZCoord = chunkZ + rand.nextInt(16);   
            new WorldGenMinable(ModBlocks.oreCopper.blockID, 10).generate(world, rand, oreCopperXCoord, oreCopperYCoord, oreCopperZCoord);
         
        }
        
        
        for(int t = 0; t < 10; t++){
            int oreTinXCoord = chunkX + rand.nextInt(16);
            int oreTinYCoord = rand.nextInt(40);
            int oreTinZCoord = chunkZ + rand.nextInt(16);   
            new WorldGenMinable(ModBlocks.oreTin.blockID, 10).generate(world, rand, oreTinXCoord, oreTinYCoord, oreTinZCoord);
         
        }

  

    }

    private void generateNether(World world, Random rand, int chunkX, int chunkZ) {
    }
}