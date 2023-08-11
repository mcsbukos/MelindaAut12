package OldTests.Course08;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestUsername {
    @Test
    public void webElementTestSendTextToField() {
        //path catre chromedriver.exe al fiecaruia dintre voi
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MelindaSimon\\IdeaProjects\\MelindaAut12\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://86.121.249.151:4999/");
        WebElement loginElement = chromeDriver.findElement(By.tagName("h2"));
        loginElement.click();
        WebElement usernameElement = chromeDriver.findElement(By.id("user"));
        usernameElement.sendKeys("zebra");
        System.out.println("username field content: " + usernameElement.getAttribute("value"));
        Assert.assertEquals("Incorrect username", "zebra",
                usernameElement.getAttribute("value"));
        usernameElement.clear();
        Assert.assertEquals("Username was not deleted", "", usernameElement.getAttribute("value"));
        chromeDriver.quit();
    }
}
