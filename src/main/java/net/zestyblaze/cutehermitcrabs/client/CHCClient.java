package net.zestyblaze.cutehermitcrabs.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.zestyblaze.cutehermitcrabs.client.model.HermitCrabModel;
import net.zestyblaze.cutehermitcrabs.client.renderer.HermitCrabRenderer;
import net.zestyblaze.cutehermitcrabs.registry.CHCEntityRegistry;

@Environment(EnvType.CLIENT)
public class CHCClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(CHCEntityRegistry.HERMIT_CRAB, HermitCrabRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(HermitCrabModel.LAYER_LOCATION, HermitCrabModel::createBodyLayer);
    }
}
