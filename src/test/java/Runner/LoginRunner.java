package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src\\test\\java\\Features\\Ex5_2_ScenarioOutlineAndScenarioInSameFeatureFile.feature",   //path of feature file
        glue="Steps",  //package name of step definition class
        publish = true
)
public class LoginRunner extends AbstractTestNGCucumberTests
{

}
