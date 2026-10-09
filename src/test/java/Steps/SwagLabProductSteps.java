package Steps;

import LibraryFiles.DriverFactory;
import PageClasses.SwagLabHomePage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SwagLabProductSteps
{
    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);

    @Then("verify {string} product is present in home page")
    public void verify_product_is_present_in_home_page(String expProductName)
    {
        String actProductName = home.getSauceLabsBackpackProductName();
        Assert.assertEquals(actProductName,expProductName,"Failed- Act & exp product Name mismatch");
    }

    @Then("verify Sauce Labs Backpack price as {double}")
    public void verify_sauce_labs_backpack_price_as(double expProductPrice)
    {
        double actProductPrice = home.getSauceLabsBackpackProductPrice();
        Assert.assertEquals(actProductPrice,expProductPrice,"Failed-act & exp product price mismatch");
    }

    @Then("verify total product price should be {double}")
    public void verify_total_product_price_should_be(double expTotalProductsPrice)
    {
        double actTotalProductPrice = home.getAllProductTotalPrice();
        Assert.assertEquals(actTotalProductPrice,expTotalProductsPrice,"Failed- act & exp product price mismatch");
    }

}
