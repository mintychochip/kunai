package mintychochip.kunai.events;

import com.google.common.base.Function;
import org.bukkit.damage.DamageSource;
import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class DamageTypeEvent extends EntityDamageEvent {

    public DamageTypeEvent(@NotNull Entity damagee, @NotNull DamageCause cause, @NotNull DamageSource damageSource, @NotNull Map<DamageModifier, Double> modifiers, @NotNull Map<DamageModifier, ? extends Function<? super Double, Double>> modifierFunctions) {
        super(damagee, cause, damageSource, modifiers, modifierFunctions);
    }
}
