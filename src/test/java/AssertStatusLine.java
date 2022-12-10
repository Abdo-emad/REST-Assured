import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

public class AssertStatusLine {
    public static void main(String[] args) {
        Response response = RestAssured.given().baseUri("https://reqres.in/api/users/2").when().get();
        response.prettyPeek();
        response.then().statusLine("HTTP/1.1 200 OK");
        // assertion on response body parameters (email)
        response.then().body("data.email", Matchers.equalTo("janet.weaver@reqres.in"));
    }
}
