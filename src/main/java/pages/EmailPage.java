package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailPage extends BasePage{
    public EmailPage(WebDriver driver) {
        super(driver);
    }

    By inputEmailAdreesBy = By.id("id_email");
    By errorMassage = By.id("error_1_id_email");
    By resultTextBy = By.id("result-text");


    public void enterEmail(String text){
        enterText(inputEmailAdreesBy, text);
    }

    public void pressEnterEmail(){
        pressEnter(inputEmailAdreesBy);
    }

    public String email(){
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        return email;
    }

    public void verificationValidEmailAdrres(String text){
        if(text.matches("^[\\w-.]+@([\\w-]+.)+[\\w-]")){
            assertStringEquals(readText(resultTextBy), text);}
        else {
            assertStringEquals(readText(errorMassage), "Enter a valid email address.");
        }
    }


}
