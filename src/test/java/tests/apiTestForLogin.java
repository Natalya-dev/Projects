package tests;

import Helper.PropertiesHelper;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.path.xml.XmlPath;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static com.jayway.restassured.RestAssured.given;

public class apiTestForLogin {

    @Test
    public void apiTEstForLogin () {
        Response responseForCookies = given ()
                .param("email", PropertiesHelper.INSTANCE.getProperties("email"))
                .param("passwd",PropertiesHelper.INSTANCE.getProperties("password"))
                .param ("back", "my-account")
                .param("SubmitLogin", "")
                .post ("http://automationpractice.com/index.php?controller=authentication");
                Map<String, String> loginCookies = responseForCookies.getCookies(); // map это коллекция индексу соответствует значение ( в других коллекциях ключ и значение есть, ключу соответ значение, ключи уникальны)
                                                                                    // значене в одном формате а

        Response responseForLogin = given ()
                .cookies(loginCookies)
                .get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
               String htmlPage = responseForLogin.asString();
               XmlPath xmlPath = new XmlPath(XmlPath.CompatibilityMode.HTML,htmlPage);
               String title = xmlPath.getString("html.head.title");
               Assert.assertEquals("My account - My Store", title);
                System.out.println (responseForLogin.getBody().print());

    }

}
