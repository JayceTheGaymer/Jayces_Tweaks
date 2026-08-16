package io.jayce.jayces_tweaks.item;

import io.jayce.jayces_tweaks.Jayces_tweaks;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Jayces_tweaks.MODID);

    public static final DeferredItem<Item> IRON_PICKAXE_HEAD = ITEMS.register("iron_pickaxe_head",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> IRON_AXE_HEAD = ITEMS.register("iron_axe_head",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> IRON_SHOVEL_HEAD = ITEMS.register("iron_shovel_head",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> IRON_HOE_HEAD = ITEMS.register("iron_hoe_head",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> IRON_SWORD_BLADE = ITEMS.register("iron_sword_blade",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
