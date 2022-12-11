package net.krezzr.modernsurvival.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.krezzr.modernsurvival.ModernSurvival;
import net.krezzr.modernsurvival.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class ModBlocks {

    private static final int wool_luminance = 5;

    // Fuel Block
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);

    // Glowing Wool
    public static final Block GLOWING_WHITE_WOOL = registerBlock("glowing_white_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.WHITE).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_ORANGE_WOOL = registerBlock("glowing_orange_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.ORANGE).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_MAGENTA_WOOL = registerBlock("glowing_magenta_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.MAGENTA).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_LIGHT_BLUE_WOOL = registerBlock("glowing_light_blue_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.LIGHT_BLUE).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_YELLOW_WOOL = registerBlock("glowing_yellow_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.YELLOW).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_LIME_WOOL = registerBlock("glowing_lime_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.LIME).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_PINK_WOOL = registerBlock("glowing_pink_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.PINK).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_GRAY_WOOL = registerBlock("glowing_gray_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.GRAY).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_LIGHT_GRAY_WOOL = registerBlock("glowing_light_gray_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.LIGHT_GRAY).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_CYAN_WOOL = registerBlock("glowing_cyan_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.CYAN).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_PURPLE_WOOL = registerBlock("glowing_purple_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.PURPLE).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_BLUE_WOOL = registerBlock("glowing_blue_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.BLUE).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_BROWN_WOOL = registerBlock("glowing_brown_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.BROWN).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_GREEN_WOOL = registerBlock("glowing_green_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.GREEN).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_RED_WOOL = registerBlock("glowing_red_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.RED).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_BLACK_WOOL = registerBlock("glowing_black_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.BLACK).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);

    // Glowing Carpet
    public static final Block GLOWING_WHITE_CARPET = registerBlock("glowing_white_carpet",
            new DyedCarpetBlock(DyeColor.WHITE, FabricBlockSettings.of(Material.CARPET, MapColor.WHITE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_ORANGE_CARPET = registerBlock("glowing_orange_carpet",
            new DyedCarpetBlock(DyeColor.ORANGE, FabricBlockSettings.of(Material.CARPET, MapColor.ORANGE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_MAGENTA_CARPET = registerBlock("glowing_magenta_carpet",
            new DyedCarpetBlock(DyeColor.MAGENTA, FabricBlockSettings.of(Material.CARPET, MapColor.MAGENTA)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_LIGHT_BLUE_CARPET = registerBlock("glowing_light_blue_carpet",
            new DyedCarpetBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.of(Material.CARPET, MapColor.LIGHT_BLUE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_YELLOW_CARPET = registerBlock("glowing_yellow_carpet",
            new DyedCarpetBlock(DyeColor.YELLOW, FabricBlockSettings.of(Material.CARPET, MapColor.YELLOW)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_LIME_CARPET = registerBlock("glowing_lime_carpet",
            new DyedCarpetBlock(DyeColor.LIME, FabricBlockSettings.of(Material.CARPET, MapColor.LIME)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_PINK_CARPET = registerBlock("glowing_pink_carpet",
            new DyedCarpetBlock(DyeColor.PINK, FabricBlockSettings.of(Material.CARPET, MapColor.PINK)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_GRAY_CARPET = registerBlock("glowing_gray_carpet",
            new DyedCarpetBlock(DyeColor.GRAY, FabricBlockSettings.of(Material.CARPET, MapColor.GRAY)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_LIGHT_GRAY_CARPET = registerBlock("glowing_light_gray_carpet",
            new DyedCarpetBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.of(Material.CARPET, MapColor.LIGHT_GRAY)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_CYAN_CARPET = registerBlock("glowing_cyan_carpet",
            new DyedCarpetBlock(DyeColor.YELLOW, FabricBlockSettings.of(Material.CARPET, MapColor.YELLOW)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_PURPLE_CARPET = registerBlock("glowing_purple_carpet",
            new DyedCarpetBlock(DyeColor.PURPLE, FabricBlockSettings.of(Material.CARPET, MapColor.PURPLE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_BLUE_CARPET = registerBlock("glowing_blue_carpet",
            new DyedCarpetBlock(DyeColor.BLUE, FabricBlockSettings.of(Material.CARPET, MapColor.BLUE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_BROWN_CARPET = registerBlock("glowing_brown_carpet",
            new DyedCarpetBlock(DyeColor.BROWN, FabricBlockSettings.of(Material.CARPET, MapColor.BROWN)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_GREEN_CARPET = registerBlock("glowing_green_carpet",
            new DyedCarpetBlock(DyeColor.GREEN, FabricBlockSettings.of(Material.CARPET, MapColor.GREEN)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_RED_CARPET = registerBlock("glowing_red_carpet",
            new DyedCarpetBlock(DyeColor.RED, FabricBlockSettings.of(Material.CARPET, MapColor.RED)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_BLACK_CARPET = registerBlock("glowing_black_carpet",
            new DyedCarpetBlock(DyeColor.BLACK, FabricBlockSettings.of(Material.CARPET, MapColor.BLACK)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> wool_luminance)
                    .postProcess(ModBlocks::isAlwaysTrue).emissiveLighting(ModBlocks::isAlwaysTrue)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);

    public static boolean isAlwaysTrue(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ModernSurvival.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ModernSurvival.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        ModernSurvival.LOGGER.info("registering ModBlocks for " + ModernSurvival.MOD_ID);
    }
}
