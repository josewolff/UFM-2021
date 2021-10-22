package systemTests.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "exampleFirstName")
    private WebElement firstName;

    @FindBy(id = "exampleLastName")
    private WebElement lastName;

    @FindBy(id = "exampleInputEmail")
    private WebElement email;

    @FindBy(xpath = "//div/div/input[@placeholder='Password']")
    private WebElement password;

    @FindBy(id = "exampleRepeatPassword")
    private WebElement repeatPassword;

    @FindBy(xpath = "//a[contains(text(),'Register Account')]")
    private WebElement registerBtn;

    public RegisterPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
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
}
