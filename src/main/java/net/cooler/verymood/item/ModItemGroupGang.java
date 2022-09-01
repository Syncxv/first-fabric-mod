package net.cooler.verymood.item;

import net.cooler.verymood.CoolMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

//will try later
public class ModItemGroupGang {
    public static final ItemGroup CoolModGroup = FabricItemGroupBuilder.build(new Identifier(net.cooler.verymood.CoolMod.MOD_ID, "cool_mod"), () -> new ItemStack(ModItemsGang.COOL_ORE_RAW ));
}
