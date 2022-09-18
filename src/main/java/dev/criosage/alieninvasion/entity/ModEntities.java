package dev.criosage.alieninvasion.entity;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.CrusidEntity;
import dev.criosage.alieninvasion.entity.custom.IlgoidEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<IlgoidEntity> ILGOID = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "ilgoid"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, IlgoidEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build()
    );
    public static final EntityType<CrusidEntity> CRUSID = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "crusid"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CrusidEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build()
    );

    public static void registerModEntities() {
        AlienInvasion.LOGGER.debug("Registering mod entities for " + AlienInvasion.MOD_ID);
    }
}
