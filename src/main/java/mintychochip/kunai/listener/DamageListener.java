package mintychochip.kunai.listener;

import mintychochip.kunai.events.DamageTypeEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageListener implements Listener {

    @EventHandler
    private void onDamage(EntityDamageEvent event) {
        if(event instanceof DamageTypeEvent) {
            return;
        }

    }
}
