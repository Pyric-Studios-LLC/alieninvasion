package dev.criosage.alieninvasion.entity.model;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.SchmobEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SchmobModel extends AnimatedGeoModel<SchmobEntity> {
    @Override
    public Identifier getModelResource(SchmobEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "geo/schmob.geo.json");
    }

    @Override
    public Identifier getTextureResource(SchmobEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/schmob_texture.png");
    }

    @Override
    public Identifier getAnimationResource(SchmobEntity animatable) {
        return new Identifier(AlienInvasion.MOD_ID, "animations/schmob.animation.json");
    }
}
