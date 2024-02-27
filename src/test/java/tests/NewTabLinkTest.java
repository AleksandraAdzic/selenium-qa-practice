package tests;

import org.testng.annotations.Test;
import pages.NewTabLinkPage;
import pages.NewTabNewPagePage;

public class NewTabLinkTest extends BaseTest{

    @Test
    public void newTabLinkTest(){
        driver.get("https://www.qa-practice.com/elements/new_tab/link");
        NewTabLinkPage newTabLinkPage = new NewTabLinkPage(driver);
        newTabLinkPage.chekLink();
        newTabLinkPage.clickLinkToNewPage();
        newTabLinkPage.switchToNewTab();
        NewTabNewPagePage newTabNewPagePage = new NewTabNewPagePage(driver);
        newTabNewPagePage.verificationNewPage();
    }
}
