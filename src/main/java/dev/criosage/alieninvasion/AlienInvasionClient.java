package dev.criosage.alieninvasion;

import dev.criosage.alieninvasion.entity.ModEntities;
import dev.criosage.alieninvasion.entity.render.CrusidRender;
import dev.criosage.alieninvasion.entity.render.IlgoidRender;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AlienInvasionClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.ILGOID, IlgoidRender::new);
        EntityRendererRegistry.register(ModEntities.CRUSID, CrusidRender::new);
    }
}
