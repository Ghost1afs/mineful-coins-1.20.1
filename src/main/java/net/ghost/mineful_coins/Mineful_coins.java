package net.ghost.mineful_coins;

import net.fabricmc.api.ModInitializer;

import net.ghost.mineful_coins.item.ModItemGroups;
import net.ghost.mineful_coins.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mineful_coins implements ModInitializer {
    public static final String MOD_ID = "mineful_coins";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}