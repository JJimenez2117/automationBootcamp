package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class catalogPage extends BasePage{
    public catalogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//h2[@class=\"name\"]")
    private WebElement productTitle;

    @FindBy(how = How.XPATH, using = "//h3[@class=\"price-container\"]")
    private WebElement productPrice;
    @FindBy(how = How.ID, using = "more-information")
    private WebElement productDescription;
    @FindBy(how = How.XPATH, using = "//div[@class=\"product-image\"]")
    private WebElement productImage;
    @FindBy(how = How.XPATH, using = "//a[@class=\"btn btn-success btn-lg\"]")
    private WebElement productButton;

    public WebElement getProductTitle() {return productTitle;}

    public WebElement getProductPrice() {return productPrice;}

    public WebElement getProductDescription() {return productDescription;}

    public WebElement getProductImage(){return productImage;}

    public WebElement getProductButton(){return productButton;}
}
