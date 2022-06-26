package net.kermitted.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kermitted.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RED_VELVET_LIGHTSTICK = registerItem("red_velvet_lightstick",
            new Item(new FabricItemSettings().group(ModItemGroup.RED_VELVET)));
    public static final Item RED_VELVET_DIAMOND = registerItem("red_velvet_diamond",
            new Item(new FabricItemSettings().group(ModItemGroup.RED_VELVET)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items " + TutorialMod.MOD_ID);
    }
}
