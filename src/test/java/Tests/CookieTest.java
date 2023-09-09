package Tests;

import PageObjects.CookiePage;
import PageObjects.LoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class CookieTest extends BaseTest {
    LoginPage loginPage;
    CookiePage cookiePage;

    @Test
    public void printCookie() {
        loginPage = new LoginPage(driver);
        //     cookiePage = loginPage.goToCookiePage();
        loginPage.goToCookiePage();
        cookiePage = new CookiePage(driver);

        // validez ca este afisat acest buton
        Assert.assertTrue(cookiePage.setCookieButtonElementIsDisplayed(), "Cookie is not displayed");
        driver.navigate().refresh();
        cookiePage.clickSetCookieButton();

        Cookie consentCookie = driver.manage().getCookieNamed("gibberish");
        Assert.assertNotNull(consentCookie, "Checking that the cookie is not null");
        System.out.println("Consent cookie value: " + consentCookie.getValue());

        // validarea ca ce am la nivel de browser(Consola prin F12) este acelasi cu cel din interfata = pagina web
        Assert.assertEquals(consentCookie.getValue(), cookiePage.getDisplayedCookie(), "Incorrect cookie values");

        cookiePage.removeCookie();
        // is displayed returneaza true chiar daca elementul nu mai este vizibil in pagina, dar exista in DOM
        // Assert.assertFalse(cookiePage.cookieValueIsDisplayed(),"Cookie value is still displayed");
        Assert.assertEquals("", cookiePage.getDisplayedCookie(), "Incorrect cookie values");

        // extragem consentCookie din Browser (consola cu F12)
        consentCookie = driver.manage().getCookieNamed("gibberish");
        Assert.assertNull(consentCookie, "Cookie is still present");
    }

    @Test
    public void addNewCookie() {
        loginPage = new LoginPage(driver);
        loginPage.goToCookiePage();
        cookiePage = new CookiePage(driver);
        // Validam ca s-a adugat un cookie cu numele dat in metoda goToCookiePage() din LoginPage.java
        Assert.assertTrue(cookiePage.setCookieButtonElementIsDisplayed(), "Cookie is not displayed");
        Cookie pageTitleCookie = driver.manage().getCookieNamed("cookiePageTitle");
        // validam ca am adaugat un Cookie-ul care este identic cu titlul paginii
        Assert.assertEquals(pageTitleCookie.getValue(), cookiePage.getPageTitle(), "Incorrect page Title");
    }

    @Test
    public void deleteAllCookie() throws IOException {
        loginPage = new LoginPage(driver);
        loginPage.goToCookiePage();
        cookiePage = new CookiePage(driver);
        // validam ca s-a incarat butonul de aduagare de cookie
        Assert.assertTrue(cookiePage.setCookieButtonElementIsDisplayed(), "Cookie is not displayed");
        Cookie pageTitleCookie = driver.manage().getCookieNamed("cookiePageTitle");
        // validam ca s-a incarat cookieul creat de noi
        Assert.assertEquals(pageTitleCookie.getValue(), cookiePage.getPageTitle(), "Incorrect page Title");
        // sterge toate cookie-urile
        // driver.manage().deleteAllCookies();

        // sterge un anumit cookie
        //driver.manage().deleteCookie(pageTitleCookie);

        // sterge un cookie dupa denumire
        //  driver.manage().deleteCookieNamed("cookiePageTitle");

        driver.navigate().refresh();
        cookiePage.clickSetCookieButton();
        // listam toate cookie-urile existente
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie cookie : allCookies) {
            System.out.println(cookie.getName() + ": " + cookie.getValue());
        }

        System.out.println("----------------------------------");

        driver.manage().deleteAllCookies();
        // reinitalizam lista noastra de cookies, daca nu, ne da lista neschimbata
        allCookies = driver.manage().getCookies();
        for (Cookie cookie : allCookies) {
            System.out.println(cookie.getName() + ": " + cookie.getValue());
        }

        // aceasta solicia exceptia
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File finaleFile = new File("screenshots/image.png");
        FileUtils.copyFile(screenshotFile, finaleFile);

    }
}
