package net.krezzr.modernsurvival.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.krezzr.modernsurvival.ModernSurvival;
import net.krezzr.modernsurvival.item.custom.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

//    Emerald tools
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe",
            new ModPickaxeItem(ModToolMaterials.EMERALD, 3, 2f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));
    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            new ModAxeItem(ModToolMaterials.EMERALD, 8, 1f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe",
            new ModHoeItem(ModToolMaterials.EMERALD, 3, 2f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel",
            new ShovelItem(ModToolMaterials.EMERALD, 3, 2f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));
    public static final Item EMERALD_SWORD = registerItem("emerald_sword",
            new SwordItem(ModToolMaterials.EMERALD, 6, 3f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));

//    Emerald custom tools
    public static final Item EMERALD_BOW = registerItem("emerald_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB).maxDamage(1534)));
    public static final Item EMERALD_MULTI_TOOLS = registerItem("emerald_multi_tools",
            new ModMultiToolsItem(ModToolMaterials.EMERALD, 3, 3f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));

//    Emerald Armor
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALARMORSTAB)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALARMORSTAB)));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALARMORSTAB)));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALARMORSTAB)));
    public static final Item EMERALD_HORSE_ARMOR = registerItem("emerald_horse_armor",
            new HorseArmorItem(15, "emerald", new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALARMORSTAB)));





    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ModernSurvival.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ModernSurvival.LOGGER.info("Registering Mod Items for " + ModernSurvival.MOD_ID);
    }

}
