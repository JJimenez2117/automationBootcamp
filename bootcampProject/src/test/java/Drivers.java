import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Drivers {
    public WebDriver driver = getDriver();
    JavascriptExecutor je = (JavascriptExecutor) driver;

    @BeforeTest(alwaysRun = true)
    private WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver","/Users/jj0921/Desktop/bootcampProject/chromedriver");
        this.driver= new ChromeDriver();
        JavascriptExecutor je = (JavascriptExecutor) driver;
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        return driver;
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }



}
