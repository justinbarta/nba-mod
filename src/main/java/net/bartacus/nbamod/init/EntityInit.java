package net.bartacus.nbamod.init;

import net.bartacus.nbamod.NBAMod;
import net.bartacus.nbamod.entities.NBAPlayerEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NBAMod.MODID);

    public static final RegistryObject<EntityType<NBAPlayerEntity>> NBA_PLAYER = ENTITIES.register("nba_player_entity",
            () -> EntityType.Builder.of(NBAPlayerEntity::new, MobCategory.CREATURE).sized(1.0f,1.0f).build(NBAMod.MODID + ":nba_player_entity"));
}