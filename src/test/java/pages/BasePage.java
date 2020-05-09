// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends PageObject {
    protected BasePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}