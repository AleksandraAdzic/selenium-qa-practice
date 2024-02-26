package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordInputFieldPage extends BasePage{
    public PasswordInputFieldPage(WebDriver driver) {
        super(driver);
    }

    By inputPasswordBy = By.id("id_password");

    By resultTextBy = By.id("result-text");

    By errorMassageBy = By.id("error_1_id_password");

    public void writeText(String text){
        enterText(inputPasswordBy, text);
    }

    public void pressEnterAfterInput(){
        pressEnter(inputPasswordBy);
    }


    public void verificationValidPassword(String text){
        if(text.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"
        )){
            assertStringEquals(readText(resultTextBy), text);}
        else {
            assertStringEquals(readText(errorMassageBy), "Low password complexity");
        }
    }


}
