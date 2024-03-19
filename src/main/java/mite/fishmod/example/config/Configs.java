package mite.fishmod.example.config;

import net.xiaoyu233.fml.config.ConfigCategory;
import net.xiaoyu233.fml.config.ConfigEntry;
import net.xiaoyu233.fml.util.FieldReference;

import java.io.File;

public class Configs {
    public static final File CONFIG_FILE = new File("mite-mod.json");
    public static final ConfigCategory ROOT = new ConfigCategory("root").
            addEntry(ConfigEntry.of("example", GameMechanics.EXAMPLE).withComment("description"));

    public static class GameMechanics{
        public static final FieldReference<Boolean> EXAMPLE = new FieldReference<>(true);
    }
}
