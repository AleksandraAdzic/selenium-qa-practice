package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.IframePopUpPage;
import utilities.PropertyManager;

public class IframePopUpTest extends BaseTest {

    @Test
    public void iframePopUpCorrectTest(){
        driver.get("https://www.qa-practice.com/elements/popup/iframe_popup");
        IframePopUpPage iframePopUpPage = new IframePopUpPage(driver);
        iframePopUpPage.checkLaunchButtonName();
        iframePopUpPage.goToIframe();
        iframePopUpPage.checkIframe();
        String text = iframePopUpPage.getTextForCopy();
        iframePopUpPage.switchToTopFrame();
        iframePopUpPage.clickCheckButtonIframe();
        iframePopUpPage.sendTextToInput(text);
        iframePopUpPage.verificationRightTextInInput();
    }

    @Test
    public void iframePopUpNotCorrectTest(){
        driver.get("https://www.qa-practice.com/elements/popup/iframe_popup");
        IframePopUpPage iframePopUpPage = new IframePopUpPage(driver);
        iframePopUpPage.goToPutInputForm();
        String text = PropertyManager.getInstance().getInvalidTextForInputFromIframe();
        iframePopUpPage.sendTextToInput(text);
        iframePopUpPage.verificationWrongTextInInput();
    }


}
