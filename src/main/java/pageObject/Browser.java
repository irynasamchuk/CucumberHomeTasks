package pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
    protected static WebDriver driver;
    protected static WebDriverWait driverWait;

    public static WebDriver getDriver() {
        if (driver == null) {
            // WebDriverManager.firefoxdriver().setup();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            //driver = new FirefoxDriver();
            driverWait = new WebDriverWait(driver, 15);
        }
        return driver;
    }

    public static void closeDriver() {
        if(driver !=null)
            driver.quit();
    }

    public static WebDriverWait getWait(){
            driverWait = new WebDriverWait(driver, 50);
        return driverWait;
    }
}
