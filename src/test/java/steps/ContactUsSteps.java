package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ContactUsPage;

public class ContactUsSteps  extends ScenarioSteps {

    private ContactUsPage onPage;

    @Step
    public void clickOnSubjectHeadingDropDownButton  (String subjectValue) {
        onPage.clickOnSubjectHeadingDropDownButton (subjectValue);
    }

    @Step
    public void fillInEmailAddressField (String email){
        onPage.fillInEmailAddressField (email);
    }

    @Step
    public void clickOnOrderReferenceDropDownButton (String order){
        onPage.clickOnOrderReferenceDropDownButton (order);
    }

    @Step
    public void clickOnAttachFiledButton(String pathToFile) {
        onPage.clickOnAttachFiledButton (pathToFile);
    }
    @Step
    public void clickOnSendButton () {
        onPage.clickOnSendButton();
    }

    @Step
    public  void clickOnMessageField (String message) {
        onPage.clickOnMessageField(message);
    }

    @Step
    public void clickOnContactUsButton () {
       onPage.clickOnContactUsButton ();
    }
}


