package net.zestyblaze.cutehermitcrabs.registry;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.entity.MobCategory;

public class CHCWorldRegistry {
    public static void registerSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.tag(BiomeTags.IS_BEACH), MobCategory.CREATURE, CHCEntityRegistry.HERMIT_CRAB, 10, 2, 6);
    }
}
