package net.squishkitt.SQArmory.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.squishkitt.SQArmory.SQArmory;

import java.util.List;

public class UpgradeShardItem extends Item {
    public UpgradeShardItem(Properties pProperties) {
        super(pProperties);
    }
    public static String Type;
    public static String Desc;
    private static final ChatFormatting MESSAGE_FORMAT = ChatFormatting.GRAY;

    public void setTypeAndDesc() {
        Type = "fragment_type_fallback";
        Desc = "fragment_desc_fallback";
    }

    public MutableComponent getType() {
        return Component.translatable(Util.makeDescriptionId("tooltip", ResourceLocation.fromNamespaceAndPath(SQArmory.MOD_ID, Type))).withStyle(MESSAGE_FORMAT);
    }
    public MutableComponent getDesc() {
        return Component.translatable(Util.makeDescriptionId("tooltip", ResourceLocation.fromNamespaceAndPath(SQArmory.MOD_ID, Desc))).withStyle(MESSAGE_FORMAT);
    }
    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        setTypeAndDesc();
        pTooltipComponents.add(getType());
        pTooltipComponents.add(getDesc());
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}
