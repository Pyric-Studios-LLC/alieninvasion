package dev.criosage.alieninvasion.entity;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.custom.*;
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
    public static final EntityType<SkeekEntity> SKEEK = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "skeek"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SkeekEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build()
    );
    public static final EntityType<SklomEntity> SKLOM = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "sklom"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SklomEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build()
    );
    public static final EntityType<MutantEntity> MUTANT = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "mutant"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MutantEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build()
    );
    public static final EntityType<SchwiftEntity> SCHWIFT = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "schwift"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SchwiftEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build()
    );
    public static final EntityType<FaceEntity> FACE = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "face"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FaceEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build()
    );
    public static void registerModEntities() {
        AlienInvasion.LOGGER.debug("Registering mod entities for " + AlienInvasion.MOD_ID);
    }
}
