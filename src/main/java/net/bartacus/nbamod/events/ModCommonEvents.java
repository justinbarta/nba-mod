package net.bartacus.nbamod.events;

import net.bartacus.nbamod.NBAMod;
import net.bartacus.nbamod.entities.NBAPlayerEntity;
import net.bartacus.nbamod.init.EntityInit;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = NBAMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonEvents {
    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SpawnPlacements.register(EntityInit.NBA_PLAYER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, NBAPlayerEntity::canSpawn);
        });
    }

    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.NBA_PLAYER.get(), NBAPlayerEntity.getExampleAttributes().build());
    }
}
