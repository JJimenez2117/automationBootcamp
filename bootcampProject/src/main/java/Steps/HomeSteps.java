package Steps;
import Pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomeSteps extends BaseSteps{
    HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
    public HomeSteps(WebDriver webDriver) {
        super(webDriver);
    }
    waits wait = new waits(webDriver);
    CustomAssertions customAssertions = new CustomAssertions();
    JavascriptExecutor je = (JavascriptExecutor) webDriver;

    public void clickPhone(int cont){
        switch (cont){
            case 1: {
                wait.waitForElement(homePage.getPhone1());
                homePage.getPhone1().click();
                break;
            }
            case 2: {
                wait.waitForElement(homePage.getPhone2());
                homePage.getPhone2().click();
                break;
            }
            case 3: {
                wait.waitForElement(homePage.getPhone3());
                homePage.getPhone3().click();
                break;
            }
            case 4: {
                wait.waitForElement(homePage.getPhone4());
                homePage.getPhone4().click();
                break;
            }
            case 5: {
                wait.waitForElement(homePage.getPhone5());
                homePage.getPhone5().click();
                break;
            }
            case 6: {
                wait.waitForElement(homePage.getPhone6());
                homePage.getPhone6().click();
                break;
            }
            case 7: {
                wait.waitForElement(homePage.getPhone7());
                homePage.getPhone7().click();
                break;
            }
            case 8: {
                wait.waitForElement(homePage.getPhone8());
                homePage.getPhone8().click();
                break;
            }
            case 9: {
                wait.waitForElement(homePage.getPhone9());
                homePage.getPhone9().click();
                break;
            }

            default:
                break;

        }

    }

    public void isCategoriesDisplayed(){
        boolean elementExpected = wait.waitForElement(homePage.getCategoriesGroup());
        customAssertions.isElementDisplayed(elementExpected);
        Reporter.log("");
        boolean expectedPhone = wait.waitForElement(homePage.getCategoriesPhone());
        customAssertions.isElementDisplayed(expectedPhone);
        boolean expectedLaptop = wait.waitForElement(homePage.getCategoriesLaptop());
        customAssertions.isElementDisplayed(expectedLaptop);
        boolean expectedMonitor= wait.waitForElement(homePage.getCategoriesMonitors());
        customAssertions.isElementDisplayed(expectedMonitor);
    }

    public void returnHome()
    {
        homePage.getHomeButton().click();
    }

    public void scrollToMiddle(){
        wait.waitForElement(homePage.getPhone2());
        je.executeScript("arguments[0].scrollIntoView(true);",homePage.getPhone5());
    }


}
