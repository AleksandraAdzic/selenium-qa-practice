package tests;

import org.testng.annotations.Test;
import pages.PopUPModalPage;

public class PopUPModalTest extends BaseTest{

    @Test
    public void popUpModalChekChekboxTest(){
        driver.get("https://www.qa-practice.com/elements/popup/modal");
        PopUPModalPage popUPModalPage = new PopUPModalPage(driver);
        popUPModalPage.checkButtonName();
        popUPModalPage.clickLaunchPopUpButton();
        popUPModalPage.chekPopUp();
        popUPModalPage.verificationClickChekChekbox();
    }


    @Test
    public void popUpModalNoChekChekboxTest(){
        driver.get("https://www.qa-practice.com/elements/popup/modal");
        PopUPModalPage popUPModalPage = new PopUPModalPage(driver);
        popUPModalPage.clickLaunchPopUpButton();
        popUPModalPage.verificationNonChekChekbox();
    }

}
