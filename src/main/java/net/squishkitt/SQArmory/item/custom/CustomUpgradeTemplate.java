package net.squishkitt.SQArmory.item.custom;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.squishkitt.SQArmory.SQArmory;

public class CustomUpgradeTemplate extends Item {
    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
    private static final Component INGREDIENTS_TITLE = Component.translatable(Util.makeDescriptionId("item", ResourceLocation.withDefaultNamespace("smithing_template.ingredients")))
            .withStyle(TITLE_FORMAT);
    private static final Component APPLIES_TO_TITLE = Component.translatable(Util.makeDescriptionId("item", ResourceLocation.withDefaultNamespace("smithing_template.applies_to")))
            .withStyle(TITLE_FORMAT);




    private static final ResourceLocation EMPTY_SLOT_HELMET = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_helmet");
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_chestplate");
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_leggings");
    private static final ResourceLocation EMPTY_SLOT_BOOTS = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_boots");
    private static final ResourceLocation EMPTY_SLOT_HOE = ResourceLocation.withDefaultNamespace("item/empty_slot_hoe");
    private static final ResourceLocation EMPTY_SLOT_AXE = ResourceLocation.withDefaultNamespace("item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_SWORD = ResourceLocation.withDefaultNamespace("item/empty_slot_sword");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = ResourceLocation.withDefaultNamespace("item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = ResourceLocation.withDefaultNamespace("item/empty_slot_pickaxe");
    private static final ResourceLocation EMPTY_SLOT_INGOT = ResourceLocation.withDefaultNamespace("item/empty_slot_ingot");

    private final Component appliesTo;
    private final Component ingredients;
    private final Component upgradeDescription;
    private final Component baseSlotDescription;
    private final Component additionsSlotDescription;
    private final List<ResourceLocation> baseSlotEmptyIcons;
    private final List<ResourceLocation> additionalSlotEmptyIcons;

    public CustomUpgradeTemplate(
            Component pAppliesTo,
            Component pIngredients,
            Component pUpgradeDescription,
            Component pBaseSlotDescription,
            Component pAdditionsSlotDescription,
            List<ResourceLocation> pBaseSlotEmptyIcons,
            List<ResourceLocation> pAdditionalSlotEmptyIcons,
            FeatureFlag... pRequiredFeatures
    ) {
        super(new Item.Properties().requiredFeatures(pRequiredFeatures));
        this.appliesTo = pAppliesTo;
        this.ingredients = pIngredients;
        this.upgradeDescription = pUpgradeDescription;
        this.baseSlotDescription = pBaseSlotDescription;
        this.additionsSlotDescription = pAdditionsSlotDescription;
        this.baseSlotEmptyIcons = pBaseSlotEmptyIcons;
        this.additionalSlotEmptyIcons = pAdditionalSlotEmptyIcons;
    }

    public static net.minecraft.world.item.SmithingTemplateItem createCustomUpgradeTemplate(String Name /*upgrade.MOD_ID.Name*/, String Ingredients, String Applies_to, String Base_slot_desc, String Additions_slot_desc) {
        Component upgrade_applies_to = Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(SQArmory.MOD_ID, Applies_to))).withStyle(DESCRIPTION_FORMAT);
        Component upgrade_name = Component.translatable(Util.makeDescriptionId("upgrade", ResourceLocation.fromNamespaceAndPath(SQArmory.MOD_ID,Name))).withStyle(TITLE_FORMAT);
        Component upgrade_ingredients = Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(SQArmory.MOD_ID,Ingredients))).withStyle(DESCRIPTION_FORMAT);
        Component upgrade_base_slot_description = Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(SQArmory.MOD_ID,Base_slot_desc)));
        Component upgrade_additions_slot_description = Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(SQArmory.MOD_ID,Additions_slot_desc)));

        return new net.minecraft.world.item.SmithingTemplateItem(upgrade_applies_to, upgrade_ingredients, upgrade_name, upgrade_base_slot_description, upgrade_additions_slot_description, createCustomUpgradeIconList(), createCustomUpgradeMaterialList());
    }

    private static List<ResourceLocation> createCustomUpgradeIconList() {
        return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_SWORD, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_AXE, EMPTY_SLOT_BOOTS, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL);
    }

    private static List<ResourceLocation> createCustomUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }

    @Override
    public void appendHoverText(ItemStack pStack, Item.TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        pTooltipComponents.add(this.upgradeDescription);
        pTooltipComponents.add(CommonComponents.EMPTY);
        pTooltipComponents.add(APPLIES_TO_TITLE);
        pTooltipComponents.add(CommonComponents.space().append(this.appliesTo));
        pTooltipComponents.add(INGREDIENTS_TITLE);
        pTooltipComponents.add(CommonComponents.space().append(this.ingredients));
    }

    public Component getBaseSlotDescription() {
        return this.baseSlotDescription;
    }

    public Component getAdditionSlotDescription() {
        return this.additionsSlotDescription;
    }

    public List<ResourceLocation> getBaseSlotEmptyIcons() {
        return this.baseSlotEmptyIcons;
    }

    public List<ResourceLocation> getAdditionalSlotEmptyIcons() {
        return this.additionalSlotEmptyIcons;
    }
}
