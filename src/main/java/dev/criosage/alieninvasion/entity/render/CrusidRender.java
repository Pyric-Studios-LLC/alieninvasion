package dev.criosage.alieninvasion.entity.render;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.CrusidEntity;
import dev.criosage.alieninvasion.entity.custom.IlgoidEntity;
import dev.criosage.alieninvasion.entity.model.CrusidModel;
import dev.criosage.alieninvasion.entity.model.IlgoidModel;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CrusidRender extends GeoEntityRenderer<CrusidEntity> {
    public CrusidRender(EntityRendererFactory.Context ctx) {
        super(ctx, new CrusidModel());
        this.shadowRadius = 0.4f;
    }
    @Override
    public Identifier getTextureResource(CrusidEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/crusid_texture.png");
    }

    @Override
    public RenderLayer getRenderType(CrusidEntity animatable, float partialTicks, MatrixStack stack,
                                     @Nullable VertexConsumerProvider renderTypeBuffer,
                                     @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                     Identifier textureLocation) {
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
