package net.bartacus.nbamod.init;

import net.bartacus.nbamod.NBAMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NBAMod.MODID);

    public static final RegistryObject<Item> BASKETBALL = ITEMS.register("basketball",
            () -> new Item(props()));

    public static final RegistryObject<ForgeSpawnEggItem> NBA_PLAYER_ENTITY_SPAWN_EGG = ITEMS.register("nba_player_entity_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.NBA_PLAYER, 0x0d7e36, 0xdadedf, props().stacksTo(16)));

    private static Item.Properties props() {
        return new Item.Properties().tab(NBAMod.TAB);
    }
}