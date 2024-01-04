package me.dinax.tutorial.tutorial.fabric;

import me.dinax.tutorial.tutorial.Tutorial;
import net.fabricmc.api.ModInitializer;

public class TutorialFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Tutorial.init();
    }
}