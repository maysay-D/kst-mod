package io.github.maysayd.kstmod.core.init;

import io.github.maysayd.kstmod.KstMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KstMod.MODID);

    public static final RegistryObject<Block> KEISUKE_HEAD = register("keisuke_head",
                () -> new Block(Block.Properties.of(Material.DECORATION)),
                      new Item.Properties().tab(KstMod.TAB));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, Item.Properties properties) {
        RegistryObject<T> blockObj = BLOCKS.register(name, block);
        ItemInit.ITEMS.register(name, () -> new BlockItem(blockObj.get(), properties));
        return blockObj;
    }
}