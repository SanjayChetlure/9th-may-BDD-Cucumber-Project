package Hooks;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

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
    public void closeBrowser()
    {
        DriverFactory.driver.quit();
    }

}
