package dev.criosage.alieninvasion.item;

import dev.criosage.alieninvasion.AlienInvasion;
import dev.criosage.alieninvasion.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ILGOID_SPAWN_EGG = Registry.register(
            Registry.ITEM,
            new Identifier(AlienInvasion.MOD_ID, "ilgoid_spawn_egg"),
            new SpawnEggItem(ModEntities.ILGOID, 0xadffb6, 0x437b8e,
                    new FabricItemSettings().group(ModItemGroup.ALIENS))
    );
    public static final Item CRUSID_SPAWN_EGG = Registry.register(
            Registry.ITEM,
            new Identifier(AlienInvasion.MOD_ID, "crusid_spawn_egg"),
            new SpawnEggItem(ModEntities.CRUSID, 0x49403a, 0x80be61,
                    new FabricItemSettings().group(ModItemGroup.ALIENS))
    );
    public static final Item SKEEK_SPAWN_EGG = Registry.register(
            Registry.ITEM,
            new Identifier(AlienInvasion.MOD_ID, "skeek_spawn_egg"),
            new SpawnEggItem(ModEntities.SKEEK, 0x999968, 0x574b82,
                    new FabricItemSettings().group(ModItemGroup.ALIENS))
    );
    public static final Item SKLOM_SPAWN_EGG = Registry.register(
            Registry.ITEM,
            new Identifier(AlienInvasion.MOD_ID, "sklom_spawn_egg"),
            new SpawnEggItem(ModEntities.SKLOM, 0x281b1b, 0xffa066,
                    new FabricItemSettings().group(ModItemGroup.ALIENS))
    );
    public static final Item MUTANT_SPAWN_EGG = Registry.register(
            Registry.ITEM,
            new Identifier(AlienInvasion.MOD_ID, "mutant_spawn_egg"),
            new SpawnEggItem(ModEntities.MUTANT, 0x437b8e, 0xadffb6,
                    new FabricItemSettings().group(ModItemGroup.ALIENS))
    );
    public static final Item SCHWIFT_SPAWN_EGG = Registry.register(
            Registry.ITEM,
            new Identifier(AlienInvasion.MOD_ID, "schwift_spawn_egg"),
            new SpawnEggItem(ModEntities.SCHWIFT, 0x585868, 0xc0c097,
                    new FabricItemSettings().group(ModItemGroup.ALIENS))
    );
    public static final Item FACE_SPAWN_EGG = Registry.register(
            Registry.ITEM,
            new Identifier(AlienInvasion.MOD_ID, "face_spawn_egg"),
            new SpawnEggItem(ModEntities.FACE, 0xe5d9c2, 0x604f30,
                    new FabricItemSettings().group(ModItemGroup.ALIENS))
    );
    public static void registerModItems() {
        AlienInvasion.LOGGER.debug("Registering mod items for " + AlienInvasion.MOD_ID);
    }
}
