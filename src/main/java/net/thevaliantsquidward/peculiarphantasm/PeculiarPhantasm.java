package net.thevaliantsquidward.peculiarphantasm;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thevaliantsquidward.peculiarphantasm.block.ModBlocks;
import net.thevaliantsquidward.peculiarphantasm.effect.ModEffects;
import net.thevaliantsquidward.peculiarphantasm.entity.ModEntities;
import net.thevaliantsquidward.peculiarphantasm.entity.client.GiganhingaRenderer;
import net.thevaliantsquidward.peculiarphantasm.entity.client.TroodonRenderer;
import net.thevaliantsquidward.peculiarphantasm.entity.custom.Giganhinga;
import net.thevaliantsquidward.peculiarphantasm.item.ModItems;
import org.slf4j.Logger;


@Mod(PeculiarPhantasm.MOD_ID)
public class PeculiarPhantasm
{
    public static final String MOD_ID = "peculiarphantasm";
    private static final Logger LOGGER = LogUtils.getLogger();


    public PeculiarPhantasm(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
        modEventBus.addListener(this::commonSetup);

        ModEntities.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEffects.register(modEventBus);


        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }


    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register
                    (ModEntities.TROODON.get(), TroodonRenderer:: new);
            EntityRenderers.register
                    (ModEntities.GIGANHINGA.get(), GiganhingaRenderer:: new);
        }
    }
}
