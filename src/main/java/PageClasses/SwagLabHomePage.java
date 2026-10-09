package PageClasses;
//POM class 2

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SwagLabHomePage
{
    //1: Declaration
   @FindBy(xpath = "//div[@class='app_logo']") private WebElement logoText;
   @FindBy(xpath = "(//button[text()='Add to cart'])[1]") private WebElement addToCart;
   @FindBy(xpath = "//button[text()='Remove']") private WebElement removeAddToCart;
   @FindBy(xpath = "//div[text()='Sauce Labs Backpack']") private WebElement SauceLabsBackpackProduct;
   @FindBy(xpath = "(//div[@class='inventory_item_price'])[1]") private WebElement SauceLabsBackpackProductPrice;
   @FindBy(xpath = "//div[@class='inventory_item_price']") private List<WebElement> allProductTotalPrice;

   //2:initialization
    public SwagLabHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public String getLogoText()
    {
        String actLogoText = logoText.getText();
        return actLogoText;
    }

    public void clickOnAddToCartBtn()
    {
        addToCart.click();
    }

    public boolean checkRemoveAddToCartElementPresentOrNot()
    {
        boolean removeElementFound=false;
        try
        {
            removeElementFound=removeAddToCart.isDisplayed();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Exception handled");
        }
        return removeElementFound;
    }


    public String getSauceLabsBackpackProductName()
    {
        String actProductName = SauceLabsBackpackProduct.getText();
        return actProductName;
    }


    public double getSauceLabsBackpackProductPrice()
    {
        String actProductPrice = SauceLabsBackpackProductPrice.getText();     //  $29.99
        actProductPrice = actProductPrice.substring(1);             // 29.99  -> remove $ char from string
        double actProductPriceInDouble = Double.parseDouble(actProductPrice); // convert string to double
        return actProductPriceInDouble;
    }
    
    public double getAllProductTotalPrice()
    {
        double totalProductPrice=0;
        for(WebElement eachProductPriceAddress:allProductTotalPrice)
        {
            String singleProductPrice = eachProductPriceAddress.getText();       //$20.33
            singleProductPrice=singleProductPrice.substring(1);       //remove $   -> 20.33 as string
            double singleProductPriceInDouble = Double.parseDouble(singleProductPrice);    // convert string to double   20.33 as double
            totalProductPrice=totalProductPrice+singleProductPriceInDouble;               // ass singleProductPriceInDouble in totalProductPrice variable
        }
        
        return totalProductPrice;
    }

}
