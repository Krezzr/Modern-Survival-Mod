package net.krezzr.modernsurvival;

import net.fabricmc.api.ModInitializer;
import net.krezzr.modernsurvival.item.ModItems;
import net.krezzr.modernsurvival.block.ModBlocks;
import net.krezzr.modernsurvival.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModernSurvival implements ModInitializer {
	public static final String MOD_ID = "modernsurvival";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

	}
}
