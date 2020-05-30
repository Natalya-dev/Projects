package tests;
import Helper.PropertiesHelper;
import org.junit.Test;

public class AddToCartOneItemTest extends SampleTest {

    @Test
    public void addToCartOneItem () {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.mainPage.fillEmailAddressField(PropertiesHelper.INSTANCE.getProperties("email"));
        user.mainPage.fillPasswordField(PropertiesHelper.INSTANCE.getProperties("password"));
        user.mainPage.clickOnSubmitLoginButton();
        user.mainPage.clickOnWomenButton();
        user.mainPage.clickOnDressesTab();
        user.mainPage.clickOnCasualDressesTab();
        user.mainPage.clickOnAddToCartButton();
        user.mainPage.checkAddingOneItemToCart();

    }
}


