package net.krezzr.modernsurvival.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.krezzr.modernsurvival.ModernSurvival;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item PLANT_FIBER = registerItem("plant_fiber",
            new Item(new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTAB)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ModernSurvival.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ModernSurvival.LOGGER.info("Registering Mod Items for " + ModernSurvival.MOD_ID);
    }

}
