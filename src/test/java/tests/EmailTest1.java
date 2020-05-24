package tests;

import Helper.PropertiesHelper;
import org.junit.Test;

public class EmailTest1 extends SampleTest {

    @Test
    public void emailTest1() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.mainPage.fillEmailAddressField(PropertiesHelper.INSTANCE.getProperties("email"));
        user.mainPage.fillPasswordField(PropertiesHelper.INSTANCE.getProperties("password"));
        user.mainPage.clickOnSubmitLoginButton();
        user.mainPage.checkEmailTest();
    }

    @Test
    public void InvalidEmailTest () {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.mainPage.fillEmailAddressField ("automationstep@@gmail.com");
        user.mainPage.fillPasswordField("");
        user.mainPage.clickOnSubmitLoginButton();
        user.mainPage.checkInvalidEmailTest();

    }

    @Test
    public void withoutEmailTest () {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.mainPage.fillEmailAddressField ("");
        user.mainPage.fillPasswordField("");
        user.mainPage.clickOnSubmitLoginButton();
        user.mainPage.checkWithoutEmailTest();
    }

     @Test
     public void CartTest () {
         user.mainPage.openMainPage();
         user.mainPage.clickOnSignInButton();
         user.mainPage.fillEmailAddressField(PropertiesHelper.INSTANCE.getProperties("email"));
         user.mainPage.fillPasswordField(PropertiesHelper.INSTANCE.getProperties("password"));
         user.mainPage.clickOnSubmitLoginButton();
         user.mainPage.clickOnWomenButton();
         user.mainPage.clickOnDressesTab();
         user.mainPage.clickOnCasualDressesTab();
         user.mainPage.clickOnAddToCartButton();
         user.mainPage.checkCartTest();

     }
}
