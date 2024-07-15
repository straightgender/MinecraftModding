package net.initializer;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.straight.first.FirstMod;

public class Blocks {

    public static final Block OPAL_BLOCK = registerWithItem("opal_block", new Block(
            AbstractBlock.Settings.create()
                    .hardness(5.0F)
                    .requiresTool()
                    .strength(6.5F)
    ));

    public static <T extends Block> T register(String name, T block){
        return Registry.register(Registries.BLOCK, FirstMod.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings){
        T registered = register(name, block);
        Items.registerItem(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block){
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load(){}

}
