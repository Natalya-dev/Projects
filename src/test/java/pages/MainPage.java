//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@DefaultUrl("http://automationpractice.com/index.php")
public class MainPage extends BasePage {
    @FindBy(css = "a.login")

    private WebElement signInButton;

    @FindBy (xpath = ("//*[@id='create-account_form']/div/p")
            private WebElement createAnAccountText;
    @FindBy (id = "email")
            private Webelement emailAddressField;
    @FindBy (id = "passwd")
            private WebElement passwordField;

    public MainPage(WebDriver driver) { super(driver); }

    public void openMainPage() { open(); }


    public void clickOnSignInButton() {element(signInButton).click();

        public void checkText() {
            String text = element(signInButton).getText();
            Pattern pattern = Pattern.compile("(^Please\\senter\\s)");
            Matcher matcher = pattern.matcher(text);

            if(matcher.find()) {
                System.out.println("Нашел");
            } else {
                System.out.println("Нe нашел");
            }

        }
        public void fillInEmailAddressField (String email) {
            element (emailAddressField).sendKeys(email);
        }

        public void fillInPasswordField (String password) {
            element (passwordField).sendKeys(password);
        }
    }
}
