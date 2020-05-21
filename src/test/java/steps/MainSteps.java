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
    public void clickOnSubmitLoginButton () { //////new
        onPage.clickOnSubmitLoginButton();
    }

    @Step
    public void clickOnWomenTab () {  //////new
        onPage.clickOnWomenTab ();
    }
    
    @Step
    public void checkOrangeColorsOnItems () {  /////new
        onPage.checkOrangeColorsOnItems();
    }
}
