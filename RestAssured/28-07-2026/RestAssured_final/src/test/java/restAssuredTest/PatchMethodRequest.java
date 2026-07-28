package restAssuredTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class PatchMethodRequest {

    @Test
    public void patchPost() {

        String requestBody =
                "{"
                + "\"title\":\"Patched Title\""
                + "}";

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)

        .when()
            .patch("https://jsonplaceholder.typicode.com/posts/1")

        .then()
            .log().all()
            .statusCode(200)
            .body("title", equalTo("Patched Title"));
    }
}