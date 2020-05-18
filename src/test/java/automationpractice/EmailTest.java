package automationpractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class EmailTest {
package automationpractice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

    public class EmailTest extends WebdriverSetting {

        @Test
        public void emailTest() {
            driver.get("http://automationpractice.com/index.php");
            driver.findElement(By.cssSelector("[class='login']")).click();
            driver.findElement(By.id("email")).sendKeys("automationstep@gmail.com");
            driver.findElement(By.id("passwd")).sendKeys("123456");
            driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
            //driver.findElement(By.cssSelector("[class=\"info-account\"]"));

            Assert.assertTrue(driver.findElement(By.cssSelector("[class=\"row addresses-lists\"]")).isDisplayed());
            Assert.assertEquals("ORDER HISTORY AND DETAILS\n" +
                    "MY CREDIT SLIPS\n" +
                    "MY ADDRESSES\n" +
                    "MY PERSONAL INFORMATION\n" +
                    "MY WISHLISTS", driver.findElement(By.cssSelector("[class=\"row addresses-lists\"]")).getText());

        }

        @Test
        public void emailTest2() {
            driver.get("http://automationpractice.com/index.php");
            driver.findElement(By.cssSelector("[class='login']")).click();
            driver.findElement(By.id("email")).sendKeys("automationstep@@gmail.com");
            driver.findElement(By.id("passwd")).sendKeys("");
            driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();

            Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).isDisplayed());
            Assert.assertEquals("Authentication failed", driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).getText());


        }

        @Test
        public void emailTest3() {
            driver.get("http://automationpractice.com/index.php");
            driver.findElement(By.cssSelector("[class='login']")).click();
            driver.findElement(By.id("email")).sendKeys("");
            driver.findElement(By.id("passwd")).sendKeys("");
            driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
            Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).isDisplayed());
            Assert.assertEquals("Authentication failed", driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).getText());

        }
    }
}
