package mite.fishmod.example;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import net.xiaoyu233.fml.util.EnumExtends;

public class EarlyRiser implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        System.out.println("[MITE-EXAMPLE-MOD] Early riser registering chat formatting");
    }
}
