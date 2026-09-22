package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps
{

//    @Given("user is on login page")
//    public void enterUN()
//    {
//        System.out.println("user is on login page");
//    }
//
//    @When("user enters valid username")
//    public void enterPWD()
//    {
//        System.out.println("user enters password");
//    }

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



}
