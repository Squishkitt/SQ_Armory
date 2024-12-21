package net.squishkitt.SQArmory.util;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ChargedProjectiles;
import net.squishkitt.SQArmory.item.ModItems;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        makeCustomBow(ModItems.COPPER_BOW.get());
    }

    private static void makeCustomBow(Item item) {
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pull"), (p_340951_, p_340952_, p_340953_, p_340954_) -> {
            if (p_340953_ == null) {
                return 0.0F;
            } else {
                return p_340953_.getUseItem() != p_340951_ ? 0.0F : (float)(p_340951_.getUseDuration(p_340953_) - p_340953_.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(
                item,
                ResourceLocation.withDefaultNamespace("pulling"),
                (p_174630_, p_174631_, p_174632_, p_174633_) -> p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F
        );
    }

    private static void makeCustomCrossbow(Item item) {
        ItemProperties.register(
                Items.CROSSBOW,
                ResourceLocation.withDefaultNamespace("pull"),
                (p_340947_, p_340948_, p_340949_, p_340950_) -> {
                    if (p_340949_ == null) {
                        return 0.0F;
                    } else {
                        return CrossbowItem.isCharged(p_340947_)
                                ? 0.0F
                                : (float)(p_340947_.getUseDuration(p_340949_) - p_340949_.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(p_340947_, p_340949_);
                    }
                }
        );
        ItemProperties.register(
                Items.CROSSBOW,
                ResourceLocation.withDefaultNamespace("pulling"),
                (p_174605_, p_174606_, p_174607_, p_174608_) -> p_174607_ != null
                        && p_174607_.isUsingItem()
                        && p_174607_.getUseItem() == p_174605_
                        && !CrossbowItem.isCharged(p_174605_)
                        ? 1.0F
                        : 0.0F
        );
        ItemProperties.register(
                Items.CROSSBOW,
                ResourceLocation.withDefaultNamespace("charged"),
                (p_275891_, p_275892_, p_275893_, p_275894_) -> CrossbowItem.isCharged(p_275891_) ? 1.0F : 0.0F
        );
        ItemProperties.register(Items.CROSSBOW, ResourceLocation.withDefaultNamespace("firework"), (p_325563_, p_325564_, p_325565_, p_325566_) -> {
            ChargedProjectiles chargedprojectiles = p_325563_.get(DataComponents.CHARGED_PROJECTILES);
            return chargedprojectiles != null && chargedprojectiles.contains(Items.FIREWORK_ROCKET) ? 1.0F : 0.0F;
        });
    }
}
