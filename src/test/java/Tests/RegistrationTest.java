package Tests;

import PageObjects.CookiePage;
import PageObjects.LoginPage;
import PageObjects.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationTest extends BaseTest {

    LoginPage loginPage;
    RegistrationPage registrationPage;


    @DataProvider(name="registrationDp")
    public Object [][] registrationDataProvider() {
        return new Object[][] {
                {"", "", ""},
                {"SomeUser", "SomePassword", "SomePassword"},
                {"SomeUser", "SomePassword1", "SomePassword2"}};
        }
    @Test(dataProvider = "registrationDp")
    public void registration(String username, String password, String password2) {
        System.out.println("Registration with username: " + username + " /password: " + password + " /confirm password: "+password2);

        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        System.out.println("Opened login page.");

        loginPage.goToRegistrationPage();
        System.out.println("Opened registration page.");

        registrationPage = new RegistrationPage(driver);

        System.out.println("registration finished");
    }






//    @BeforeClass
//    @Test
//    public void setUp() {
//    loginPage =new LoginPage(driver);
//    loginPage.goToLoginPage();
//    loginPage.goToRegistrationPage();
//    registrationPage = new RegistrationPage(driver);



//    Assert.assertTrue(registrationPage.getPageTitle(),"Cookie button is not displayed");

//        System.out.println("Positive registration");
//     }

//    @Test
 //   public void positiveRegistration() {
  //      System.out.println("Positive registration");
   // }
}
