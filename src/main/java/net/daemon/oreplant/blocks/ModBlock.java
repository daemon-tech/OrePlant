package net.daemon.oreplant.blocks;

import net.daemon.oreplant.OrePlant;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock {

    // Crop Blocks

    public static final IronCropBlock IRON_CROP_BLOCK = new IronCropBlock(
        AbstractBlock.Settings
        .of(Material.PLANT).nonOpaque().noCollision().ticksRandomly()
        .breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final GoldCropBlock GOLD_CROP_BLOCK = new GoldCropBlock(
        AbstractBlock.Settings
        .of(Material.PLANT).nonOpaque().noCollision().ticksRandomly()
        .breakInstantly().sounds(BlockSoundGroup.CROP));
    
    public static final DiamondCropBlock DIAMOND_CROP_BLOCK = new DiamondCropBlock(
        AbstractBlock.Settings
        .of(Material.PLANT).nonOpaque().noCollision().ticksRandomly()
        .breakInstantly().sounds(BlockSoundGroup.CROP));
    

    // Crop Blocks Register

    public static void registerBlock() {

        //Block Register

        Registry.register(Registry.BLOCK, new Identifier(
            OrePlant.MOD_ID, "iron_crop_block"),IRON_CROP_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(
            OrePlant.MOD_ID, "gold_crop_block"),GOLD_CROP_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(
            OrePlant.MOD_ID, "diamond_crop_block"),DIAMOND_CROP_BLOCK);
    }

}