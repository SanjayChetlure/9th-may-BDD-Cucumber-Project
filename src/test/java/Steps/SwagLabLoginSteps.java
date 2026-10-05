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
        String UnValue=UtilityClass.getPFData(UnKey);
        login.enterUN(UnValue);
    }

    @When("user enter PWD as {string}")
    public void user_enter_pwd_as(String pwdKey) throws IOException
    {
        String pwdValue=UtilityClass.getPFData(pwdKey);
        login.enterPWD(pwdValue);
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

}
