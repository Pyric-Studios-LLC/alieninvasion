package dev.criosage.alieninvasion.entity.model;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.MutantIlgoidEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MutantIlgoidModel extends AnimatedGeoModel<MutantIlgoidEntity> {
    @Override
    public Identifier getModelResource(MutantIlgoidEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "geo/mutant_ilgoid.geo.json");
    }

    @Override
    public Identifier getTextureResource(MutantIlgoidEntity object) {
        return new Identifier(AlienInvasion.MOD_ID, "textures/entity/mutant_ilgoid_texture.png");
    }

    @Override
    public Identifier getAnimationResource(MutantIlgoidEntity animatable) {
        return new Identifier(AlienInvasion.MOD_ID, "animations/mutant_ilgoid.animation.json");
    }
}
