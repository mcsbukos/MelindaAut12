package Tests;


import Utils.BrowserUtils;
import Utils.ConfigUtils;
import Utils.ConstantUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {

    public WebDriver driver;
    String baseUrl;

    @BeforeClass
    public void setUp() {
        baseUrl = ConfigUtils.getGenericElement(ConstantUtils.CONFIG_FILE, "hostname");
    }

   public void setUpDriver(String browserName) {
        String browser = browserName;
        if (browser.isEmpty())
             browser = ConfigUtils.getGenericElement(ConstantUtils.CONFIG_FILE, "browser");
        System.out.println("Set up webdriver for browser: " + browser);
        driver = BrowserUtils.getBrowser(browser);
    }

    // for cookieGoogleTest not to repeat the :
    //        setUpDriver("chrome");
    //        driver.get(baseUrl);. we have created the following beforeMethod
    @BeforeMethod
    public void startBrowser(){
        String browserName = ConfigUtils.getGenericElement(ConstantUtils.CONFIG_FILE, "browser");
        setUpDriver(browserName);
        driver.get(baseUrl);
        System.out.println("Browser has been opened");
      }

//      @AfterMethod(alwaysRun = true)
//    public void cleanUp() {
//        if (driver !=null)
//        driver.quit();
 //   }

// alwaysRun = true, inseamna ca indiferent daca rezultatul testului a fost passed/failed, aplicatia web se va inchide
    @AfterClass(alwaysRun = true)
    public void afterTest() {
        System.out.println("Close browser");
        if (driver != null)
            driver.quit();
    }
}
