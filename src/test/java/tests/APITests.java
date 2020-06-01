package tests;

import Helper.DataUser;
import com.jayway.restassured.response.Response;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import static com.jayway.restassured.RestAssured.given;

public class APITests {

    static String DEFAULT_URL = "https://jsonplaceholder.typicode.com/posts";
    static String CONTENT_TYPE = "Content-type";
    static String HEADER_APP_JSON = "application/json; charset=utf-8";
    Response response; // присваевать запрос и проверять
    SoftAssert softAssert = new SoftAssert();
    DataUser getUser1 = new DataUser("1", "foo", "poo");




    @Test
    public void verifyHTTPSStatusCode200() {
        given()
                .when ().get ("DEFAULT_URL")
                .then().assertThat().statusCode(200);
    }

    @Test
    public void verifyHTTPResponseHeader() {
        given()
                .when().get("DEFAULT_URL")
                .then().assertThat()
                .header(CONTENT_TYPE, HEADER_APP_JSON)
                .and().statusCode(200);
    }

    @Test
    public void verifyHTTPResponseBody () {
        response = given()
                .when().get(DEFAULT_URL);
                softAssert.assertEquals (response.body()
                 .jsonPath().getList("id").size(), 101);
          softAssert.assertAll();
    }

    @Test
    public void createNewPost () {
        response = given()
                .header(CONTENT_TYPE,HEADER_APP_JSON)
                .body(getUser1)
                .when().post(DEFAULT_URL);
        softAssert.assertEquals(response.statusCode(), 201);
        softAssert.assertNotNull(response.body());
        System.out.println("id: " + response.body()
                .jsonPath().getInt ("id"));
    }

    @Test
    public void updatePost () {
        response = given()
                .header(CONTENT_TYPE,HEADER_APP_JSON)
                .body(getUser1)
                .when().put(DEFAULT_URL + "/1");
        softAssert.assertEquals(response.statusCode(), 200);
        softAssert.assertEquals(response.getBody()
                .jsonPath().getInt("id"), 1);
        softAssert.assertEquals(response.getBody()
                .jsonPath().getString("title"),"foo");
        softAssert.assertAll();
        response.body().print();
    }

    @Test
    public void deletePost () {
        response = given()
                .header(CONTENT_TYPE,HEADER_APP_JSON)
                .when().delete(DEFAULT_URL + "/1");
        softAssert.assertEquals(response.statusCode(), 200);
        softAssert.assertAll();
        response.body().print ();
    }
}
