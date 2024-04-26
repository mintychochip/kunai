package mintychochip.kunai.container;

import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public interface Regsitries {

    Registry<DType> DAMAGE_TYPES = new Registry<DType>() {
        List<DType> type = new ArrayList<>();

        @Override
        public @Nullable DType get(@NotNull NamespacedKey key) {
            return this.stream().filter(type -> type.getKey().equals(key)).findFirst().orElse(null);
        }

        @Override
        public @NotNull Stream<DType> stream() {
            return type.stream();
        }

        @NotNull
        @Override
        public Iterator<DType> iterator() {
            return type.iterator();
        }
    };
}
