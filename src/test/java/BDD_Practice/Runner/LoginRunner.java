package BDD_Practice.Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src\\test\\java\\BDD_Practice\\Features\\Ex1_LoginToApp.feature",   //path of feature file
//        glue="Steps",  //package name of step definition class -> without Hooks
        glue={"BDD_Practice/Steps", "BDD_Practice/Hooks"}, //package name of step definition & Hooks class -> with hooks
        publish = true,
//        tags = "@login"
//        tags = "@Sanity or @Regression"
//        tags = "@MayRelease26 and @Regression"
        tags = "not @Smoke"
)
public class LoginRunner extends AbstractTestNGCucumberTests
{

}
