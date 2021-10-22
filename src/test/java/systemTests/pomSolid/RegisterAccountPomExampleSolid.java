package systemTests.pomSolid;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import systemTesting.InitDriver;
import systemTests.pom.RegisterPage;

public class RegisterAccountPomExampleSolid extends InitDriver {

    private String url = "http://localhost:8081/register.html";
    private RegisterPageActions registerPageActions;

    @BeforeMethod
    public void goToUrl(){
        driver.get(url);
        registerPageActions =  new RegisterPageActions(driver,wait);
    }

    @Test
    public void createAccount() throws InterruptedException {
        Thread.sleep(5000);
        registerPageActions.fillRegisterPage();
        String currentUrl  = driver.getCurrentUrl();
        if(!currentUrl.contains("login.html")){
            Assert.fail("The page is not the correct one.");
        }
    }
}
