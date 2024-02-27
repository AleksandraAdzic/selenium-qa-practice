package tests;


import org.testng.annotations.Test;
import pages.PromptBoxPage;

public class PromptBoxTest extends BaseTest {

    @Test
    public void promptBoxOkTest(){
        driver.get("https://www.qa-practice.com/elements/alert/prompt");
        PromptBoxPage promptBoxPage = new PromptBoxPage(driver);
        promptBoxPage.checkClickButton();
        promptBoxPage.clickClickButton();
        String text = promptBoxPage.sendTextInAlert();
        promptBoxPage.clickOkOnAlert();
        promptBoxPage.verificationTextFromPromptBoxOk(text);
    }

    @Test
    public void promptBoxCancleTest(){
        driver.get("https://www.qa-practice.com/elements/alert/prompt");
        PromptBoxPage promptBoxPage = new PromptBoxPage(driver);
        promptBoxPage.clickClickButton();
        promptBoxPage.clickCancleOnAlert();
        promptBoxPage.varificationTextFromCanclePromptBox();
    }
}
