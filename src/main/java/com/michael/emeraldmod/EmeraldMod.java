package com.michael.emeraldmod;

import com.michael.emeraldmod.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// Assicurarsi che il MOD_ID sia quello corretto
@Mod(EmeraldMod.MOD_ID)
public class EmeraldMod {
    public static final String MOD_ID = "emeraldmod";

    public EmeraldMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registro gli Items E le Schede Creative
        ModItems.CREATIVE_MODE_TABS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        
        // Qui andranno altre registrazioni (Blocchi, Entità, ecc.)
    }
}