package src.main.java.designpattern.singleton;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String configSetting;

    private ConfigurationManager() {
        // Load configuration settings from a file or other source
        configSetting = "default_value";
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfigSetting() {
        return configSetting;
    }

    public void setConfigSetting(String value) {
        configSetting = value;
    }


    public static void main(String[] args) {

        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Get and set configuration settings
        System.out.println("Initial config setting: " + configManager.getConfigSetting());
        configManager.setConfigSetting("new_value");
        System.out.println("Updated config setting: " + configManager.getConfigSetting());

        // Using the same instance in another part of the program
        ConfigurationManager anotherConfigManager = ConfigurationManager.getInstance();
        System.out.println("Config setting from another instance: " + anotherConfigManager.getConfigSetting());

        // Both instances are the same
        System.out.println("Instances are the same: " + (configManager == anotherConfigManager));
    }
}

