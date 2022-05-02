package neros2k.jcapi;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import java.util.Optional;
public final class JCApi extends JavaPlugin {
    @NotNull
    public static <T> Optional<JSONConfig<T>> getNew(@NotNull JavaPlugin PLUGIN, Class<T> CLASS, String NAME) {
        if(!PLUGIN.isEnabled()) return Optional.empty();
        return Optional.of(new JSONConfig<>(PLUGIN, CLASS, NAME));
    }
}

