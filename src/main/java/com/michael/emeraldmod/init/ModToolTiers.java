package com.michael.emeraldmod.init;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier; // Interfaccia corretta
import net.minecraft.world.item.Items; // Importazione per Items (Smeraldo)

public class ModToolTiers {
    
    // DEFINIZIONE DEL MATERIALE SMERALDO
    // Usa l'interfaccia Tier
    public static final Tier EMERALD = new Tier() {
        
        // Durabilità (Uses): 3000 (deve essere int)
        @Override
        public int getUses() { return 3000; } 
        
        // Danno Aggiuntivo Base: 5.5F (deve essere float)
        @Override
        public float getAttackDamageBonus() { return 5.5f; } 
        
        // Velocità di Scavo: 9.5F (deve essere float)
        @Override
        public float getSpeed() { return 9.5f; } 
        
        // Livello di Raccolta (Level): 3 (deve essere int)
        @Override
        public int getLevel() { return 3; } 
        
        // Valore di Incantamento (EnchantmentValue): 15 (deve essere int)
        @Override
        public int getEnchantmentValue() { return 15; } 
        
        // Ingrediente di Riparazione
        @Override
        public Ingredient getRepairIngredient() { 
            return Ingredient.of(Items.EMERALD);
        }
    };
}