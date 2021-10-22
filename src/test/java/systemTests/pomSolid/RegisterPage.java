package systemTests.pomSolid;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

    @FindBy(id = "exampleFirstName")
    protected WebElement firstName;

    @FindBy(id = "exampleLastName")
    protected WebElement lastName;

    @FindBy(id = "exampleInputEmail")
    protected WebElement email;

    @FindBy(xpath = "//div/div/input[@placeholder='Password']")
    protected WebElement password;

    @FindBy(id = "exampleRepeatPassword")
    protected WebElement repeatPassword;

    @FindBy(xpath = "//a[contains(text(),'Register Account')]")
    protected WebElement registerBtn;
}
