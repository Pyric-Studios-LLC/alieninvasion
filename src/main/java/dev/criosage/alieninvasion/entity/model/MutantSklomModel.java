package dev.criosage.alieninvasion.entity.model;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.MutantCrusidEntity;
import dev.criosage.alieninvasion.entity.custom.MutantSklomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MutantSklomModel extends AnimatedGeoModel<MutantSklomEntity> {
    @Override
    public Identifier getModelResource(MutantSklomEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "geo/mutant_sklom.geo.json");
    }

    @Override
    public Identifier getTextureResource(MutantSklomEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/mutant_sklom_texture.png");
    }

    @Override
    public Identifier getAnimationResource(MutantSklomEntity animatable) {
        return new Identifier(AlienInvasion.MOD_ID, "animations/mutant_sklom.animation.json");
    }
}
