//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package tests;

import Helper.PropertiesHelper;
import org.junit.Test;

public class LoginTest extends SampleTest {

    @Test
    public void loginTest() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.mainPage.checkText();
        user.mainPage.fillInEmailAddressField (PropertiesHelper.INSTANCE.getProperty("email"));
        user.mainPage.fillInPasswordField (PropertiesHelper.INSTANCE.getProperty("password"));
    }
}

