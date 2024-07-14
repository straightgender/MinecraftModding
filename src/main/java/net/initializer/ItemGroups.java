package net.initializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.straight.first.FirstMod;

import java.util.Optional;

public class ItemGroups {
    public static final Text EXAMPLE_TITLE = Text.translatable(
            "itemGroup."+ FirstMod.id + "example.group"
    );
    public static final ItemGroup EXAMPLE_GROUP = register("example_group", FabricItemGroup
            .builder()
            .displayName(EXAMPLE_TITLE)
            .icon(Items.TUNA::getDefaultStack)
            // You can add them like this or filter items with your mod id from the registries
//            .entries((displayContext, entries) -> {
//                entries.add(Items.TUNA);
//                entries.add(Items.BOX);
//                entries.add(Items.OPAL_BLOCK_ITEM);
//                entries.add(Blocks.OPAL_BLOCK);
//                    }
//            )
            .entries((displayContext, entries) -> Registries.ITEM.getIds().stream()
                    .filter(key -> key.getNamespace().equals(FirstMod.id))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());

    public static <T extends ItemGroup> T register(String name, T itemGroup){
        return Registry.register(Registries.ITEM_GROUP, FirstMod.id(name), itemGroup);
    }

    public static void load(){}

}
