package net.cooler.verymood.item;

import net.cooler.verymood.CoolMod;
import net.cooler.verymood.item.custom.CoolCustomItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItemsGang {

    public static Item COOL_ORE_RAW = registerItem("cool_ore_raw", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static Item COOL_INGOT = registerItem("cool_ingot", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static Item customItem = registerItem("bruh", new CoolCustomItem(new FabricItemSettings().group(ItemGroup.MISC)));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CoolMod.MOD_ID, name), item);
    }


    public static void registerModShit() {
        CoolMod.LOGGER.info("GOING TO REGISETER A FUCKIJNG ITEM");
    }


}
