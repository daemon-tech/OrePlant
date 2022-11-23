package net.daemon.oreplant;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.daemon.oreplant.blocks.ModBlock.IRON_CROP_BLOCK;
import net.daemon.oreplant.blocks.ModBlock;
import net.daemon.oreplant.items.ModItems;

public class OrePlant implements ModInitializer {

	public static final String MOD_ID = "oreplant";
	public static final String MODNAME = "OrePlant";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODNAME);

	//ItemGroup COTTON_ITEM_GROUP
	public static final ItemGroup OREPLANT_ITEM_GROUP = FabricItemGroupBuilder.create(
				new Identifier(OrePlant.MOD_ID, "oreplant_item_group"))
                .icon(() -> new ItemStack(Items.BOWL))
                .build();

	@Override
	public void onInitialize() {

		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), IRON_CROP_BLOCK);

		ModItems.registerItems();
		ModBlock.registerBlock();

		LOGGER.info(MODNAME + "Loading now! Thanks for installing! <3");
	}
}
