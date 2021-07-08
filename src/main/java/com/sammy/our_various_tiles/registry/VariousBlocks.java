package com.sammy.our_various_tiles.registry;

import com.sammy.our_various_tiles.VariousTilesMod;
import com.sammy.our_various_tiles.content.blocks.ModStairsBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;
import java.time.temporal.IsoFields;

import static net.minecraft.block.PressurePlateBlock.*;
import static net.minecraft.block.PressurePlateBlock.Sensitivity.EVERYTHING;

public class VariousBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VariousTilesMod.MODID);
    //note: if you wanna see vanilla' block properties, go to the 'Blocks' class (net.minecraft.block.Blocks;)
    //To do this you can simply type out Blocks anywhere and then press ctrl + B, it'll take you there
    //another note: for convenience, our properties are in form of a method as shown below. Minecraft Blocks' properties don't use a method and are instead placed directly in the block register.
    public static AbstractBlock.Properties EXAMPLE_PROPERTIES()
    {
        return AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).sound(SoundType.STONE).setRequiresTool().hardnessAndResistance(1.25F, 9.0F);
    }
    public static AbstractBlock.Properties STONE_PROPERTIES()
    {
        return AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).sound(SoundType.STONE).setRequiresTool().hardnessAndResistance(1.25F, 9.0F);
    }

    public static AbstractBlock.Properties SOFT_WOOD_PROPERTIES()
    {
        return AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).setRequiresTool().hardnessAndResistance(0.75F, 8.35F);
    }
    public static AbstractBlock.Properties HARD_STONE_PROPERTIES()
    {
        return AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).sound(SoundType.STONE).setRequiresTool().hardnessAndResistance(2F, 11.0F);
    }
    public static AbstractBlock.Properties SOFT_STONE_PROPERTIES()
    {
        return AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).sound(SoundType.STONE).setRequiresTool().hardnessAndResistance(0.75F, 6.0F);
    }
    public static final RegistryObject<Block> COBBLED_NAUTILUS_QUARTZ = BLOCKS.register("cobbled_nautilus_quartz", () -> new Block(STONE_PROPERTIES()));
    public static final RegistryObject<Block> COBBLED_NAUTILUS_QUARTZ_SLAB = BLOCKS.register("cobbled_nautilus_quartz_slab", () -> new SlabBlock(STONE_PROPERTIES()));
    public static final RegistryObject<Block> COBBLED_NAUTILUS_QUARTZ_STAIRS = BLOCKS.register("cobbled_nautilus_quartz_stairs", () -> new ModStairsBlock(COBBLED_NAUTILUS_QUARTZ, STONE_PROPERTIES()));
    public static final RegistryObject<Block> COBBLED_NAUTILUS_QUARTZ_WALL = BLOCKS.register("cobbled_nautilus_quartz_wall", () -> new WallBlock(STONE_PROPERTIES()));
    public static final RegistryObject<Block> CHISELED_NAUTILUS_QUARTZ = BLOCKS.register("chiseled_nautilus_quartz", () -> new Block(STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_NAUTILUS_QUARTZ = BLOCKS.register("polished_nautilus_quartz", () -> new Block(STONE_PROPERTIES()));
    public static final RegistryObject<Block> CUT_NAUTILUS_QUARTZ_BRICKS = BLOCKS.register("cut_nautilus_quartz_bricks", () -> new Block(STONE_PROPERTIES()));
    public static final RegistryObject<Block> CUT_NAUTILUS_QUARTZ_BRICKS_STAIRS = BLOCKS.register("cut_nautilus_quartz_bricks_stairs", () -> new ModStairsBlock(CUT_NAUTILUS_QUARTZ_BRICKS, STONE_PROPERTIES()));
    public static final RegistryObject<Block> CUT_NAUTILUS_QUARTZ_BRICKS_SLAB = BLOCKS.register("cut_nautilus_quartz_bricks_slab", () -> new SlabBlock(STONE_PROPERTIES()));
    public static final RegistryObject<Block> CUT_NAUTILUS_QUARTZ_BRICKS_WALL = BLOCKS.register("cut_nautilus_quartz_bricks_wall", () -> new WallBlock(STONE_PROPERTIES()));

    public static final RegistryObject<Block> POLISHED_DEBRIS = BLOCKS.register("polished_debris", () -> new Block(HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_DEBRIS_STAIRS = BLOCKS.register("polished_debris_stairs", () -> new ModStairsBlock(POLISHED_DEBRIS, HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_DEBRIS_SLAB = BLOCKS.register("polished_debris_slab", () -> new SlabBlock(HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_DEBRIS_WALL = BLOCKS.register("polished_debris_wall", () -> new WallBlock(HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_DEBRIS_BRICKS = BLOCKS.register("polished_debris_bricks", () -> new Block(HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_DEBRIS_BRICKS_STAIRS = BLOCKS.register("polished_debris_bricks_stairs", () -> new ModStairsBlock(POLISHED_DEBRIS_BRICKS, HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_DEBRIS_BRICKS_SLAB = BLOCKS.register("polished_debris_bricks_slab", () -> new SlabBlock(HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_DEBRIS_BRICKS_WALL = BLOCKS.register("polished_debris_bricks_wall", () -> new WallBlock(HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> CUT_DEBRIS_BRICKS = BLOCKS.register("cut_debris_bricks", () -> new Block(HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> CUT_DEBRIS_BRICKS_STAIRS = BLOCKS.register("cut_debris_bricks_stairs", () -> new ModStairsBlock(CUT_DEBRIS_BRICKS, HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> CUT_DEBRIS_BRICKS_SLAB = BLOCKS.register("cut_debris_bricks_slab", () -> new SlabBlock(HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> CUT_DEBRIS_BRICKS_WALL = BLOCKS.register("cut_debris_bricks_wall", () -> new WallBlock(HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_DEBRIS_TILES = BLOCKS.register("polished_debris_tiles", () -> new Block(HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_DEBRIS_TILES_STAIRS = BLOCKS.register("polished_debris_tiles_stairs", () -> new ModStairsBlock(POLISHED_DEBRIS_TILES, HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_DEBRIS_TILES_SLAB = BLOCKS.register("polished_debris_tiles_slab", () -> new SlabBlock(HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_DEBRIS_TILES_WALL = BLOCKS.register("polished_debris_tiles_wall", () -> new WallBlock(HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> CHISELED_DEBRIS_BRICKS = BLOCKS.register("chiseled_debris_bricks", () -> new Block(HARD_STONE_PROPERTIES()));
    public static final RegistryObject<Block> DEBRIS_SHINGLES = BLOCKS.register("debris_shingles", () -> new RotatedPillarBlock(HARD_STONE_PROPERTIES()));

    public static final RegistryObject<Block> SOULSTONE = BLOCKS.register("soulstone", () -> new Block(SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> SOULSTONE_STAIRS = BLOCKS.register("soulstone_stairs", () -> new ModStairsBlock(SOULSTONE, SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> SOULSTONE_SLAB = BLOCKS.register("soulstone_slab", () -> new SlabBlock(SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> SOULSTONE_WALL = BLOCKS.register("soulstone_wall", () -> new WallBlock(SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_SOULSAND = BLOCKS.register("polished_soulsand", () -> new Block(SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_SOULSAND_STAIRS = BLOCKS.register("polished_soulsand_stairs", () -> new ModStairsBlock(POLISHED_SOULSAND, SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_SOULSAND_SLAB = BLOCKS.register("polished_soulsand_slab", () -> new SlabBlock(SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> POLISHED_SOULSAND_WALL = BLOCKS.register("polished_soulsand_wall", () -> new WallBlock(SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> EMERALD_PLATED_POLISHED_SOULSAND = BLOCKS.register("emerald_plated_polished_soulsand", () -> new Block(STONE_PROPERTIES()));
    public static final RegistryObject<Block> EMERALD_PLATED_POLISHED_SOULSAND_STAIRS = BLOCKS.register("emerald_plated_polished_soulsand_stairs", () -> new ModStairsBlock(EMERALD_PLATED_POLISHED_SOULSAND, STONE_PROPERTIES()));
    public static final RegistryObject<Block> EMERALD_PLATED_POLISHED_SOULSAND_SLAB = BLOCKS.register("emerald_plated_polished_soulsand_slab", () -> new SlabBlock(STONE_PROPERTIES()));
    public static final RegistryObject<Block> EMERALD_PLATED_POLISHED_SOULSAND_WALL = BLOCKS.register("emerald_plated_polished_soulsand_wall", () -> new WallBlock(STONE_PROPERTIES()));
    public static final RegistryObject<Block> SOULSAND_BRICKS = BLOCKS.register("soulsand_bricks", () -> new Block(SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> SOULSAND_BRICKS_STAIRS = BLOCKS.register("soulsand_bricks_stairs", () -> new ModStairsBlock(SOULSAND_BRICKS, SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> SOULSAND_BRICKS_SLAB = BLOCKS.register("soulsand_bricks_slab", () -> new SlabBlock(SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> SOULSAND_BRICKS_WALL = BLOCKS.register("soulsand_bricks_wall", () -> new WallBlock(SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> EMERALD_SOULSAND_BRICKS = BLOCKS.register("emerald_soulsand_bricks", () -> new Block(SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> EMERALD_SOULSAND_BRICKS_STAIRS = BLOCKS.register("emerald_soulsand_bricks_stairs", () -> new ModStairsBlock(EMERALD_SOULSAND_BRICKS, SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> EMERALD_SOULSAND_BRICKS_SLAB = BLOCKS.register("emerald_soulsand_bricks_slab", () -> new SlabBlock(SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> EMERALD_SOULSAND_BRICKS_WALL = BLOCKS.register("emerald_soulsand_bricks_wall", () -> new WallBlock(SOFT_STONE_PROPERTIES()));
    public static final RegistryObject<Block> EMERALD_CHISELED_SOULSAND_BRICKS = BLOCKS.register("emerald_chiseled_soulsand_bricks", () -> new Block(SOFT_STONE_PROPERTIES()));

    public static final RegistryObject<Block> CHISELED_HONEY_PUMPKIN = BLOCKS.register("chiseled_honey_pumpkin", () -> new Block(SOFT_WOOD_PROPERTIES()));
    public static final RegistryObject<Block> HONEY_PUMPKIN_BRICKS = BLOCKS.register("honey_pumpkin_bricks", () -> new Block(SOFT_WOOD_PROPERTIES()));
    public static final RegistryObject<Block> HONEY_PUMPKIN_BRICKS_STAIRS = BLOCKS.register("honey_pumpkin_bricks_stairs", () -> new ModStairsBlock(HONEY_PUMPKIN_BRICKS, SOFT_WOOD_PROPERTIES()));
    public static final RegistryObject<Block> HONEY_PUMPKIN_BRICKS_SLAB = BLOCKS.register("honey_pumpkin_bricks_slab", () -> new SlabBlock(SOFT_WOOD_PROPERTIES()));
    public static final RegistryObject<Block> HONEY_PUMPKIN_BRICKS_WALL = BLOCKS.register("honey_pumpkin_bricks_wall", () -> new WallBlock(SOFT_WOOD_PROPERTIES()));
    public static final RegistryObject<Block> HONEY_PUMPKIN_TILES = BLOCKS.register("honey_pumpkin_tiles", () -> new Block(SOFT_WOOD_PROPERTIES()));
    public static final RegistryObject<Block> HONEY_PUMPKIN_TILES_STAIRS = BLOCKS.register("honey_pumpkin_tiles_stairs", () -> new ModStairsBlock(HONEY_PUMPKIN_TILES ,SOFT_WOOD_PROPERTIES()));
    public static final RegistryObject<Block> HONEY_PUMPKIN_TILES_SLAB = BLOCKS.register("honey_pumpkin_tiles_slab", () -> new SlabBlock(SOFT_WOOD_PROPERTIES()));
    public static final RegistryObject<Block> HONEY_PUMPKIN_TILES_WALL = BLOCKS.register("honey_pumpkin_tiles_wall", () -> new WallBlock(SOFT_WOOD_PROPERTIES()));




    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(EXAMPLE_PROPERTIES()));
    public static final RegistryObject<Block> EXAMPLE_BLOCK_SLAB = BLOCKS.register("example_block_slab", () -> new SlabBlock(EXAMPLE_PROPERTIES()));
    public static final RegistryObject<Block> EXAMPLE_BLOCK_STAIRS = BLOCKS.register("example_block_stairs", () -> new ModStairsBlock(EXAMPLE_BLOCK, EXAMPLE_PROPERTIES()));

    public static final RegistryObject<Block> EXAMPLE_BLOCK_PRESSURE_PLATE = BLOCKS.register("example_block_pressure_plate", () -> new PressurePlateBlock(Sensitivity.MOBS, EXAMPLE_PROPERTIES()));
    public static final RegistryObject<Block> EXAMPLE_BLOCK_BUTTON = BLOCKS.register("example_block_button", () -> new WoodButtonBlock(EXAMPLE_PROPERTIES()));

    public static final RegistryObject<Block> EXAMPLE_DOOR = BLOCKS.register("example_door", () -> new DoorBlock(EXAMPLE_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> EXAMPLE_TRAPDOOR = BLOCKS.register("example_trapdoor", () -> new TrapDoorBlock(EXAMPLE_PROPERTIES().notSolid()));

    public static final RegistryObject<Block> EXAMPLE_BLOCK_WALL = BLOCKS.register("example_block_wall", () -> new Block(EXAMPLE_PROPERTIES()));
    public static final RegistryObject<Block> EXAMPLE_BLOCK_FENCE = BLOCKS.register("example_block_fence", () -> new FenceBlock(EXAMPLE_PROPERTIES()));
    public static final RegistryObject<Block> EXAMPLE_BLOCK_FENCE_GATE = BLOCKS.register("example_block_fence_gate", () -> new FenceGateBlock(EXAMPLE_PROPERTIES()));

    public static final RegistryObject<Block> EXAMPLE_PILLAR_BLOCK = BLOCKS.register("example_pillar_block", () -> new RotatedPillarBlock(EXAMPLE_PROPERTIES()));
}
