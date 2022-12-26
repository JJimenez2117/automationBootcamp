package Steps;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class waits{
    WebDriver driver;
    public waits(WebDriver driver) {

        this.driver = driver;
    }

    public FluentWait waiter(){
         Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
         return (FluentWait) wait;
    }


    public Boolean waitForElement(WebElement element) {
        boolean elementPresemt = false;
        try {
            waiter().until(ExpectedConditions.visibilityOf(element));
            System.out.println("Element found: "+ element);
            elementPresemt = true;
        }
        catch (Exception e){
            System.out.println("Error Element not found: "+ element);
        }
        return elementPresemt;
    }

    public void waitAlert(){
        waiter().until(ExpectedConditions.alertIsPresent());
    }

}
