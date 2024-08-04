package io.github.maysayd.kstmod;

import io.github.maysayd.kstmod.core.init.ItemInit;
import io.github.maysayd.kstmod.core.init.BlockInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(KstMod.MODID)
public class KstMod {
    public static final String MODID = "kstmod";

    public KstMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ItemInit.SPEAR_AND_HATCHET.get().getDefaultInstance();
        }
    };
}