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
                    .dimensions(EntityDimensions.fixed(0.4f, 1.75f)).build()
    );
    public static final EntityType<CrusidEntity> CRUSID = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "crusid"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CrusidEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 2.0f)).build()
    );
    public static final EntityType<SkeekEntity> SKEEK = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "skeek"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SkeekEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 2.25f)).build()
    );
    public static final EntityType<SklomEntity> SKLOM = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "sklom"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SklomEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 1.75f)).build()
    );
    public static final EntityType<SchwiftEntity> SCHWIFT = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "schwift"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SchwiftEntity::new)
                    .dimensions(EntityDimensions.fixed(1.2f, 1.5f)).build()
    );
    public static final EntityType<FaceEntity> FACE = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "face"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FaceEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.0f)).build()
    );
    public static final EntityType<MutantIlgoidEntity> MUTANT_ILGOID = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "mutant_ilgoid"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MutantIlgoidEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 3.25f)).build()
    );
    public static final EntityType<MutantCrusidEntity> MUTANT_CRUSID = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "mutant_crusid"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MutantCrusidEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 3f)).build()
    );
    public static final EntityType<MutantSklomEntity> MUTANT_SKLOM = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AlienInvasion.MOD_ID, "mutant_sklom"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MutantSklomEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 2.75f)).build()
    );
    public static void registerModEntities() {
        AlienInvasion.LOGGER.debug("Registering mod entities for " + AlienInvasion.MOD_ID);
    }
}
