package pages;

import com.github.javafaker.Faker;
import dk.brics.automaton.RegExp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFieldPage extends BasePage{
    public InputFieldPage(WebDriver driver) {
        super(driver);
    }

        By inputBy = By.id("id_text_string");

        By errorMessageBy = By.id("error_1_id_text_string");
        By errorMessage2By = By.id("error_2_id_text_string");

        By resoltTextBy = By.id("result-text");

    public void checkRequiredInput(){
        checkRequired(inputBy);
    }

    public void pressEnterToInput(){
        pressEnter(inputBy);
    }

    public String fakerText(int num){
        Faker faker = new Faker();
        String text = faker.lorem().characters(num);
        return text;
    }

    public void enterTextToInput(String text){
        enterText(inputBy, text);
    }

    public void verificationChekInputForLenght(String text){
        if(text.length() < 2){
            assertStringEquals(readText(errorMessageBy), "Please enter 2 or more characters");
        } else if(text.length() < 25){
            assertStringEquals(readText(resoltTextBy), text);
        } else {
            assertStringEquals(readText(errorMessageBy), "Please enter no more than 25 characters");
        }
    }







}
