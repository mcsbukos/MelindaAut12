package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageCurs9 {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(tagName = "h2")
    private WebElement loginPagebtn;

    @FindBy(id = "user")
    private WebElement usernameInput;

    @FindBy(tagName = "pass")
    private WebElement passwordInput;

    @FindBy(tagName = "button")
    private WebElement loginBtn;

    @FindBy(xpath = "//input[@id='remember']")
    private  WebElement rememberMe;

    @FindBy(xpath = "//input[@id='user']//../..//small")
    private WebElement usernameErr;

    @FindBy(xpath = "//input[@id='pass']/../..//small")
    private WebElement passErr;


    public LoginPageCurs9(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        PageFactory.initElements(driver, this);
    }

    public void goToLoginPage() {
        wait.until(ExpectedConditions.visibilityOf(loginPagebtn));
        loginPagebtn.click();
    }

    public void login(String username, String pass){
        wait.until(ExpectedConditions.elementToBeClickable(usernameInput));
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(pass);
        loginBtn.click();
    }

    public String getPassErr(){
        return passErr.getText();
    }

    public String getUsernameErr(){
        return usernameErr.getText();
    }

}
