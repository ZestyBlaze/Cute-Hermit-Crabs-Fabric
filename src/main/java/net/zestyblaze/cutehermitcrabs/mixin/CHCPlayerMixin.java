package net.zestyblaze.cutehermitcrabs.mixin;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.zestyblaze.cutehermitcrabs.config.CHCConfig;
import net.zestyblaze.cutehermitcrabs.registry.CHCItemsRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public abstract class CHCPlayerMixin extends LivingEntity {
    public CHCPlayerMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "tick", at = @At("HEAD"))
    private void helmetTick(CallbackInfo ci) {
        if(level instanceof ServerLevel) {
            Player player = (Player)(Object)this;
            if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == CHCItemsRegistry.HERMIT_CRAB_SHELL) {
                if(player.isShiftKeyDown()) {
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10, CHCConfig.resistanceLevel - 1, false, false, true));
                }
            }
        }
    }
}
