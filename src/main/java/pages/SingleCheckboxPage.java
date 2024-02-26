package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SingleCheckboxPage extends BasePage{
    public SingleCheckboxPage(WebDriver driver) {
        super(driver);
    }


    By labelOfChekboxBy = By.xpath("//label[@class='form-check-label']");
    By chekboxInputBy = By.id("id_checkbox_0");
    By submitButtonBy = By.id("submit-id-submit");
    By resultTextBy = By.id("result-text");


    public void checkNumber(){
        List<WebElement> chkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
        int size =chkboxes.size();
        if(size == 1 ){
            System.out.print("There is 1 checkbox");
        }else {
            System.out.print("There is more then 1 checkbox");
        }
    }

    public void textFromLabelNextToChekbox(){
        assertStringEquals(readText(labelOfChekboxBy), "Select me or not");
    }

    public void chekIfIsAbleChekbox(){
        WebElement chekBox = driver.findElement(By.id("id_checkbox_0"));
        if(chekBox.isDisplayed() == true){
            chekBox.click();
            chekBox.click();
        }else {
            System.out.print("ChekBox is not displayed.");
        }
    }

    public void checkIfButtonIsNotDissable(){
        checkIfButtonIsEnabled(submitButtonBy);
    }

    public void validationClikOnChekbox(){
        clickElement(chekboxInputBy);
        clickElement(submitButtonBy);
        assertStringEquals(readText(resultTextBy), "select me or not");
    }



}
