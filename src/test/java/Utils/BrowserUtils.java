package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {
    static WebDriver driver;
    public static WebDriver getBrowser(String browser) {
        switch (browser.toLowerCase()) {
            case ("chrome"): {
                WebDriverManager.chromedriver().setup();
                //ChromeOptions chromeOptions=getChromeOptions();
                //driver = new ChromeDriver(chromeOptions);
                //will be replaced by chrome options
                driver=new ChromeDriver();
                driver.manage().window().maximize(); // see chrome options
                return driver;
            }
            case ("firefox"): {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                return driver;
            }
            case ("edge"): {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                return driver;
            }
            default: {
                System.out.println("Driver is not supported.");
                return null;
            }
        }
    }
    private static EdgeOptions getEdgeOptions() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setCapability("--start-maximized", true);
        return edgeOptions;
    }
    private static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("incognito");
//        chromeOptions.addArguments("--headless"); //porneste browser in mod headless, nu se vede browserul
        return chromeOptions;
    }
}
