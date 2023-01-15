package net.krezzr.modernsurvival.item.custom;

import net.krezzr.modernsurvival.item.ModArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.include.com.google.common.collect.ImmutableMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, List<StatusEffectInstance>> MATERIAL_STATUS_EFFECT_INSTANCE_MAP =
            new ImmutableMap.Builder<ArmorMaterial, List<StatusEffectInstance>>()
                    .put(ArmorMaterials.IRON,
                            Collections.singletonList(new StatusEffectInstance(StatusEffects.SPEED, 405, 0)))
                    .put(ArmorMaterials.GOLD,
                            Collections.singletonList(new StatusEffectInstance(StatusEffects.ABSORPTION, 405, 0)))
                    .put(ModArmorMaterials.AMETHYST,
                            Collections.singletonList(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 405, 0)))
                    .put(ModArmorMaterials.QUARTZ,
                            Collections.singletonList(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 405, 0)))
                    .put(ArmorMaterials.DIAMOND,
                            Collections.singletonList(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 405, 0)))
                    .put(ModArmorMaterials.EMERALD,
                            Collections.singletonList(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 405, 0)))
                    .put(ArmorMaterials.NETHERITE,
                            Arrays.asList(
                                    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 405, 1),
                                    new StatusEffectInstance(StatusEffects.STRENGTH, 405, 1)
                            ))
                    .build();
    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient()) {
            if (entity instanceof PlayerEntity player) {

                if (hasFullSuitOfArmorOn(player)) {
                    evaluateArmorEffects(player);
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, List<StatusEffectInstance>> entry : MATERIAL_STATUS_EFFECT_INSTANCE_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            List<StatusEffectInstance> mapStatusEffects = entry.getValue();

            if (hasCorrectArmorOn(mapArmorMaterial, player)) {
                for (StatusEffectInstance effect : mapStatusEffects) {
                    addStatusEffectForMaterial(player, effect);
                }
            }
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity player, StatusEffectInstance mapStatusEffect) {
        player.addStatusEffect(new StatusEffectInstance(mapStatusEffect.getEffectType(),
                mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        for (int i = 0; i < 4; i++) {
            ItemStack armorStack = player.getInventory().getArmorStack(i);
            if (armorStack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, PlayerEntity player) {
        for (int i = 0; i < 4; i++) {
            ItemStack armorStack = player.getInventory().getArmorStack(i);
            if (!(armorStack.getItem() instanceof ArmorItem) || ((ArmorItem) armorStack.getItem()).getMaterial() != material) {
                return false;
            }
        }
        return true;
    }
}