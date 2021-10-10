package integrationTesting;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import requestMaker.RequestMaker;

import static io.restassured.RestAssured.given;

public class GetMethods {

    private String url;

    @BeforeClass
    public void initUrl(){
        url  = "http://localhost:5000/users/all";
    }

    @Test
    public void getAllUsers(){
        Response response = RequestMaker.makeGetRequest(url);
        String reponseString = response.asString();
        JSONArray jsonArray =  new JSONArray(reponseString);
        for(int i = 0; i < jsonArray.length(); i++){
            System.out.println(jsonArray.getJSONObject(i).toString(10));
        }
    }

    @Test
    public void findById(){
        String url = "http://localhost:5000/users/findbyid/412";
        Response response = RequestMaker.makeGetRequest(url);
        String reponseString = response.asString();
        JSONObject jsonArray =  new JSONObject(reponseString);
        System.out.println(jsonArray.toString(10));
    }

    @Test
    public void gfindByEmail(){
        String url = "http://localhost:5000/users/findbyemail/usernamge@gmail.com";
        Response response = RequestMaker.makeGetRequest(url);
        String reponseString = response.asString();
        JSONArray jsonArray =  new JSONArray(reponseString);
        for(int i = 0; i < jsonArray.length(); i++){
            System.out.println(jsonArray.getJSONObject(i).toString(10));
        }
    }
}
