package net.bartacus.nbamod.events;

import net.bartacus.nbamod.NBAMod;
import net.bartacus.nbamod.client.models.NBAPlayerEntityModel;
import net.bartacus.nbamod.client.renderer.NBAPlayerEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.bartacus.nbamod.init.EntityInit;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = NBAMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
    }

    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.NBA_PLAYER.get(), NBAPlayerEntityRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(NBAPlayerEntityModel.LAYER_LOCATION, NBAPlayerEntityModel::createBodyLayer);
    }
}
