package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="@target/ReRunFiles/reRun.txt",
        glue={"Steps"},
        plugin = {"rerun:target/ReRunFiles/reRun.txt"}
)
public class Ex12_ExecuteOnlyFailedScenarios extends AbstractTestNGCucumberTests
{

}
