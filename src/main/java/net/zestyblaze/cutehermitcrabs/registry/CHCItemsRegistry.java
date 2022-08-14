package net.zestyblaze.cutehermitcrabs.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.material.Fluids;
import net.zestyblaze.cutehermitcrabs.CuteHermitCrabs;
import net.zestyblaze.cutehermitcrabs.item.HermitCrabShellItem;
import net.zestyblaze.cutehermitcrabs.misc.Foods;
import net.zestyblaze.cutehermitcrabs.misc.ModArmourMaterials;

public class CHCItemsRegistry {
    public static final Item HERMIT_CRAB_SHELL_PIECE = new Item(new FabricItemSettings().group(CuteHermitCrabs.TAB));

    public static final Item HERMIT_CRAB_SHELL = new HermitCrabShellItem(ModArmourMaterials.SHELL, EquipmentSlot.HEAD, new FabricItemSettings().group(CuteHermitCrabs.TAB));

    public static final Item HERMIT_CRAB_SPAWN_EGG = new SpawnEggItem(CHCEntityRegistry.HERMIT_CRAB, 0xad4040, 0x793030, new FabricItemSettings().group(CuteHermitCrabs.TAB));
    public static final Item BUCKET_OF_HERMIT_CRAB = new MobBucketItem(CHCEntityRegistry.HERMIT_CRAB, Fluids.WATER, SoundEvents.BUCKET_EMPTY_FISH, new FabricItemSettings().maxCount(1).group(CuteHermitCrabs.TAB));

    public static final Item RAW_HERMIT_CRAB = new Item(new FabricItemSettings().food(Foods.RAW_HERMIT_CRAB).group(CuteHermitCrabs.TAB));
    public static final Item COOKED_HERMIT_CRAB = new Item(new FabricItemSettings().food(Foods.COOKED_HERMIT_CRAB).group(CuteHermitCrabs.TAB));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new ResourceLocation(CuteHermitCrabs.MOD_ID, "hermit_crab_shell_piece"), HERMIT_CRAB_SHELL_PIECE);
        Registry.register(Registry.ITEM, new ResourceLocation(CuteHermitCrabs.MOD_ID, "hermit_crab_shell"), HERMIT_CRAB_SHELL);
        Registry.register(Registry.ITEM, new ResourceLocation(CuteHermitCrabs.MOD_ID, "hermit_crab_spawn_egg"), HERMIT_CRAB_SPAWN_EGG);
        Registry.register(Registry.ITEM, new ResourceLocation(CuteHermitCrabs.MOD_ID, "bucket_of_hermit_crab"), BUCKET_OF_HERMIT_CRAB);
        Registry.register(Registry.ITEM, new ResourceLocation(CuteHermitCrabs.MOD_ID, "raw_hermit_crab"), RAW_HERMIT_CRAB);
        Registry.register(Registry.ITEM, new ResourceLocation(CuteHermitCrabs.MOD_ID, "cooked_hermit_crab"), COOKED_HERMIT_CRAB);
    }
}
