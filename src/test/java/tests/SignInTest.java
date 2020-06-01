package tests;

import Helper.PropertiesHelper;
import org.junit.Test;

    public class SignInTest extends SampleTest {

        @Test
        public void signInWithValidEmailAndPassword() {
            user.mainPage.openMainPage();
            user.mainPage.clickOnSignInButton();
            user.mainPage.fillEmailAddressField(PropertiesHelper.INSTANCE.getProperties("email"));
            user.mainPage.fillPasswordField(PropertiesHelper.INSTANCE.getProperties("password"));
            user.mainPage.clickOnSubmitLoginButton();
            user.mainPage.checkSignInWithValidEmailAndPassword();
        }
    }

