package PageClasses;
//POM class 2

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage
{
    //1: Declaration
   @FindBy(xpath = "//div[@class='app_logo']") private WebElement logoText;
   @FindBy(xpath = "(//button[text()='Add to cart'])[1]") private WebElement addToCart;
   @FindBy(xpath = "//button[text()='Remove']") private WebElement removeAddToCart;

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

}
