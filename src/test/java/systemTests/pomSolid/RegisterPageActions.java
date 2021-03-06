package systemTests.pomSolid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPageActions extends  RegisterPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public RegisterPageActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void fillRegisterPage(){
        fillFirstName("Test");
        fillLastName("test2");
        fillEmail("test@email.com");
        fillPassword("passwords");
        fillRepeatPassword("sdfasd");
        clickRegisterAccount();
    }

    public void fillFirstName(String firstNameTest){
        wait.until(ExpectedConditions.visibilityOf(firstName)).sendKeys(firstNameTest);
    }


    public void fillLastName(String lastNameText){
        wait.until(ExpectedConditions.visibilityOf(lastName)).sendKeys(lastNameText);
    }


    public void fillEmail(String emailT){
        wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(emailT);
    }

    public void fillPassword(String passwordT){
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(passwordT);
    }

    public void fillRepeatPassword(String rPasswordT){
        wait.until(ExpectedConditions.visibilityOf(repeatPassword)).sendKeys(rPasswordT);
    }

    public void clickRegisterAccount(){
        wait.until(ExpectedConditions.visibilityOf(registerBtn)).click();
    }

    public void clickRegisterWithGoogleButton(){
        registerWithGoogle.click();
    }
}
