package net.thevaliantsquidward.peculiarphantasm.effect.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.thevaliantsquidward.peculiarphantasm.entity.ModEntities;
import net.thevaliantsquidward.peculiarphantasm.entity.custom.Troodon;

public class IncubatingEffect extends MobEffect {

    private int durationFinal = -1;

    public IncubatingEffect() {
        super(MobEffectCategory.HARMFUL, 0x732a37);
    }

    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (durationFinal == 1) {
            int troodon = amplifier + 1;

            for (int i = 0; i < troodon; i++) {
                if (entity instanceof Player) {
                    Troodon pTroodon = ModEntities.TROODON.get().create(entity.level());
                    pTroodon.copyPosition(entity);
                    if (!entity.level().isClientSide) {
                        entity.level().addFreshEntity(pTroodon);
                    }
                    entity.hurt(entity.damageSources().magic(), troodon * 10);
                    entity.playSound(SoundEvents.SLIME_HURT);
                } else {
                    Troodon pTroodon = ModEntities.TROODON.get().create(entity.level());
                    pTroodon.copyPosition(entity);
                    if (!entity.level().isClientSide) {
                        entity.level().addFreshEntity(pTroodon);
                    }
                    entity.hurt(entity.damageSources().magic(), troodon * 100);
                }
            }
        }
    }

    public boolean isDurationEffectTick(int duration, int amplifier) {
        durationFinal = duration;
        return duration > 0;
    }

}
