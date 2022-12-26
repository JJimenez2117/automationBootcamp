package Steps;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class BaseSteps {
    WebDriver webDriver;
    CustomAssertions customAssertions = new CustomAssertions();
    public BaseSteps (WebDriver webDriver) {
        this.webDriver= webDriver;
    }

    public void checkURL()
    {
        String url = webDriver.getCurrentUrl();
        customAssertions.isURLCorrect(url);
        Reporter.log("The url displayed is " + url);
    }


}
