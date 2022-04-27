package neros2k.jcapi;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import java.util.Optional;
public final class JCApi extends JavaPlugin {
    // JSONConfig<Model> JSON_CONFIG = JCApi.getNew(Model.class, "config.json").get().createConfig().reload();
    private static JavaPlugin PLUGIN_INSTANCE;
    public JCApi() {
        JCApi.PLUGIN_INSTANCE = this;
    }
    @NotNull
    public static <T> Optional<JSONConfig<T>> getNew(Class<T> CLASS, String NAME) {
        if(!JCApi.PLUGIN_INSTANCE.isEnabled()) return Optional.empty();
        return Optional.of(new JSONConfig<>(JCApi.PLUGIN_INSTANCE, CLASS, NAME));
    }
    @NotNull
    public static <T> Optional<JSONConfig<T>> getNew(@NotNull JavaPlugin PLUGIN, Class<T> CLASS, String NAME) {
        if(!PLUGIN.isEnabled()) return Optional.empty();
        return Optional.of(new JSONConfig<>(PLUGIN, CLASS, NAME));
    }
}
