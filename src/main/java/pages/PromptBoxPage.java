package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PromptBoxPage extends BasePage{
    public PromptBoxPage(WebDriver driver) {
        super(driver);
    }
    By buttonClickBy = By.className("a-button");
    By resultTextBy = By.id("result-text");
    public void checkClickButton(){
        checkIfButtonIsEnabled(buttonClickBy);
    }

    public void clickClickButton(){
        clickElement(buttonClickBy);
    }


    public void clickOkOnAlert(){
        switchAlertOK();
    }

    public void clickCancleOnAlert(){
        switchAlertCancel();
    }


    public String sendTextInAlert(){
        Faker faker = new Faker();
        String text = faker.lorem().sentence();
        driver.switchTo().alert().sendKeys(text);
        return text;
    }

    public void verificationTextFromPromptBoxOk(String text){
        assertStringEquals(readText(resultTextBy), text);
    }
    public void varificationTextFromCanclePromptBox(){
        assertStringEquals(readText(resultTextBy), "You canceled the prompt");
    }
}
