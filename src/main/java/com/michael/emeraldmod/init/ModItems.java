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

// Import per aggiungere gli item
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.PickaxeItem;

import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.Item.Properties;

public class ModItems {
    // 1. Registro per gli Oggetti (Item)
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, EmeraldMod.MOD_ID);

    // 2. Oggetti della Mod
    // Oggetti
    public static final RegistryObject<Item> EMERALD_INGOT = ITEMS.register("emerald_ingot",
        () -> new Item(new Item.Properties())); 

    public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget",
        () -> new Item(new Item.Properties()));

    // Equipaggiamento
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
        () -> new SwordItem(

            ModToolTiers.EMERALD,

            6,     // Bonus attacco

            -2.0f, // Velocità attacco

            new Properties()
        )
    );

    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
        () -> new PickaxeItem(

            ModToolTiers.EMERALD,

            0,

            -2.4f,

            new Properties()
        )
    );

    // 3. Registro per le Schede Creative - QUESTO È IL CREATIVE_MODE_TABS MANCANTE!
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmeraldMod.MOD_ID);

    // 4. Definizione della Scheda Creativa (Creative Mode Tab) - USA .builder()
    public static final RegistryObject<CreativeModeTab> EMERALD_TAB = CREATIVE_MODE_TABS.register("emerald_tab",
        () -> CreativeModeTab.builder()

            // Imposta l'icona della scheda
            .icon(() -> new ItemStack(EMERALD_INGOT.get()))

            // Imposta il titolo visualizzato
            .title(Component.translatable("Emerald Stuff"))

            // Definisce quali oggetti inserire nella scheda
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(EMERALD_INGOT.get());
                pOutput.accept(EMERALD_NUGGET.get());

                pOutput.accept(EMERALD_SWORD.get());
                pOutput.accept(EMERALD_PICKAXE. get());
            })
            .build());
}