package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps
{

    @Given("user is on login page")
    public void user_is_on_login_page()
    {
        System.out.println("user is on login page");
    }
    @When("user enters valid username")
    public void user_enters_valid_username()
    {
        System.out.println("user enters valid username");
    }
    @When("user enters valid password")
    public void user_enters_valid_password()
    {
        System.out.println("user enters valid password");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button()
    {
        System.out.println("user clicks on login button");
    }
    @Then("user should be redirected to the home page")
    public void user_should_be_redirected_to_the_home_page()
    {
        System.out.println("Home page is displayed");
    }

    @Then("title of page should be visible")
    public void title_of_page_should_be_visible()
    {
        System.out.println("Title of page is visible");
    }

    @When("user enters invalid username")
    public void user_enters_invalid_username() {
        System.out.println("user enters invalid username");
    }
    @When("user enters invalid password")
    public void user_enters_invalid_password() {
        System.out.println("user enters invalid password");
    }
    @Then("login failed error msg should be visible")
    public void login_failed_error_msg_should_be_visible() {
        System.out.println("Login failed error msg is visible");
    }

    @When("user enter username as {string}")
    public void user_enter_username_as(String un)
    {
        System.out.println("Entered UN -"+un);
    }
    @When("user enter password as {string}")
    public void user_enter_password_as(String pwd)
    {
        System.out.println("Entered PWD -"+pwd);
    }
    @Then("verify home page visible with logo text {string}")
    public void verify_home_page_visible_with_logo_text(String expLogoText)
    {
        System.out.println("Logo text visible with text-"+expLogoText);
    }

    @When("user enter pin as {int}")
    public void user_enter_pin_as(int pin)
    {
        System.out.println("Entered Pin -"+pin);
    }





}
