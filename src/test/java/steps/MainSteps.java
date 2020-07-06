package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ContactUsPage;
import pages.MainPage;

public class MainSteps extends ScenarioSteps {
    private MainPage onPage;

    @Step
    public void clickOnSignInButton() {
        onPage.clickOnSignInButton();
    }

    @Step
    public void openMainPage() {
        onPage.openMainPage();
    }

    @Step
    public void fillEmailAddressField(String email) {
        onPage.fillEmailAddressField(email);
    }

    @Step
    public void fillPasswordField(String password){
        onPage.fillPasswordField(password);
    }

    @Step
    public void checkText(){
        onPage.checkText();
    }
    @Step
    public void clickOnSubmitLoginButton () { 
        onPage.clickOnSubmitLoginButton();
    }

    @Step
    public void clickOnWomenTab () { 
        onPage.clickOnWomenTab ();
    }

    @Step
    public void checkOrangeColorsOnItems () { 
        onPage.checkOrangeColorsOnItems();
    }

    @Step
    public void checkSignInWithValidEmailAndPassword() {   //// TASK
        onPage.checkSignInWithValidEmailAndPassword();
    }

    @Step
    public void checkInvalidEmailMessage () {  //// TASK
        onPage.checkInvalidEmailMessage();

    }

    @Step
    public void checkSignInWithoutEmailAndPassword() {  //// TASK
        onPage.checkSignInWithoutEmailAndPassword();
    }

    @Step
    public void clickOnWomenButton () { //// TASK
        onPage.clickOnWomenButton();
    }

    @Step
    public void clickOnDressesTab () {  //// TASK
        onPage.clickOnDressesTab  ();
    }

    @Step
    public void clickOnCasualDressesTab () { //// TASK
        onPage.clickOnCasualDressesTab();
    }

    @Step
    public void clickOnAddToCartButton () { //// TASK
        onPage.clickOnAddToCartButton();
    }

    @Step
    public void checkAddingOneItemToCart () { //// TASK
        onPage.checkAddingOneItemToCart();
    }

    @Step
    public void clickOnAddToCartButtonsOnItems (int count) {
        onPage.clickOnAddToCartButtonsOnItems(count);
    }

    @Step
    public void clickOnProceedToCheckoutButtonOnPopUp () { //// TASK
        onPage.clickOnProceedToCheckoutButtonOnPopUp ();
    }

    @Step
    public void clickOnProceedToCheckoutButtonOnShoppingCartPage () { //// TASK
        onPage.clickOnProceedToCheckoutButtonOnShoppingCartPage ();
    }

    @Step
    public void clickOnProceedToCheckoutButtonOnAddressesPage () { //// TASK
        onPage.clickOnProceedToCheckoutButtonOnAddressesPage ();
    }

    @Step
    public void clickOnCheckBoxIAgreeToTheTermsOfService () { //// TASK
        onPage.clickOnCheckBoxIAgreeToTheTermsOfService ();
    }

    @Step
    public void clickOnProceedToCheckoutButtonOnShippingPage () { //// TASK
       onPage.clickOnProceedToCheckoutButtonOnShippingPage ();
    }

    @Step
    public void clickOnPayByCheckButton () { //// TASK
        onPage.clickOnPayByCheckButton ();
    }

    @Step
    public void clickOnIConfirmMyOrderButton () { //// TASK
        onPage.clickOnIConfirmMyOrderButton ();
    }

    @Step
    public void checkOrderConfirmationMessage () { //// TASK
        onPage.checkOrderConfirmationMessage ();
    }
}
