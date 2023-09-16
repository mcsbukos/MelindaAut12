package Tests;

import PageObjects.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;

public class LoginTestCurs9 extends BaseTest {

    LoginPage loginPage;

    @DataProvider(name = "loginDp")
    public Object[][] loginDataProvider () {
        Collection<Object[]> dp = new ArrayList<>();
        return new Object[][] {
                 {"","", "chrome"},
                 {"SomeUser", "somePassword", "edge"},
                {"test", "test", "firefox"}};
        }

    @Test(dataProvider = "loginDp")
    public void login (String username, String password, String browser) {
        System.out.println("Login with username: "+username+" /password: "+password+" => on browser: "+browser);
        setUpDriver(browser);
        driver.get(baseUrl);

        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        loginPage.login(username, password);
        System.out.println("Login Finished, verify Error message");



    }

}
