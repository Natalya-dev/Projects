package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
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
    public void checkEmailTest () {   /////// TASK
        onPage.checkEmailTest();
    }

    @Step
    public void checkInvalidEmailTest () {  ///// TASK
        onPage.checkInvalidEmailTest();

    }

    @Step
    public void checkWithoutEmailTest () {  ///// TASK
        onPage.checkWithoutEmailTest();
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
    public void clickOnCasualDressesTab () { ////// TASK
        onPage.clickOnCasualDressesTab();
    }

    @Step
    public void clickOnAddToCartButton () { ////// TASK
        onPage.clickOnAddToCartButton();
    }

    @Step
    public void checkCartTest () { ////// TASK
        onPage.checkCartTest();
    }

    @Step
    public void clickOnAddToCartButtonsOnItems (int count) {
        onPage.clickOnAddToCartButtonsOnItems(count);
    }

