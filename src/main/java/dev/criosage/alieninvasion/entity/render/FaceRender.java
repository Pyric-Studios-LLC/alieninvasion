package dev.criosage.alieninvasion.entity.render;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.CrusidEntity;
import dev.criosage.alieninvasion.entity.custom.FaceEntity;
import dev.criosage.alieninvasion.entity.model.CrusidModel;
import dev.criosage.alieninvasion.entity.model.FaceModel;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class FaceRender extends GeoEntityRenderer<FaceEntity> {
    public FaceRender(EntityRendererFactory.Context ctx) {
        super(ctx, new FaceModel());
        this.shadowRadius = 0.4f;
    }
    @Override
    public Identifier getTextureResource(FaceEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/face_texture.png");
    }

    @Override
    public RenderLayer getRenderType(FaceEntity animatable, float partialTicks, MatrixStack stack,
                                     @Nullable VertexConsumerProvider renderTypeBuffer,
                                     @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                     Identifier textureLocation) {
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
