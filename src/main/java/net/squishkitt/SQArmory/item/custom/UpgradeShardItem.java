package net.squishkitt.SQArmory.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.squishkitt.SQArmory.SQArmory;

import java.util.List;

public class UpgradeShardItem extends Item {
    public UpgradeShardItem(Properties pProperties) {
        super(pProperties);
    }
    private static final ChatFormatting MESSAGE_FORMAT = ChatFormatting.GRAY;
    private static final Component MESSAGE = Component.translatable(Util.makeDescriptionId("tooltip", ResourceLocation.fromNamespaceAndPath(SQArmory.MOD_ID, "upgrade_shard")))
            .withStyle(MESSAGE_FORMAT);
    private static final Component HINT = Component.translatable(Util.makeDescriptionId("tooltip", ResourceLocation.fromNamespaceAndPath(SQArmory.MOD_ID, "upgrade_shard_hint")))
            .withStyle(MESSAGE_FORMAT);
    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        pTooltipComponents.add(MESSAGE);
        pTooltipComponents.add(CommonComponents.space());
        pTooltipComponents.add(HINT);
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}
