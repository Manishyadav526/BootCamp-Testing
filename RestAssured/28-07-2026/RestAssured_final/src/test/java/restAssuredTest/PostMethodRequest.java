package restAssuredTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class PostMethodRequest {

    @Test
    public void createPost() {

        // Create JSON Request Body
        JSONObject request = new JSONObject();

        request.put("title", "Rest Assured");
        request.put("body", "Learning POST Request");
        request.put("userId", 1);

        given()
            .header("Content-Type", "application/json")
            .body(request.toString())

        .when()
            .post("https://jsonplaceholder.typicode.com/posts")

        .then()
            .log().all()
            .statusCode(201)
            .body("title", equalTo("Rest Assured"))
            .body("body", equalTo("Learning POST Request"))
            .body("userId", equalTo(1));
    }
}