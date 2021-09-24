package integrationTesting;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetMethods {

    private String url;

    @BeforeClass
    public void initUrl(){
        url  = "http://localhost:5000/users/all";
    }

    @Test
    public void getAllUsers(){
        Response response = given()
                    .header("Content-Type","application/json")
                    .when()
                    .get(url)
                    .then()
                    .assertThat().statusCode(200)
                    .extract().response();
        String reponseString = response.asString();
        JSONArray jsonArray =  new JSONArray(reponseString);
        for(int i = 0; i < jsonArray.length(); i++){
            System.out.println(jsonArray.getJSONObject(i).toString(10));
        }
        //System.out.println(jsonArray.toString(10));

    }
}
