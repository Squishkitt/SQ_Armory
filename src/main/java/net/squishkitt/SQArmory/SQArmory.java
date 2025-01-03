package net.squishkitt.SQArmory;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.squishkitt.SQArmory.block.ModBlocks;
import net.squishkitt.SQArmory.item.ModItems;
import net.squishkitt.SQArmory.util.ModItemProperties;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SQArmory.MOD_ID)
public class SQArmory {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "sqarmory";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public SQArmory() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.WOOD_SHORTSWORD);
            event.accept(ModItems.WOOD_LONGSWORD);
            event.accept(ModItems.WOOD_BAXE);

            event.accept(ModItems.STONE_SHORTSWORD);
            event.accept(ModItems.STONE_LONGSWORD);
            event.accept(ModItems.STONE_BAXE);

            event.accept(ModItems.IRON_SHORTSWORD);
            event.accept(ModItems.IRON_LONGSWORD);
            event.accept(ModItems.IRON_BAXE);

            event.accept(ModItems.GOLD_SHORTSWORD);
            event.accept(ModItems.GOLD_LONGSWORD);
            event.accept(ModItems.GOLD_BAXE);

            event.accept(ModItems.DIAMOND_SHORTSWORD);
            event.accept(ModItems.DIAMOND_LONGSWORD);
            event.accept(ModItems.DIAMOND_BAXE);

            event.accept(ModItems.NETHERITE_SHORTSWORD);
            event.accept(ModItems.NETHERITE_LONGSWORD);
            event.accept(ModItems.NETHERITE_BAXE);

            event.accept(ModItems.AURIC_SWORD);
            event.accept(ModItems.AURIC_SHORTSWORD);
            event.accept(ModItems.AURIC_LONGSWORD);
            event.accept(ModItems.AURIC_BAXE);

            event.accept(ModItems.AA_SWORD);
            event.accept(ModItems.AA_SHORTSWORD);
            event.accept(ModItems.AA_LONGSWORD);
            event.accept(ModItems.AA_BAXE);

            event.accept(ModItems.AURIC_HELMET);
            event.accept(ModItems.AURIC_CHESTPLATE);
            event.accept(ModItems.AURIC_LEGGINGS);
            event.accept(ModItems.AURIC_BOOTS);

            event.accept(ModItems.AA_HELMET);
            event.accept(ModItems.AA_CHESTPLATE);
            event.accept(ModItems.AA_LEGGINGS);
            event.accept(ModItems.AA_BOOTS);

            event.accept(ModItems.COPPER_BOW);
        }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.AURIC_INGOT);
            event.accept(ModItems.ECHO_AMETHYST);
            event.accept(ModItems.AURIC_UPGRADE);
            event.accept(ModItems.UPGRADE_SHARD_1);
            event.accept(ModItems.UPGRADE_SHARD_2);
            event.accept(ModItems.UPGRADE_SHARD_3);
            event.accept(ModItems.UPGRADE_SHARD_4);
            event.accept(ModItems.ANCIENT_UPGRADE);
            event.accept(ModItems.UPGRADE_SHARD_5);
            event.accept(ModItems.UPGRADE_SHARD_6);
            event.accept(ModItems.COPPER_UPGRADE);
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.AURIC_SHOVEL);
            event.accept(ModItems.AURIC_PICKAXE);
            event.accept(ModItems.AURIC_AXE);
            event.accept(ModItems.AURIC_HOE);

            event.accept(ModItems.AA_SHOVEL);
            event.accept(ModItems.AA_PICKAXE);
            event.accept(ModItems.AA_AXE);
            event.accept(ModItems.AA_HOE);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.AURIC_BLOCK);
            event.accept(ModBlocks.AA_BLOCK);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ModItemProperties.addCustomItemProperties();
        }
    }
}
