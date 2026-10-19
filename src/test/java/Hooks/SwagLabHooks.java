package Hooks;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

import java.io.IOException;

public class SwagLabHooks
{

    @Before
    public void openBrowser() throws IOException
    {
        String browserValue=UtilityClass.getPFData("browserName");
        DriverFactory.initializeBrowser(browserValue);
    }

    @After
    public void closeBrowser(Scenario scenario) throws IOException
    {
        if (scenario.isFailed())         //check status of last executed scenario, is status if failed , then it capture ss of webpage
        {
            UtilityClass.captureSS(scenario.getName());     //execute code to capture SS
        }
        DriverFactory.driver.quit();
    }

//    @BeforeStep
//    public void beforeStep() throws IOException, InterruptedException
//    {
//        Thread.sleep(1000);
//    }

}
