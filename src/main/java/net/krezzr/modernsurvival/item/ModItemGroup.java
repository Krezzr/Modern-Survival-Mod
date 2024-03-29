package net.krezzr.modernsurvival.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.krezzr.modernsurvival.ModernSurvival;
import net.krezzr.modernsurvival.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MODERNSURVIVALBLOCKSTAB = FabricItemGroupBuilder.build(new Identifier(ModernSurvival.MOD_ID, "modernsurvivalblockstab"),
            () -> new ItemStack(ModBlocks.CHARCOAL_BLOCK));
    public static final ItemGroup MODERNSURVIVALTOOLSTAB = FabricItemGroupBuilder.build(new Identifier(ModernSurvival.MOD_ID, "modernsurvivaltoolstab"),
            () -> new ItemStack(ModItems.BREBIUM_MULTI_TOOLS));
    public static final ItemGroup MODERNSURVIVALARMORSTAB = FabricItemGroupBuilder.build(new Identifier(ModernSurvival.MOD_ID, "modernsurvivalarmorstab"),
            () -> new ItemStack(ModItems.BREBIUM_CHESTPLATE));
    public static final ItemGroup MODERNSURVIVALWEAPONSTAB = FabricItemGroupBuilder.build(new Identifier(ModernSurvival.MOD_ID, "modernsurvivalweaponstab"),
            () -> new ItemStack(ModItems.BREBIUM_SWORD));
    public static final ItemGroup MODERNSURVIVALITEMSTAB = FabricItemGroupBuilder.build(new Identifier(ModernSurvival.MOD_ID, "modernsurvivalitemstab"),
            () -> new ItemStack(ModItems.BREBIUM_STAR));
}
