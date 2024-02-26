package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DisabledButtonPage extends BasePage{
    public DisabledButtonPage(WebDriver driver) {
        super(driver);
    }


    By buttonSubmitBy = By.id("submit-id-submit");
    By selectStateBy = By.id("id_select_state");
    By stateDisabledBy = By.xpath("//option[@value='disabled']");
    By stateEnabledBy = By.xpath("//option[@value='enabled']");
    By resultTextBy= By.id("result-text");

    public void checkIfButtonIsDefault(){
        checkSomeValue("disabled", buttonSubmitBy, "true");
    }

    public void clickOnSelectState(){
        clickElement(selectStateBy);
    }
    public void clickOnDisabledState(){
        clickElement(stateDisabledBy);
    }
    public void clickOnEnabbledState(){
        clickElement(stateEnabledBy);
    }

    public void clickButtonSubmit(){
        clickElement(buttonSubmitBy);
    }


    public void checkEnableAndDisable(){
        clickOnSelectState();
        clickOnEnabbledState();
        clickOnDisabledState();
    }

    public void checkAppliedOption(){
        clickOnSelectState();
        clickOnEnabbledState();
        checkSomeValue("enabled", buttonSubmitBy, "true");
    }

    public void clickButtonSubmitEnabbledState(){
        clickOnSelectState();
        clickOnEnabbledState();
        clickButtonSubmit();
    }

    public void verificationEnabledState(){
        clickButtonSubmitEnabbledState();
        assertStringEquals(readText(resultTextBy), "Submitted");
    }
}
