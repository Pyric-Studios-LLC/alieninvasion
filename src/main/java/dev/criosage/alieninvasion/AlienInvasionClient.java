package dev.criosage.alieninvasion;

import dev.criosage.alieninvasion.entity.ModEntities;
import dev.criosage.alieninvasion.entity.render.SchmobRender;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AlienInvasionClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.SCHMOB, SchmobRender::new);
    }
}
