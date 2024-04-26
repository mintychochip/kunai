package mintychochip.kunai.container.damtype;

import mintychochip.kunai.Kunai;
import mintychochip.kunai.container.DType;
import mintychochip.kunai.events.DamageTypeEvent;
import net.kyori.adventure.key.Key;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.jetbrains.annotations.NotNull;

public class Flame extends DType {

    public Flame(String name, String description) {
        super(name, description);
    }
    @Override
    public @NotNull NamespacedKey getKey() {
        return
    }

    @Override
    public @NotNull Key key() {
        return super.key();
    }

    @Override
    public void execute(DamageTypeEvent event) {

    }
}
