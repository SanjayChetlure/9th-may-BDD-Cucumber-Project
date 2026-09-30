package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "C:\\Users\\sanja\\IdeaProjects\\9th may BDD Cucumber Framework\\src\\test\\java\\Features",
        glue = "Steps",
        dryRun = true
)
public class Ex10_LoginRunner_DryRun extends AbstractTestNGCucumberTests
{

}
