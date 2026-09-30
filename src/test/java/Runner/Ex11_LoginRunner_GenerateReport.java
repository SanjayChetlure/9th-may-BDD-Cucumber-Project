package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "C:\\Users\\sanja\\IdeaProjects\\9th may BDD Cucumber Framework\\src\\test\\java\\Features",
        glue = "Steps",
        tags = "@ordersFeatures",
        publish = true,
        plugin = {"pretty","html:C:\\Users\\sanja\\IdeaProjects\\9th may BDD Cucumber Framework\\Reports\\SampleReport2.html"}
)
public class Ex11_LoginRunner_GenerateReport extends AbstractTestNGCucumberTests
{

}
