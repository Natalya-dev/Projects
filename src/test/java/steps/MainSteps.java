package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.MainPage;

public class MainSteps extends ScenarioSteps {
    private MainPage onPage;

    public MainSteps() {
    }

    @Step
    public void clickOnSignInButton() {
        this.onPage.clickOnSignInButton();
    }

    @Step
    public void openMainPage() { this.onPage.openMainPage(); }

    @Step
    public void checkText() {
        onPage.checkText () ;
        @Step
        public void fillInEmailAddressField (String email) {
            onPage.fillInEmailAddressField (email);

            @Step
                    public void fillInPasswordField (String password) {
                onPage.fillInPasswordField ();

            }
        }
    }

    public void fillInEmailAddressField(String email) {
    }

    public void fillInPasswordField(String password) {
    }
}