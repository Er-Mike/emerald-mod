package com.michael.emeraldmod.init;

import com.michael.emeraldmod.EmeraldMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // 1. Registro per gli Oggetti (Item)
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, EmeraldMod.MOD_ID);

    // 2. Oggetti della Mod
    public static final RegistryObject<Item> EMERALD_INGOT = ITEMS.register("emerald_ingot",
        () -> new Item(new Item.Properties())); 

    public static final RegistryObject<Item> RAW_EMERALD_ITEM = ITEMS.register("raw_emerald_item",
        () -> new Item(new Item.Properties()));

    // 3. Registro per le Schede Creative - QUESTO È IL CREATIVE_MODE_TABS MANCANTE!
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmeraldMod.MOD_ID);

    // 4. Definizione della Scheda Creativa (Creative Mode Tab) - USA .builder()
    public static final RegistryObject<CreativeModeTab> EMERALD_TAB = CREATIVE_MODE_TABS.register("emerald_tab",
        () -> CreativeModeTab.builder()
            // Imposta l'icona della scheda
            .icon(() -> new ItemStack(EMERALD_INGOT.get()))
            // Imposta il titolo visualizzato
            .title(Component.translatable("itemGroup." + EmeraldMod.MOD_ID + ".emerald_tab"))
            // Definisce quali oggetti inserire nella scheda
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(EMERALD_INGOT.get());
                pOutput.accept(RAW_EMERALD_ITEM.get());
            })
            .build());
}