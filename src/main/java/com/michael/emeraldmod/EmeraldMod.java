package com.michael.emeraldmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// Questo è il tuo identificatore del mod, deve essere uguale a quello nel mods.toml
@Mod(EmeraldMod.MOD_ID)
public class EmeraldMod {
    public static final String MOD_ID = "emeraldmod";

    public EmeraldMod() {
        // Bus degli eventi per registrare roba (blocchi, item, ecc.)
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Qui dentro aggiungerai le registrazioni dei tuoi oggetti in futuro
        System.out.println("Emerald Mod caricato!");
    }
}
