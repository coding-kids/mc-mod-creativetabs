package codingkids.mc.creativetabs;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MyCreativeTabs {
    public static final net.minecraft.creativetab.CreativeTabs DEMO_CREATIVETABS = new net.minecraft.creativetab.CreativeTabs(0, "ckcreativetabs.demo_creativetabs") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.DIAMOND_SWORD);
        }
    };
}
