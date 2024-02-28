package tests;

import org.testng.annotations.Test;
import pages.TextAreaInputsPage;

public class TextAreaInputsTest extends BaseTest{

    @Test
    public void textAreaInputsText(){
        driver.get("https://www.qa-practice.com/elements/textarea/single");
        TextAreaInputsPage textAreaInputsPage = new TextAreaInputsPage(driver);
        textAreaInputsPage.chekFieldName();
        textAreaInputsPage.chekRequiredTextArea();
        textAreaInputsPage.verificationText();
    }

}
