package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.security.SecureRandom;

public class MultipleSelectsPage extends BasePage{
    public MultipleSelectsPage(WebDriver driver) {
        super(driver);
    }

    By firstLabelTextBy = By.xpath("//label[@for='id_choose_the_place_you_want_to_go']");
    By secendLabelTextBy = By.xpath("//label[@for='id_choose_how_you_want_to_get_there']");
    By thirdLabelTextBy = By.xpath("//label[@for='id_choose_when_you_want_to_go']");

    By firstSelectOptionBy = By.id("id_choose_the_place_you_want_to_go");
    By secendSelectOptionBy = By.id("id_choose_how_you_want_to_get_there");
    By thirdSelectOptionBy = By.id("id_choose_when_you_want_to_go");
    By submitButtonBy = By.id("submit-id-submit");
    By resoltTextBy = By.id("result-text");

    public void checkFailedNames(){
        Assert.assertTrue(readText(firstLabelTextBy).contains("Choose the place you want to go"));
        Assert.assertTrue(readText(secendLabelTextBy).contains("Choose how you want to get there"));
        Assert.assertTrue(readText(thirdLabelTextBy).contains("Choose when you want to go"));
    }

    public void checkRequired(){
        checkRequired(firstSelectOptionBy);
        checkRequired(secendSelectOptionBy);
        checkRequired(thirdSelectOptionBy);
    }

    public String selectAndReadFirstFiled(){
        String id = "id_choose_the_place_you_want_to_go";
        int number = pickRandumNumber(5);
        clickInput(number,firstSelectOptionBy, id );
        String selectedText = readTextFromLable(number, id);
        return selectedText;
    }

    public void selectSecondFiled(int number){
        clickInput(number, secendSelectOptionBy, "id_choose_how_you_want_to_get_there");
    }

    public String readSelectSecondFiled(int number){
        String selectedText = readTextFromLable(number, "id_choose_how_you_want_to_get_there");
        return selectedText;
    }

    public String selectAndReadSecondFiled(){
        int number = pickRandumNumber(4);
        selectSecondFiled(number);
        String selectedText = readSelectSecondFiled(number);
        return selectedText;
    }

    public String selectAndReadThirdFiled(){
        String id = "id_choose_when_you_want_to_go";
        int number = pickRandumNumber(3);
        clickInput(number,thirdSelectOptionBy, id );
        String selectedText = readTextFromLable(number, id);
        return selectedText;
    }

    public void verificationMulipleSelect(){
        String destination = selectAndReadFirstFiled();
        String transport = selectAndReadSecondFiled();
        String when = selectAndReadThirdFiled();
        clickElement(submitButtonBy);
        String text = "to go by " + transport + " to the "+ destination +" " + when;
        assertStringEquals(text.toLowerCase(), readText(resoltTextBy));
    }
}
