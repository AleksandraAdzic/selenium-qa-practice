package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SingleSelectPage extends BasePage{
    public SingleSelectPage(WebDriver driver) {
        super(driver);
    }

    By fieldNameBy =By.xpath("//label");
    By selectLanguageBy= By.id("id_choose_language");

    By submitButtonBy = By.id("submit-id-submit");
    By resultTextBy = By.id("result-text");


    public void checkFieldName(){
        checkNameOfField(fieldNameBy, "Choose language");
    }

    public void checkIfFieldIsRequired(){
        checkRequired(selectLanguageBy);
    }

    public void clickSubmitButton(){
        clickElement(submitButtonBy);
    }
    public void clickToChooseLanguage(){
        clickElement(selectLanguageBy);
    }
    public int pickRandrumNumber(){
       int number = pickRandumNumber(5);
        return number;
    }

    public void clickSomeLenguage(int number){
        clickElement(driver.findElement(By.xpath("//option[@value= '"+number+"' ]")));
    }

    public String readSelectLanguage(int number){
        String text = readText(By.xpath("//option[@value= '"+number+"' ]"));
        return text;
    }

    public String readSelectLanguage(){
        clickToChooseLanguage();
        int number = pickRandrumNumber();
        clickSomeLenguage(number);
        String language = readSelectLanguage(number);
        return language;
    }

    public void validationSelectedLanguage(){
        String language = readSelectLanguage();
        clickSubmitButton();
        assertStringEquals(language, readText(resultTextBy) );
    }

}
