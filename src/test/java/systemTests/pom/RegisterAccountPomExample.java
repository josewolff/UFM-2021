package systemTests.pom;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import systemTesting.InitDriver;

public class RegisterAccountPomExample extends InitDriver {

    private String url = "http://localhost:8081/register.html";
    private RegisterPage registerPage;

    @BeforeMethod
    public void goToUrl(){
        driver.get(url);
        registerPage =  new RegisterPage(driver,wait);
    }

    @Test
    public void createAccount() throws InterruptedException {
        Thread.sleep(5000);
       registerPage.fillFirstName("Test");
       registerPage.fillLastName("test2");
       registerPage.fillEmail("test@email.com");
       registerPage.fillPassword("passwords");
       registerPage.fillRepeatPassword("sdfasd");
       registerPage.clickRegisterAccount();
        String currentUrl  = driver.getCurrentUrl();
        if(!currentUrl.contains("login.html")){
            Assert.fail("The page is not the correct one.");
        }
    }
}
