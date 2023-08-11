package OldTests.Homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginHomework {
    @Test
    public void loginWithValidCredentials() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MelindaSimon\\IdeaProjects\\MelindaAut12\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://86.121.249.151:4999/");
        WebElement loginElement = chromeDriver.findElement(By.tagName("h2"));
        loginElement.click();
        WebElement usernameElement = chromeDriver.findElement(By.id("user"));
        usernameElement.sendKeys("zebra");
        System.out.println("username field content: " + usernameElement.getAttribute("value"));
        Assert.assertEquals("Incorrect username", "zebra", usernameElement.getAttribute("value"));
        WebElement passElement = chromeDriver.findElement(By.id("pass"));
        passElement.sendKeys("zebrapassword"); // Use passElement instead of usernameElement
        System.out.println("Password field content: " + passElement.getAttribute("value"));
        Assert.assertEquals("Incorrect password", "zebrapassword", passElement.getAttribute("value"));
        WebElement loginButton = chromeDriver.findElement(By.xpath("//*[@class='btn btn-primary']"));
        loginButton.click();
        WebElement successLoginProof = chromeDriver.findElement(By.tagName("h1"));
        System.out.println("After a successfull login a welcome message is displayed: " + successLoginProof.getText());
        Assert.assertEquals("Welcome to web-stubs, zebra!", "Welcome to web-stubs, zebra!", successLoginProof.getText());
        //  chromeDriver.quit();





            //WebElement usernameElement = chromeDriver.findElement(By.id("user"));
            // usernameElement.sendKeys("zebra");
            //System.out.println("username field content: " + usernameElement.getAttribute("value"));
            //Assert.assertEquals("Incorrect username", "zebra", usernameElement.getAttribute("value"));
            //WebElement passElement = chromeDriver.findElement(By.id("pass"));
            // passElement.sendKeys("zebrapassword"); // Use passElement instead of usernameElement
            // System.out.println("Password field content: " + passElement.getAttribute("value"));
            //Assert.assertEquals("Incorrect password", "zebrapassword", passElement.getAttribute("value"));
            //WebElement loginButton = chromeDriver.findElement(By.xpath("//*[@class='btn btn-primary']"));
            //loginButton.click();
            //WebElement successLoginProof = chromeDriver.findElement(By.tagName("h1"));
            //System.out.println("After a successfull login a welcome message is displayed: " + successLoginProof.getText());
            //Assert.assertEquals("Welcome to web-stubs, zebra!", "Welcome to web-stubs, zebra!", successLoginProof.getText());
            //  chromeDriver.quit();

    }
}