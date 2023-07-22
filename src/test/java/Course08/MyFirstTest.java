package Course08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class MyFirstTest {
    @Test
    public void htmlUnitDriverTest() {
       WebDriver htmlUnitDriverTest = new HtmlUnitDriver();
       htmlUnitDriverTest.get("https://www.google.com/");
       System.out.println("PageTitle: " + htmlUnitDriverTest.getTitle());
       htmlUnitDriverTest.quit();
    }
    @Test
    public void webElementTest() {
       WebDriver htmlUnitDriverTest = new HtmlUnitDriver();
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\MelindaSimon\\IdeaProjects\\MelindaAut12\\src\\main\\resources\\Drivers\\chromedriver.exe");
       WebDriver chromeDriver = new ChromeDriver();
       chromeDriver.manage().window().maximize();
       chromeDriver.get("http://86.121.249.151:4999");
       WebElement loginElement = chromeDriver.findElement(By.tagName("h2"));
       loginElement.click();
        WebElement usernameElement = chromeDriver.findElement(By.id("user"));
        usernameElement.sendKeys("zebra");
      //  System.out.println("user field content: " + usernameElement.getAttribute());
        Assert.assertEquals("username field content", "zebra", usernameElement.getAttribute("value"));
        chromeDriver.quit();
    }

}
