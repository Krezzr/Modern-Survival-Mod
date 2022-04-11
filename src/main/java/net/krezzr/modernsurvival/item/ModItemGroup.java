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
            () -> new ItemStack(ModItems.EMERALD_PICKAXE));
    public static final ItemGroup MODERNSURVIVALARMORSTAB = FabricItemGroupBuilder.build(new Identifier(ModernSurvival.MOD_ID, "modernsurvivalarmorstab"),
            () -> new ItemStack(ModItems.EMERALD_CHESTPLATE));
}
