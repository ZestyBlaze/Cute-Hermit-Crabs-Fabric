package net.zestyblaze.cutehermitcrabs.client.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.zestyblaze.cutehermitcrabs.CuteHermitCrabs;
import net.zestyblaze.cutehermitcrabs.client.model.HermitCrabModel;
import net.zestyblaze.cutehermitcrabs.entity.HermitCrabEntity;

@Environment(EnvType.CLIENT)
public class HermitCrabRenderer extends MobRenderer<HermitCrabEntity, HermitCrabModel<HermitCrabEntity>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(CuteHermitCrabs.MOD_ID, "textures/entity/hermit_crab.png");

    public HermitCrabRenderer(EntityRendererProvider.Context context) {
        super(context, new HermitCrabModel<>(context.bakeLayer(HermitCrabModel.LAYER_LOCATION), true, 9.5F, 1F, 2F, 2F, 24), 0.3f);
    }

    @Override
    public ResourceLocation getTextureLocation(HermitCrabEntity hermitCrabEntity) {
        return TEXTURE;
    }
}
