package systemTests.myFirstTestInSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import systemTesting.InitDriver;

public class CreateAccountFirstTestImplicitWaits extends InitDriver {

    private String url = "http://localhost:8081/register.html";

    @BeforeMethod
    public void goToUrl(){
        driver.get(url);
    }

    @Test
    public void createAccount() throws InterruptedException {
        driver.findElement(By.id("exampleFirstName")).sendKeys("Wolff");
        Thread.sleep(2000);
        driver.findElement(By.id("exampleLastName")).sendKeys("Ferguson");
        Thread.sleep(2000);
        driver.findElement(By.id("exampleInputEmail")).sendKeys("wolff@ufm.edu");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/div/input[@placeholder='Password']")).sendKeys("Password");
        Thread.sleep(2000);
        driver.findElement(By.id("exampleRepeatPassword")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Register Account')]")).click();
        Thread.sleep(2000);
        String currentUrl  = driver.getCurrentUrl();
        if(!currentUrl.contains("login.html")){
            Assert.fail("The page is not the correct one.");
        }
    }
}
