package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LooksLikeAButtonPage extends BasePage{
    public LooksLikeAButtonPage(WebDriver driver) {
        super(driver);
    }


    By buttonToClickBy = By.className("a-button");
    By resultTextBy = By.id("result-text");

    public void checkIfButtonCanCLick(){
        checkIfElementIsClickable(buttonToClickBy);
    }


    public void clickButton(){
        clickElement(buttonToClickBy);
    }

    public void checkButtonAndCLick(){
        checkIfButtonCanCLick();
        clickButton();
    }


    public void verificationClickButton(){
        assertStringEquals(readText(resultTextBy), "Submitted");
    }
}
