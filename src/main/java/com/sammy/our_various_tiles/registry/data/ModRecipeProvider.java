package com.sammy.our_various_tiles.registry.data;

import com.sammy.our_various_tiles.registry.VariousBlocks;
import com.sammy.our_various_tiles.registry.VariousItems;
import net.minecraft.advancements.criterion.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

import static net.minecraft.data.ShapedRecipeBuilder.shapedRecipe;
import static net.minecraft.data.ShapelessRecipeBuilder.shapelessRecipe;

public class ModRecipeProvider extends RecipeProvider
{
    public ModRecipeProvider(DataGenerator generatorIn)
    {
        super(generatorIn);
    }
    
    @Override
    public String getName()
    {
        return "Recipe Provider";
    }
    
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shapedRecipe(VariousBlocks.EXAMPLE_BLOCK.get(), 9).key('#', Items.DIRT).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_dirt", hasItem(Items.DIRT)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(VariousBlocks.EXAMPLE_BLOCK.get(), 3).addIngredient(Items.DIAMOND).addCriterion("has_diamond", hasItem(Items.DIAMOND)).build(consumer, "example_block_alt");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.DIRT), VariousItems.EXAMPLE_BLOCK.get(), 1).addCriterion("has_dirt", hasItem(Items.DIRT)).build(consumer, "example_block_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.COBBLED_NAUTILUS_QUARTZ.get()), VariousItems.COBBLED_NAUTILUS_QUARTZ_STAIRS.get(), 1).addCriterion("has_cobbled_nautilus_quartz", hasItem(VariousItems.COBBLED_NAUTILUS_QUARTZ.get())).build(consumer, "cobbled_nautilus_quartz_stairs_stonecutting");

        ShapedRecipeBuilder.shapedRecipe(VariousBlocks.POLISHED_OBSIDIAN.get(), 8).key('&', Items.OBSIDIAN).patternLine("&&").patternLine("&&").addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer);
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.OBSIDIAN), VariousItems.POLISHED_OBSIDIAN.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "polished_obsidian_stonecutting");

        ShapedRecipeBuilder.shapedRecipe(VariousBlocks.POLISHED_OBSIDIAN_SLAB.get(), 6).key('&', VariousItems.POLISHED_OBSIDIAN.get()).patternLine("&&&").addCriterion("has_obsidian", hasItem(VariousItems.POLISHED_OBSIDIAN.get())).build(consumer);
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.OBSIDIAN), VariousItems.POLISHED_OBSIDIAN_SLAB.get(), 4).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "polished_obsidian_slab_obsidian_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.POLISHED_OBSIDIAN.get()), VariousItems.POLISHED_OBSIDIAN_SLAB.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "polished_obsidian_slab_stonecutting");

        ShapedRecipeBuilder.shapedRecipe(VariousBlocks.POLISHED_OBSIDIAN_STAIRS.get(), 8).key('&', VariousItems.POLISHED_OBSIDIAN.get()).patternLine("&  ").patternLine("&& ").patternLine("&&&").addCriterion("has_obsidian", hasItem(VariousItems.POLISHED_OBSIDIAN.get())).build(consumer);
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.OBSIDIAN), VariousItems.POLISHED_OBSIDIAN_STAIRS.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "polished_obsidian_stairs_obsidian_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.POLISHED_OBSIDIAN.get()), VariousItems.POLISHED_OBSIDIAN_STAIRS.get(), 1).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "polished_obsidian_stairs_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.OBSIDIAN), VariousItems.CUT_OBSIDIAN.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "cut_obsidian_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.OBSIDIAN), VariousItems.CUT_OBSIDIAN_SLAB.get(), 4).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "cut_obsidian_slab_obsidian_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.OBSIDIAN), VariousItems.CUT_OBSIDIAN_STAIRS.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "cut_obsidian_stairs_obsidian_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.CUT_OBSIDIAN.get()), VariousItems.CUT_OBSIDIAN_SLAB.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "cut_obsidian_slab_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.CUT_OBSIDIAN.get()), VariousItems.CUT_OBSIDIAN_STAIRS.get(), 1).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "cut_obsidian_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.CUT_OBSIDIAN.get()), VariousItems.CUT_OBSIDIAN_BRICK.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "cut_obsidian_brick_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.CUT_OBSIDIAN.get()), VariousItems.CUT_OBSIDIAN_BRICK_SLAB.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "cut_obsidian_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.CUT_OBSIDIAN.get()), VariousItems.CUT_OBSIDIAN_BRICK_STAIRS.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "cut_obsidian_brick_stairs_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.CUT_OBSIDIAN_BRICK.get()), VariousItems.CUT_OBSIDIAN_BRICK_SLAB.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "cut_obsidian_brick_brick_slab_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.CUT_OBSIDIAN_BRICK.get()), VariousItems.CUT_OBSIDIAN_BRICK_STAIRS.get(), 1).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "cut_obsidian_brick_brick_stairs_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.OBSIDIAN), VariousItems.HALVED_OBSIDIAN.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "halved_obsidian_stonecutting");
        ShapedRecipeBuilder.shapedRecipe(VariousBlocks.HALVED_OBSIDIAN.get(), 4).key('&', Items.OBSIDIAN).patternLine("&&").addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer);
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.OBSIDIAN), VariousItems.HALVED_OBSIDIAN_SLAB.get(), 4).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "halved_obsidian_slab_obsidian_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.OBSIDIAN), VariousItems.HALVED_OBSIDIAN_STAIRS.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "halved_obsidian_stairs_obsidian_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.HALVED_OBSIDIAN.get()), VariousItems.HALVED_OBSIDIAN_SLAB.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "halved_obsidian_slab_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.HALVED_OBSIDIAN.get()), VariousItems.HALVED_OBSIDIAN_STAIRS.get(), 1).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "halved_obsidian_stairs_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.OBSIDIAN), VariousItems.OBSIDIAN_ADOBE.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "obsidian_adobe_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.OBSIDIAN), VariousItems.OBSIDIAN_ADOBE_SLAB.get(), 4).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "obsidian_adobe_slab_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(Items.OBSIDIAN), VariousItems.OBSIDIAN_ADOBE_STAIRS.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "obsidian_adobe_stairs_stonecutting");

        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.OBSIDIAN_ADOBE.get()), VariousItems.OBSIDIAN_ADOBE_STAIRS.get(), 1).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "obsidian_adobe_adobe_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(VariousItems.OBSIDIAN_ADOBE.get()), VariousItems.OBSIDIAN_ADOBE_SLAB.get(), 2).addCriterion("has_obsidian", hasItem(Items.OBSIDIAN)).build(consumer, "obsidian_adobe_adobe_slab_stonecutting");

    }

    private static void smithingReinforce(Consumer<IFinishedRecipe> recipeConsumer, Item itemToReinforce, Item output, Item reinforcement)
    {
        SmithingRecipeBuilder.smithingRecipe(Ingredient.fromItems(itemToReinforce), Ingredient.fromItems(reinforcement), output).addCriterion("has_" + Registry.ITEM.getKey(reinforcement).getPath(), hasItem(reinforcement)).build(recipeConsumer, Registry.ITEM.getKey(output).getPath() + "_smithing");
    }
    private static void shapelessPlanks(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider planks, ITag<Item> input)
    {
        shapelessRecipe(planks, 4).addIngredient(input).setGroup("planks").addCriterion("has_logs", hasItem(input)).build(recipeConsumer);
    }
    private static void shapelessWood(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider stripped, IItemProvider input)
    {
        shapedRecipe(stripped, 3).key('#', input).patternLine("##").patternLine("##").setGroup("bark").addCriterion("has_log", hasItem(input)).build(recipeConsumer);
    }
    private static void shapelessButton(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider button, IItemProvider input)
    {
        shapelessRecipe(button).addIngredient(input).addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedDoor(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider door, IItemProvider input)
    {
        shapedRecipe(door, 3).key('#', input).patternLine("##").patternLine("##").patternLine("##").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedFence(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider fence, IItemProvider input)
    {
        shapedRecipe(fence, 3).key('#', Items.STICK).key('W', input).patternLine("W#W").patternLine("W#W").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedFenceGate(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider fenceGate, IItemProvider input)
    {
        shapedRecipe(fenceGate).key('#', Items.STICK).key('W', input).patternLine("#W#").patternLine("#W#").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedPressurePlate(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider pressurePlate, IItemProvider input)
    {
        shapedRecipe(pressurePlate).key('#', input).patternLine("##").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedSlab(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider slab, IItemProvider input)
    {
        shapedRecipe(slab, 6).key('#', input).patternLine("###").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedStairs(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider stairs, IItemProvider input)
    {
        shapedRecipe(stairs, 4).key('#', input).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapelessSolidTrapdoor(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider button, IItemProvider input)
    {
        shapelessRecipe(button).addIngredient(input).addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedTrapdoor(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider trapdoor, IItemProvider input)
    {
        shapedRecipe(trapdoor, 2).key('#', input).patternLine("###").patternLine("###").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedSign(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider sign, IItemProvider input)
    {
        String s = Registry.ITEM.getKey(input.asItem()).getPath();
        shapedRecipe(sign, 3).setGroup("sign").key('#', input).key('X', Items.STICK).patternLine("###").patternLine("###").patternLine(" X ").addCriterion("has_" + s, hasItem(input)).build(recipeConsumer);
    }
    private static void shapelessColoredWool(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredWool, IItemProvider dye)
    {
        shapelessRecipe(coloredWool).addIngredient(dye).addIngredient(Blocks.WHITE_WOOL).setGroup("wool").addCriterion("has_white_wool", hasItem(Blocks.WHITE_WOOL)).build(recipeConsumer);
    }
    private static void shapedCarpet(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider carpet, IItemProvider input)
    {
        String s = Registry.ITEM.getKey(input.asItem()).getPath();
        shapedRecipe(carpet, 3).key('#', input).patternLine("##").setGroup("carpet").addCriterion("has_" + s, hasItem(input)).build(recipeConsumer);
    }
    private static void shapelessColoredCarpet(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredCarpet, IItemProvider dye)
    {
        String s = Registry.ITEM.getKey(coloredCarpet.asItem()).getPath();
        String s1 = Registry.ITEM.getKey(dye.asItem()).getPath();
        shapedRecipe(coloredCarpet, 8).key('#', Blocks.WHITE_CARPET).key('$', dye).patternLine("###").patternLine("#$#").patternLine("###").setGroup("carpet").addCriterion("has_white_carpet", hasItem(Blocks.WHITE_CARPET)).addCriterion("has_" + s1, hasItem(dye)).build(recipeConsumer, s + "_from_white_carpet");
    }
    private static void shapedBed(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider bed, IItemProvider wool)
    {
        String s = Registry.ITEM.getKey(wool.asItem()).getPath();
        shapedRecipe(bed).key('#', wool).key('X', ItemTags.PLANKS).patternLine("###").patternLine("XXX").setGroup("bed").addCriterion("has_" + s, hasItem(wool)).build(recipeConsumer);
    }
    private static void shapedColoredBed(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredBed, IItemProvider dye)
    {
        String s = Registry.ITEM.getKey(coloredBed.asItem()).getPath();
        shapelessRecipe(coloredBed).addIngredient(Items.WHITE_BED).addIngredient(dye).setGroup("dyed_bed").addCriterion("has_bed", hasItem(Items.WHITE_BED)).build(recipeConsumer, s + "_from_white_bed");
    }
    private static void shapedBanner(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider banner, IItemProvider input)
    {
        String s = Registry.ITEM.getKey(input.asItem()).getPath();
        shapedRecipe(banner).key('#', input).key('|', Items.STICK).patternLine("###").patternLine("###").patternLine(" | ").setGroup("banner").addCriterion("has_" + s, hasItem(input)).build(recipeConsumer);
    }
    private static void shapedColoredGlass(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredGlass, IItemProvider dye)
    {
        shapedRecipe(coloredGlass, 8).key('#', Blocks.GLASS).key('X', dye).patternLine("###").patternLine("#X#").patternLine("###").setGroup("stained_glass").addCriterion("has_glass", hasItem(Blocks.GLASS)).build(recipeConsumer);
    }
    private static void shapedGlassPane(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider pane, IItemProvider glass)
    {
        shapedRecipe(pane, 16).key('#', glass).patternLine("###").patternLine("###").setGroup("stained_glass_pane").addCriterion("has_glass", hasItem(glass)).build(recipeConsumer);
    }
    private static void shapedColoredPane(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredPane, IItemProvider dye)
    {
        String s = Registry.ITEM.getKey(coloredPane.asItem()).getPath();
        String s1 = Registry.ITEM.getKey(dye.asItem()).getPath();
        shapedRecipe(coloredPane, 8).key('#', Blocks.GLASS_PANE).key('$', dye).patternLine("###").patternLine("#$#").patternLine("###").setGroup("stained_glass_pane").addCriterion("has_glass_pane", hasItem(Blocks.GLASS_PANE)).addCriterion("has_" + s1, hasItem(dye)).build(recipeConsumer, s + "_from_glass_pane");
    }
    private static void shapedColoredTerracotta(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredTerracotta, IItemProvider dye)
    {
        shapedRecipe(coloredTerracotta, 8).key('#', Blocks.TERRACOTTA).key('X', dye).patternLine("###").patternLine("#X#").patternLine("###").setGroup("stained_terracotta").addCriterion("has_terracotta", hasItem(Blocks.TERRACOTTA)).build(recipeConsumer);
    }
    private static void shapedColorConcretePowder(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredConcretePowder, IItemProvider dye)
    {
        shapelessRecipe(coloredConcretePowder, 8).addIngredient(dye).addIngredient(Blocks.SAND, 4).addIngredient(Blocks.GRAVEL, 4).setGroup("concrete_powder").addCriterion("has_sand", hasItem(Blocks.SAND)).addCriterion("has_gravel", hasItem(Blocks.GRAVEL)).build(recipeConsumer);
    }
    protected static EnterBlockTrigger.Instance enteredBlock(Block block)
    {
        return new EnterBlockTrigger.Instance(EntityPredicate.AndPredicate.ANY_AND, block, StatePropertiesPredicate.EMPTY);
    }
    protected static InventoryChangeTrigger.Instance hasItem(IItemProvider item)
    {
        return hasItem(ItemPredicate.Builder.create().item(item).build());
    }
    protected static InventoryChangeTrigger.Instance hasItem(ITag<Item> tag)
    {
        return hasItem(ItemPredicate.Builder.create().tag(tag).build());
    }
    protected static InventoryChangeTrigger.Instance hasItem(ItemPredicate... predicate)
    {
        return new InventoryChangeTrigger.Instance(EntityPredicate.AndPredicate.ANY_AND, MinMaxBounds.IntBound.UNBOUNDED, MinMaxBounds.IntBound.UNBOUNDED, MinMaxBounds.IntBound.UNBOUNDED, predicate);
    }
}