package com.sammy.our_various_tiles.registry;

import com.sammy.our_various_tiles.VariousTilesMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class VariousBlocksCreativeTab extends ItemGroup
{
    public static final VariousBlocksCreativeTab INSTANCE = new VariousBlocksCreativeTab();

    public VariousBlocksCreativeTab() {
        super(VariousTilesMod.MODID);
    }
    
    @Nonnull
    @Override
    public ItemStack createIcon() {
        return new ItemStack(VariousItems.EXAMPLE_BLOCK.get());
    }
}
