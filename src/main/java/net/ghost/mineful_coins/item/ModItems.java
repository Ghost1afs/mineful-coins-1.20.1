package net.ghost.mineful_coins.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ghost.mineful_coins.Mineful_coins;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item Gold_coin = registerItem("gold_coin", new Item(new FabricItemSettings())); //adds the item
    public static final Item Iron_coin = registerItem("iron_coin", new Item(new FabricItemSettings()));
    public static final Item Copper_coin = registerItem("copper_coin", new Item(new FabricItemSettings()));
    public static final Item Diamond_coin = registerItem("diamond_coin", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) { //adds item to the creative mode tab
        entries.add(Gold_coin);
        entries.add(Iron_coin);
        entries.add(Copper_coin);
        entries.add(Diamond_coin);

    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Mineful_coins.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Mineful_coins.LOGGER.info("Register Mod Items for" + Mineful_coins.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup); //adds item to the vanilla ingredients item group in the creative menu
    }
}
