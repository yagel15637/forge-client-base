package git.yagel15637.clientbase.impl.mixin.accessors;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Minecraft.class)
public interface IMinecraft {
    @Accessor("rightClickDelayTimer")
    void setRightClickDelayTimer(final int rightClickDelayTimer);
}
