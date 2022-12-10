import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AssetStatusCode {
    public static void main(String[] args) {
        // Response Interface
        Response  response = RestAssured.given().baseUri("https://reqres.in/api/users/2").when().get();
        // response print response body
        response.prettyPeek();
        // assertion on  status code
        response.then().statusCode(200);
    }
}
