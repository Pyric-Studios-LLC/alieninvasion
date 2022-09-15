package dev.criosage.alieninvasion;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlienInvasion implements ModInitializer {
	public static final String MOD_ID = "alieninvasion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Alien Invasion.");
		LOGGER.info("Alien Invasion Initialized.");
	}
}
