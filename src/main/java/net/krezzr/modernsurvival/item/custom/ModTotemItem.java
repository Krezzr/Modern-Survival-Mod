package net.krezzr.modernsurvival.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTotemItem extends Item {
    public ModTotemItem(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
