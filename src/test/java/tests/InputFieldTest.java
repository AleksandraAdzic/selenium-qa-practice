package tests;

import org.testng.annotations.Test;
import pages.InputFieldPage;

public class InputFieldTest extends BaseTest{

    @Test
    public void inputFieldTestLenght(){
        driver.get("https://www.qa-practice.com/elements/input/simple");
        InputFieldPage inputFieldPage = new InputFieldPage(driver);
        inputFieldPage.checkRequiredInput();
        String text = inputFieldPage.fakerText(2);
        inputFieldPage.enterTextToInput(text);
        inputFieldPage.pressEnterToInput();
        inputFieldPage.verificationChekInputForLenght(text);
    }

    @Test
    public void inputFieldTestForCharacter(){
        driver.get("https://www.qa-practice.com/elements/input/simple");
        InputFieldPage inputFieldPage = new InputFieldPage(driver);
        inputFieldPage.checkRequiredInput();
        String text = "#";
        inputFieldPage.enterTextToInput(text);
        inputFieldPage.pressEnterToInput();
        //inputFieldPage.verificationChekInputForCharacter(text);
    }
}
