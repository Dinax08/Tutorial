package me.dinax.tutorial.tutorial;

import me.dinax.tutorial.tutorial.creative_tab.CreativeTabController;
import me.dinax.tutorial.tutorial.item.ItemController;

public class Tutorial
{
	public static final String MOD_ID = "tutorial";

	public static void init() {
		ItemController.register();
		CreativeTabController.register();
	}
}
