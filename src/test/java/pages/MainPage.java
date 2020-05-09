package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@DefaultUrl("http://automationpractice.com/index.php")

public class MainPage extends BasePage{

    @FindBy(css = "a.login")
    // Указываем веб элемент и его название:
    private WebElement signInButton;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

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

    public void checkText(){
       
        String text = element(createAccountText).getText();
        //Создаем паттерн и компилируем:
        Pattern pattern = Pattern.compile("(^Please\\senter\\s)");
        Matcher matcher = pattern.matcher(text);
      
        if(matcher.find()){
            //Если тру:
            System.out.println("FOUND");
        }else {
           
            System.out.println("NOT FOUND");
        }
    }
}
