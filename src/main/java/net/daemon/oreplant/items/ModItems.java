package net.daemon.oreplant.items;

import net.daemon.oreplant.OrePlant;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.daemon.oreplant.blocks.ModBlock;

public class ModItems {

    // -> General Items <-

    public static final Item IRON_DUST = new Item(new FabricItemSettings()
    .group(OrePlant.OREPLANT_ITEM_GROUP));

    public static final Item GOLD_DUST = new Item(new FabricItemSettings()
    .group(OrePlant.OREPLANT_ITEM_GROUP));

    // -> Seed Items <-

    public static final Item IRON_SEED_ITEM = new AliasedBlockItem(
        ModBlock.IRON_CROP_BLOCK, new Item.Settings()
        .group(OrePlant.OREPLANT_ITEM_GROUP));

    public static final Item GOLD_SEED_ITEM = new AliasedBlockItem(
        ModBlock.IRON_CROP_BLOCK, new Item.Settings()
        .group(OrePlant.OREPLANT_ITEM_GROUP));

    public static void registerItems() {

        //Seed Items Register
        Registry.register(
            Registry.ITEM, new Identifier(
                OrePlant.MOD_ID, "iron_seed_item"), IRON_SEED_ITEM);

        Registry.register(
            Registry.ITEM, new Identifier(
                OrePlant.MOD_ID, "gold_seed_item"), GOLD_SEED_ITEM);


        //Normal Items Register
        Registry.register(
            Registry.ITEM, new Identifier(
                OrePlant.MOD_ID, "iron_dust"), IRON_DUST);

        Registry.register(
            Registry.ITEM, new Identifier(
                OrePlant.MOD_ID, "gold_dust"), GOLD_DUST);
    }

}