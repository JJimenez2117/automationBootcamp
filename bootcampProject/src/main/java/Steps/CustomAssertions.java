package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Steps.BaseSteps;
import org.testng.Reporter;

public class CustomAssertions extends Assert {

    public static void isElementDisplayed(Boolean elementExpected) {
        Assert.assertTrue(elementExpected, "The Element isn't displayed");
        Reporter.log("The Element is displayed");
    }

    public static void isURLCorrect(String url){
        String expectedURL = "https://www.demoblaze.com/";
        Assert.assertEquals(url, expectedURL, "The URL isn't correct");
        System.out.println("Current url: "+ url);
    }

    public static void isTextCorrect(String expectedText, String actualText)
    {
        Assert.assertEquals(actualText,expectedText);
        Reporter.log("text is correct");
    }

}
