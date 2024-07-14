package net.straight.first;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.initializer.Blocks;
import net.initializer.ItemGroups;
import net.initializer.Items;
import net.minecraft.util.Identifier;

import java.util.logging.Logger;

public class FirstMod implements ModInitializer {

	Logger logger = Logger.getLogger("FirstMod");
	public static final String id = "first";

	@Override
	public void onInitialize() {

	logger.info("Starting Fabric ...");
		Items.load();
		Blocks.load();
		ItemGroups.load();

		// Adding item to a vanilla item group
		ItemGroupEvents.modifyEntriesEvent(net.minecraft.item.ItemGroups.FOOD_AND_DRINK).register(
				entries -> {
					// entries.add(Items.TUNA); // Adds randomly
					entries.addAfter(net.minecraft.item.Items.BEETROOT_SOUP, Items.TUNA); // adds after
				}
		);
	}

	public static Identifier id(String path){
		return Identifier.of(id, path);
	}

}