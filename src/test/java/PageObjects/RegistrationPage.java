package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage {
    WebDriver driver;
    WebDriverWait wait;

//    @FindBy(tagName= "h1")
//private WebElement pageTitleElement;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameElement;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordElement;
    @FindBy(xpath = "//input[@id='password2']")
    private WebElement password2Element;

    @FindBy(xpath = "//input[@id='input-first-name']")
    private WebElement firsNameElement;

    @FindBy(xpath = "//input[@id='input-last-name']")
    private WebElement lastnameElement;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailElement;

    @FindBy(xpath = "//input[@id='terms']")
    private WebElement acceptTermsCheckbox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement submitRegistrationBtn;

    @FindBy(xpath = "//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[1]/small[2]")
    private WebElement usernameError;

    @FindBy(xpath = "//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[2]/small[2]")
    private WebElement passwordError;

    @FindBy(xpath = "//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[3]/small[1]")
    private WebElement password2Error;

    @FindBy(xpath = "//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[11]/small")
    private WebElement acceptTermsError;



    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        PageFactory.initElements(driver, this);
    }

    public void registration(String username, String password, String password2) {
        wait.until(ExpectedConditions.elementToBeClickable(usernameElement));
        usernameElement.clear();
        usernameElement.sendKeys(username);

        //wait.until(ExpectedConditions.visibilityOf(passwordElement));
        passwordElement.clear();
        passwordElement.sendKeys(password);

        //wait.until(ExpectedConditions.visibilityOf(password2Element));
        password2Element.clear();
        password2Element.sendKeys(password2);

        //wait.until(ExpectedConditions.visibilityOf(acceptTermsCheckbox));
        wait.until(ExpectedConditions.elementToBeClickable(acceptTermsCheckbox));
        acceptTermsCheckbox.click();

        wait.until(ExpectedConditions.visibilityOf(submitRegistrationBtn));
        submitRegistrationBtn.click();
        }

    public String getUsernameError() {
        return usernameError.getText();
         }
    public String getPasswordError() {
        return passwordError.getText();
         }
    public String getPassword2Error() {
        return password2Error.getText();
         }
    public String getCheckboxError() {
        return acceptTermsError.getText();
         }


}
