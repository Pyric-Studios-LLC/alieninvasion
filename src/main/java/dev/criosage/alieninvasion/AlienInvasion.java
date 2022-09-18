package dev.criosage.alieninvasion;

import dev.criosage.alieninvasion.entity.ModEntities;
import dev.criosage.alieninvasion.entity.custom.SchmobEntity;
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

		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.SCHMOB, SchmobEntity.setAttributes());

		LOGGER.info("Alien Invasion Initialized.");
	}
}
