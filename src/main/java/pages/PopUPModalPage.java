package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PopUPModalPage extends BasePage{
    public PopUPModalPage(WebDriver driver) {
        super(driver);
    }

        By buttonLaunchPopUpBy = By.xpath("//div[@id='content']/button");
    By titlePopUpBy = By.id("exampleModalLabel");
    By chekBoxBy = By.id("id_checkbox_0");
    By labelChekboxBy = By.className("form-check-label");
    By buttonSendInChekboxBy = By.xpath("//button[@type='submit']");
    By resultTextBy = By.id("result-text");


    public void checkButtonName(){
        assertStringEquals(readText(buttonLaunchPopUpBy), "Launch Pop-Up");
    }

    public void clickLaunchPopUpButton(){
        clickElement(buttonLaunchPopUpBy);
    }
    public void chekTitleOdPopUp(){
        assertStringEquals(readText(titlePopUpBy), "I am a Pop-Up");
    }
    public void chekIfThereIsChekbox(){
        checkSomeValue("type", chekBoxBy, "checkbox");
    }

    public void readTextNextToChekbox(){
        assertStringEquals(readText(labelChekboxBy), "Select me or not");
    }



    public void chekIfButtonsAreClickable(){
        checkIfElementIsClickable(buttonSendInChekboxBy);
    }
    public void chekPopUp(){
        chekTitleOdPopUp();
        chekIfThereIsChekbox();
        readTextNextToChekbox();
        chekIfButtonsAreClickable();
    }

    public void verificationNonChekChekbox(){

    }
    public void verificationClickChekChekbox(){
        clickElement(chekBoxBy);
        clickElement(buttonSendInChekboxBy);
        assertStringEquals(readText(resultTextBy), "select me or not");
    }


}
