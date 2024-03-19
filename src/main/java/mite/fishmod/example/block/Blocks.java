package mite.fishmod.example.block;

import net.minecraft.Block;
import net.minecraft.BlockConstants;
import net.minecraft.Material;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;
import net.xiaoyu233.fml.reload.event.RecipeRegistryEvent;
import net.xiaoyu233.fml.util.IdUtil;

public class Blocks extends Block{

    protected Blocks(int par1, Material par2Material, BlockConstants constants) {
        super(par1, par2Material, constants);
    }

    public static int getNextBlockID() {
        return IdUtil.getNextBlockID();
    }

    public static void registerItemBlocks(ItemRegistryEvent registryEvent){
    }

    public static void registerRecipes(RecipeRegistryEvent register) {

    }
}
