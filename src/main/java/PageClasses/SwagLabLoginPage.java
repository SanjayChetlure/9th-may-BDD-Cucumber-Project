package PageClasses;
//POM class 1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage
{
//    1. Data member/Variable should be declared globally with access level private using @findBy Annotation
    @FindBy(xpath = "//input[@id='user-name']") private WebElement un ;  //private WebElement un=driver.findElement(By.xpath(""))
    @FindBy(xpath = "//input[@id='password']") private WebElement pwd;  //private WebElement pwd=driver.findElement(By.xpath(""))
    @FindBy(xpath = "//input[@name='login-button']") private WebElement loginBtn; //private WebElement loginBtn=driver.findElement(By.xpath(""))
    @FindBy(xpath = "//h3[contains(text(),'Username and password')]") private WebElement errorMsg;


    //2: Initialize within a constructor with access level public using pagefactory class
    public SwagLabLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);     //className.methodName(driverObj, thisKeyword)
    }

    //3. Utilize within a method with access level public
    public void enterUN(String UNValue)
    {
        un.sendKeys(UNValue);
    }

    public void enterPWD(String pwdValue)
    {
        pwd.sendKeys(pwdValue);
    }

    public void clickOnLogionBtn()
    {
        loginBtn.click();
    }

    public String getErrorMsg()
    {
        String actErrorMsg = errorMsg.getText();
        return actErrorMsg;
    }


}
