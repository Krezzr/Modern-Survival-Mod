package net.krezzr.modernsurvival;

import net.fabricmc.api.ClientModInitializer;
import net.krezzr.modernsurvival.util.ModModelPredicateProvider;

public class ModernSurvivalClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
    }
}
