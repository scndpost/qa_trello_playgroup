package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void firstTest() {
        RestAssured.get("https://www.google.com/").then().statusCode(200);
    }
}
