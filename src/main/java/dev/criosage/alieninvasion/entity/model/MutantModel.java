package dev.criosage.alieninvasion.entity.model;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.CrusidEntity;
import dev.criosage.alieninvasion.entity.custom.MutantEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MutantModel extends AnimatedGeoModel<MutantEntity> {
    @Override
    public Identifier getModelResource(MutantEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "geo/mutant.geo.json");
    }

    @Override
    public Identifier getTextureResource(MutantEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/mutant_texture.png");
    }

    @Override
    public Identifier getAnimationResource(MutantEntity animatable) {
        return new Identifier(AlienInvasion.MOD_ID, "animations/mutant.animation.json");
    }
}
