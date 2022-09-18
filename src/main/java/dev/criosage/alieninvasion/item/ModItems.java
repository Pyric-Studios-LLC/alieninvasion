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
            new SpawnEggItem(ModEntities.ILGOID, 0x22b341, 0x19732e,
                    new FabricItemSettings().group(ModItemGroup.ALIENS))
    );
    public static final Item CRUSID_SPAWN_EGG = Registry.register(
            Registry.ITEM,
            new Identifier(AlienInvasion.MOD_ID, "crusid_spawn_egg"),
            new SpawnEggItem(ModEntities.CRUSID, 0x22b341, 0x19732e,
                    new FabricItemSettings().group(ModItemGroup.ALIENS))
    );

    public static void registerModItems() {
        AlienInvasion.LOGGER.debug("Registering mod items for " + AlienInvasion.MOD_ID);
    }
}
