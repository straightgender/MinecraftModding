package net.straight.first;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final String id = "first";
    public static final Logger LOGGER = LoggerFactory.getLogger(id);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}