package mintychochip.kunai.container.damtype;

import java.util.ArrayList;
import java.util.List;

public class HandlerContainer {

    private final List<DamageTypeHandler> handlers = new ArrayList<>();

    public boolean addHandler(DamageTypeHandler damageTypeHandler) {
        return handlers.add(damageTypeHandler);
    }
}
