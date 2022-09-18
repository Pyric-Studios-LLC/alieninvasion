package dev.criosage.alieninvasion.entity.model;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.IlgoidEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IlgoidModel extends AnimatedGeoModel<IlgoidEntity> {
    @Override
    public Identifier getModelResource(IlgoidEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "geo/ilgoid.geo.json");
    }

    @Override
    public Identifier getTextureResource(IlgoidEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/ilgoid_texture.png");
    }

    @Override
    public Identifier getAnimationResource(IlgoidEntity animatable) {
        return new Identifier(AlienInvasion.MOD_ID, "animations/ilgoid.animation.json");
    }
}
