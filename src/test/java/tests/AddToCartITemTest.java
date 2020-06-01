package tests;

import org.junit.Test;

public class AddToCartITemTest extends SampleTest{

    @Test
    public void addToCartItemTest () {
        user.mainPage.openMainPage();
        user.mainPage.clickOnWomenTab();
        user.mainPage.clickOnAddToCartButtonsOnItems(3);
    }

}
