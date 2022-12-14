package net.krezzr.modernsurvival.Enchantment;

import net.krezzr.modernsurvival.ModernSurvival;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {
    public static Enchantment SMELTING_ENCHANTMENT = register("smelting_enchantment",
            new ModSmeltingEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.DIGGER, EquipmentSlot.MAINHAND));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(ModernSurvival.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        ModernSurvival.LOGGER.info("Registering Enchantments for " + ModernSurvival.MOD_ID);
    }
}
