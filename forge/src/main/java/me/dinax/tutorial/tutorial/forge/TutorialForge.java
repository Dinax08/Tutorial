package me.dinax.tutorial.tutorial.forge;

import dev.architectury.platform.forge.EventBuses;
import me.dinax.tutorial.tutorial.Tutorial;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Tutorial.MOD_ID)
public class TutorialForge {
    public TutorialForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Tutorial.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Tutorial.init();
    }
}