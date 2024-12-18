package net.squishkitt.SQArmory.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModToolTiers {
    public static final Tier AURIC = new ForgeTier(1024, 9.0F, 3.0F, 22,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.AURIC_INGOT.get()),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL);
    public static final Tier ANCIENT = new ForgeTier(1824, 9.0F, 4.0F, 22,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.ECHO_AMETHYST.get()),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL);
}
