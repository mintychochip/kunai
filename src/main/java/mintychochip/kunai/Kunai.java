package mintychochip.kunai;

import mintychochip.kunai.container.Regsitries;
import org.bukkit.plugin.java.JavaPlugin;

public final class Kunai extends JavaPlugin implements Regsitries {

    private static Kunai instance;
    @Override
    public void onEnable() {
        instance = this;
        // Plugin startup logic
    }

    public static Kunai getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
