import io.restassured.RestAssured;


public class PostRequest {
    public static void main(String[] args) {

        RestAssured.given().
                baseUri("https://reqres.in/api/users").
                when().
                body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}").
                header("Content-Type","application/json").
                post().
                prettyPeek();
    }
}
