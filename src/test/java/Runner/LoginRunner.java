package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src\\test\\java\\Features\\Ex6_Orders.feature",   //path of feature file
//        glue="Steps",  //package name of step definition class -> without Hooks
        glue={"Steps","Hooks"}, //package name of step definition & Hooks class -> with hooks
        publish = true
)
public class LoginRunner extends AbstractTestNGCucumberTests
{

}
