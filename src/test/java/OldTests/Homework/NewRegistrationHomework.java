package OldTests.Homework;

import Tests.BaseTest;
import Utils.ConfigUtils;
import Utils.ConstantUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class NewRegistrationHomework extends BaseTest {

        private WebDriver chromeDriver;




        @DataProvider(name = "LoginDataProvider")
        public Iterator<Object[]> loginDataProvider() {
            Collection<Object[]> dp = new ArrayList<>();
            dp.add(new String[]{"", "", "", "Please choose a username", "Please choose a password", "", "You need to accept the terms and conditions"});
            dp.add(new String[]{"", "somePassword", "somePassword", "Please choose a username", "", "", ""});
            dp.add(new String[]{"SomeUser", "", "somePassword", "", "Please choose a password", "", ""});
            dp.add(new String[]{"SomeUser", "somePassword", "", "", "", "Passwords do not match", ""});
            dp.add(new String[]{"abc", "somePassword", "somePassword", "Please choose a longer username", "", "", ""});
            dp.add(new String[]{"123456789112345678911234567890123456", "somePassword", "somePassword", "Please choose a shorter username", "", "", ""});
            dp.add(new String[]{"SomeUser", "123", "somePassword", "", "Please choose a longer password", "", ""});
            dp.add(new String[]{"SomeUser", "somePassword", "somePassword", "", "", "", "You need to accept the terms and conditions"});
            return dp.iterator();
        }
        @AfterMethod
        public void quit(){
            chromeDriver.quit();
        }


        @BeforeMethod
        public void setup() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\MelindaSimon\\IdeaProjects\\MelindaAut12\\src\\test\\resources\\Drivers\\chromedriver.exe");
            chromeDriver = new ChromeDriver();
            chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            chromeDriver.manage().window().maximize();
            chromeDriver.get("https://adimoldovan.github.io/web-stubs/");
        }

        @Test(dataProvider = "LoginDataProvider")
        public void registrationTest(String username, String password, String password2, String usernameError, String passwordError, String password2Error, String checkboxError) {
            WebElement loginElement = chromeDriver.findElement(By.tagName("h2"));
            loginElement.click();

            WebElement registrationElement = chromeDriver.findElement(By.cssSelector("div.col>a"));
            registrationElement.click();

            WebElement usernameElement = chromeDriver.findElement(By.id("username"));
            usernameElement.clear();
            usernameElement.sendKeys(username);

            WebElement passwordElement = chromeDriver.findElement(By.id("password"));
            passwordElement.clear();
            passwordElement.sendKeys(password);

            WebElement confirmPasswordElement = chromeDriver.findElement(By.id("password2"));
            confirmPasswordElement.clear();
            confirmPasswordElement.sendKeys(password2);

            WebElement elementToScrollTo = chromeDriver.findElement(By.xpath("//button[@class='btn btn-primary']"));
            JavascriptExecutor jsExecutor = (JavascriptExecutor) chromeDriver;
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
            System.out.println();

            chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// click on checkbox to accept terms and conditions
//       WebElement checkboxToAcceptConditions = chromeDriver.findElement(By.xpath("//div[11]/div/label"));
//       checkboxToAcceptConditions.click();

            WebElement buttonSubmit = chromeDriver.findElement(By.xpath("//button[@class='btn btn-primary']"));
            buttonSubmit.submit();

// Locating the error elements for username, password, confirm password and not selecting the checkbox
            WebElement noUsernameErrorElement = chromeDriver.findElement(By.xpath("//small[contains(text(),'Please choose a username')]"));
            String actualNoUsernameError = noUsernameErrorElement.getText();

            WebElement noPasswordErrorElement = chromeDriver.findElement(By.xpath("//small[contains(text(),'Please choose a password')]"));
            String actualNoPasswordError = noPasswordErrorElement.getText();

            WebElement noPassword2ErrorElement = chromeDriver.findElement(By.xpath("//small[contains(text(),'Passwords do not match')]"));
            String actualNoPassword2Error = noPassword2ErrorElement.getText();

            WebElement checkboxErrorElement = chromeDriver.findElement(By.xpath("//small[contains(text(),'You need to accept the terms and conditions')]"));
            String actualCheckboxError = checkboxErrorElement.getText();

            WebElement tooShortUsernameErrorElement = chromeDriver.findElement(By.xpath("//small[contains(text(),'Please choose a longer username')]"));
            String actualTooShortUsernameError = tooShortUsernameErrorElement.getText();

            WebElement tooLongUsernameErrorElement = chromeDriver.findElement(By.xpath("//small[contains(text(),'Please choose a shorter username')]"));
            String actualTooLongUsernameError = tooLongUsernameErrorElement.getText();

            WebElement tooShortPasswordErrorElement = chromeDriver.findElement(By.xpath("//small[contains(text(),'Please choose a longer password')]"));
            String actualTooShortPassword = tooShortPasswordErrorElement.getText();

// Comparing the expected and actual error messages
            Assert.assertEquals("Please choose a username", usernameError, actualNoUsernameError);
            Assert.assertEquals("Please choose a password", passwordError, actualNoPasswordError);
            Assert.assertEquals("Passwords do not match", password2Error, actualNoPassword2Error);
            Assert.assertEquals("You need to accept the terms and conditions", checkboxError, actualCheckboxError);
            Assert.assertEquals("Please choose a longer username", usernameError, actualTooShortUsernameError);
            Assert.assertEquals("Please choose a shorter username", usernameError, actualTooLongUsernameError);
            Assert.assertEquals("Please choose a longer password", passwordError, actualTooShortPassword);
            Assert.assertEquals("You need to accept the terms and conditions", checkboxError, actualCheckboxError);

        }

    }
