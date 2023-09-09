package PageObjects;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(tagName = "h2")
    private WebElement loginPagebtn;
    @FindBy(id = "user")
    private WebElement usernameInput;

    @FindBy(how = How.ID, using = "pass")
    private WebElement passwordInput;

    @FindBy(tagName = "button")
    private WebElement loginBtn;

    private WebElement rememberMe;

    //@FindBy(xpath = "//div[@class='form-check']/label")
    @FindBy(xpath = "//input[@id='user']/../..//small")
    private WebElement usernameErr;

    @FindBy(xpath = "//input[@id='pass']/../..//small")
    private WebElement passErr;
    @FindBy(css="a[href*='cookie']")
    private WebElement cookieButtonElement;

    @FindBy(css="a[href*='hover']")
    private WebElement alertsButtonElement;

    @FindBy(css="a[href*='alerts']")
    private WebElement hoverButtonElement;

    @FindBy(css="a[href*='modal']")
    private WebElement modalButtonElement;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }

    public void goToLoginPage(){
        wait.until(ExpectedConditions.visibilityOf(loginPagebtn));
        loginPagebtn.click();
    }
    public void login(String username, String pass) {
        wait.until(ExpectedConditions.elementToBeClickable(usernameInput));
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(pass);
        loginBtn.click();
    }

    public String getPassErr(){
        try {
            return passErr.getText();
        } catch (NoSuchElementException ex) {
            return "";
        }
    }
  public String getUsernameErr(){
        try {
        return usernameErr.getText();
     } catch (NoSuchElementException ex) {
            return "";
        }
    }
   //Best practice:
// no void
//    public CookiePage goToCookiePage(){
//        wait.until(ExpectedConditions.visibilityOf(cookieButtonElement));
//        cookieButtonElement.click();
 //       return new CookiePage(driver);
 //   }

    //easier to understand:
     public void goToCookiePage(){
        wait.until(ExpectedConditions.visibilityOf(cookieButtonElement));
        cookieButtonElement.click();
        Cookie cookie = new Cookie("cookiePageTitle", "The gibberish talking cookie");
        driver.manage().addCookie(cookie);
        }

//    public void goToAlertsPage(){
//        wait.until(ExpectedConditions.visibilityOf(alertsButtonElement));
//        alertsButtonElement.click();
//  }
//    public void goToHoverPage(){
//        wait.until(ExpectedConditions.visibilityOf(hoverButtonElement));
//        hoverButtonElement.click();
//    }

    public void goToModalPage(){
        wait.until(ExpectedConditions.visibilityOf(modalButtonElement));
        modalButtonElement.click();
    }

}
