package net.thevaliantsquidward.peculiarphantasm.entity;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.peculiarphantasm.PeculiarPhantasm;
import net.thevaliantsquidward.peculiarphantasm.entity.custom.Giganhinga;
import net.thevaliantsquidward.peculiarphantasm.entity.custom.Troodon;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PeculiarPhantasm.MOD_ID);


    public static final RegistryObject<EntityType<Troodon>> TROODON =
            ENTITY_TYPES.register("troodon",
                    () -> EntityType.Builder.of(Troodon::new, MobCategory.CREATURE)
                            .sized(1.0f, 1.0f)
                            .build(new ResourceLocation(PeculiarPhantasm.MOD_ID, "troodon").toString()));

    public static final RegistryObject<EntityType<Giganhinga>> GIGANHINGA =
            ENTITY_TYPES.register("giganhinga",
                    () -> EntityType.Builder.of(Giganhinga::new, MobCategory.CREATURE)
                            .sized(1.0f, 1.0f)
                            .build(new ResourceLocation(PeculiarPhantasm.MOD_ID, "giganhinga").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}