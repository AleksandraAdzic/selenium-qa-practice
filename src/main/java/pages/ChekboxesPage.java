package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChekboxesPage extends BasePage{
    public ChekboxesPage(WebDriver driver) {
        super(driver);
    }

    By labelAfterFirstChekboxBy = By.xpath("//label[@for='id_checkboxes_0']");
    By labelAfterSecendChekboxBy = By.xpath("//label[@for='id_checkboxes_1']");
    By labelAfterThirdChekboxBy = By.xpath("//label[@for='id_checkboxes_2']");
    By chekboxNullBy = By.id("id_checkboxes_0");
    By chekboxOneBy = By.id("id_checkboxes_1");
    By chekboxTwoBy = By.id("id_checkboxes_2");

    By submitButtonBy = By.id("submit-id-submit");

    By checkboxButtonBy = By.xpath("//input[@type='checkbox']");
    By resultTextBy = By.id("result-text");

    public void checkNumber(){
        List<WebElement> chkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
        int size =chkboxes.size();
        if(size == 3 ){
            System.out.print("There is 3 checkbox");
        }else {
            System.out.print("There is more then 1 checkbox");
        }
    }
    public void textAfterFirstChekbox(){
        assertStringEquals(readText(labelAfterFirstChekboxBy), "One");
    }
    public void textAfterSecendChekbox(){
        assertStringEquals(readText(labelAfterSecendChekboxBy), "Two");
    }
    public void textAfterThirdChekbox(){
        assertStringEquals(readText(labelAfterThirdChekboxBy), "Three");
    }

    public void textFromLabelNextToChekbox(){
        textAfterFirstChekbox();
        textAfterSecendChekbox();
        textAfterThirdChekbox();
    }


    public void chekIfIsAbleChekbox(){
        List <WebElement> chekBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for (WebElement chekBox : chekBoxes){
            if(chekBox.isDisplayed() == true){
                chekBox.click();
                chekBox.click();
            }else {
                System.out.print("ChekBox is not displayed.");
            }
        }
    }

    public void checkIfButtonIsNotDissable(){
        checkIfButtonIsEnabled(submitButtonBy);
    }

    public String checkCheckdChekbox(){
        List<WebElement> list = driver.findElements(checkboxButtonBy);
        int numberChekbox = list.size();
        Random random = new Random();
        int randumChekbox = random.nextInt(numberChekbox);
        list.get(randumChekbox).click();
        List<String> text = new ArrayList<>();
        for(WebElement e: list){
            if(e.isSelected()){
                text.add(e.getAttribute("value"));
            }
        } return String.join(", ",text);


    }

    public void clickSubmitButton(){
        clickElement(submitButtonBy);
    }

    public void verifikacationMultiChekdChekbox(String text){
        assertStringEquals(text, readText(resultTextBy));
    }

    public void clickAllThreeChekbox(){
        clickElement(chekboxNullBy);
        clickElement(chekboxOneBy);
        clickElement(chekboxTwoBy);
    }

}
