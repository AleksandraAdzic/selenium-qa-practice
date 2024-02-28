package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IframePage extends BasePage{
    public IframePage(WebDriver driver) {
        super(driver);
    }

    public void findNumberOfIframe(){
        List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
        System.out.print("Total number of iframes are " + iframeElements.size());
    }
    public void switchToIframe(){
        driver.switchTo().frame(0);
    }

}
