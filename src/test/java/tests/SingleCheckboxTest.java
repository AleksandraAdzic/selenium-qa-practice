package tests;

import org.testng.annotations.Test;
import pages.SingleCheckboxPage;

public class SingleCheckboxTest extends BaseTest{


    @Test
    public void singleCheckboxTest(){
        driver.get("https://www.qa-practice.com/elements/checkbox/single_checkbox");
        SingleCheckboxPage singleCheckboxPage = new SingleCheckboxPage(driver);
        singleCheckboxPage.checkNumber();
        singleCheckboxPage.textFromLabelNextToChekbox();
        singleCheckboxPage.chekIfIsAbleChekbox();
        singleCheckboxPage.checkIfButtonIsNotDissable();
        singleCheckboxPage.validationClikOnChekbox();
    }
}
