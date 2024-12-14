package net.squishkitt.SQArmory.item;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.squishkitt.SQArmory.SQArmory;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SQArmory.MOD_ID);

    public static final RegistryObject<Item> WOOD_LONGSWORD = ITEMS.register("wood_longsword",
            () -> new SwordItem(Tiers.WOOD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.WOOD, 5, -2.8f))));
    public static final RegistryObject<Item> WOOD_SHORTSWORD = ITEMS.register("wood_shortsword",
            () -> new SwordItem(Tiers.WOOD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.WOOD, 2, -1.7f))));
    public static final RegistryObject<Item> WOOD_BAXE = ITEMS.register("wood_baxe",
            () -> new AxeItem(Tiers.WOOD, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.WOOD, 8, -3.4f))));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
