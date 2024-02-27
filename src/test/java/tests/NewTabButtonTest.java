package tests;

import org.testng.annotations.Test;
import pages.NewTabButtonPage;
import pages.NewTabNewPagePage;

public class NewTabButtonTest extends BaseTest{


    @Test
    public void newTabButtonTest(){
        driver.get("https://www.qa-practice.com/elements/new_tab/button");
        NewTabButtonPage newTabButtonPage = new NewTabButtonPage(driver);
        newTabButtonPage.chekLinkOfNewPage();
        newTabButtonPage.clickButton();
        newTabButtonPage.switchToNewTab();
        NewTabNewPagePage newTabNewPagePage = new NewTabNewPagePage(driver);
        newTabNewPagePage.verificationNewPage();
    }
}
