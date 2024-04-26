package mintychochip.kunai.container;

import mintychochip.kunai.container.damtype.DamageTypeHandler;
import mintychochip.kunai.container.damtype.HandlerContainer;
import mintychochip.kunai.events.ITriggerOnDamage;
import org.bukkit.Keyed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class DType implements Keyed, ITriggerOnDamage {

    private final String name;

    private final String description;

    protected final Map<String,DamageTypeHandler> handlers = new HashMap<>();

    public DType(String name, String description) {
        this.name = name;
        this.description = description;
        handlers.
    }

    public DamageTypeHandler getHandler(String namespace) {

    }
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }


}
