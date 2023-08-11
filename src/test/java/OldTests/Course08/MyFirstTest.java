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

public class MyFirstTest {
    @Test
    public void htmlUnitDriverTest() {
        WebDriver htmlUnitDriver = new HtmlUnitDriver();
        htmlUnitDriver.get("https://www.google.com/");
        System.out.println("PageTitle: " + htmlUnitDriver.getTitle());
        htmlUnitDriver.navigate().to("https://www.facebook.com/");
        System.out.println("The page title after navigate to facebook: " + htmlUnitDriver.getTitle());
        htmlUnitDriver.navigate().back();
        System.out.println("The page title after the back method: " + htmlUnitDriver.getTitle());
        htmlUnitDriver.navigate().forward();
        System.out.println("The page title after the forward method: " + htmlUnitDriver.getTitle());
        htmlUnitDriver.navigate().refresh();
        System.out.println("The page title after the refresh method: " + htmlUnitDriver.getTitle());
        htmlUnitDriver.quit();
    }

    @Test
    public void chromeDriverTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MelindaSimon\\IdeaProjects\\MelindaAut12\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
        System.out.println("Page Title: " + chromeDriver.getTitle());
        chromeDriver.navigate().to("https://www.facebook.com/");
        System.out.println("The page title after navigate to facebook: " + chromeDriver.getTitle());
        chromeDriver.navigate().back();
        System.out.println("The page title after the back method: " + chromeDriver.getTitle());
        chromeDriver.navigate().forward();
        System.out.println("The page title after the forward method: " + chromeDriver.getTitle());
        chromeDriver.navigate().refresh();
        System.out.println("The page title after the refresh method: " + chromeDriver.getTitle());
        // chromeDriver.quit();
    }

    @Test
    public void switchWindowHandles() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MelindaSimon\\IdeaProjects\\MelindaAut12\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.google.com/");
        chromeDriver.get("https://www.youtube.com/");
        chromeDriver.get("https://www.facebook.com/");
        for (String currentBrowserTab : chromeDriver.getWindowHandles()) {
            chromeDriver.switchTo().window(currentBrowserTab);
            System.out.println("Current tab title: " + chromeDriver.getTitle());
        }
        //chromeDriver.close();
        // chromeDriver.quit();
    }

    @Test
    public void edgeDriverTest() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\MelindaSimon\\IdeaProjects\\MelindaAut12\\src\\main\\resources\\Drivers\\msedgedriver.exe");
        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://www.google.com/");
        edgeDriver.navigate().to("https://www.google.com/");
        System.out.println("Page Title: " + edgeDriver.getTitle());
        edgeDriver.quit();
    }

    @Test
    public void webElementTestGetText() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MelindaSimon\\IdeaProjects\\MelindaAut12\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://86.121.249.151:4999/");
        WebElement titleElement = chromeDriver.findElement(By.tagName("h1"));
        System.out.println(titleElement.getText());
        chromeDriver.quit();
    }
    @Test
    public void webElementTestSendTextToField() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MelindaSimon\\IdeaProjects\\MelindaAut12\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://86.121.249.151:4999/");
        WebElement loginElement = chromeDriver.findElement(By.tagName("h2"));
        loginElement.click();
        WebElement usernameElement = chromeDriver.findElement(By.id("user"));
      //  WebElement usernameElement = chromeDriver.findElement(By.className("bi-person"));
        usernameElement.sendKeys("zebra");
        System.out.println("username field content: " + usernameElement.getAttribute("value"));
        Assert.assertEquals("Incorrect username", "zebra", usernameElement.getAttribute("value"));
        usernameElement.clear();
        chromeDriver.quit();
    }
    @Test
    public void printSideButton() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MelindaSimon\\IdeaProjects\\MelindaAut12\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        //chromeDriver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(chromeDriver, 10);
        chromeDriver.get("http://86.121.249.151:4999/");
        List<WebElement> sidebarButtonElements = chromeDriver.findElements(By.xpath("//div[@class= 'sidebar']/a[not(@target)]"));
        for (WebElement currentButtonElement : sidebarButtonElements) {
            System.out.println("Button text: "+ currentButtonElement.getText());
        }
        WebElement waitButtonElement = sidebarButtonElements.get(sidebarButtonElements.size()-1);
        waitButtonElement.click();
        WebElement answerElement = chromeDriver.findElement(By.xpath("//*[@id='answer-trigger']"));
        //WebElement answerElement = chromeDriver.findElement(By.cssSelector("p.answer"));
        System.out.println("Calculating answer element: " + answerElement.getText());
        WebElement giveAnswerElement = chromeDriver.findElement(By.id("answer-trigger"));
        giveAnswerElement.click();
        System.out.println("Answer is: "+ answerElement.getText());
       // WebElement responseElement = chromeDriver.findElement(By.xpath("//p[text()='42']"));
        WebElement responseElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='42']")));
        System.out.println("Response: element text " + responseElement.getText());
        chromeDriver.quit();
    }
    @Test
    public void isCheckboxSelected() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MelindaSimon\\IdeaProjects\\MelindaAut12\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://86.121.249.151:4999/");
        List<WebElement> sidebarButtonElements = chromeDriver.findElements(By.xpath("//div[@class= 'sidebar']/a[not(@target)]"));
        for (WebElement currentButtonElement : sidebarButtonElements) {
            System.out.println("Button text: " + currentButtonElement.getText());
        }
        WebElement clickInterceptedElement = sidebarButtonElements.get(3);
        clickInterceptedElement.click();
        WebElement checkboxElement = chromeDriver.findElement(By.id("the_checkbox"));
        System.out.println("Checkbox: " + checkboxElement.isSelected());
        WebElement checkboxTextElement = chromeDriver.findElement(By.cssSelector(".off"));
        checkboxTextElement.click();


        //  chromeDriver.quit();
    }

}
