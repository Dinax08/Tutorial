package me.dinax.tutorial.tutorial.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.dinax.tutorial.tutorial.Tutorial;
import me.dinax.tutorial.tutorial.creative_tab.CreativeTabController;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;

public class ItemController {
    public static final DeferredRegister<Item> ItemRegister = DeferredRegister.create(Tutorial.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> Pito = ItemRegister.register(
            "pito",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).arch$tab(CreativeTabController.ModEpico))
    );

    public static final RegistrySupplier<Item> PicoEpico = ItemRegister.register(
            "pico_epico",
            () -> new PickaxeItem(Tiers.WOOD, 1,1, new Item.Properties().arch$tab(CreativeTabController.ModEpico))
    );

    public static void register(){
        ItemRegister.register();
    }
}
