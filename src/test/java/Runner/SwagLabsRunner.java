package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\test\\java\\Features",
        glue = {"Steps","Hooks"},
        publish = true,
        plugin = {"pretty","html:Reports/SwagLabProduct.html"},
        tags = "@product_E2E_usingScenarioOutline"
)
public class SwagLabsRunner extends AbstractTestNGCucumberTests
{

}
