package pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {
    protected static WebDriver driver;
    protected static WebDriverWait driverWait;

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setBinary("C:\\Users\\Iryna_Samchuk\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driverWait = new WebDriverWait(driver, 15);
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
