package net.krezzr.modernsurvival.util;

import net.krezzr.modernsurvival.ModernSurvival;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> MULTI_TOOLS_MINEABLE =
                createTag("mineable/multi_tools");



        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(ModernSurvival.MOD_ID, name));
        }
    }
    public static class Items {


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(ModernSurvival.MOD_ID, name));
        }
    }
}