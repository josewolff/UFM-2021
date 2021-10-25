package cucumberTests.hooksAndShareData;

import cucumber.CucumberDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {
    private ShareData shareData;

    public Hooks(ShareData shareData){
        this.shareData = shareData;
    }

    @Before
    public void InitDriver(){
        CucumberDriver cucumberDriver =  new CucumberDriver();
        shareData.driver = cucumberDriver.initDriver("chrome");
        shareData.wait = new WebDriverWait(shareData.driver, Duration.ofSeconds(15));
    }

    @After
    public void closeDriver(){
        shareData.driver.quit();
    }
}
