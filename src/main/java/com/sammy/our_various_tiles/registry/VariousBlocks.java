package com.sammy.our_various_tiles.registry;

import com.sammy.our_various_tiles.VariousTilesMod;
import com.sammy.our_various_tiles.content.blocks.ModStairsBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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
    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(EXAMPLE_PROPERTIES()));
    public static final RegistryObject<Block> EXAMPLE_BLOCK_SLAB = BLOCKS.register("example_block_slab", () -> new SlabBlock(EXAMPLE_PROPERTIES()));
    public static final RegistryObject<Block> EXAMPLE_BLOCK_STAIRS = BLOCKS.register("example_block_stairs", () -> new ModStairsBlock(EXAMPLE_BLOCK, EXAMPLE_PROPERTIES()));

    public static final RegistryObject<Block> EXAMPLE_BLOCK_PRESSURE_PLATE = BLOCKS.register("example_block_pressure_plate", () -> new PressurePlateBlock(Sensitivity.MOBS, EXAMPLE_PROPERTIES()));
    public static final RegistryObject<Block> EXAMPLE_BLOCK_BUTTON = BLOCKS.register("example_block_button", () -> new WoodButtonBlock(EXAMPLE_PROPERTIES()));

    public static final RegistryObject<Block> EXAMPLE_DOOR = BLOCKS.register("example_door", () -> new DoorBlock(EXAMPLE_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> EXAMPLE_TRAPDOOR = BLOCKS.register("example_trapdoor", () -> new TrapDoorBlock(EXAMPLE_PROPERTIES().notSolid()));

    public static final RegistryObject<Block> EXAMPLE_BLOCK_WALL = BLOCKS.register("example_block_wall", () -> new WallBlock(EXAMPLE_PROPERTIES()));
    public static final RegistryObject<Block> EXAMPLE_BLOCK_FENCE = BLOCKS.register("example_block_fence", () -> new FenceBlock(EXAMPLE_PROPERTIES()));
    public static final RegistryObject<Block> EXAMPLE_BLOCK_FENCE_GATE = BLOCKS.register("example_block_fence_gate", () -> new FenceGateBlock(EXAMPLE_PROPERTIES()));

    public static final RegistryObject<Block> EXAMPLE_PILLAR_BLOCK = BLOCKS.register("example_pillar_block", () -> new RotatedPillarBlock(EXAMPLE_PROPERTIES()));
}
