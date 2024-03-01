package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IframePopUpPage extends BasePage{
    public IframePopUpPage(WebDriver driver) {
        super(driver);
    }

    By buttonToClickBy = By.xpath("//div[@id='content']/button");
    By iframePageTitleBy = By.xpath("//div[@class='page-content']/div/h1");
    By textToBeCopyBy = By.id("text-to-copy");

    By checkButtonIframeBy = By.xpath("//div[@class='modal-footer']/button[contains(@class, 'btn-primary')]");
    By inputForCopyTextBy = By.id("id_text_from_iframe");
    By submitButtonBy = By.id("submit-id-submit");
    By resultBy = By.id("check-result");
    public void checkLaunchButtonName(){
        assertStringEquals(readText(buttonToClickBy), "Launch Pop-Up");
    }
    public void clickLaunchButton(){
        clickElement(buttonToClickBy);
    }

    public void switchToIframe(){
        driver.switchTo().frame(0);
    }
    public void switchToTopFrame(){
        driver.switchTo().defaultContent();
    }

    public void chekTitleIframe(){
        assertStringEquals(readText(iframePageTitleBy), "Iframe page title");
    }
    public void chekTextToBeCopy(){
        assertStringEquals(readText(textToBeCopyBy), "I am the text you want to copy");
    }

    public void checkIframe(){
        chekTitleIframe();
        chekTextToBeCopy();
    }

    public void clickCheckButtonIframe(){
        clickElement(checkButtonIframeBy);
    }

    public String getTextForCopy(){
        String text = driver.findElement(textToBeCopyBy).getText();
        return text;
    }

    public void sendTextToInput(String text){
        enterText(inputForCopyTextBy, text);
        clickElement(submitButtonBy);
    }

    public void verificationRightTextInInput(){
        assertStringEquals(readText(resultBy), "Correct!");
    }

    public void goToIframe(){
        clickLaunchButton();
        switchToIframe();
    }
    public void goToPutInputForm(){
        goToIframe();
        switchToTopFrame();
        clickCheckButtonIframe();
    }
    public void verificationWrongTextInInput(){
        assertStringEquals(readText(resultBy), "Nope. Better luck next time!");
    }

}
