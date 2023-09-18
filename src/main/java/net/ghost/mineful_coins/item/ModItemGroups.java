package net.ghost.mineful_coins.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ghost.mineful_coins.Mineful_coins;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup Economy_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Mineful_coins.MOD_ID, "gold_coin"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.gold_coin"))
                    .icon(() -> new ItemStack(ModItems.Gold_coin)).entries((displayContext, entries) -> {
                        entries.add(ModItems.Copper_coin);
                        entries.add(ModItems.Iron_coin);
                        entries.add(ModItems.Gold_coin);
                        entries.add(ModItems.Diamond_coin);


                    }).build());
    public static void registerItemGroups() {
        Mineful_coins.LOGGER.info("Registering Item Groups for" + Mineful_coins.MOD_ID);
    }
}
