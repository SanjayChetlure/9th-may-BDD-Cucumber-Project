package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src\\test\\java\\Features\\Ex3_ProvideTDFromFeatureFileToSDClass.feature",   //path of feature file
        glue="Steps"  //package name of step definition class
)
public class LoginRunner extends AbstractTestNGCucumberTests
{

}
