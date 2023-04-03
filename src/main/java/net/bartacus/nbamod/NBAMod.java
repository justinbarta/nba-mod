package net.bartacus.nbamod;

import net.bartacus.nbamod.init.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(NBAMod.MODID)
public class NBAMod {
    public static final String MODID = "nbamod";

    public NBAMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(modEventBus);
        EntityInit.ENTITIES.register(modEventBus);
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ItemInit.BASKETBALL.get().getDefaultInstance();
        }
    };
}