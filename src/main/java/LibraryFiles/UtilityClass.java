package LibraryFiles;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass
{

    //this method is use to get data from property file, provide String key as input & returns String value
    //@Author: Sanjay
    public static String getPFData(String key) throws IOException {
        //1: navigate to property file path
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\LibraryFiles\\PropertyFile.properties");

        //2: open property file
        Properties p=new Properties();
        p.load(file);

        //3:read data from property file using key
        String value=p.getProperty(key);
        return value;
    }

    //This method is use to capture screenshot of webpage
    //need to pass scenario name as a input
    public static void captureSS(String scenarioName) throws IOException {
        File src = ((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.FILE);
        File dest=new File(System.getProperty("user.dir")+"\\Screenshots\\"+scenarioName+".png");
        FileHandler.copy(src,dest);
    }

    //Method overloading
    public static void switchToFrame(int frameIndex)
    {
        DriverFactory.driver.switchTo().frame(frameIndex);
    }

    public static void switchToFrame(String frameNameOrId)
    {
        DriverFactory.driver.switchTo().frame(frameNameOrId);
    }

    public static void switchToFrame(WebElement frameElement)
    {
        DriverFactory.driver.switchTo().frame(frameElement);
    }

    public static void switchToDefaultContent()
    {
        DriverFactory.driver.switchTo().defaultContent();
    }

    public static void switchToParentFrame()
    {
        DriverFactory.driver.switchTo().parentFrame();
    }

    public static void clickOkOnAlert()
    {
        DriverFactory.driver.switchTo().alert().accept();
    }

    public static void clickCancelOnAlert()
    {
        DriverFactory.driver.switchTo().alert().dismiss();
    }

    public static String getTextFromAlert()
    {
        return DriverFactory.driver.switchTo().alert().getText();
    }

    public static void enterTextOnAlert(String inp)
    {
        DriverFactory.driver.switchTo().alert().sendKeys(inp);
    }

    public static void selectOptionInListbox(WebElement ele,int index)
    {
        Select s=new Select(ele);
        s.selectByIndex(index);
    }

    public static void selectOptionInListboxUsingValue(WebElement ele,String value)
    {
        Select s=new Select(ele);
        s.selectByValue(value);
    }

    public static void selectOptionInListboxUsingVisibleText(WebElement ele,String visibleText)
    {
        Select s=new Select(ele);
        s.selectByVisibleText(visibleText);
    }

    public static void deSelectAllOptionInListbox(WebElement ele)
    {
        Select s=new Select(ele);
        s.deselectAll();
    }

    public static void deSelectOptionInListboxUsingIndex(WebElement ele, int index)
    {
        Select s=new Select(ele);
        s.deselectByIndex(index);
    }

    public static void deSelectOptionInListboxUsingValue(WebElement ele, String value)
    {
        Select s=new Select(ele);
        s.deselectByValue(value);
    }

    public static void deSelectOptionInListboxUsingVisibleText(WebElement ele, String visibleText)
    {
        Select s=new Select(ele);
        s.deselectByVisibleText(visibleText);
    }


}
