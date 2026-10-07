package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\test\\java\\Features\\SwagLabLogin.feature",
        glue = {"Steps","Hooks"},
        publish = true,
        plugin = {"pretty","html:Reports/SwagLabReport.html"},
        tags = ""
)
public class SwagLabsRunner extends AbstractTestNGCucumberTests
{
}
