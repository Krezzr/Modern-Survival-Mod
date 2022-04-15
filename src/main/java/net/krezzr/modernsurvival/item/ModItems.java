package net.krezzr.modernsurvival.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.krezzr.modernsurvival.ModernSurvival;
import net.krezzr.modernsurvival.item.custom.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //    Wooden custom tools
    public static final Item WOODEN_MULTI_TOOLS = registerItem("wooden_multi_tools",
            new ModMultiToolsItem(ToolMaterials.WOOD, 6, -3.4f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB).maxDamage(177)));

    //    Stone custom tools
    public static final Item STONE_MULTI_TOOLS = registerItem("stone_multi_tools",
            new ModMultiToolsItem(ToolMaterials.STONE, 7, -3.4f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB).maxDamage(393)));

    //    Iron custom tools
    public static final Item IRON_MULTI_TOOLS = registerItem("iron_multi_tools",
            new ModMultiToolsItem(ToolMaterials.IRON, 6, -3.3f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB).maxDamage(750)));
    public static final Item IRON_BOW = registerItem("iron_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALWEAPONSTAB).maxDamage(1627)));

    //    Gold custom tools
    public static final Item GOLDEN_MULTI_TOOLS = registerItem("golden_multi_tools",
            new ModMultiToolsItem(ToolMaterials.GOLD, 6, -3.2f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB).maxDamage(96)));
    public static final Item GOLDEN_BOW = registerItem("golden_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALWEAPONSTAB).maxDamage(208)));

    //    Diamond custom tools
    public static final Item DIAMOND_MULTI_TOOLS = registerItem("diamond_multi_tools",
            new ModMultiToolsItem(ToolMaterials.DIAMOND, 5, -3.0f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB).maxDamage(4683)));
    public static final Item DIAMOND_BOW = registerItem("diamond_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALWEAPONSTAB).maxDamage(10159)));

    //    Netherite custom tools
    public static final Item NETHERITE_MULTI_TOOLS = registerItem("netherite_multi_tools",
            new ModMultiToolsItem(ToolMaterials.NETHERITE, 5, -3.0f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB).maxDamage(6093)));
    public static final Item NETHERITE_BOW = registerItem("netherite_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALWEAPONSTAB).maxDamage(13218)));

    //    Copper tools
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new ModPickaxeItem(ModToolMaterials.COPPER, 2, -2.8f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new ModAxeItem(ModToolMaterials.COPPER, 7, -3.2f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoeItem(ModToolMaterials.COPPER, -1, 0.0f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER, 2, -3.0f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER, 4, -2.4f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALWEAPONSTAB)));
    //    Copper custom tools
    public static final Item COPPER_BOW = registerItem("copper_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALWEAPONSTAB).maxDamage(1302)));
    public static final Item COPPER_MULTI_TOOLS = registerItem("copper_multi_tools",
            new ModMultiToolsItem(ModToolMaterials.COPPER, 7, -3.5f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB).maxDamage(600)));
    //    Copper Armor
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALARMORSTAB)));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALARMORSTAB)));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALARMORSTAB)));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALARMORSTAB)));
    public static final Item COPPER_HORSE_ARMOR = registerItem("copper_horse_armor",
            new HorseArmorItem(4, "copper", new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALARMORSTAB)));

    //Emerald tools
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe",
            new ModPickaxeItem(ModToolMaterials.EMERALD, 3, -2.8f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));
    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            new ModAxeItem(ModToolMaterials.EMERALD, 7, -3.0f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe",
            new ModHoeItem(ModToolMaterials.EMERALD, -1, 0.0f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel",
            new ShovelItem(ModToolMaterials.EMERALD, 3, -3.0f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB)));
    public static final Item EMERALD_SWORD = registerItem("emerald_sword",
            new SwordItem(ModToolMaterials.EMERALD, 4, -2.4f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALWEAPONSTAB)));
    //Emerald custom tools
    public static final Item EMERALD_BOW = registerItem("emerald_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALWEAPONSTAB).maxDamage(6508)));
    public static final Item EMERALD_MULTI_TOOLS = registerItem("emerald_multi_tools",
            new ModMultiToolsItem(ModToolMaterials.EMERALD, 7, -3.2f, new FabricItemSettings().group(ModItemGroup.MODERNSURVIVALTOOLSTAB).maxDamage(3000)));
    //Emerald Armor
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
