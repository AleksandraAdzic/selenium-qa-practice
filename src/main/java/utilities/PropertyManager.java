package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {
    private static String invalidEmail;
    private static PropertyManager instance;

    public static PropertyManager getInstance() {
        if (instance == null) {
            instance = new PropertyManager();
            instance.loadData();
        }

        return instance;
    }

    public void loadData() {
        Properties properties = new Properties();

        try {
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }

        invalidEmail = properties.getProperty("invalidEmail");
    }

    public String getInvalidEmail() {
        return invalidEmail;
    }
}
