package dev.criosage.alieninvasion.entity.model;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.CrusidEntity;
import dev.criosage.alieninvasion.entity.custom.SkeekEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SkeekModel extends AnimatedGeoModel<SkeekEntity> {
    @Override
    public Identifier getModelResource(SkeekEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "geo/skeek.geo.json");
    }

    @Override
    public Identifier getTextureResource(SkeekEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/skeek_texture.png");
    }

    @Override
    public Identifier getAnimationResource(SkeekEntity animatable) {
        return new Identifier(AlienInvasion.MOD_ID, "animations/skeek.animation.json");
    }
}
