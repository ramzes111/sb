package sbautotests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sbautotests.helpers.Config;

import java.util.concurrent.TimeUnit;

public class Base {
    private static WebDriver driver;

    public static WebDriver getWebDriver() {
        if (driver == null) createWebDriver();
        return driver;
    }

    private static void createWebDriver() {
        String browser = Config.get("browser").toLowerCase();
        switch (browser) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            default:
                driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        getWebDriver().get(Config.get("start.page"));
    }

    public static void setUp() {
        getWebDriver();
    }

    public static void tearDown() {
        driver.quit();
    }
}
