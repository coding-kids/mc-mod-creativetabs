package codingkids.mc.creativetabs;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MyCreativeTabs {
    public static final net.minecraft.creativetab.CreativeTabs DEMO_CREATIVETABS = new net.minecraft.creativetab.CreativeTabs("demo_creativetabs") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.DIAMOND_SWORD);
        }
    };
}
