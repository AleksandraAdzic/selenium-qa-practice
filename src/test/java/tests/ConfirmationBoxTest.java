package tests;

import org.testng.annotations.Test;
import pages.ConfirmationBoxPage;

public class ConfirmationBoxTest extends BaseTest{

    @Test
    public void confirmationBoxCancelTest(){
        driver.get("https://www.qa-practice.com/elements/alert/confirm");
        ConfirmationBoxPage confirmationBoxPage = new ConfirmationBoxPage(driver);
        confirmationBoxPage.checkClickButton();
        confirmationBoxPage.clickClickButton();
        confirmationBoxPage.vericitaionCancleAlertButton();
    }

    @Test
    public void confirmationBoxOkTest(){
        driver.get("https://www.qa-practice.com/elements/alert/confirm");
        ConfirmationBoxPage confirmationBoxPage = new ConfirmationBoxPage(driver);
        confirmationBoxPage.clickClickButton();
        confirmationBoxPage.verificationOkAlertButton();
    }
}
