package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleButtonPage extends BasePage{
    public SimpleButtonPage(WebDriver driver) {
        super(driver);
    }

    By buttonClickBy = By.id("submit-id-submit");
    By textResoltBy = By.id("result-text");

    public void checkIfButtonIsClickable(){
        checkIfElementIsClickable(buttonClickBy);
    }

    public void checkButtonValue(){
        checkValueButton(buttonClickBy);
    }

    public void clickButton(){
        clickElement(buttonClickBy);
    }

    public void compliteClickButton(){
        checkIfButtonIsClickable();
        checkButtonValue();
        clickButton();
    }


    public void verificationClickButton(){
        assertStringEquals(readText(textResoltBy), "Submitted");
    }


}
