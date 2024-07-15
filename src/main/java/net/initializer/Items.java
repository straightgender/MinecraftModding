package net.initializer;

import net.list.Foods;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.straight.first.FirstMod;

public class Items {

    public static final Item BOX = registerItem("box", new Item(new Item.Settings()));
    public static final Item TUNA = registerItem("tuna", new Item(new Item.Settings().food(Foods.TUNA_SETTINGS).maxCount(8)));
    public static final BlockItem OPAL_BLOCK_ITEM = registerItem("opal_block",
            new BlockItem(Blocks.OPAL_BLOCK, new Item.Settings()));
    public static final BlockItem NIOBIUM_BLOCK_ITEM = registerItem("niobium_block",
            new BlockItem(Blocks.NIOBIUM_BLOCK, new Item.Settings()));
    public static final Item TUNGSTEN = registerItem("tungsten", new Item(new Item.Settings()));
    public static  <T extends Item>T registerItem(String name, T item){
        return Registry.register(Registries.ITEM, FirstMod.id(name), item);
    }

    public static void load(){}

}
