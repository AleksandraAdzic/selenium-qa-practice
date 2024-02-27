package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTabNewPagePage extends BasePage{
    public NewTabNewPagePage(WebDriver driver) {
        super(driver);
    }

    By resultTextBy = By.id("result-text");

    public void verificationNewPage(){
        assertStringEquals(readText(resultTextBy), "I am a new page in a new tab");
    }
}
