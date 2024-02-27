package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ConfirmationBoxPage extends BasePage{
    public ConfirmationBoxPage(WebDriver driver) {
        super(driver);
    }

    By buttonClickBy = By.className("a-button");
    By textFromResultBy= By.id("result-text");

    public void checkClickButton(){
        checkIfButtonIsEnabled(buttonClickBy);
    }

    public void clickClickButton(){
        clickElement(buttonClickBy);
    }

    public void verificationOkAlertButton(){
        switchAlertOK();
        assertStringEquals(readText(textFromResultBy), "Ok");
    }

    public void vericitaionCancleAlertButton(){
        switchAlertCancel();
        assertStringEquals(readText(textFromResultBy), "Cancel");
    }
}
