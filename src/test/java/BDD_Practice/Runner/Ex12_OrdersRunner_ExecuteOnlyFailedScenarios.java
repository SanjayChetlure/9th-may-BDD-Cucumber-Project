package BDD_Practice.Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src\\test\\java\\BDD_Practice\\Features\\Ex12_OrdersExecuteOnlyFailedScenarios.feature",
        glue={"BDD_Practice/Steps"},
        plugin = {"rerun:target/ReRunFiles/reRun.txt"}
)
public class Ex12_OrdersRunner_ExecuteOnlyFailedScenarios extends AbstractTestNGCucumberTests
{

}
