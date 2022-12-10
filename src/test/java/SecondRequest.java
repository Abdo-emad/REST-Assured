import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

public class SecondRequest {
    public static void main(String[] args) {
   // this is the way that you write it to test an api request or get api response
       Response response= RestAssured.
                given().
                baseUri("https://reqres.in/api/users").
                queryParam("page","2").
                when().get();
       // print response body
        response.prettyPeek();
        // assert status code
        response.then().statusCode(200);
        // assert on status line (actual state)
        response.then().statusLine("HTTP/1.1 200 OK");
        // assert on body parameters
        response.then().body("data[2].email", Matchers.equalTo("tobias.funke@reqres.in"));
    }
}
