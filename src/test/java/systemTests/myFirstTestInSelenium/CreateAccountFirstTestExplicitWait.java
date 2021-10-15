package systemTests.myFirstTestInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import systemTesting.InitDriver;

public class CreateAccountFirstTestExplicitWait extends InitDriver {

    private String url = "http://localhost:8081/register.html";

    @BeforeMethod
    public void goToUrl(){
        driver.get(url);
    }

    @Test
    public void createAccount() throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleFirstName"))).sendKeys("Wolff");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleLastName"))).sendKeys("Ferguson");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleInputEmail"))).sendKeys("wolff@ufm.edu");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/div/input[@placeholder='Password']"))).sendKeys("password");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleRepeatPassword"))).sendKeys("password");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Register Account')]"))).click();
        String currentUrl  = driver.getCurrentUrl();
        if(!currentUrl.contains("login.html")){
            Assert.fail("The page is not the correct one.");
        }
    }
}
