package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php")

 public class ContactUsPage extends BasePage {

    @FindBy(id = "uniform-id_contact")
    private WebElement subjectHeadingDropDownButton;

    @FindBy (id = "id_contact")
    private WebElement subject;

    @FindBy (id = "email")
    private WebElement emailAddressField;

    @FindBy (css = "[name = 'id_order']")
    private WebElement orderReferenceDropDownButton;

    @FindBy (id = "uniform-fileUpload")
    private WebElement attachFiledButton;

    @FindBy (id = "submitMessage")
    private WebElement sendButton;

    @FindBy (id = "message")
    private WebElement messageField;

    @FindBy (css = "a[title='Contact Us']")  // button
    private WebElement contactUsButton;


    public ContactUsPage(WebDriver driver) {
        super(driver);

        }


    public void clickOnSubjectHeadingDropDownButton(String subjectValue) {
        element(subjectHeadingDropDownButton).click();
        selectFromDropdown(subject, subjectValue); // для dropdown

    }

    public void  fillInEmailAddressField (String email) {
        element (emailAddressField).sendKeys(email);
    }

    public void clickOnOrderReferenceDropDownButton (String order) {
    element (orderReferenceDropDownButton).sendKeys(order);

   }

   public void clickOnAttachFiledButton (String pathToFile ) {
        element (attachFiledButton).click();
        getDriver().switchTo().activeElement().sendKeys(pathToFile);
   }

   public void clickOnSendButton () {
        element (sendButton).click();
   }

   public void clickOnMessageField (String message) {
        element(messageField).sendKeys(message);

   }

    public void clickOnContactUsButton() {
        element (contactUsButton).click();
    }

    }



