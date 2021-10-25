package cucumberTests.tests;

import cucumberTests.hooksAndShareData.ShareData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import systemTests.pomSolid.RegisterPageActions;


public class RegisterStepsDefinition {

    private ShareData shareData;
    private RegisterPageActions createAccountModelActions;

    public RegisterStepsDefinition(ShareData shareData){
        this.shareData = shareData;
    }

    @Given("that we create a new account on {string}")
    public void thatWeCreateANewAccountOn(String url) {
        shareData.driver.get(url);
        createAccountModelActions = new RegisterPageActions(shareData.driver, shareData.wait);
    }

    @When("we add the firstname as {string}")
    public void weAddTheFirstnameAs(String firstname) {
       createAccountModelActions.fillFirstName(firstname);
    }

    @And("we add the lastname as {string}")
    public void weAddTheLastnameAs(String lastname) {
        createAccountModelActions.fillLastName(lastname);
    }

    @And("we add the email as {string}")
    public void weAddTheEmailAs(String email) {
        createAccountModelActions.fillEmail(email);
    }

    @And("we add the password as {string}")
    public void weAddThePasswordAs(String password) {
        createAccountModelActions.fillPassword(password);
    }

    @And("we add the repeat password as {string}")
    public void weAddTheRepeatPasswordAs(String repearPassword) {
        createAccountModelActions.fillRepeatPassword(repearPassword);
    }

    @And("we clicks the register account button")
    public void weClicksTheRegisterAccountButton() {
        createAccountModelActions.clickRegisterAccount();
    }

    @Then("the page should have the url {string}")
    public void thePageShouldHaveTheUrl(String urlLogin) {
        String currentUrl = shareData.driver.getCurrentUrl();
        if(!currentUrl.contains(urlLogin)){
            Assert.fail("The site didn't redirect to the expeted page. ExpectedUrl: " + currentUrl);
        }
    }

    @When("we clicks the button register with google")
    public void weClicksTheButtonRegisterWithGoogle() {
        createAccountModelActions.clickRegisterWithGoogleButton();
    }
}
