package restAssuredTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetRequestMethod {

    @Test
    public void getPosts() {

        given()

        .when()
            .get("https://jsonplaceholder.typicode.com/posts")

        .then()
            .log().all()                     
            .statusCode(200)                 
            .time(lessThan(2000L))          
            .body("size()", greaterThan(0)); 
    }
}