package integrationTesting;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import requestMaker.RequestMaker;

public class RemoveMethods {


    private String url;

    @BeforeClass
    public void initUrl() {
        url = "http://localhost:5000/users/removebyid/411";
    }


    @Test
    public void removeTest() {
        Response response = RequestMaker.makeRemoveRequest(url);
        String reponseString = response.asString();
        JSONObject jsonArray = new JSONObject(reponseString);

        System.out.println(jsonArray.toString(10));
    }
}
