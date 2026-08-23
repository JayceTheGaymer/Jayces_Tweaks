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

    public static final DeferredItem<Item> LEATHER_STRIP = ITEMS.register("leather_strip",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LEATHER_STRAP = ITEMS.register("leather_strap",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIAMOND_PICKAXE_HEAD = ITEMS.register("diamond_pickaxe_head",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIAMOND_AXE_HEAD = ITEMS.register("diamond_axe_head",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIAMOND_SHOVEL_HEAD = ITEMS.register("diamond_shovel_head",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIAMOND_HOE_HEAD = ITEMS.register("diamond_hoe_head",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIAMOND_SWORD_BLADE = ITEMS.register("diamond_sword_blade",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
