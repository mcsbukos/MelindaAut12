package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ModalPage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    @FindBy(css = "div.modal-footer > button")
    private WebElement cancelButtonElement;
    @FindBy(css = "div.content button")
    private WebElement openModalButtonElement;

    @FindBy(css ="button.btn-close")
    private WebElement closeXButtonElement;

    public ModalPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    public boolean cancelButtonIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(cancelButtonElement));
        return cancelButtonElement.isDisplayed();
    }

    public void openModal() {
        // a aparut un stale element reference exception message de aceea am putea introduce urmatorea iteratie
        int currentRetry = 0;
        while (currentRetry < 50) {
            try {
           // urmatorul rand: eset o reintializare si a fost o incercare de a evita stale element exception fara ciclul while
           //     openModalButtonElement = driver.findElement(By.cssSelector("div.content button"));
                openModalButtonElement.click();
                break;
            } catch (StaleElementReferenceException e) {
                // pt a verifica aca a intrat in catch
                System.out.println("StaleElementReferenceException");
                currentRetry++;
            }

        }

    }

    public void closeModalWithX() {
        closeXButtonElement.click();
    }
    public void closeModalWithCancel() {
        cancelButtonElement.click();
    }
    public void closeButtonUsingEscape() {
        actions.sendKeys(Keys.ESCAPE).build().perform();
    }
    public void closModalByClickOutsideTheModal() {
        System.out.println("System is going to click outside the Modal box");
        actions.moveToElement(closeXButtonElement, 50,500).click().build().perform();
        System.out.println("Clicked outside the Modal box");
    }
}
