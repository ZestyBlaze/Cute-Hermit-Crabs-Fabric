package net.zestyblaze.cutehermitcrabs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.zestyblaze.cutehermitcrabs.registry.CHCEntityRegistry;
import net.zestyblaze.cutehermitcrabs.registry.CHCItemsRegistry;
import net.zestyblaze.cutehermitcrabs.registry.CHCSoundRegistry;
import net.zestyblaze.cutehermitcrabs.registry.CHCWorldRegistry;

public class CuteHermitCrabs implements ModInitializer {
	public static final String MOD_ID = "cutehermitcrabs";
	public static final CreativeModeTab TAB = FabricItemGroupBuilder.build(new ResourceLocation(MOD_ID, "cute_hermit_crabs_tab"), () -> new ItemStack(CHCItemsRegistry.HERMIT_CRAB_SHELL_PIECE));

	@Override
	public void onInitialize() {
		CHCSoundRegistry.registerSounds();
		CHCEntityRegistry.registerEntities();
		CHCItemsRegistry.registerItems();
		CHCWorldRegistry.registerSpawns();
	}
}
