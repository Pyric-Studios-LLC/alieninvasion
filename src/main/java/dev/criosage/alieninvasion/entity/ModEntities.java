package dev.criosage.alieninvasion.entity;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.SchmobEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<SchmobEntity> SCHMOB = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "schmob"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SchmobEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build()
    );
}