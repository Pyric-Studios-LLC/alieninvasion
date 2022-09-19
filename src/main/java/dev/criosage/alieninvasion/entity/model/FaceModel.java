package dev.criosage.alieninvasion.entity.model;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.FaceEntity;
import dev.criosage.alieninvasion.entity.custom.IlgoidEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FaceModel extends AnimatedGeoModel<FaceEntity> {
    @Override
    public Identifier getModelResource(FaceEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "geo/face.geo.json");
    }

    @Override
    public Identifier getTextureResource(FaceEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/face_texture.png");
    }

    @Override
    public Identifier getAnimationResource(FaceEntity animatable) {
        return new Identifier(AlienInvasion.MOD_ID, "animations/face.animation.json");
    }
}
