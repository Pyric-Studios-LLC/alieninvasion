package dev.criosage.alieninvasion.entity.model;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.SkeekEntity;
import dev.criosage.alieninvasion.entity.custom.SklomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SklomModel extends AnimatedGeoModel<SklomEntity> {
    @Override
    public Identifier getModelResource(SklomEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "geo/sklom.geo.json");
    }

    @Override
    public Identifier getTextureResource(SklomEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/sklom_texture.png");
    }

    @Override
    public Identifier getAnimationResource(SklomEntity animatable) {
        return new Identifier(AlienInvasion.MOD_ID, "animations/sklom.animation.json");
    }
}
