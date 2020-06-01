package tests;

import Helper.PropertiesHelper;
import org.junit.Test;

public class PayForProductByCheckTest extends SampleTest {

    @Test
    public void payForProductByCheck() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.mainPage.fillEmailAddressField(PropertiesHelper.INSTANCE.getProperties("email"));
        user.mainPage.fillPasswordField(PropertiesHelper.INSTANCE.getProperties("password"));
        user.mainPage.clickOnSubmitLoginButton();
        user.mainPage.clickOnWomenButton();
        user.mainPage.clickOnDressesTab();
        user.mainPage.clickOnCasualDressesTab();
        user.mainPage.clickOnAddToCartButton();
        user.mainPage.clickOnProceedToCheckoutButtonOnPopUp ();
        user.mainPage.clickOnProceedToCheckoutButtonOnShoppingCartPage ();
        user.mainPage.clickOnProceedToCheckoutButtonOnAddressesPage ();
        user.mainPage.clickOnCheckBoxIAgreeToTheTermsOfService ();
        user.mainPage.clickOnProceedToCheckoutButtonOnShippingPage ();
        user.mainPage.clickOnPayByCheckButton ();
        user.mainPage.clickOnIConfirmMyOrderButton ();
        user.mainPage.checkOrderConfirmationMessage ();

    }
}