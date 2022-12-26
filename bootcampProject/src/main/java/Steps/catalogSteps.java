package Steps;

import Pages.HomePage;
import Pages.catalogPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class catalogSteps extends BaseSteps{
    catalogPage catalogPage = PageFactory.initElements(webDriver, catalogPage.class);
    public catalogSteps(WebDriver webDriver) {
        super(webDriver);
    }
    waits wait = new waits(webDriver);
    CustomAssertions customAssertions = new CustomAssertions();


    public void isCatalogTextDisplayed(WebElement expectedText, String actualText)
    {
        wait.waitForElement(expectedText);
        String expectedPrice = expectedText.getText();
        customAssertions.isTextCorrect(expectedPrice,actualText);

    }

    public void isCatalogImgDisplayed()
    {
        boolean image = wait.waitForElement(catalogPage.getProductImage());
        customAssertions.isElementDisplayed(image);

    }

    public void isCatalogBtnDisplayed()
    {
        boolean btn = wait.waitForElement(catalogPage.getProductButton());
        customAssertions.isElementDisplayed(btn);

    }
    public void clickCartBtn()
    {
        wait.waitForElement(catalogPage.getProductButton());
        catalogPage.getProductButton().click();;

    }
    public void verifyAlertPopUp()
    {
        wait.waitAlert();
        String alertText = webDriver.switchTo().alert().getText();
        customAssertions.isTextCorrect(constants.alertText, alertText);
        webDriver.switchTo().alert().accept();
    }

}
