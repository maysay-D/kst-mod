package io.github.maysayd.kstmod.core.init;

import io.github.maysayd.kstmod.KstMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KstMod.MODID);

    public static final RegistryObject<Item> SPEAR_AND_HATCHET = ITEMS.register("spear_and_hatchet", () -> new Item(new Item.Properties().tab(KstMod.TAB)));

    private static RegistryObject<Item> register(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().tab(KstMod.TAB)));
    }
}
