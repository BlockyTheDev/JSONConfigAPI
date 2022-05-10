package neros2k.jcapi;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
@Deprecated
public final class JSONConfig<T> extends n2k_.jcapi.JSONConfig<T> {
    public JSONConfig(@NotNull Plugin PLUGIN, Class<T> CLASS, String NAME) {
        super(PLUGIN, CLASS, NAME);
    }
}
