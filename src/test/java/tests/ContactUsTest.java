package tests;

import org.junit.Test;

public class ContactUsTest extends SampleTest {

    @Test
    public void contactUsTest() {
        user.mainPage.openMainPage();
        user.contactUsPage.clickOnContactUsButton();
        user.contactUsPage.clickOnSubjectHeadingDropDownButton("Webmaster");
        user.contactUsPage.clickOnAttachFiledButton("C:\\Users\\maksi\\OneDrive\\Рабочий стол\\New Text Document.txt");
       try {
            Thread.sleep(10000);
       } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
}


