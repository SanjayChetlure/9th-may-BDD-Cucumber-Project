package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class OrderHooks
{

    @Before       //before hook
    public void openBrowser()
    {
        System.out.println("--Open browser--");
    }

    @After        //after hook
    public void closeBrowser()
    {
        System.out.println("--Close browser--");
    }

//    @BeforeStep
//    public void m1()
//    {
//        System.out.println("-running before step-");
//    }
//
//    @AfterStep
//    public void m2()
//    {
//        System.out.println("-running after step-");
//    }
}
