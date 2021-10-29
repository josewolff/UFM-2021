package cucumberTests.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test()
@CucumberOptions(features = {"src/test/resources/featureFiles/", "src/test/resources/calculator/"},
        glue = {"cucumberTests/hooksAndShareData", "cucumberTests/tests"},
        plugin = {"html:target/cucumber-reports/cucumber-reports.html","json:target/cucumber-reports/Cucumber.json"},
        publish = true, tags = "@registerFeature")
public class CucumberTestRunner  extends AbstractTestNGCucumberTests {
}
