package net.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class Foods {

    public static final FoodComponent TUNA_SETTINGS = new FoodComponent.Builder()
            .alwaysEdible()
            .nutrition(10)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20 * 5, 1), 1.0F)
            .build();

}
