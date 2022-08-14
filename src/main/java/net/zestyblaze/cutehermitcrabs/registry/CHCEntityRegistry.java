package net.zestyblaze.cutehermitcrabs.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.zestyblaze.cutehermitcrabs.CuteHermitCrabs;
import net.zestyblaze.cutehermitcrabs.entity.HermitCrabEntity;

public class CHCEntityRegistry {
    public static final EntityType<HermitCrabEntity> HERMIT_CRAB = Registry.register(
            Registry.ENTITY_TYPE,
            new ResourceLocation(CuteHermitCrabs.MOD_ID, "hermit_crab"),
            FabricEntityTypeBuilder.createMob()
                    .spawnGroup(MobCategory.WATER_CREATURE)
                    .entityFactory(HermitCrabEntity::new)
                    .dimensions(EntityDimensions.scalable(0.5f, 0.5f))
                    .spawnRestriction(SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, HermitCrabEntity::canSpawn)
                    .build()
    );

    public static void registerEntities() {
        FabricDefaultAttributeRegistry.register(HERMIT_CRAB, HermitCrabEntity.createAttributes());
    }
}
