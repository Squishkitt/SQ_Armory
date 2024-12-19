package net.squishkitt.SQArmory.item;

import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.squishkitt.SQArmory.SQArmory;
import net.squishkitt.SQArmory.item.custom.CustomUpgradeTemplateItem;
import net.squishkitt.SQArmory.item.custom.BaxeItem;
import net.squishkitt.SQArmory.item.custom.UpgradeShardItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SQArmory.MOD_ID);

    public static final RegistryObject<Item> AURIC_INGOT = ITEMS.register("auric_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ECHO_AMETHYST = ITEMS.register("echo_amethyst",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UPGRADE_SHARD_1 = ITEMS.register("upgrade_shard_1",
            () -> new UpgradeShardItem(new Item.Properties()){
                @Override
                public void setTypeAndDesc() {
                    Type = "upgrade_shard_type";
                    Desc = "upgrade_shard_1_desc";
                }
            });
    public static final RegistryObject<Item> UPGRADE_SHARD_2 = ITEMS.register("upgrade_shard_2",
            () -> new UpgradeShardItem(new Item.Properties()){
                @Override
                public void setTypeAndDesc() {
                    Type = "upgrade_shard_type";
                    Desc = "upgrade_shard_2_desc";
                }
            });
    public static final RegistryObject<Item> UPGRADE_SHARD_3 = ITEMS.register("upgrade_shard_3",
            () -> new UpgradeShardItem(new Item.Properties()){
                @Override
                public void setTypeAndDesc() {
                    Type = "upgrade_shard_type";
                    Desc = "upgrade_shard_3_desc";
                }
            });
    public static final RegistryObject<Item> UPGRADE_SHARD_4 = ITEMS.register("upgrade_shard_4",
            () -> new UpgradeShardItem(new Item.Properties()){
                @Override
                public void setTypeAndDesc() {
                    Type = "upgrade_shard_type";
                    Desc = "upgrade_shard_4_desc";
                }
            });


    public static final RegistryObject<Item> AURIC_UPGRADE = ITEMS.register("auric_upgrade",
            () -> CustomUpgradeTemplateItem.createCustomUpgradeTemplate(
                    "auric_upgrade",
                    "smithing_template.auric_upgrade.ingredients",
                    "smithing_template.auric_upgrade.applies_to",
                    "smithing_template.auric_upgrade.base_slot_description",
                    "smithing_template.auric_upgrade.additions_slot_description"
                    ));
    public static final RegistryObject<Item> DAMASCUS_UPGRADE = ITEMS.register("damascus_upgrade",
            () -> CustomUpgradeTemplateItem.createCustomUpgradeTemplate(
                    "damascus_upgrade",
                    "smithing_template.damascus_upgrade.ingredients",
                    "smithing_template.damascus_upgrade.applies_to",
                    "smithing_template.damascus_upgrade.base_slot_description",
                    "smithing_template.damascus_upgrade.additions_slot_description"
            ));
    public static final RegistryObject<Item> ANCIENT_UPGRADE = ITEMS.register("ancient_upgrade",
            () -> CustomUpgradeTemplateItem.createCustomUpgradeTemplate(
                    "ancient_upgrade",
                    "smithing_template.ancient_upgrade.ingredients",
                    "smithing_template.ancient_upgrade.applies_to",
                    "smithing_template.ancient_upgrade.base_slot_description",
                    "smithing_template.ancient_upgrade.additions_slot_description"
            ));

    private static final int LongSwordDamage = 5;
    private static final int ShortSwordDamage = 2;
    private static final int BattleAxeDamage = 9;

    private static final float LongSwordSpeed = -2.8f;
    private static final float ShortSwordSpeed = -1.7f;
    private static final float BattleAxeSpeed = -3.4f;

    public static final RegistryObject<Item> WOOD_LONGSWORD = ITEMS.register("wood_longsword",
            () -> new SwordItem(Tiers.WOOD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.WOOD, LongSwordDamage, LongSwordSpeed))));
    public static final RegistryObject<Item> WOOD_SHORTSWORD = ITEMS.register("wood_shortsword",
            () -> new SwordItem(Tiers.WOOD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.WOOD, ShortSwordDamage, ShortSwordSpeed))));
    public static final RegistryObject<Item> WOOD_BAXE = ITEMS.register("wood_baxe",
            () -> new BaxeItem(Tiers.WOOD, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.WOOD, BattleAxeDamage, BattleAxeSpeed))));

    public static final RegistryObject<Item> STONE_LONGSWORD = ITEMS.register("stone_longsword",
            () -> new SwordItem(Tiers.STONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.STONE, LongSwordDamage, LongSwordSpeed))));
    public static final RegistryObject<Item> STONE_SHORTSWORD = ITEMS.register("stone_shortsword",
            () -> new SwordItem(Tiers.STONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.STONE, ShortSwordDamage, ShortSwordSpeed))));
    public static final RegistryObject<Item> STONE_BAXE = ITEMS.register("stone_baxe",
            () -> new BaxeItem(Tiers.STONE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.STONE, BattleAxeDamage, BattleAxeSpeed))));

    public static final RegistryObject<Item> IRON_LONGSWORD = ITEMS.register("iron_longsword",
            () -> new SwordItem(Tiers.IRON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.IRON, LongSwordDamage, LongSwordSpeed))));
    public static final RegistryObject<Item> IRON_SHORTSWORD = ITEMS.register("iron_shortsword",
            () -> new SwordItem(Tiers.IRON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.IRON, ShortSwordDamage, ShortSwordSpeed))));
    public static final RegistryObject<Item> IRON_BAXE = ITEMS.register("iron_baxe",
            () -> new BaxeItem(Tiers.IRON, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.IRON, BattleAxeDamage, BattleAxeSpeed))));

    public static final RegistryObject<Item> GOLD_LONGSWORD = ITEMS.register("gold_longsword",
            () -> new SwordItem(Tiers.GOLD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.GOLD, LongSwordDamage, LongSwordSpeed))));
    public static final RegistryObject<Item> GOLD_SHORTSWORD = ITEMS.register("gold_shortsword",
            () -> new SwordItem(Tiers.GOLD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.GOLD, ShortSwordDamage, ShortSwordSpeed))));
    public static final RegistryObject<Item> GOLD_BAXE = ITEMS.register("gold_baxe",
            () -> new BaxeItem(Tiers.GOLD, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.GOLD, BattleAxeDamage, BattleAxeSpeed))));

    public static final RegistryObject<Item> DIAMOND_LONGSWORD = ITEMS.register("diamond_longsword",
            () -> new SwordItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.DIAMOND, LongSwordDamage, LongSwordSpeed))));
    public static final RegistryObject<Item> DIAMOND_SHORTSWORD = ITEMS.register("diamond_shortsword",
            () -> new SwordItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.DIAMOND, ShortSwordDamage, ShortSwordSpeed))));
    public static final RegistryObject<Item> DIAMOND_BAXE = ITEMS.register("diamond_baxe",
            () -> new BaxeItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.DIAMOND, BattleAxeDamage, BattleAxeSpeed))));

    public static final RegistryObject<Item> NETHERITE_LONGSWORD = ITEMS.register("netherite_longsword",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, LongSwordDamage, LongSwordSpeed))));
    public static final RegistryObject<Item> NETHERITE_SHORTSWORD = ITEMS.register("netherite_shortsword",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, ShortSwordDamage, ShortSwordSpeed))));
    public static final RegistryObject<Item> NETHERITE_BAXE = ITEMS.register("netherite_baxe",
            () -> new BaxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.NETHERITE, BattleAxeDamage, BattleAxeSpeed))));

    public static final RegistryObject<Item> AURIC_LONGSWORD = ITEMS.register("auric_longsword",
            () -> new SwordItem(ModToolTiers.AURIC, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AURIC, LongSwordDamage, LongSwordSpeed))));
    public static final RegistryObject<Item> AURIC_SHORTSWORD = ITEMS.register("auric_shortsword",
            () -> new SwordItem(ModToolTiers.AURIC, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AURIC, ShortSwordDamage, ShortSwordSpeed))));
    public static final RegistryObject<Item> AURIC_BAXE = ITEMS.register("auric_baxe",
            () -> new BaxeItem(ModToolTiers.AURIC, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.AURIC, BattleAxeDamage, BattleAxeSpeed))));

    public static final RegistryObject<Item> AA_LONGSWORD = ITEMS.register("aa_longsword",
            () -> new SwordItem(ModToolTiers.ANCIENT, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ANCIENT, LongSwordDamage, LongSwordSpeed))));
    public static final RegistryObject<Item> AA_SHORTSWORD = ITEMS.register("aa_shortsword",
            () -> new SwordItem(ModToolTiers.ANCIENT, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ANCIENT, ShortSwordDamage, ShortSwordSpeed))));
    public static final RegistryObject<Item> AA_BAXE = ITEMS.register("aa_baxe",
            () -> new BaxeItem(ModToolTiers.ANCIENT, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ANCIENT, BattleAxeDamage, BattleAxeSpeed))));

    public static final RegistryObject<Item> AURIC_SWORD = ITEMS.register("auric_sword",
            () -> new SwordItem(ModToolTiers.AURIC, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AURIC, 3, -2.4f))));
    public static final RegistryObject<Item> AURIC_PICKAXE = ITEMS.register("auric_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AURIC, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AURIC, 1, -2.8f))));
    public static final RegistryObject<Item> AURIC_SHOVEL = ITEMS.register("auric_shovel",
            () -> new ShovelItem(ModToolTiers.AURIC, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.AURIC, 1.5f, -3.0f))));
    public static final RegistryObject<Item> AURIC_AXE = ITEMS.register("auric_axe",
            () -> new AxeItem(ModToolTiers.AURIC, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.AURIC, 5, -3.0f))));
    public static final RegistryObject<Item> AURIC_HOE = ITEMS.register("auric_hoe",
            () -> new HoeItem(ModToolTiers.AURIC, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.AURIC, -3, 0.0f))));

    public static final RegistryObject<Item> AA_SWORD = ITEMS.register("aa_sword",
            () -> new SwordItem(ModToolTiers.ANCIENT, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ANCIENT, 3, -2.4f))));
    public static final RegistryObject<Item> AA_PICKAXE = ITEMS.register("aa_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANCIENT, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ANCIENT, 1, -2.8f))));
    public static final RegistryObject<Item> AA_SHOVEL = ITEMS.register("aa_shovel",
            () -> new ShovelItem(ModToolTiers.ANCIENT, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ANCIENT, 1.5f, -3.0f))));
    public static final RegistryObject<Item> AA_AXE = ITEMS.register("aa_axe",
            () -> new AxeItem(ModToolTiers.ANCIENT, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ANCIENT, 5, -3.0f))));
    public static final RegistryObject<Item> AA_HOE = ITEMS.register("aa_hoe",
            () -> new HoeItem(ModToolTiers.ANCIENT, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ANCIENT, -3, 0.0f))));

    public static final RegistryObject<Item> AURIC_HELMET = ITEMS.register("auric_helmet",
            () -> new ArmorItem(ModArmorMaterials.AURIC_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(25))));
    public static final RegistryObject<Item> AURIC_CHESTPLATE = ITEMS.register("auric_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AURIC_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(25))));
    public static final RegistryObject<Item> AURIC_LEGGINGS = ITEMS.register("auric_leggings",
            () -> new ArmorItem(ModArmorMaterials.AURIC_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(25))));
    public static final RegistryObject<Item> AURIC_BOOTS = ITEMS.register("auric_boots",
            () -> new ArmorItem(ModArmorMaterials.AURIC_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(25))));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
