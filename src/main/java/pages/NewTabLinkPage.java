package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class NewTabLinkPage extends BasePage{
    public NewTabLinkPage(WebDriver driver) {
        super(driver);
    }

    By linkToNewPageBy =By.id("new-page-link");

    public void clickLinkToNewPage(){
        clickElement(linkToNewPageBy);
    }
    public void chekLink(){
        checkCorrectLink(linkToNewPageBy, "https://www.qa-practice.com/elements/new_tab/new_page");
    }
    public void switchToNewTab() {
        switchToNextTab();
    }
}
