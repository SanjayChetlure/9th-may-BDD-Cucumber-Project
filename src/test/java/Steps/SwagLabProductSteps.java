package Steps;

import LibraryFiles.DriverFactory;
import PageClasses.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import javax.swing.*;

public class SwagLabProductSteps
{
    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);
    SwagLabYourCartPage youCartPage=new SwagLabYourCartPage(DriverFactory.driver);
    SwaglabCheckoutYourInfoPage yourInfoPage=new SwaglabCheckoutYourInfoPage(DriverFactory.driver);
    SwagLabCheckoutOverviewPage overviewPage=new SwagLabCheckoutOverviewPage(DriverFactory.driver);
    SwagLabCheckoutCompletePage completePage=new SwagLabCheckoutCompletePage(DriverFactory.driver);

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

    @When("user click on cart link")
    public void user_click_on_cart_link()
    {
        home.clickOnCartLink();
    }
    @When("user click checkout button")
    public void user_click_checkout_button()
    {
        youCartPage.clickOnCheckoutButton();
    }
    @When("user enter FN as {string}")
    public void user_enter_fn_as(String fn)
    {
        yourInfoPage.enterFirstname(fn);
    }
    @When("user enter LN as {string}")
    public void user_enter_ln_as(String ln)
    {
        yourInfoPage.enterLastname(ln);
    }
    @When("user enter postal code as {string}")
    public void user_enter_postal_code_as(String pc)
    {
        yourInfoPage.enterPostalCode(pc);
    }
    @When("user click on continue button")
    public void user_click_on_continue_button()
    {
        yourInfoPage.clickOnContinueBtn();
    }
    @When("user click on finish button")
    public void user_click_on_finish_button()
    {
        overviewPage.clickOnFinishBtn();
    }
    @Then("verify order placed message {string} is visible")
    public void verify_order_placed_message_is_visible(String expMsg)
    {
        String actMsg = completePage.getOrderPlacedMsg();
        Assert.assertEquals(actMsg,expMsg,"Failed-act & exp message mismatch");
    }


}
