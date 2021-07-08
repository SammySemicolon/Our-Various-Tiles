package com.sammy.our_various_tiles.content.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModStairsBlock extends StairsBlock
{
    public ModStairsBlock(RegistryObject<Block> object, Properties properties)
    {
        super(() -> object.get().getDefaultState(), properties);
    }
}
