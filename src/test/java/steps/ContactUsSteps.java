package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ContactUsPage;

public class ContactUsSteps  extends ScenarioSteps {

    private ContactUsPage onContactPage;

    @Step
    public void clickOnSubjectHeadingDropDownButton  (String subjectValue) {
        onContactPage.clickOnSubjectHeadingDropDownButton (subjectValue);
    }

    @Step
    public void fillInEmailAddressField (String email){
        onContactPage.fillInEmailAddressField (email);
    }

    @Step
    public void clickOnOrderReferenceDropDownButton (String order){
        onContactPage.clickOnOrderReferenceDropDownButton (order);
    }

    @Step
    public void clickOnAttachFiledButton(String pathToFile) {
        onContactPage.clickOnAttachFiledButton (pathToFile);
    }
    @Step
    public void clickOnSendButton () {
        onContactPage.clickOnSendButton();
    }

    @Step
    public  void clickOnMessageField (String message) {
        onContactPage.clickOnMessageField(message);
    }

    @Step
    public void clickOnContactUsButton () {
        onContactPage.clickOnContactUsButton ();
    }
}


