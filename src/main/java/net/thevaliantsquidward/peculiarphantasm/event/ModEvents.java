package net.thevaliantsquidward.peculiarphantasm.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.peculiarphantasm.PeculiarPhantasm;
import net.thevaliantsquidward.peculiarphantasm.entity.ModEntities;
import net.thevaliantsquidward.peculiarphantasm.entity.custom.Giganhinga;
import net.thevaliantsquidward.peculiarphantasm.entity.custom.Troodon;

@Mod.EventBusSubscriber(modid = PeculiarPhantasm.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.TROODON.get(), Troodon.setAttributes());
        event.put(ModEntities.GIGANHINGA.get(), Giganhinga.setAttributes());


    }
}
