package com.sammy.our_various_tiles;

import com.sammy.our_various_tiles.registry.data.*;
import net.minecraft.data.BlockTagsProvider;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.sammy.our_various_tiles.registry.VariousBlocks.BLOCKS;
import static com.sammy.our_various_tiles.registry.VariousItems.ITEMS;

@Mod(VariousTilesMod.MODID)
public class VariousTilesMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "our_various_tiles";

    public VariousTilesMod()
    {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modBus);
        ITEMS.register(modBus);
        modBus.addListener(this::gatherData);
    }
    public void gatherData(GatherDataEvent evt)
    {
        BlockTagsProvider provider = new ModBlockTagProvider(evt.getGenerator(), evt.getExistingFileHelper());
        evt.getGenerator().addProvider(provider);
        evt.getGenerator().addProvider(new ModItemTagProvider(evt.getGenerator(),provider, evt.getExistingFileHelper()));
        evt.getGenerator().addProvider(new ModBlockStateProvider(evt.getGenerator(), evt.getExistingFileHelper()));
        evt.getGenerator().addProvider(new ModItemModelProvider(evt.getGenerator(), evt.getExistingFileHelper()));
        evt.getGenerator().addProvider(new ModLangProvider(evt.getGenerator()));
        evt.getGenerator().addProvider(new ModLootTableProvider(evt.getGenerator()));
        evt.getGenerator().addProvider(new ModRecipeProvider(evt.getGenerator()));
    }
}
