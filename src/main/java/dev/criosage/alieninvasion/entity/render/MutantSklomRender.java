package dev.criosage.alieninvasion.entity.render;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.MutantCrusidEntity;
import dev.criosage.alieninvasion.entity.custom.MutantSklomEntity;
import dev.criosage.alieninvasion.entity.model.MutantCrusidModel;
import dev.criosage.alieninvasion.entity.model.MutantSklomModel;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MutantSklomRender extends GeoEntityRenderer<MutantSklomEntity> {
    public MutantSklomRender(EntityRendererFactory.Context ctx) {
        super(ctx, new MutantSklomModel());
        this.shadowRadius = 0.4f;
    }
    @Override
    public Identifier getTextureResource(MutantSklomEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/mutant_sklom_texture.png");
    }

    @Override
    public RenderLayer getRenderType(MutantSklomEntity animatable, float partialTicks, MatrixStack stack,
                                     @Nullable VertexConsumerProvider renderTypeBuffer,
                                     @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                     Identifier textureLocation) {
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
