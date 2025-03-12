package net.thevaliantsquidward.peculiarphantasm.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.peculiarphantasm.PeculiarPhantasm;
import net.thevaliantsquidward.peculiarphantasm.effect.custom.IncubatingEffect;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PeculiarPhantasm.MOD_ID);

    public static final RegistryObject<MobEffect> INCUBATING = EFFECTS.register("incubating", ()-> new IncubatingEffect());

    public static void register(IEventBus eventBus) {
        EFFECTS.register(eventBus);
    }
}
