package net.krezzr.modernsurvival.util;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.krezzr.modernsurvival.ModernSurvival;
import net.krezzr.modernsurvival.block.ModBlocks;
import net.krezzr.modernsurvival.command.ReturnHomeCommand;
import net.krezzr.modernsurvival.command.SetHomeCommand;
import net.krezzr.modernsurvival.event.ModPlayerEventCopyFrom;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerCommands();
        registersEvents();
    }

    private static void registerFuels() {
        ModernSurvival.LOGGER.info("Registering Fuels for " + ModernSurvival.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModBlocks.CHARCOAL_BLOCK, 16000);
    }
    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }
    private static void registersEvents() {
        ServerPlayerEvents.COPY_FROM.register(new ModPlayerEventCopyFrom());
    }
}
