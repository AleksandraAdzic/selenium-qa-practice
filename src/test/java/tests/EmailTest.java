package tests;

import org.testng.annotations.Test;
import pages.EmailPage;
import utilities.PropertyManager;

public class EmailTest extends BaseTest {
    @Test
    public void validEmailTest() {
        driver.get("https://www.qa-practice.com/elements/input/email");
        EmailPage emailPage = new EmailPage(driver);
        String email = emailPage.email();
        emailPage.enterEmail(email);
        emailPage.pressEnterEmail();
        emailPage.verificationValidEmailAdrres(email);
    }

    @Test
    public void invalidEmailTest() {
        driver.get("https://www.qa-practice.com/elements/input/email");
        EmailPage emailPage = new EmailPage(driver);
        String email = PropertyManager.getInstance().getInvalidEmail();
        emailPage.enterEmail(email);
        emailPage.pressEnterEmail();
        emailPage.verificationValidEmailAdrres(email);
    }
}