package net.daemon.oreplant;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.util.Identifier;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrePlant implements ModInitializer {

	public static final String MOD_ID = "oreplant";

	//ItemGroup COTTON_ITEM_GROUP
	public static final ItemGroup COTTON_ITEM_GROUP = FabricItemGroupBuilder.create(
				new Identifier(OrePlant.MOD_ID, "oreplant_item_group"))
                .icon(() -> new ItemStack(Items.WHEAT))
                .build();

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		LOGGER.info("OrePlants says Hello!");
	}
}
