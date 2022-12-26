package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Using number based xpath just in case they change the names or products
    //Expecting to check all 9 phones
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Samsung galaxy s6')]")
    private WebElement phone1;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Nokia lumia 1520')]")
    private WebElement phone2;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Nexus 6')]")
    private WebElement phone3;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Samsung galaxy s7')]")
    private WebElement phone4;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Iphone 6 32gb')]")
    private WebElement phone5;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sony xperia z5')]")
    private WebElement phone6;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'HTC One M9')]")
    private WebElement phone7;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sony vaio i5')]")
    private WebElement phone8;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sony vaio i7')]")
    private WebElement phone9;

    @FindBy(how = How.XPATH, using = "//div[@class='list-group']")
    private WebElement categoriesGroup;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Phones')]")
    private WebElement categoriesPhone;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Laptops')]")
    private WebElement categoriesLaptop;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Monitors')]")
    private WebElement categoriesMonitors;

    @FindBy(how = How.ID, using = "nava")
    private WebElement homeButton;

    public WebElement getPhone1() {
        return phone1;
    }

    public WebElement getPhone2() {return phone2;}

    public WebElement getPhone3() {return phone3;}

    public WebElement getPhone4() {return phone4;}

    public WebElement getPhone5() {return phone5;}

    public WebElement getPhone6() {return phone6;}

    public WebElement getPhone7() {return phone7;}

    public WebElement getPhone8() {return phone8;}

    public WebElement getPhone9() {return phone9;}

    public WebElement getCategoriesGroup() { return categoriesGroup; }

    public WebElement getCategoriesPhone() {return categoriesPhone;}

    public WebElement getCategoriesLaptop() {return categoriesLaptop;}

    public WebElement getCategoriesMonitors() {return categoriesMonitors;}

    public WebElement getHomeButton() {return homeButton;}


}
