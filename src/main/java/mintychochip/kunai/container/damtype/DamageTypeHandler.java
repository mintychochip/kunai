package mintychochip.kunai.container.damtype;

import mintychochip.kunai.Kunai;
import mintychochip.kunai.events.DamageTypeEvent;
import mintychochip.kunai.events.ITriggerOnDamage;
import org.bukkit.Bukkit;
import org.bukkit.Keyed;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.damage.DamageSource;
import org.bukkit.damage.DamageType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DamageTypeHandler implements Keyed {

    protected final double duration;

    protected final long interval;

    protected final long delay;

    protected final List<Action> actions = new ArrayList<>();

    private final String namespace;

    public DamageTypeHandler(String namespace, double duration, long interval, long delay) {
        this.namespace = namespace;
        this.duration = duration;
        this.interval = interval;
        this.delay = delay;
    }

    public boolean addAction(Action action) {
        return actions.add(action);
    }

    public double getDuration() {
        return duration;
    }

    public long getDelay() {
        return delay;
    }

    public long getInterval() {
        return interval;
    }

    public BukkitTask apply(LivingEntity livingEntity) {
        final long start = System.currentTimeMillis();
        return new BukkitRunnable() {
            @Override
            public void run() {
                if (this.end(start)) {
                    this.cancel();
                }
                actions.forEach(action -> action.action(livingEntity));
            }

            private double timeElapsedSeconds(long start) { //in seconds
                return (double) (System.currentTimeMillis() - start) / 1000;
            }

            private boolean end(long start) {
                return this.timeElapsedSeconds(start) >= duration;
            }
        }.runTaskTimer(Kunai.getInstance(), delay, interval);

    }


    @Override
    public @NotNull NamespacedKey getKey() {
        return new NamespacedKey(namespace.)
    }
}
