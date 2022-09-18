package dev.criosage.alieninvasion;

import dev.criosage.alieninvasion.entity.ModEntities;
import dev.criosage.alieninvasion.entity.custom.IlgoidEntity;
import dev.criosage.alieninvasion.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class AlienInvasion implements ModInitializer {
	public static final String MOD_ID = "alieninvasion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Alien Invasion.");

		ModEntities.registerModEntities();
		ModItems.registerModItems();

		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.ILGOID, IlgoidEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.CRUSID, IlgoidEntity.setAttributes());

		LOGGER.info("Alien Invasion Initialized.");
	}
}
