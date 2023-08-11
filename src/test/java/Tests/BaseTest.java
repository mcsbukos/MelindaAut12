package Tests;

import Utils.ConfigUtils;
import Utils.ConstantUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    public WebDriver driver;
    String baseUrl;

    @BeforeClass
    public void setUp() {
        baseUrl = ConfigUtils.getGenericElement("hostname", ConstantUtils.CONFIG_FILE);
    }

    @BeforeMethod
    public void setUpUntilTestRun() {
        System.out.println(baseUrl);
    }

}
