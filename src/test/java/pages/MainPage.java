package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@DefaultUrl("http://automationpractice.com/index.php")

public class MainPage extends BasePage{

    @FindBy(css = "a.login")
    private WebElement signInButton;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy (id="SubmitLogin")  //////new//////
    private WebElement getSignInButtonOnLoginPage;

    @FindBy (css ="a[title='Women']")  /////new
    private WebElement womenTab;

    @FindBy (css = "a[style=' style='background:#F39C11;']") ////new
    private WebElement orangeBox;

    @FindBy (css ="ul[class='color_to_pick_list clearfix']") //////new
    private List<WebElement> colorBoxes;

    @FindBy(xpath = "//*[@id='create-account_form']/div/p")
    private WebElement createAccountText;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        open();
    }

    public void clickOnSignInButton() {
        element(signInButton).click();
    }

    public void fillEmailAddressField(String email){
        element(emailField).sendKeys(email);
    }
 
    public void fillPasswordField(String password){
        element(passwordField).sendKeys(password);
    }

    public void clickOnSubmitLoginButton () {  //////////new
        element(getSignInButtonOnLoginPage).click();
    }
    public void clickOnWomenTab() {   //////new
        element(womenTab).click();
    }
    private List<WebElement> getColorBoxes () {   /////new
        return colorBoxes;
    }

    public void checkOrangeColorsOnItems () {   /////new
        int counter = 0;
        for (int i =0; 1 < getColorBoxes().size();i++) {
            if (getColorBoxes().get(i).findElements(By.cssSelector("a[style='background:#F39C11;']")).size() == 1) {
                counter ++;
            }
        }
        Assert.assertEquals(3, counter);
    }

    public void checkText(){
        String text = element(createAccountText).getText();
        Pattern pattern = Pattern.compile("(^Please\\senter\\s)");
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()){
            System.out.println("FOUND");
        }else {
            System.out.println("NOT FOUND");
        }
    }
}
