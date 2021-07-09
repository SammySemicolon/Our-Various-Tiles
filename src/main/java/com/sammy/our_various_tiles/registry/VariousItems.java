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
    public static final RegistryObject<Item> COBBLED_NAUTILUS_QUARTZ = ITEMS.register("cobbled_nautilus_quartz", () -> new BlockItem(VariousBlocks.COBBLED_NAUTILUS_QUARTZ.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> COBBLED_NAUTILUS_QUARTZ_SLAB = ITEMS.register("cobbled_nautilus_quartz_slab", () -> new BlockItem(VariousBlocks.COBBLED_NAUTILUS_QUARTZ_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> COBBLED_NAUTILUS_QUARTZ_STAIRS = ITEMS.register("cobbled_nautilus_quartz_stairs", () -> new BlockItem(VariousBlocks.COBBLED_NAUTILUS_QUARTZ_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> COBBLED_NAUTILUS_QUARTZ_WALL = ITEMS.register("cobbled_nautilus_quartz_wall", () -> new BlockItem(VariousBlocks.COBBLED_NAUTILUS_QUARTZ_WALL.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CHISELED_NAUTILUS_QUARTZ = ITEMS.register("chiseled_nautilus_quartz", () -> new BlockItem(VariousBlocks.CHISELED_NAUTILUS_QUARTZ.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_NAUTILUS_QUARTZ = ITEMS.register("polished_nautilus_quartz", () -> new BlockItem(VariousBlocks.POLISHED_NAUTILUS_QUARTZ.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CUT_NAUTILUS_QUARTZ_BRICKS = ITEMS.register("cut_nautilus_quartz_bricks", () -> new BlockItem(VariousBlocks.CUT_NAUTILUS_QUARTZ_BRICKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CUT_NAUTILUS_QUARTZ_BRICKS_STAIRS = ITEMS.register("cut_nautilus_quartz_bricks_stairs", () -> new BlockItem(VariousBlocks.CUT_NAUTILUS_QUARTZ_BRICKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CUT_NAUTILUS_QUARTZ_BRICKS_SLAB = ITEMS.register("cut_nautilus_quartz_bricks_slab", () -> new BlockItem(VariousBlocks.CUT_NAUTILUS_QUARTZ_BRICKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CUT_NAUTILUS_QUARTZ_BRICKS_WALL = ITEMS.register("cut_nautilus_quartz_bricks_wall", () -> new BlockItem(VariousBlocks.CUT_NAUTILUS_QUARTZ_BRICKS_WALL.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> POLISHED_DEBRIS = ITEMS.register("polished_debris", () -> new BlockItem(VariousBlocks.POLISHED_DEBRIS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_DEBRIS_STAIRS = ITEMS.register("polished_debris_stairs", () -> new BlockItem(VariousBlocks.POLISHED_DEBRIS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_DEBRIS_SLAB = ITEMS.register("polished_debris_slab", () -> new BlockItem(VariousBlocks.POLISHED_DEBRIS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_DEBRIS_WALL = ITEMS.register("polished_debris_wall", () -> new BlockItem(VariousBlocks.POLISHED_DEBRIS_WALL.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_DEBRIS_BRICKS = ITEMS.register("polished_debris_bricks", () -> new BlockItem(VariousBlocks.POLISHED_DEBRIS_BRICKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_DEBRIS_BRICKS_STAIRS = ITEMS.register("polished_debris_bricks_stairs", () -> new BlockItem(VariousBlocks.POLISHED_DEBRIS_BRICKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_DEBRIS_BRICKS_SLAB = ITEMS.register("polished_debris_bricks_slab", () -> new BlockItem(VariousBlocks.POLISHED_DEBRIS_BRICKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_DEBRIS_BRICKS_WALL = ITEMS.register("polished_debris_bricks_wall", () -> new BlockItem(VariousBlocks.POLISHED_DEBRIS_BRICKS_WALL.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CUT_DEBRIS_BRICKS = ITEMS.register("cut_debris_bricks", () -> new BlockItem(VariousBlocks.CUT_DEBRIS_BRICKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CUT_DEBRIS_BRICKS_STAIRS = ITEMS.register("cut_debris_bricks_stairs", () -> new BlockItem(VariousBlocks.CUT_DEBRIS_BRICKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CUT_DEBRIS_BRICKS_SLAB = ITEMS.register("cut_debris_bricks_slab", () -> new BlockItem(VariousBlocks.CUT_DEBRIS_BRICKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CUT_DEBRIS_BRICKS_WALL = ITEMS.register("cut_debris_bricks_wall", () -> new BlockItem(VariousBlocks.CUT_DEBRIS_BRICKS_WALL.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_DEBRIS_TILES = ITEMS.register("polished_debris_tiles", () -> new BlockItem(VariousBlocks.POLISHED_DEBRIS_TILES.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_DEBRIS_TILES_STAIRS = ITEMS.register("polished_debris_tiles_stairs", () -> new BlockItem(VariousBlocks.POLISHED_DEBRIS_TILES_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_DEBRIS_TILES_SLAB = ITEMS.register("polished_debris_tiles_slab", () -> new BlockItem(VariousBlocks.POLISHED_DEBRIS_TILES_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_DEBRIS_TILES_WALL = ITEMS.register("polished_debris_tiles_wall", () -> new BlockItem(VariousBlocks.POLISHED_DEBRIS_TILES_WALL.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CHISELED_DEBRIS_BRICKS = ITEMS.register("chiseled_debris_bricks", () -> new BlockItem(VariousBlocks.CHISELED_DEBRIS_BRICKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> DEBRIS_SHINGLES = ITEMS.register("debris_shingles", () -> new BlockItem(VariousBlocks.DEBRIS_SHINGLES.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> SOULSTONE = ITEMS.register("soulstone", () -> new BlockItem(VariousBlocks.SOULSTONE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SOULSTONE_STAIRS = ITEMS.register("soulstone_stairs", () -> new BlockItem(VariousBlocks.SOULSTONE_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SOULSTONE_SLAB = ITEMS.register("soulstone_slab", () -> new BlockItem(VariousBlocks.SOULSTONE_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SOULSTONE_WALL = ITEMS.register("soulstone_wall", () -> new BlockItem(VariousBlocks.SOULSTONE_WALL.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_SOULSAND = ITEMS.register("polished_soulsand", () -> new BlockItem(VariousBlocks.POLISHED_SOULSAND.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_SOULSAND_STAIRS = ITEMS.register("polished_soulsand_stairs", () -> new BlockItem(VariousBlocks.POLISHED_SOULSAND_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_SOULSAND_SLAB = ITEMS.register("polished_soulsand_slab", () -> new BlockItem(VariousBlocks.POLISHED_SOULSAND_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_SOULSAND_WALL = ITEMS.register("polished_soulsand_wall", () -> new BlockItem(VariousBlocks.POLISHED_SOULSAND_WALL.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EMERALD_PLATED_POLISHED_SOULSAND = ITEMS.register("emerald_plated_polished_soulsand", () -> new BlockItem(VariousBlocks.EMERALD_PLATED_POLISHED_SOULSAND.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EMERALD_PLATED_POLISHED_SOULSAND_STAIRS = ITEMS.register("emerald_plated_polished_soulsand_stairs", () -> new BlockItem(VariousBlocks.EMERALD_PLATED_POLISHED_SOULSAND_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EMERALD_PLATED_POLISHED_SOULSAND_SLAB = ITEMS.register("emerald_plated_polished_soulsand_slab", () -> new BlockItem(VariousBlocks.EMERALD_PLATED_POLISHED_SOULSAND_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EMERALD_PLATED_POLISHED_SOULSAND_WALL = ITEMS.register("emerald_plated_polished_soulsand_wall", () -> new BlockItem(VariousBlocks.EMERALD_PLATED_POLISHED_SOULSAND_WALL.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_SOULSAND_BRICKS = ITEMS.register("polished_soulsand_bricks", () -> new BlockItem(VariousBlocks.POLISHED_SOULSAND_BRICKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_SOULSAND_BRICKS_STAIRS = ITEMS.register("polished_soulsand_bricks_stairs", () -> new BlockItem(VariousBlocks.POLISHED_SOULSAND_BRICKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_SOULSAND_BRICKS_SLAB = ITEMS.register("polished_soulsand_bricks_slab", () -> new BlockItem(VariousBlocks.POLISHED_SOULSAND_BRICKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_SOULSAND_BRICKS_WALL = ITEMS.register("polished_soulsand_bricks_wall", () -> new BlockItem(VariousBlocks.POLISHED_SOULSAND_BRICKS_WALL.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EMERALD_SOULSAND_BRICKS = ITEMS.register("emerald_soulsand_bricks", () -> new BlockItem(VariousBlocks.EMERALD_SOULSAND_BRICKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EMERALD_SOULSAND_BRICKS_STAIRS = ITEMS.register("emerald_soulsand_bricks_stairs", () -> new BlockItem(VariousBlocks.EMERALD_SOULSAND_BRICKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EMERALD_SOULSAND_BRICKS_SLAB = ITEMS.register("emerald_soulsand_bricks_slab", () -> new BlockItem(VariousBlocks.EMERALD_SOULSAND_BRICKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EMERALD_SOULSAND_BRICKS_WALL = ITEMS.register("emerald_soulsand_bricks_wall", () -> new BlockItem(VariousBlocks.EMERALD_SOULSAND_BRICKS_WALL.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> EMERALD_CHISELED_SOULSAND_BRICKS = ITEMS.register("emerald_chiseled_soulsand_bricks", () -> new BlockItem(VariousBlocks.EMERALD_CHISELED_SOULSAND_BRICKS.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> CHISELED_HONEY_PUMPKIN = ITEMS.register("chiseled_honey_pumpkin", () -> new BlockItem(VariousBlocks.CHISELED_HONEY_PUMPKIN.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> HONEY_PUMPKIN_BRICKS = ITEMS.register("honey_pumpkin_bricks", () -> new BlockItem(VariousBlocks.HONEY_PUMPKIN_BRICKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> HONEY_PUMPKIN_BRICKS_STAIRS = ITEMS.register("honey_pumpkin_bricks_stairs", () -> new BlockItem(VariousBlocks.HONEY_PUMPKIN_BRICKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> HONEY_PUMPKIN_BRICKS_SLAB = ITEMS.register("honey_pumpkin_bricks_slab", () -> new BlockItem(VariousBlocks.HONEY_PUMPKIN_BRICKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> HONEY_PUMPKIN_BRICKS_WALL = ITEMS.register("honey_pumpkin_bricks_wall", () -> new BlockItem(VariousBlocks.HONEY_PUMPKIN_BRICKS_WALL.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> HONEY_PUMPKIN_TILES = ITEMS.register("honey_pumpkin_tiles", () -> new BlockItem(VariousBlocks.HONEY_PUMPKIN_TILES.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> HONEY_PUMPKIN_TILES_STAIRS = ITEMS.register("honey_pumpkin_tiles_stairs", () -> new BlockItem(VariousBlocks.HONEY_PUMPKIN_TILES_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> HONEY_PUMPKIN_TILES_SLAB = ITEMS.register("honey_pumpkin_tiles_slab", () -> new BlockItem(VariousBlocks.HONEY_PUMPKIN_TILES_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> HONEY_PUMPKIN_TILES_WALL = ITEMS.register("honey_pumpkin_tiles_wall", () -> new BlockItem(VariousBlocks.HONEY_PUMPKIN_TILES_WALL.get(), DEFAULT_PROPERTIES()));


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

    public static final RegistryObject<Item> POLISHED_OBSIDIAN = ITEMS.register("polished_obsidian", () -> new BlockItem(VariousBlocks.POLISHED_OBSIDIAN.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_OBSIDIAN_SLAB = ITEMS.register("polished_obsidian_slab", () -> new BlockItem(VariousBlocks.POLISHED_OBSIDIAN_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> POLISHED_OBSIDIAN_STAIRS = ITEMS.register("polished_obsidian_stairs", () -> new BlockItem(VariousBlocks.POLISHED_OBSIDIAN_STAIRS.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> CUT_OBSIDIAN = ITEMS.register("cut_obsidian", () -> new BlockItem(VariousBlocks.CUT_OBSIDIAN.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CUT_OBSIDIAN_SLAB = ITEMS.register("cut_obsidian_slab", () -> new BlockItem(VariousBlocks.CUT_OBSIDIAN_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CUT_OBSIDIAN_STAIRS = ITEMS.register("cut_obsidian_stairs", () -> new BlockItem(VariousBlocks.CUT_OBSIDIAN_STAIRS.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> CUT_OBSIDIAN_BRICK = ITEMS.register("cut_obsidian_brick", () -> new BlockItem(VariousBlocks.CUT_OBSIDIAN_BRICK.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CUT_OBSIDIAN_BRICK_SLAB = ITEMS.register("cut_obsidian_brick_slab", () -> new BlockItem(VariousBlocks.CUT_OBSIDIAN_BRICK_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> CUT_OBSIDIAN_BRICK_STAIRS = ITEMS.register("cut_obsidian_brick_stairs", () -> new BlockItem(VariousBlocks.CUT_OBSIDIAN_BRICK_STAIRS.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> HALVED_OBSIDIAN = ITEMS.register("halved_obsidian", () -> new BlockItem(VariousBlocks.HALVED_OBSIDIAN.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> HALVED_OBSIDIAN_SLAB = ITEMS.register("halved_obsidian_slab", () -> new BlockItem(VariousBlocks.HALVED_OBSIDIAN_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> HALVED_OBSIDIAN_STAIRS = ITEMS.register("halved_obsidian_stairs", () -> new BlockItem(VariousBlocks.HALVED_OBSIDIAN_STAIRS.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> OBSIDIAN_ADOBE = ITEMS.register("obsidian_adobe", () -> new BlockItem(VariousBlocks.OBSIDIAN_ADOBE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> OBSIDIAN_ADOBE_SLAB = ITEMS.register("obsidian_adobe_slab", () -> new BlockItem(VariousBlocks.OBSIDIAN_ADOBE_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> OBSIDIAN_ADOBE_STAIRS = ITEMS.register("obsidian_adobe_stairs", () -> new BlockItem(VariousBlocks.OBSIDIAN_ADOBE_STAIRS.get(), DEFAULT_PROPERTIES()));
}