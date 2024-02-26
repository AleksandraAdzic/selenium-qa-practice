package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.DisabledButtonPage;

public class DisabledButtonTest extends BaseTest {


    @Test
    public void disabledButtonTest(){
        driver.get("https://www.qa-practice.com/elements/button/disabled");
        DisabledButtonPage disabledButtonPage = new DisabledButtonPage(driver);
        disabledButtonPage.checkIfButtonIsDefault();
        disabledButtonPage.checkEnableAndDisable();
        disabledButtonPage.checkAppliedOption();
        disabledButtonPage.verificationEnabledState();
    }


}
