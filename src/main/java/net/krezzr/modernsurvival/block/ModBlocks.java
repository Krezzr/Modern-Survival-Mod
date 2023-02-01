package net.krezzr.modernsurvival.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.krezzr.modernsurvival.ModernSurvival;
import net.krezzr.modernsurvival.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
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

    private static final int wool_luminance = 9;

    // Fuel Block
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block BREBIUM_BLOCK = registerBlock("brebium_block",
            new Block(FabricBlockSettings.of(Material.METAL, MapColor.DARK_AQUA).requiresTool().strength(7.0f, 8.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);

    // Compressed Block
    public static final Block COMPRESSED_AMETHYST_BLOCK = registerBlock("compressed_amethyst_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST, MapColor.PINK).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_ANDESITE = registerBlock("compressed_andesite",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_BASALT = registerBlock("compressed_basalt",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.GRAY).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_BLACKSTONE = registerBlock("compressed_blackstone",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_BREBIUM_BLOCK = registerBlock("compressed_brebium_block",
            new Block(FabricBlockSettings.of(Material.METAL, MapColor.DARK_AQUA).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_BRICKS = registerBlock("compressed_bricks",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.DULL_RED).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_CALCITE = registerBlock("compressed_calcite",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.WHITE_GRAY).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_CHARCOAL_BLOCK = registerBlock("compressed_charcoal_block",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_BLACK).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_COAL_BLOCK = registerBlock("compressed_coal_block",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_COBBLED_DEEPSLATE = registerBlock("compressed_cobbled_deepslate",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.GRAY).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_COBBLESTONE = registerBlock("compressed_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.GRAY).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_COPPER_BLOCK = registerBlock("compressed_copper_block",
            new Block(FabricBlockSettings.of(Material.METAL, MapColor.TERRACOTTA_ORANGE).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_DEEPSLATE = registerBlock("compressed_deepslate",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.GRAY).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_DIAMOND_BLOCK = registerBlock("compressed_diamond_block",
            new Block(FabricBlockSettings.of(Material.METAL, MapColor.DIAMOND_BLUE).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_DIORITE = registerBlock("compressed_diorite",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.LIGHT_GRAY).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_DIRT = registerBlock("compressed_dirt",
            new Block(FabricBlockSettings.of(Material.AGGREGATE, MapColor.DIRT_BROWN).strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_EMERALD_BLOCK = registerBlock("compressed_emerald_block",
            new Block(FabricBlockSettings.of(Material.METAL, MapColor.EMERALD_GREEN).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_END_STONE = registerBlock("compressed_end_stone",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_GLOWSTONE = registerBlock("compressed_glowstone",
            new Block(FabricBlockSettings.of(Material.GLASS, MapColor.PALE_YELLOW).requiresTool()
                    .strength(5.0f, 6.0f).sounds(BlockSoundGroup.GLASS)
                    .luminance((state) -> { return 15; })), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_GOLD_BLOCK = registerBlock("compressed_gold_block",
            new Block(FabricBlockSettings.of(Material.METAL, MapColor.GOLD).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_GRANITE = registerBlock("compressed_granite",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.DULL_RED).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_GRAVEL = registerBlock("compressed_gravel",
            new GravelBlock(FabricBlockSettings.of(Material.AGGREGATE, MapColor.LIGHT_GRAY)
                    .strength(5.0f, 6.0f).requiresTool().sounds(BlockSoundGroup.GRAVEL)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_IRON_BLOCK = registerBlock("compressed_iron_block",
            new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_LAPIS_BLOCK = registerBlock("compressed_lapis_block",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.LAPIS_BLUE).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_MUD = registerBlock("compressed_mud",
            new Block(FabricBlockSettings.of(Material.SOIL, MapColor.BROWN).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_NETHERITE_BLOCK = registerBlock("compressed_netherite_block",
            new Block(FabricBlockSettings.of(Material.METAL, MapColor.BLACK).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_NETHERRACK = registerBlock("compressed_netherrack",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.RED).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_OBSIDIAN = registerBlock("compressed_obsidian",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(50.0f, 1200.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_OXIDIZED_COPPER = registerBlock("compressed_oxidized_copper",
            new Block(FabricBlockSettings.of(Material.METAL, MapColor.CYAN).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_PACKED_MUD = registerBlock("compressed_packed_mud",
            new Block(FabricBlockSettings.of(Material.AGGREGATE, MapColor.TERRACOTTA_BROWN).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_QUARTZ_BLOCK = registerBlock("compressed_quartz_block",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.WHITE).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_REDSTONE_BLOCK = registerBlock("compressed_redstone_block",
            new RedstoneBlock(FabricBlockSettings.of(Material.METAL, MapColor.BRIGHT_RED).requiresTool().strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL).solidBlock(ModBlocks::never)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_SAND = registerBlock("compressed_sand",
            new GravelBlock(FabricBlockSettings.of(Material.AGGREGATE, MapColor.PALE_YELLOW)
                    .strength(5.0f, 6.0f).requiresTool().sounds(BlockSoundGroup.SAND)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_SANDSTONE = registerBlock("compressed_sandstone",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_SLIME_BLOCK = registerBlock("compressed_slime_block",
            new SlimeBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, MapColor.PALE_GREEN)
                    .slipperiness(0.4F).sounds(BlockSoundGroup.SLIME).nonOpaque()),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_SOUL_SAND = registerBlock("compressed_soul_sand",
            new SoulSandBlock(FabricBlockSettings.of(Material.AGGREGATE, MapColor.BROWN).strength(5.0f, 6.0f)
                    .velocityMultiplier(0.05F).sounds(BlockSoundGroup.SOUL_SAND).allowsSpawning(ModBlocks::always)
                    .solidBlock(ModBlocks::always).blockVision(ModBlocks::always).suffocates(ModBlocks::always)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_SOUL_SOIL = registerBlock("compressed_soul_soil",
            new Block(FabricBlockSettings.of(Material.SOIL, MapColor.BROWN).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_STONE = registerBlock("compressed_stone",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block COMPRESSED_TUFF = registerBlock("compressed_tuff",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(5.0f, 6.0f)),
            ModItemGroup.MODERNSURVIVALBLOCKSTAB);

    // Glowing Wool
    public static final Block GLOWING_WHITE_WOOL = registerBlock("glowing_white_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.WHITE).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_ORANGE_WOOL = registerBlock("glowing_orange_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.ORANGE).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_MAGENTA_WOOL = registerBlock("glowing_magenta_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.MAGENTA).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_LIGHT_BLUE_WOOL = registerBlock("glowing_light_blue_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.LIGHT_BLUE).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_YELLOW_WOOL = registerBlock("glowing_yellow_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.YELLOW).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_LIME_WOOL = registerBlock("glowing_lime_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.LIME).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_PINK_WOOL = registerBlock("glowing_pink_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.PINK).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_GRAY_WOOL = registerBlock("glowing_gray_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.GRAY).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_LIGHT_GRAY_WOOL = registerBlock("glowing_light_gray_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.LIGHT_GRAY).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_CYAN_WOOL = registerBlock("glowing_cyan_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.CYAN).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_PURPLE_WOOL = registerBlock("glowing_purple_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.PURPLE).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_BLUE_WOOL = registerBlock("glowing_blue_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.BLUE).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_BROWN_WOOL = registerBlock("glowing_brown_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.BROWN).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_GREEN_WOOL = registerBlock("glowing_green_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.GREEN).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_RED_WOOL = registerBlock("glowing_red_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.RED).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_BLACK_WOOL = registerBlock("glowing_black_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.BLACK).strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);

    // Glowing Carpet
    public static final Block GLOWING_WHITE_CARPET = registerBlock("glowing_white_carpet",
            new DyedCarpetBlock(DyeColor.WHITE, FabricBlockSettings.of(Material.CARPET, MapColor.WHITE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_ORANGE_CARPET = registerBlock("glowing_orange_carpet",
            new DyedCarpetBlock(DyeColor.ORANGE, FabricBlockSettings.of(Material.CARPET, MapColor.ORANGE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_MAGENTA_CARPET = registerBlock("glowing_magenta_carpet",
            new DyedCarpetBlock(DyeColor.MAGENTA, FabricBlockSettings.of(Material.CARPET, MapColor.MAGENTA)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_LIGHT_BLUE_CARPET = registerBlock("glowing_light_blue_carpet",
            new DyedCarpetBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.of(Material.CARPET, MapColor.LIGHT_BLUE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_YELLOW_CARPET = registerBlock("glowing_yellow_carpet",
            new DyedCarpetBlock(DyeColor.YELLOW, FabricBlockSettings.of(Material.CARPET, MapColor.YELLOW)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_LIME_CARPET = registerBlock("glowing_lime_carpet",
            new DyedCarpetBlock(DyeColor.LIME, FabricBlockSettings.of(Material.CARPET, MapColor.LIME)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_PINK_CARPET = registerBlock("glowing_pink_carpet",
            new DyedCarpetBlock(DyeColor.PINK, FabricBlockSettings.of(Material.CARPET, MapColor.PINK)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_GRAY_CARPET = registerBlock("glowing_gray_carpet",
            new DyedCarpetBlock(DyeColor.GRAY, FabricBlockSettings.of(Material.CARPET, MapColor.GRAY)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_LIGHT_GRAY_CARPET = registerBlock("glowing_light_gray_carpet",
            new DyedCarpetBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.of(Material.CARPET, MapColor.LIGHT_GRAY)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_CYAN_CARPET = registerBlock("glowing_cyan_carpet",
            new DyedCarpetBlock(DyeColor.YELLOW, FabricBlockSettings.of(Material.CARPET, MapColor.YELLOW)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_PURPLE_CARPET = registerBlock("glowing_purple_carpet",
            new DyedCarpetBlock(DyeColor.PURPLE, FabricBlockSettings.of(Material.CARPET, MapColor.PURPLE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_BLUE_CARPET = registerBlock("glowing_blue_carpet",
            new DyedCarpetBlock(DyeColor.BLUE, FabricBlockSettings.of(Material.CARPET, MapColor.BLUE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_BROWN_CARPET = registerBlock("glowing_brown_carpet",
            new DyedCarpetBlock(DyeColor.BROWN, FabricBlockSettings.of(Material.CARPET, MapColor.BROWN)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_GREEN_CARPET = registerBlock("glowing_green_carpet",
            new DyedCarpetBlock(DyeColor.GREEN, FabricBlockSettings.of(Material.CARPET, MapColor.GREEN)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_RED_CARPET = registerBlock("glowing_red_carpet",
            new DyedCarpetBlock(DyeColor.RED, FabricBlockSettings.of(Material.CARPET, MapColor.RED)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);
    public static final Block GLOWING_BLACK_CARPET = registerBlock("glowing_black_carpet",
            new DyedCarpetBlock(DyeColor.BLACK, FabricBlockSettings.of(Material.CARPET, MapColor.BLACK)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(wool_luminance)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ModItemGroup.MODERNSURVIVALBLOCKSTAB);

    public static boolean always(BlockState state, BlockView world, BlockPos pos) { return true; }
    private static boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> entityType) { return true; }
    public static boolean never(BlockState state, BlockView world, BlockPos pos) { return false; }
    public static boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> entityType) { return false; }

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
