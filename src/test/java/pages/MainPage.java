package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

@DefaultUrl("http://automationpractice.com/index.php")

public class MainPage extends BasePage{

    @FindBy(css = "a.login")
    private WebElement signInButton;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy (id="SubmitLogin")  
    private WebElement getSignInButtonOnLoginPage;

    @FindBy (css ="a[title='Women']")  
    private WebElement womenTab;

    @FindBy (css = "a[style=' style='background:#F39C11;']") 
    private WebElement orangeBox;

    @FindBy (css ="ul[class='color_to_pick_list clearfix']") 
    private List<WebElement> colorBoxes;

    @FindBy (css = "[class='sf-with-ul']") //// TASK
    private WebElement womenButton;

    @FindBy (css = "[class=\"row addresses-lists\"]") //// TASK
    private WebElement myAccount;

    @FindBy (xpath = "//div[@class='alert alert-danger']/ol/li")  //// TASK
    private WebElement errorEmail;

    @FindBy (xpath = "//*[@id='categories_block_left']/div/ul/li[2]") //// TASK
    private  WebElement dressesTab;

    @FindBy (xpath = "//*[@id='categories_block_left']/div/ul/li[1]/a") //// TASK
    private WebElement casualDressesTab;

    @FindBy (xpath = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]") //// TASK
    private  WebElement addToCartButton;

    @FindBy (xpath = "//*[@id=\"center_column\"]/h1/span[2]") //// TASK
    private WebElement textItemInCart;

    @FindBy(xpath = "//*[@id='center_column']/ul/li")
    private List<WebElement> moveToItem;

    @FindBy (css = "a[title='Add to cart'][data-id-product]")
    private List<WebElement> addToCartButtons;

    @FindBy (xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span" )
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//*[@id='create-account_form']/div/p")
    private WebElement createAccountText;

    @FindBy (css = "[class='btn btn-default button button-medium']" ) //// TASK
    private WebElement proceedToCheckoutButtonOnPopUp;

    @FindBy (css = "[class='button btn btn-default standard-checkout button-medium']") //// TASK
    private WebElement proceedToCheckoutButtonOnShoppingCartPage;

    @FindBy (css = "[class='button btn btn-default button-medium']") //// TASK
    private WebElement proceedToCheckoutButtonOnAddressesPage;

    @FindBy (css = "[class='checker']") //// TASK
    private WebElement checkBoxIAgreeToTheTermsOfService;

    @FindBy (css = "[class='button btn btn-default standard-checkout button-medium']") //// TASK
    private WebElement proceedToCheckoutButtonOnShippingPage;

    @FindBy (css = "[class='cheque']") //// TASK
    private WebElement payByCheckButton;

    @FindBy (css = "[class='button btn btn-default button-medium']") //// TASK
    private WebElement iConfirmMyOrderButton;

    @FindBy (css = "[class='alert alert-success']") //// TASK
    private WebElement yourOrderOnMyStoreText;

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

    public void clickOnSubmitLoginButton () {  
        element(getSignInButtonOnLoginPage).click();
    }

    public void clickOnWomenTab() {
        element(womenTab).click();
    }

    private List<WebElement> getColorBoxes () {
        return colorBoxes;
    }

    public void clickOnWomenButton () {
        element (womenButton).click();
    }

    public void clickOnDressesTab () { //// TASK
        element(dressesTab).click();
    }

     public void clickOnCasualDressesTab () { //// TASK
        element(casualDressesTab).click();
    }

     public void clickOnAddToCartButton () { //// TASK
        element(addToCartButton).click();
    }
    
     public void clickOnProceedToCheckoutButtonOnPopUp () { ///// TASK
        element (proceedToCheckoutButtonOnPopUp).click();
     }

     public void clickOnProceedToCheckoutButtonOnShoppingCartPage () { //// TASK
        element(proceedToCheckoutButtonOnShoppingCartPage).click();
     }

     public void clickOnProceedToCheckoutButtonOnAddressesPage () { //// TASK
        element (proceedToCheckoutButtonOnAddressesPage).click();
     }

     public void clickOnCheckBoxIAgreeToTheTermsOfService () { //// TASK
        element (checkBoxIAgreeToTheTermsOfService).click();
     }

     public void  clickOnProceedToCheckoutButtonOnShippingPage () { //// TASK
        element (proceedToCheckoutButtonOnShippingPage).click();
     }

     public void clickOnPayByCheckButton () { //// TASK
        element (payByCheckButton).click();
     }

     public void clickOnIConfirmMyOrderButton () { //// TASk
        element (iConfirmMyOrderButton).click();
     }

    /////////////////////////////////////проверка//////////////////////////

    public void checkOrangeColorsOnItems () {
        int counter = 0;
        for (int i =0; 1 < getColorBoxes().size();i++) {
            if (getColorBoxes().get(i).findElements(By.cssSelector("a[style='background:#F39C11;']")).size() == 1) {
                counter ++;
            }
        }
        assertEquals(3, counter);
    }

    public void checkSignInWithValidEmailAndPassword () { //// TASK
      String textMyAccount = element (myAccount).getText();
       Assert.assertEquals("ORDER HISTORY AND DETAILS\n" +
               "MY CREDIT SLIPS\n" +
               "MY ADDRESSES\n" +
               "MY PERSONAL INFORMATION\n" +
               "MY WISHLISTS",textMyAccount);
    }

    public void checkInvalidEmailMessage () { //// TASK
        String textErrorEmail = element (errorEmail).getText();
        Assert.assertEquals ("Invalid email address.",textErrorEmail);
    }

    public void checkSignInWithoutEmailAndPassword () { //// TASK
        String textWithoutEmail = element (errorEmail).getText();
        Assert.assertEquals ("Authentication failed",textWithoutEmail);
    }
    
     public void checkAddingOneItemToCart  () {
        String textProductInCart = element (textItemInCart).getText();
         Assert.assertEquals ("There is 1 product.",textProductInCart);
     }

     private List <WebElement> getMoveToItemList () {
        return addToCartButtons;
     }

     public void clickOnAddToCartButtonsOnItems (int count) { // добавление в корзину через кнопку add to cart
        for (int i = 0; i < count; i++) {
            withAction().moveToElement(getMoveToItemList().get(i)).perform(); // элемент из коллекции  moveToItem.get(i)
            getDriver().findElement(By.cssSelector("a[title='Add to cart'][data-id-product = '" + (i+1) + "']")).click();
            element(continueShoppingButton).click();
        }

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

    public void checkOrderConfirmationMessage() { //// TASK
        String yourOrderOnMyStoreMessage = element (yourOrderOnMyStoreText).getText();
        Assert.assertEquals("Your order on My Store is complete.",yourOrderOnMyStoreMessage );
    }
    }
