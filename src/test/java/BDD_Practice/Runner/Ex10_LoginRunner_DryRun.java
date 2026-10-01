package BDD_Practice.Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "C:\\Users\\sanja\\IdeaProjects\\9th may BDD Cucumber Framework\\src\\test\\java\\BDD_Practice\\Features",
        glue = "BDD_Practice/Steps",
        dryRun = true
)
public class Ex10_LoginRunner_DryRun extends AbstractTestNGCucumberTests
{

}
