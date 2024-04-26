package mintychochip.kunai.container.damtype;

import org.bukkit.Location;
import org.bukkit.damage.DamageSource;
import org.bukkit.damage.DamageType;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class KunaiSource implements DamageSource {
    private final Location destination;
    private final Location source;

    private DamageType damageType;
    private Entity cause;
    private Entity directed;

    private boolean direct = false;
    private boolean scalesWithDiff = false;
    private int exhaustion = 0;

    public KunaiSource(Entity cause, Entity directed , Location destination, Location source) {
        this.cause = cause;
        this.directed = directed;
        this.destination = destination;
        this.source = source;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public void setScalesWithDiff(boolean scalesWithDiff) {
        this.scalesWithDiff = scalesWithDiff;
    }

    public void setDirect(boolean direct) {
        this.direct = direct;
    }

    public void setExhaustion(int exhaustion) {
        this.exhaustion = exhaustion;
    }

    public void setCause(Entity cause) {
        this.cause = cause;
    }

    @Override
    public @NotNull DamageType getDamageType() {
        return damageType != null ? damageType : DamageType.MAGIC;
    }

    @Override
    public @Nullable Entity getCausingEntity() {
        return cause;
    }

    @Override
    public @Nullable Entity getDirectEntity() {
        return directed;
    }

    @Override
    public @Nullable Location getDamageLocation() {
        return directed != null ? directed.getLocation() : destination;
    }

    @Override
    public @Nullable Location getSourceLocation() {
        return cause != null ? cause.getLocation() : source;
    }

    @Override
    public boolean isIndirect() {
        return direct;
    }

    @Override
    public float getFoodExhaustion() {
        return exhaustion;
    }

    @Override
    public boolean scalesWithDifficulty() {
        return scalesWithDiff;
    }
}
