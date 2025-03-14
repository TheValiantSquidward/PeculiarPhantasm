package net.thevaliantsquidward.peculiarphantasm.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.peculiarphantasm.PeculiarPhantasm;
import net.thevaliantsquidward.peculiarphantasm.block.ModBlocks;
import net.thevaliantsquidward.peculiarphantasm.entity.ModEntities;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PeculiarPhantasm.MOD_ID);

    public static final RegistryObject<Item> TROODON_SPAWN_EGG = ITEMS.register("troodon_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.TROODON, 0x687370, 0x732a37, new Item.Properties()));

    public static final RegistryObject<Item> GIGANHINGA_EGG = ITEMS.register
            ("giganhinga_egg", () -> new BlockItem(ModBlocks.GIGANHINGA_EGG_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> GOOD_EGG = ITEMS.register
            ("good_egg", () -> new BlockItem(ModBlocks.GOOD_EGG_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> BAD_EGG = ITEMS.register
            ("bad_egg", () -> new BlockItem(ModBlocks.BAD_EGG_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> TROODON_EGG = ITEMS.register
            ("troodon_egg", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
