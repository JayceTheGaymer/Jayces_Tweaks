package io.jayce.jayces_tweaks.mixin;

import jeresources.entry.MobEntry;
import mezz.jei.api.gui.ingredient.IRecipeSlotView;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

// JER reads the JEI slot name as a raw index into the mob's drop list without a bounds
// check, so hovering a slot that has no matching drop (i.e. the spawn egg) crashes the client.
// This skips the tooltip in that case.
@Pseudo
@Mixin(targets = "jeresources.jei.mob.MobTooltip", remap = false)
public abstract class MobTooltipCrashGuardMixin {

    @Shadow @Final private MobEntry entry;

    @Inject(method = "onTooltip", at = @At("HEAD"), cancellable = true)
    private void jayces_tweaks$skipMissingDrop(IRecipeSlotView view, List<Component> tooltip, CallbackInfo ci) {
        int index;
        try {
            index = Integer.parseInt(view.getSlotName().orElse("0"));
        } catch (NumberFormatException e) {
            ci.cancel();
            return;
        }

        if (index < 0 || index >= entry.getDrops().size()) {
            ci.cancel();
        }
    }
}
