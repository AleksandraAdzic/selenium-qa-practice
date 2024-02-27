package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTabButtonPage extends BasePage{
    public NewTabButtonPage(WebDriver driver) {
        super(driver);
    }

    By clickButtonBy = By.id("new-page-button");

    public void chekLinkOfNewPage(){
        checkCorrectLink(clickButtonBy, "https://www.qa-practice.com/elements/new_tab/new_page");
    }
    public void clickButton(){
        clickElement(clickButtonBy);
    }

    public void switchToNewTab(){
        switchToNextTab();
    }
}
