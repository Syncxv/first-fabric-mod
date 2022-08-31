package net.cooler.verymood;

import net.cooler.verymood.coolitem.ModItemsGang;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolMod implements ModInitializer {
	public static final String MOD_ID = "verymood";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGang.registerModShit();
	}
}
