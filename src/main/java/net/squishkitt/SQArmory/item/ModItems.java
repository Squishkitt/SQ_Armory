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

    public static final RegistryObject<Item> WOOD_LONGSWORD = ITEMS.register("wood_longsword",
            () -> new SwordItem(Tiers.WOOD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.WOOD, 5, -2.8f))));
    public static final RegistryObject<Item> WOOD_SHORTSWORD = ITEMS.register("wood_shortsword",
            () -> new SwordItem(Tiers.WOOD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.WOOD, 2, -1.7f))));
    public static final RegistryObject<Item> WOOD_BAXE = ITEMS.register("wood_baxe",
            () -> new BaxeItem(Tiers.WOOD, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.WOOD, 8, -3.4f))));

    public static final RegistryObject<Item> STONE_LONGSWORD = ITEMS.register("stone_longsword",
            () -> new SwordItem(Tiers.STONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.STONE, 5, -2.8f))));
    public static final RegistryObject<Item> STONE_SHORTSWORD = ITEMS.register("stone_shortsword",
            () -> new SwordItem(Tiers.STONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.STONE, 2, -1.7f))));
    public static final RegistryObject<Item> STONE_BAXE = ITEMS.register("stone_baxe",
            () -> new BaxeItem(Tiers.STONE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.STONE, 8, -3.4f))));

    public static final RegistryObject<Item> IRON_LONGSWORD = ITEMS.register("iron_longsword",
            () -> new SwordItem(Tiers.STONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.STONE, 6, -2.8f))));
    public static final RegistryObject<Item> IRON_SHORTSWORD = ITEMS.register("iron_shortsword",
            () -> new SwordItem(Tiers.STONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.STONE, 3, -1.7f))));
    public static final RegistryObject<Item> IRON_BAXE = ITEMS.register("iron_baxe",
            () -> new BaxeItem(Tiers.STONE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.STONE, 8, -3.4f))));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
