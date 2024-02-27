package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsBoxPage extends BasePage{
    public AlertsBoxPage(WebDriver driver) {
        super(driver);
    }


    By buttonClickBy = By.className("a-button");

    public void checkClickButton(){
        checkIfButtonIsEnabled(buttonClickBy);
    }

    public void clickClickButton(){
        clickElement(buttonClickBy);
    }

    public void varificationAlertBox(){
        switchAlertOK();
    }
}
