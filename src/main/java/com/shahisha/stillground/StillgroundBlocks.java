package com.shahisha.stillground;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class StillgroundBlocks {
    public static final Block BEDROLL = register("bedroll",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).strength(0.2f).nonOpaque()));

    private static Block register(String name, Block block) {
        Identifier id = Identifier.of(Stillground.MOD_ID, name);
        Registry.register(Registries.BLOCK, id, block);
        Registry.register(Registries.ITEM, id, new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static void register() {
        Stillground.LOGGER.info("Registering Stillground blocks.");
    }
}
