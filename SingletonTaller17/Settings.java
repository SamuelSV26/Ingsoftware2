package SingletonTaller17;

import java.util.HashMap;
import java.util.Map;

public class Settings {
    private static Settings instancia;
    private Map<String, String> configuraciones;

    private Settings() {
        configuraciones = new HashMap<>();
        configuraciones.put("theme", "light");
        configuraciones.put("language", "en");
    }

    public static Settings getInstancia() {
        if (instancia == null) {
            instancia = new Settings();
        }
        return instancia;
    }

    public String getSetting(String key) {
        return configuraciones.get(key);
    }

    public void setSetting(String key, String value) {
        configuraciones.put(key, value);
    }
}
