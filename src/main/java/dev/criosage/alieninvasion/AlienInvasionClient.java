package dev.criosage.alieninvasion;

import dev.criosage.alieninvasion.entity.ModEntities;
import dev.criosage.alieninvasion.entity.render.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AlienInvasionClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.ILGOID, IlgoidRender::new);
        EntityRendererRegistry.register(ModEntities.CRUSID, CrusidRender::new);
        EntityRendererRegistry.register(ModEntities.SKEEK, SkeekRender::new);
        EntityRendererRegistry.register(ModEntities.SKLOM, SklomRender::new);
        EntityRendererRegistry.register(ModEntities.SCHWIFT, SchwiftRender::new);
        EntityRendererRegistry.register(ModEntities.FACE, FaceRender::new);

        EntityRendererRegistry.register(ModEntities.MUTANT_ILGOID, MutantIlgoidRender::new);
        EntityRendererRegistry.register(ModEntities.MUTANT_CRUSID, MutantCrusidRender::new);
        EntityRendererRegistry.register(ModEntities.MUTANT_SKLOM, MutantSklomRender::new);
    }
}
