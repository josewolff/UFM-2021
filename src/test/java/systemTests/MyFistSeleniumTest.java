package systemTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import systemTesting.InitDriver;

public class MyFistSeleniumTest extends InitDriver {

    @BeforeClass(alwaysRun = true)
    public void initUrl(){
        driver.get("http://localhost:8081/");

    }

    @Test(groups = {"myfirstTest"})
    public void myfirstTest() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("hello");
    }
}