package net.thevaliantsquidward.peculiarphantasm.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.peculiarphantasm.PeculiarPhantasm;
import net.thevaliantsquidward.peculiarphantasm.block.custom.GiganhingaEggBlock;
import net.thevaliantsquidward.peculiarphantasm.item.ModItems;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PeculiarPhantasm.MOD_ID);

    public static final RegistryObject<Block> GIGANHINGA_EGG_BLOCK = registerBlock("giganhinga_egg_block",
            () -> new GiganhingaEggBlock(BlockBehaviour.Properties.copy(Blocks.TURTLE_EGG)));

    public static final RegistryObject<Block> GOOD_EGG_BLOCK = registerBlock("good_egg_block",
            () -> new GiganhingaEggBlock(BlockBehaviour.Properties.copy(Blocks.TURTLE_EGG)));

    public static final RegistryObject<Block> BAD_EGG_BLOCK = registerBlock("bad_egg_block",
            () -> new GiganhingaEggBlock(BlockBehaviour.Properties.copy(Blocks.TURTLE_EGG)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
