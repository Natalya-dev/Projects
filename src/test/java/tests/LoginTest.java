package tests;

import Helper.PropertiesHelper;
import org.junit.Test;

public class LoginTest extends SampleTest {

 
    @Test
    public void loginTest() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.mainPage.fillEmailAddressField(PropertiesHelper.INSTANCE.getProperties("email"));
        user.mainPage.fillPasswordField(PropertiesHelper.INSTANCE.getProperties("password"));
    }
}
