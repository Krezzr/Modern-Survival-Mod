package net.krezzr.modernsurvival.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    FLINT(MiningLevels.STONE, 100, 1.0f, 1.0f, 5,
            () -> Ingredient.ofItems(Items.COPPER_INGOT), "FLINT"),
    COPPER(MiningLevels.STONE, 200, 2.0f, 1.0f, 16,
            () -> Ingredient.ofItems(Items.COPPER_INGOT), "COPPER"),
    AMETHYST(MiningLevels.IRON, 800, 4.0f, 1.0f, 19,
            () -> Ingredient.ofItems(Items.AMETHYST_SHARD), "AMETHYST"),
    QUARTZ(MiningLevels.IRON, 800, 4.0f, 1.0f, 23,
            () -> Ingredient.ofItems(Items.AMETHYST_SHARD), "QUARTZ"),
    EMERALD(MiningLevels.IRON, 1000, 5.0f, 1.0f, 25,
            () -> Ingredient.ofItems(Items.EMERALD), "EMERALD");

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;
    private final String string;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient, String toString) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<>(repairIngredient);
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
    /*
    I was reading dragon loot mod code, and I saw that part for levelz compatibility
    Thank you Globox_Z for letting me use part this little part of your code
     */
    @Override
    public String toString() { return this.string; }
}
