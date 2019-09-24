package pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
    protected static WebDriver driver;
    protected static WebDriverWait driverWait;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driverWait = new WebDriverWait(driver, 15);
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
        driver = null;
    }

    public static WebDriverWait getWait() {
        driverWait = new WebDriverWait(driver, 50);
        return driverWait;
    }
}
