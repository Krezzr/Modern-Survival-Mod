package net.krezzr.modernsurvival.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    FLINT(1, 100, 3.0f, 1.0f, 5,
            () -> Ingredient.ofItems(Items.COPPER_INGOT), "FLINT"),
    COPPER(1, 200, 5.0f, 1.0f, 16,
            () -> Ingredient.ofItems(Items.COPPER_INGOT), "COPPER"),
    AMETHYST(2, 800, 6.0f, 1.0f, 19,
            () -> Ingredient.ofItems(Items.AMETHYST_SHARD), "AMETHYST"),
    QUARTZ(2, 800, 6.0f, 1.0f, 23,
            () -> Ingredient.ofItems(Items.AMETHYST_SHARD), "QUARTZ"),
    EMERALD(3, 1000, 8.0f, 1.0f, 25,
            () -> Ingredient.ofItems(Items.EMERALD), "EMERALD"),
    BREBIUM(4, 15000, 16.0f, 1.0f, 30,
                    () -> Ingredient.ofItems(ModItems.BREBIUM_INGOT), "BREBIUM");

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;
    private final String string;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient, String toString) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
        this.string = toString;
    }


    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String toString() {
        return this.string;
    }
}
