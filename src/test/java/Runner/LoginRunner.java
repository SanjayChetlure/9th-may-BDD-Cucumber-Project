package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="C:\\Users\\sanja\\IdeaProjects\\9th may BDD Cucumber Framework\\src\\test\\java\\Features\\LoginToApp.feature",   //path of feature file
        glue="Steps"  //package name of step definition class
)
public class LoginRunner extends AbstractTestNGCucumberTests
{

}
