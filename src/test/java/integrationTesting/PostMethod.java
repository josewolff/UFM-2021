package integrationTesting;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import requestMaker.RequestMaker;

import static io.restassured.RestAssured.given;

public class PostMethod {

    private String url;

    @BeforeClass
    public void initUrl(){
        url  = "http://localhost:5000/users/add";
    }

    @Test
    public void postUser(){
        for (int i = 0; i < 200; i++){
            JSONObject body = new JSONObject();
            body.put("username","username"+i)
                    .put("firstname", "firstame12"+i)
                    .put("lastname", "lastname12"+i)
                    .put("email","email12" + i +"@gmail.com");
            Response response = RequestMaker.makePostRequest(url,body.toString());
            String reponseString = response.asString();
            JSONObject jsonArray =  new JSONObject(reponseString);
            System.out.println(jsonArray.toString(10));
        }
    }
}
