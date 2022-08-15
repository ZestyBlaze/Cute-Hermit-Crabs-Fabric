package net.zestyblaze.cutehermitcrabs.integration;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import eu.midnightdust.lib.config.MidnightConfig;
import net.zestyblaze.cutehermitcrabs.CuteHermitCrabs;

public class ModMenu implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return screen -> MidnightConfig.getScreen(screen, CuteHermitCrabs.MOD_ID);
    }
}
