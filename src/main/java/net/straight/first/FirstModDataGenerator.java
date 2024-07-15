package net.straight.first;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.straight.first.data.provider.FirstModBlockLootTableProvider;
import net.straight.first.data.provider.FirstModBlockTagProvider;
import net.straight.first.data.provider.FirstModModelProvider;

public class FirstModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		// pack.addProvider((output, registriesFuture) -> new FirstModModelProvider(output));
		pack.addProvider(FirstModModelProvider::new);
		pack.addProvider(FirstModBlockLootTableProvider::new);
		pack.addProvider(FirstModBlockTagProvider::new);
	}
}