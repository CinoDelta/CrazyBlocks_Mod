package com.deltch.crazyBlocks.item;

import com.deltch.crazyBlocks.CrazyBlocks;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrazyBlocks.MOD_ID);

    public static final RegistryObject<Item> CRAZITE = ITEMS.register("crazite",
            () -> new Item(new Item.Properties())
            );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
