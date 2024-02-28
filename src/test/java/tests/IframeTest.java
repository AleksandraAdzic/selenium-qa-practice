package tests;

import org.testng.annotations.Test;
import pages.IframePage;

public class IframeTest extends BaseTest{


    @Test
    public void iframeTest(){
        driver.get("https://www.qa-practice.com/elements/iframe/iframe_page");
        IframePage iframePage = new IframePage(driver);
        iframePage.findNumberOfIframe();
        iframePage.switchToIframe();
    }
}
