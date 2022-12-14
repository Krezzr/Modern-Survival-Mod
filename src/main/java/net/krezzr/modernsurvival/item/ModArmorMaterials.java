package net.krezzr.modernsurvival.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    FLINT("flint", 5, new int[]{1, 2, 3, 1}, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f,
            () -> Ingredient.ofItems(Items.FLINT), "FLINT"),
    COPPER("copper", 10, new int[]{1, 3, 4, 2}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f,
            () -> Ingredient.ofItems(Items.COPPER_INGOT), "COPPER"),
    AMETHYST("amethyst", 20, new int[]{2, 5, 7, 2}, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f, 0.0f,
            () -> Ingredient.ofItems(Items.AMETHYST_SHARD), "AMETHYST"),
    QUARTZ("quartz", 20, new int[]{2, 5, 7, 2}, 23,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f, 0.0f,
            () -> Ingredient.ofItems(Items.QUARTZ), "QUARTZ"),
    EMERALD("emerald", 25, new int[]{2, 5, 7, 3}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f,
            () -> Ingredient.ofItems(Items.EMERALD), "EMERALD");

    private static final int[] BASE_DURABILITY;
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredientSupplier;
    private final String string;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier, String toString) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = repairIngredientSupplier;
        this.string = toString;
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @Override
    public String toString() { return this.string; }

    static {
        BASE_DURABILITY = new int[]{13, 15, 16, 11};
    }
}
