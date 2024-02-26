package tests;

import org.testng.annotations.Test;
import pages.ChekboxesPage;

public class ChekboxesTest extends BaseTest {

    @Test
    public void chekboxesOneChekTest(){
        driver.get("https://www.qa-practice.com/elements/checkbox/mult_checkbox");
        ChekboxesPage chekboxesPage = new ChekboxesPage(driver);
        chekboxesPage.checkNumber();
        chekboxesPage.textFromLabelNextToChekbox();
        chekboxesPage.chekIfIsAbleChekbox();
        chekboxesPage.checkIfButtonIsNotDissable();
        String text = chekboxesPage.checkCheckdChekbox();
        chekboxesPage.clickSubmitButton();
        chekboxesPage.verifikacationMultiChekdChekbox(text);
    }

    @Test
    public void chekboxesAllThreeChekTest(){
        driver.get("https://www.qa-practice.com/elements/checkbox/mult_checkbox");
        ChekboxesPage chekboxesPage = new ChekboxesPage(driver);
        chekboxesPage.clickAllThreeChekbox();
        chekboxesPage.clickSubmitButton();

    }

}
