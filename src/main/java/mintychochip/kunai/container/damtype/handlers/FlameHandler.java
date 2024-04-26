package mintychochip.kunai.container.damtype.handlers;

import mintychochip.kunai.container.damtype.DamageTypeHandler;
import mintychochip.kunai.events.DamageTypeEvent;
import mintychochip.kunai.events.ITriggerOnDamage;
import org.bukkit.Location;
import org.bukkit.damage.DamageType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FlameHandler extends DamageTypeHandler {

    public FlameHandler(int duration, long interval, long delay) {
        super(duration, interval, delay);
    }

    @Override
    public void apply(LivingEntity livingEntity) { //ticks every interval
        livingEntity.
    }
}
