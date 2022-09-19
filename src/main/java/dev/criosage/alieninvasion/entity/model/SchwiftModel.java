package dev.criosage.alieninvasion.entity.model;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.CrusidEntity;
import dev.criosage.alieninvasion.entity.custom.SchwiftEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SchwiftModel extends AnimatedGeoModel<SchwiftEntity> {
    @Override
    public Identifier getModelResource(SchwiftEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "geo/schwift.geo.json");
    }

    @Override
    public Identifier getTextureResource(SchwiftEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/schwift_texture.png");
    }

    @Override
    public Identifier getAnimationResource(SchwiftEntity animatable) {
        return new Identifier(AlienInvasion.MOD_ID, "animations/schwift.animation.json");
    }
}
