package tests;

import org.junit.Test;
import Helper.PropertiesHelper;
import org.junit.Test;

 public class InvalidEmailMessageTest extends SampleTest {

    @Test
    public void InvalidEmailMessage () {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.mainPage.fillEmailAddressField ("automationstep@@gmail.com");
        user.mainPage.fillPasswordField("");
        user.mainPage.clickOnSubmitLoginButton();
        user.mainPage.checkInvalidEmailMessage();

    }

}
