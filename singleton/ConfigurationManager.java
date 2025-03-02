package singleton;


import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configs;

    private ConfigurationManager() {
        configs = new HashMap<>();
        configs.put("maxPlayers", "100");
        configs.put("defaultLanguage", "en");
        configs.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return configs.get(key);
    }

    public void printAllConfigs() {
        System.out.println("Current configurations:");
        configs.forEach((key, value) -> System.out.printf("%s → \"%s\"%n", key, value));
    }
}