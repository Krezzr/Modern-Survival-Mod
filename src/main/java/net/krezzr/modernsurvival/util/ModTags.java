package net.krezzr.modernsurvival.util;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.krezzr.modernsurvival.ModernSurvival;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModTags {
    public static class Blocks {

        public static final Tag.Identified<Block> MULTI_TOOLS_MINEABLE =
                createTag("mineable/multi_tools");



        private static Tag.Identified<Block> createTag(String name) {
            return TagFactory.BLOCK.create(new Identifier(ModernSurvival.MOD_ID, name));
        }
    }
    public static class Items {


        private static Tag.Identified<Item> createTag(String name) {
            return TagFactory.ITEM.create(new Identifier(ModernSurvival.MOD_ID, name));
        }
    }
}