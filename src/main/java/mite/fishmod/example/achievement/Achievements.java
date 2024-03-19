package mite.fishmod.example.achievement;

import net.minecraft.Achievement;
import net.minecraft.AchievementList;
import net.minecraft.Block;
import net.xiaoyu233.fml.util.IdUtil;

public class Achievements {
    public static Achievement example;
    public static void registerAchievements(){
        example = new Achievement(getNextAchievementID(), "example", 0, 0, Block.dirt, AchievementList.eggs).setSpecial().registerAchievement();
    }
    private static int getNextAchievementID(){
        return IdUtil.getNextAchievementID();
    }
}
