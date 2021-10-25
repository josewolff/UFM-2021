package cucumberTests.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test(groups = "tesitng-cucumber")
@CucumberOptions(features = {"src/test/resources/featureFiles/"},
        glue = {"cucumberTests/hooksAndShareData", "cucumberTests/tests"},
        plugin = {"html:target/cucumber-reports/cucumber-reports.html","json:target/cucumber-reports/Cucumber.json"},
        publish = true)
public class CucumberTestRunner  extends AbstractTestNGCucumberTests {
}
