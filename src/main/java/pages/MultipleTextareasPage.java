package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleTextareasPage extends BasePage{
    public MultipleTextareasPage(WebDriver driver) {
        super(driver);
    }


    By labelForFirstBy= By.xpath("//label[@for='id_first_chapter']");
    By textAreaForFirstBy = By.id("id_first_chapter");
    By labelForSecondBy= By.xpath("//label[@for='id_second_chapter']");
    By textAreaForSecondBy = By.id("id_second_chapter");
    By labelForThirdBy = By.xpath("//label[@for='id_third_chapter']");
    By textAreaForThirdBy = By.id("id_third_chapter");

    By submitButtonBy = By.id("submit-id-submit");
    By resultTextBy = By.id("result-text");

    public void chekTextForFirstField(){
        checkNameOfField(labelForFirstBy, "First chapter");
    }
    public void chekTextForSecondField(){
        checkNameOfField(labelForSecondBy, "Second chapter");
    }

    public void chekTextForThirdField(){
        checkNameOfField(labelForThirdBy, "Third chapter");
    }

    public void chekTextForFields(){
        chekTextForFirstField();
        chekTextForSecondField();
        chekTextForThirdField();
    }

    public void chekRequiredForFirstField(){
        checkRequired(textAreaForFirstBy);
    }

    public void waitToBeButtonActiv(){
        waitToBeActiv(submitButtonBy);
    }


    public String writeTextInFirstChapter(){
        String text = writeTextInTextArea(textAreaForFirstBy);
        return text;
    }
    public String writeTextInSecondChapter(){
        String text = writeTextInTextArea(textAreaForSecondBy);
        return text;
    }

    public String writeTextInThirdChapter(){
        waitToBeActiv(textAreaForThirdBy);
        String text = writeTextInTextArea(textAreaForThirdBy);
        return text;
    }

    public void verificationText(String text){
        assertStringEquals(readText(resultTextBy), text);
    }
}
