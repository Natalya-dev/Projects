package tests;
import org.junit.Test;
import Helper.PropertiesHelper;
import org.junit.Test;

public class SignInWithoutEmailAndPasswordTest extends SampleTest {

    @Test
    public void signInWithoutFillingEmailAndPasswordFields () {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.mainPage.fillEmailAddressField ("");
        user.mainPage.fillPasswordField("");
        user.mainPage.clickOnSubmitLoginButton();
        user.mainPage.checkSignInWithoutEmailAndPassword();
    }
}
