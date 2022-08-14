package net.zestyblaze.cutehermitcrabs.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.zestyblaze.cutehermitcrabs.config.CHCConfig;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HermitCrabShellItem extends ArmorItem {
    public HermitCrabShellItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
        tooltipComponents.add(Component.translatable("item.modifiers.sneaking").withStyle(ChatFormatting.GRAY));
        tooltipComponents.add(Component.translatable("attribute.modifier.plus").withStyle(ChatFormatting.BLUE)
                .append(Component.translatable(MobEffects.DAMAGE_RESISTANCE.getDisplayName().getString()).withStyle(ChatFormatting.BLUE)).append(" ")
                .append(Component.translatable("potion.potency." + (CHCConfig.resistanceLevel - 1))).withStyle(ChatFormatting.BLUE));
        super.appendHoverText(itemStack, level, tooltipComponents, isAdvanced);
    }
}
