package webBase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SwagLabsWebBase {
    public static WebDriver driver;
    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

    public void initializeBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:/WebDrivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void navigateToURL(String url) {
        driver.get(url);
    }

    public void scrollToTheTopOfThePage() {
        javascriptExecutor.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    public void scrollIntoElementTillVisible(WebElement element) {
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void quitBrowser() {
        driver.quit();
    }
}