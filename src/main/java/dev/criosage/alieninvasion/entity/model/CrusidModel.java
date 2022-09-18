package dev.criosage.alieninvasion.entity.model;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.CrusidEntity;
import dev.criosage.alieninvasion.entity.custom.IlgoidEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CrusidModel extends AnimatedGeoModel<CrusidEntity> {
    @Override
    public Identifier getModelResource(CrusidEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "geo/crusid.geo.json");
    }

    @Override
    public Identifier getTextureResource(CrusidEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/crusid_texture.png");
    }

    @Override
    public Identifier getAnimationResource(CrusidEntity animatable) {
        return new Identifier(AlienInvasion.MOD_ID, "animations/crusid.animation.json");
    }
}
