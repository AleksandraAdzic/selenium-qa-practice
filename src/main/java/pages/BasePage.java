package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;


public class BasePage {

    public WebDriver driver;

    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void checkIfElementIsClickable(By elementBy){
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public void clickElement(By elemntBy){
        waitVisibility(elemntBy);
        driver.findElement(elemntBy).click();
    }

    public void clickElement(WebElement webElement){
        webElement.click();
    }

    public String readText(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }


    public void assertStringEquals(String actualText, String expectedText){
        Assert.assertEquals(actualText, expectedText);
    }

    public void enterText(By elementBy, String text){
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }


    public void pressEnter(By elementBy){
        driver.findElement(elementBy).sendKeys(Keys.ENTER);
    }

    public void checkSomeValue(String text, By elementBy, String expectedText){
        assertStringEquals(driver.findElement(elementBy).getAttribute(text), expectedText);
    }

    public void checkRequired(By elementBy){
        assertStringEquals(driver.findElement(elementBy).getAttribute("required"), "true");
    }

    public void checkValueButton(By elementBy){
        assertStringEquals(driver.findElement(elementBy).getAttribute("value"), "Click");
    }


    public void checkIfButtonIsEnabled(By elementBy){
        assertStringEquals(driver.findElement(elementBy).getAttribute("disabled"), null);
    }


    public int pickRandumNumber(int max){
        int number = 1 + (int) (Math.random() * max);
        return number;
    }

    public void clickInput(int number, By elementBy, String id){
        WebElement element = driver.findElement(elementBy);
        clickElement(element);
//        clickElement(element.findElement(By.xpath("//option[@value= '"+number+"' ]")));

        clickElement(By.xpath("//select[@id='"+ id +"']//option[@value='"+ number+ "']"));
    }

    //
    public String readTextFromLable(int number, String id){
        String text = readText(By.xpath("//select[@id='"+ id +"']//option[@value='"+ number+ "']"));
        return text;
    }

    public void checkCorrectLink(By elementBy, String text){
        assertStringEquals(driver.findElement(elementBy).getAttribute("href"), text);
    }

    public void switchToNextTab() {
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
    }
    public void switchAlertOK(){
        driver.switchTo().alert().accept();
    }
    public void switchAlertCancel(){
        driver.switchTo().alert().dismiss();
    }


    public void dragAndDrop(String From, String To){
        Actions builder = new Actions(driver);
        WebElement from = driver.findElement(By.id(From));
        WebElement to = driver.findElement(By.id(To));
        builder.dragAndDrop(from, to).perform();
    }

    public void dragAndDropImage(String From, String To){
        Actions builder = new Actions(driver);
        WebElement from = driver.findElement(By.xpath(From));
        WebElement to = driver.findElement(By.id(To));
        builder.dragAndDrop(from, to).perform();
    }

    public void checkNameOfField(By elementBy, String text){
        Assert.assertTrue(readText(elementBy).contains(text));
    }

    public String writeTextInTextArea(By elementBy){
        clickElement(elementBy);
        Faker faker = new Faker();
        String text = faker.lorem().sentence();
        enterText(elementBy, text);
        return text;
    }

    public void waitToBeActiv(By elementBy){
        WebElement element = driver.findElement(elementBy);
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();
    }

}
