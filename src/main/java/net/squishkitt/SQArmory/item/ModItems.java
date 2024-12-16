package net.squishkitt.SQArmory.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.squishkitt.SQArmory.SQArmory;
import net.squishkitt.SQArmory.item.custom.CustomUpgradeTemplate;
import net.squishkitt.SQArmory.item.custom.BaxeItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SQArmory.MOD_ID);

    public static final RegistryObject<Item> AURIC_INGOT = ITEMS.register("auric_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AURIC_UPGRADE = ITEMS.register("auric_upgrade",
            () -> CustomUpgradeTemplate.createCustomUpgradeTemplate(
                    "auric_upgrade",
                    "smithing_template.auric_upgrade.ingredients",
                    "smithing_template.auric_upgrade.applies_to",
                    "smithing_template.auric_upgrade.base_slot_description",
                    "smithing_template.auric_upgrade.additions_slot_description"
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

    public static final RegistryObject<Item> AURIC_LONGSWORD = ITEMS.register("auric_longsword",
            () -> new SwordItem(ModToolTiers.AURIC, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AURIC, LongSwordDamage, LongSwordSpeed))));
    public static final RegistryObject<Item> AURIC_SHORTSWORD = ITEMS.register("auric_shortsword",
            () -> new SwordItem(ModToolTiers.AURIC, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AURIC, ShortSwordDamage, ShortSwordSpeed))));
    public static final RegistryObject<Item> AURIC_BAXE = ITEMS.register("auric_baxe",
            () -> new BaxeItem(ModToolTiers.AURIC, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.AURIC, BattleAxeDamage, BattleAxeSpeed))));

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

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
