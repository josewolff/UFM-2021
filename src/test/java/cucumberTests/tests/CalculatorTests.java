package cucumberTests.tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CalculatorTests {

    private int total = 0;

    @Given("we have {int}")
    public void weHave(int value1) {
        total += value1;
    }

    @And("we add {int}")
    public void weAdd(int value2) {
        total += value2;
    }

    @Then("the value should be {int}")
    public void theValueShouldBe(int expectedTotal) {
        Assert.assertEquals(total,expectedTotal,"The total is not the expected.");
    }
}
