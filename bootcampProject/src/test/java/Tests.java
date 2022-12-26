import Pages.HomePage;
import Steps.*;
import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Pages.catalogPage;
import Steps.constants;

public class Tests extends Drivers{
    HomeSteps homeSteps = new HomeSteps(driver);
    BaseSteps baseSteps = new BaseSteps(driver);
    catalogSteps catalogSteps= new catalogSteps(driver);
    catalogPage catalogPage = PageFactory.initElements(driver, catalogPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    String constantTitle;
    String constantPrice;
    String constantDescription;
    int cont;
    constants[] productDetails= new constants[9];
    constants constantes= new constants(constantTitle,constantPrice,constantDescription);

    @Test
    @Description("Test verifies the URL and the three categories displayed correctly")
    public void testColumnCategories(){
        baseSteps.checkURL();
        homeSteps.isCategoriesDisplayed();
    }

    @Test
    @Description("Test verifies the product from the home page" +
    "Product title, price, description, image and add to cart button")
    public void testCatalogInformation(){
        for (cont = 0; cont < 9; cont++ ) {
            if (cont > 3){
                homeSteps.scrollToMiddle();
            }
            //we assign the constants to use for different phones
            productDetails[cont] = constantes.productsConstants(cont);
            constantTitle = productDetails[cont].title;
            constantPrice = productDetails[cont].price;
            constantDescription = productDetails[cont].description;
           //all the steps that verify
            homeSteps.clickPhone(cont+1);
            catalogSteps.isCatalogTextDisplayed(catalogPage.getProductTitle(), constantTitle);
            catalogSteps.isCatalogTextDisplayed(catalogPage.getProductPrice(),constantPrice);
            catalogSteps.isCatalogTextDisplayed(catalogPage.getProductDescription(),constantDescription);
            catalogSteps.isCatalogImgDisplayed();
            catalogSteps.isCatalogBtnDisplayed();
            homeSteps.returnHome();

        }
    }

    @Test
    @Description("Test verifies the alert pop up")
    public void testCartPopUp()
    {
        homeSteps.clickPhone(1);
        catalogSteps.clickCartBtn();
        catalogSteps.verifyAlertPopUp();

    }

}
