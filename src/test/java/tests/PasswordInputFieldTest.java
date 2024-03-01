package tests;

import org.testng.annotations.Test;
import pages.PasswordInputFieldPage;
import utilities.PropertyManager;

public class PasswordInputFieldTest extends BaseTest{

        @Test
        public  void validPasswordTest(){
            driver.get("https://www.qa-practice.com/elements/input/passwd");
            PasswordInputFieldPage passwordInputFieldPage = new PasswordInputFieldPage(driver);
            String password = PropertyManager.getInstance().getValidPassword();
            passwordInputFieldPage.writeText(password);
            passwordInputFieldPage.pressEnterAfterInput();
            passwordInputFieldPage.verificationValidPassword(password);

        }

    @Test
    public  void invalidPasswordTest(){
        driver.get("https://www.qa-practice.com/elements/input/passwd");
        PasswordInputFieldPage passwordInputFieldPage = new PasswordInputFieldPage(driver);
        String password = PropertyManager.getInstance().getInvalidPassword();
        passwordInputFieldPage.writeText(password);
        passwordInputFieldPage.pressEnterAfterInput();
        passwordInputFieldPage.verificationValidPassword(password);

    }
}
