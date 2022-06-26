package net.kermitted.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.kermitted.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup RED_VELVET = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID, "red_velvet"), () -> new ItemStack(ModItems.RED_VELVET_LIGHTSTICK));
}
