package net.bartacus.nbamod.client.renderer;

import net.bartacus.nbamod.NBAMod;

import net.bartacus.nbamod.client.models.NBAPlayerEntityModel;
import net.bartacus.nbamod.entities.NBAPlayerEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class NBAPlayerEntityRenderer extends MobRenderer<NBAPlayerEntity, NBAPlayerEntityModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(NBAMod.MODID, "textures/entities/nba_player_entity.png");

    public NBAPlayerEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new NBAPlayerEntityModel(context.bakeLayer(NBAPlayerEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(NBAPlayerEntity entity) {
        return TEXTURE;
    }
}
