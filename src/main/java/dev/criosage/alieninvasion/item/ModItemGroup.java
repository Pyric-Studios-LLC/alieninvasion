package dev.criosage.alieninvasion.item;

import dev.criosage.alieninvasion.AlienInvasion;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ALIENS = FabricItemGroupBuilder.build(
            new Identifier(AlienInvasion.MOD_ID, "alieninvasiongroup"), () -> new ItemStack(ModItems.ILGOID_SPAWN_EGG));

    public static void registerModItemGroups() {
        AlienInvasion.LOGGER.debug("Registering mod item groups for " + AlienInvasion.MOD_ID);
    }
}
