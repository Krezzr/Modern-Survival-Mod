package net.krezzr.modernsurvival.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.krezzr.modernsurvival.ModernSurvival;
import net.krezzr.modernsurvival.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MODERNSURVIVALTAB = FabricItemGroupBuilder.build(new Identifier(ModernSurvival.MOD_ID, "modernsurvivaltab"),
            () -> new ItemStack(ModBlocks.CHARCOAL_BLOCK));
}
