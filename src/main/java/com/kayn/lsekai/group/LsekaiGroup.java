package com.kayn.lsekai.group;

import com.kayn.lsekai.Lsekai;
import com.kayn.lsekai.item.LsekaiItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * desc
 *
 * @author: kayn
 * 2024-12-05 10:39
 **/
public class LsekaiGroup {

    public static final ItemGroup LSEKAI = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(Lsekai.MOD_ID,"mcs"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.lsekai"))
                    .entries(LsekaiGroup::addItems)
                    .icon(LsekaiItem.GRAMME_COIN::getDefaultStack)
                    .build()
    );

    public static void addItems(ItemGroup.DisplayContext displayContext, ItemGroup.Entries entries) {
        entries.add(LsekaiItem.GRAMME_COIN);
    }

    public static void initialize(){

    }
}
