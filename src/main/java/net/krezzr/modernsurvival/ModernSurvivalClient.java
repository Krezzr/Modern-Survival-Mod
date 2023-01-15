package net.krezzr.modernsurvival;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.krezzr.modernsurvival.util.ModModelPredicateProvider;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.PotionUtil;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Collection;

public class ModernSurvivalClient implements ClientModInitializer {
    private boolean disabled;
    private TrackedData<Integer> colors;
    private WeakReference<Entity> lastCam;

    private void onClientTick(MinecraftClient client) {
        Entity entity = client.getCameraEntity();
        Entity prevEntity = lastCam.get();

        if (disabled)
            entity = null;

        if (prevEntity != entity) {
            if (prevEntity instanceof LivingEntity) {
                Collection<StatusEffectInstance> effects = ((LivingEntity) prevEntity).getStatusEffects();
                if (!effects.isEmpty())
                    prevEntity.getDataTracker().set(colors, PotionUtil.getColor(effects));
            }
            lastCam = new WeakReference<Entity>(entity);
        }

        if (entity instanceof LivingEntity)
            entity.getDataTracker().set(colors, 0);
    }

    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
        RemovePotionParticlePlayer();
    }
    private void RemovePotionParticlePlayer() {
        try {
            Field field = LivingEntity.class.getDeclaredField(FabricLoader.getInstance().getMappingResolver().mapFieldName("intermediary", "net.minecraft.class_1309", "field_6240", "Lnet/minecraft/class_2940;"));
            field.setAccessible(true);
            colors = (TrackedData<Integer>) field.get(null);
        } catch (Throwable throwable) {
            throw new IllegalStateException("Failed to acquire specific field for the mod.", throwable);
        }

        lastCam = new WeakReference<Entity>(null);
        ClientTickEvents.END_CLIENT_TICK.register(this::onClientTick);
    }
}
