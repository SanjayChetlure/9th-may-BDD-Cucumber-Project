package Steps;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import PageClasses.SwagLabHomePage;
import PageClasses.SwagLabLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class SwagLabLoginSteps
{
    SwagLabLoginPage login=new SwagLabLoginPage(DriverFactory.driver);
    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);

    @Given("user open SwagLab Application with url {string}")
    public void user_open_swag_lab_application_with_url(String urlKey) throws IOException
    {
        String urlValue= UtilityClass.getPFData(urlKey);
        DriverFactory.driver.get(urlValue);
    }


    @When("user enter UN as {string}")
    public void user_enter_un_as(String UnKey) throws IOException
    {
        if(UnKey.startsWith("#"))
        {
            String UnValue=UtilityClass.getPFData(UnKey.substring(1));  //  #UN  ->UN
            login.enterUN(UnValue);
        }
        else
        {
            login.enterUN(UnKey);
        }
    }

    @When("user enter PWD as {string}")
    public void user_enter_pwd_as(String pwdKey) throws IOException
    {
        if (pwdKey.startsWith("#"))
        {
            String pwdValue=UtilityClass.getPFData(pwdKey.substring(1));   //#pwd -> pwd
            login.enterPWD(pwdValue);
        }
        else
        {
            login.enterPWD(pwdKey);
        }

    }

    @When("user click on login button")
    public void user_click_on_login_button()
    {
        login.clickOnLogionBtn();
    }

    @Then("verify Swaglab Home page logo text as {string}")
    public void verify_swaglab_home_page_logo_text_as(String expLogoText)
    {
        String actLogoText=home.getLogoText();
        Assert.assertEquals(actLogoText, expLogoText,"Act & exp logo text mismatch");
    }


    @Then("verify login failed error message with message {string}")
    public void verify_login_failed_error_message_with_message(String expLoginFailedErrorMsg)
    {
       String actLoginFailedErrorMsg=login.getErrorMsg();
       Assert.assertEquals(actLoginFailedErrorMsg,expLoginFailedErrorMsg,"Failed-act & exp error msg mismatch");
    }


}
