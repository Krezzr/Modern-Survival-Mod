package net.krezzr.modernsurvival.mixin;

import net.krezzr.modernsurvival.Enchantment.ModEnchantments;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Mixin(Block.class)
public class ModSmeltingEnchantmentMixin {
    @Inject(method = "getDroppedStacks(Lnet/minecraft/block/BlockState;Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/BlockEntity;Lnet/minecraft/entity/Entity;Lnet/minecraft/item/ItemStack;)Ljava/util/List;",
            at = @At("RETURN"), cancellable = true)
    private static void getDroppedStacks(BlockState state, ServerWorld world, BlockPos pos, BlockEntity blockEntity, Entity entity, ItemStack stack, CallbackInfoReturnable<List<ItemStack>> info) {
        List<ItemStack> returnValue = info.getReturnValue();
        List<ItemStack> items = new ArrayList<>();

        if (!(entity instanceof PlayerEntity) || EnchantmentHelper.getLevel(ModEnchantments.SMELTING_ENCHANTMENT, stack) == 0) {
            info.setReturnValue(returnValue);
            return;
        }

        for (ItemStack itemStack : returnValue) {
            Optional<SmeltingRecipe> recipe = world.getRecipeManager().getFirstMatch(RecipeType.SMELTING, new SimpleInventory(itemStack), world);

            if (recipe.isPresent()) {
                ItemStack smelted = recipe.get().getOutput().copy();
                smelted.setCount(itemStack.getCount());
                items.add(smelted);
                int experience = (int) recipe.get().getExperience();
                int count = smelted.getCount();
                ((PlayerEntity)entity).addExperience(experience * count);
            } else {
                items.add(itemStack);
            }
        }

        info.setReturnValue(items);
    }
}
