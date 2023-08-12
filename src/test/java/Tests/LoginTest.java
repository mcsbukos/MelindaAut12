package Tests;

import PageObjects.LoginPage;
import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @DataProvider(name = "LoginDp")
    public Object[][] loginDataProvider() {
        return new Object [][] {
                {"", "", "chrome", "Please enter your username", "Please enter your password"},
                {"", "somePassword", "edge", "Please enter your username", ""},
                {"test", "", "firefox", "", "Please enter your password"}};
           }
    @Test(dataProvider = "LoginDp")
    public void login(String username, String password, String browser, String usernameErr, String passErr) {
        System.out.println("Login with username " + username + " / password: " + password+ " => on browser: " + browser);
        setUpDriver(browser);
        driver.get(baseUrl);
        System.out.println(" open browser");

        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        loginPage.login(username, password);

        System.out.println("LoginFinished, verify Error message");

        Assert.assertEquals(loginPage.getUsernameErr(), usernameErr);
        Assert.assertEquals(loginPage.getPassErr(), passErr);

    }
}