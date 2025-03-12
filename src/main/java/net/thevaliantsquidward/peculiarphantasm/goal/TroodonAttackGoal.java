package net.thevaliantsquidward.peculiarphantasm.goal;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.thevaliantsquidward.peculiarphantasm.effect.ModEffects;

public class TroodonAttackGoal extends NearestAttackableTargetGoal {
    public TroodonAttackGoal(Mob pMob, Class pTargetType, boolean pMustSee) {
        super(pMob, pTargetType, pMustSee);
    }

}
