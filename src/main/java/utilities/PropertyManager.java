package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {
    private static String invalidEmail, invalidPassword, validPassword;
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
        invalidPassword = properties.getProperty("invalidPassword");
        validPassword = properties.getProperty("validPassword");
    }

    public String getInvalidEmail() {
        return invalidEmail;
    }
    public String getInvalidPassword(){
        return invalidPassword;
    }
    public String getValidPassword(){
        return validPassword;
    }
}
