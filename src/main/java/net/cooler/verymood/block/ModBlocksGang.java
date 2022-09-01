package net.cooler.verymood.block;

import net.cooler.verymood.CoolMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocksGang {

    public static final Block COOL_BLOCK  = registerBlock("cool_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(0.4f).requiresTool()),
            ItemGroup.MISC);

    public static final Block COOL_ORE_BLOCK  = registerBlock("cool_ore_block",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(0.4f).requiresTool()),
            ItemGroup.MISC);

    public static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(CoolMod.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block, ItemGroup tab) {
        Registry.register(Registry.ITEM, new Identifier(CoolMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlockSheet() {
        CoolMod.LOGGER.info("good day kind sir registering mod blocks gang");
    }

}
