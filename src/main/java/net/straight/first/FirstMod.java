package net.straight.first;

import net.fabricmc.api.ModInitializer;
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

	}

	public static Identifier id(String path){
		return Identifier.of(id, path);
	}

}