package mintychochip.kunai.container.damtype;

import org.bukkit.entity.LivingEntity;
import org.bukkit.scheduler.BukkitRunnable;

public interface Action { //everytime this is called it runs

    void action(LivingEntity livingEntity);
}
