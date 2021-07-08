package com.sammy.our_various_tiles.registry;

import com.sammy.our_various_tiles.VariousTilesMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class VariousItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VariousTilesMod.MODID);

    //Read note in VariousBlocks, same logic applies.
    public static Item.Properties DEFAULT_PROPERTIES()
    {
        return new Item.Properties().group(VariousBlocksCreativeTab.INSTANCE);
    }

    public static final RegistryObject<Item> EXAMPLE_BLOCK = ITEMS.register("example_block", () -> new BlockItem(VariousBlocks.EXAMPLE_BLOCK.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EXAMPLE_BLOCK_SLAB = ITEMS.register("example_block_slab", () -> new BlockItem(VariousBlocks.EXAMPLE_BLOCK_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EXAMPLE_BLOCK_STAIRS = ITEMS.register("example_block_stairs", () -> new BlockItem(VariousBlocks.EXAMPLE_BLOCK_STAIRS.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> EXAMPLE_BLOCK_PRESSURE_PLATE = ITEMS.register("example_block_pressure_plate", () -> new BlockItem(VariousBlocks.EXAMPLE_BLOCK_PRESSURE_PLATE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EXAMPLE_BLOCK_BUTTON = ITEMS.register("example_block_button", () -> new BlockItem(VariousBlocks.EXAMPLE_BLOCK_BUTTON.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> EXAMPLE_DOOR = ITEMS.register("example_door", () -> new BlockItem(VariousBlocks.EXAMPLE_DOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EXAMPLE_TRAPDOOR = ITEMS.register("example_trapdoor", () -> new BlockItem(VariousBlocks.EXAMPLE_TRAPDOOR.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> EXAMPLE_BLOCK_WALL = ITEMS.register("example_block_wall", () -> new BlockItem(VariousBlocks.EXAMPLE_BLOCK_WALL.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EXAMPLE_BLOCK_FENCE = ITEMS.register("example_block_fence", () -> new BlockItem(VariousBlocks.EXAMPLE_BLOCK_FENCE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EXAMPLE_BLOCK_FENCE_GATE = ITEMS.register("example_block_fence_gate", () -> new BlockItem(VariousBlocks.EXAMPLE_BLOCK_FENCE_GATE.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> EXAMPLE_PILLAR_BLOCK = ITEMS.register("example_pillar_block", () -> new BlockItem(VariousBlocks.EXAMPLE_PILLAR_BLOCK.get(), DEFAULT_PROPERTIES()));

}