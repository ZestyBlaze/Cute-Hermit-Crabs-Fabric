package net.zestyblaze.cutehermitcrabs.registry;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.zestyblaze.cutehermitcrabs.CuteHermitCrabs;

public class CHCSoundRegistry {
    public static final SoundEvent HERMIT_CRAB_HURT = new SoundEvent(new ResourceLocation(CuteHermitCrabs.MOD_ID, "hermit_crab_hurt"));

    public static void registerSounds() {
        Registry.register(Registry.SOUND_EVENT, new ResourceLocation("hermit_crab_hurt"), HERMIT_CRAB_HURT);
    }
}
