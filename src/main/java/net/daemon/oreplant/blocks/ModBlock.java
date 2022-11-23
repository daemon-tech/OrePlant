package net.daemon.oreplant.blocks;

import net.daemon.oreplant.OrePlant;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock {
    public static final IronCropBlock IRON_CROP_BLOCK = new IronCropBlock(
        AbstractBlock.Settings
        .of(Material.PLANT).nonOpaque().noCollision().ticksRandomly()
        .breakInstantly().sounds(BlockSoundGroup.CROP));
    

    public static void registerBlock() {
        //Block Register
        Registry.register(Registry.BLOCK, new Identifier(
            OrePlant.MOD_ID, "iron_crop_block"),IRON_CROP_BLOCK);
    }

}