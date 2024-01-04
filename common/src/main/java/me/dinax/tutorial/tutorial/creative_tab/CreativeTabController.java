package me.dinax.tutorial.tutorial.creative_tab;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.dinax.tutorial.tutorial.Tutorial;
import me.dinax.tutorial.tutorial.item.ItemController;
import net.minecraft.client.gui.components.tabs.Tab;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabController {
    public static final DeferredRegister<CreativeModeTab> TabRegister = DeferredRegister.create(Tutorial.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> ModEpico = TabRegister.register(
            "mod_epico_tab",
            () -> {
                return CreativeTabRegistry.create(
                        Component.translatable("itemGroup." + Tutorial.MOD_ID + ".mod_epico_tab"),
                        () -> {
                            return new ItemStack(ItemController.Pito.get());
                        }
                );
            }
    );

    public static void register(){
        TabRegister.register();
    }
}