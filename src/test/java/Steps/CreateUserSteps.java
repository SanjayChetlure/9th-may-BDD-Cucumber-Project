package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateUserSteps
{

    @Given("user is on signin page")
    public void user_is_signin_page()
    {
        System.out.println("On SingnIn Page");
    }
    @When("user enter firstname as {string}")
    public void user_enter_firstname_as(String fn)
    {
        System.out.println("user entered FN-"+fn);
    }
    @When("user enter lastname as {string}")
    public void user_enter_lastname_as(String ln)
    {
        System.out.println("user entered LN-"+ln);
    }
    @When("user enter age {int}")
    public void user_enter_age(Integer age)
    {
        System.out.println("user entered age-"+age);
    }
    @When("user enter gender {string}")
    public void user_enter_gender(String gender)
    {
        System.out.println("user entered gender-"+gender);
    }
    @When("user click on submit button")
    public void user_click_on_submit_button()
    {
        System.out.println("click on submit button");
    }
    @Then("user created message visible")
    public void user_created_message_visible()
    {
        System.out.println("--user created--");
    }



    @When("student enter {string} as firstname")
    public void student_enter_as_firstname(String string)
    {
        System.out.println("Student Entered FN-"+string);
    }

    @When("student enter {double} as percentage")
    public void student_enter_as_percentage(Double double1)
    {
        System.out.println("Student Entered Percentage-"+double1);
    }

    @When("student click on submit button")
    public void student_click_submit_button()
    {
        System.out.println("student click on submit button");
    }

    @Then("verify student details submitted")
    public void verify_student_details_submitted()
    {
        System.out.println("Student details submitted");
    }



}
