package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextAreaInputsPage extends BasePage{
    public TextAreaInputsPage(WebDriver driver) {
        super(driver);
    }

    By textAreaBy = By.id("id_text_area");

    By labelBy = By.xpath("//label");

    By submitButtonBy = By.id("submit-id-submit");

    By resultTextBy = By.id("result-text");

  public void chekFieldName(){
       checkNameOfField(labelBy, "Text area");
  }

    public void chekRequiredTextArea(){
        checkRequired(textAreaBy);
    }

    public void clickSubmitButton(){
      clickElement(submitButtonBy);
    }

    public String makeFakeText(){
        Faker faker = new Faker();
        String text = faker.lorem().paragraph(5);
        return text;
    }

    public void enterFakeText(String text){
        enterText(textAreaBy, text);
    }
    public void verificationText(){
        String text = makeFakeText();
        enterFakeText(text);
        clickSubmitButton();
        assertStringEquals(text, readText(resultTextBy));
    }


}
