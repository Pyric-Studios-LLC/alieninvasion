package dev.criosage.alieninvasion.entity.model;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.MutantCrusidEntity;
import dev.criosage.alieninvasion.entity.custom.MutantIlgoidEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MutantCrusidModel extends AnimatedGeoModel<MutantCrusidEntity> {
    @Override
    public Identifier getModelResource(MutantCrusidEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "geo/mutant_crusid.geo.json");
    }

    @Override
    public Identifier getTextureResource(MutantCrusidEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/mutant_crusid_texture.png");
    }

    @Override
    public Identifier getAnimationResource(MutantCrusidEntity animatable) {
        return new Identifier(AlienInvasion.MOD_ID, "animations/mutant_crusid.animation.json");
    }
}
