package net.cooler.verymood.item.custom;

import net.cooler.verymood.CoolMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class CoolCustomItem extends Item {
    public CoolCustomItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            CoolMod.LOGGER.info("hey you just used me isnt that cool");
            user.sendMessage(Text.literal("COOOL EH VERY COOL"),true);

        }

        return super.use(world, user, hand);
    }

}
