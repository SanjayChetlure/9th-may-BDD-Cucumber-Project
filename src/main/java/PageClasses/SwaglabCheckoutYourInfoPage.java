package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwaglabCheckoutYourInfoPage
{
    @FindBy(xpath = "//input[@id='first-name']") private WebElement fn;
    @FindBy(xpath = "//input[@id='last-name']") private WebElement ln;
    @FindBy(xpath = "//input[@id='postal-code']") private WebElement postalCode;
    @FindBy(xpath = "//input[@id='continue']") private WebElement continueBtn;

    public SwaglabCheckoutYourInfoPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void enterFirstname(String FNValue)
    {
        fn.sendKeys(FNValue);
    }

    public void enterLastname(String lnValue)
    {
        ln.sendKeys(lnValue);
    }

    public void enterPostalCode(String postalValueValue)
    {
        postalCode.sendKeys(postalValueValue);
    }

    public void clickOnContinueBtn()
    {
        continueBtn.click();
    }
}
