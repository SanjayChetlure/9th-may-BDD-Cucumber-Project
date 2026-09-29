package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        features="src\\test\\java\\Features",   //path of feature file folder -> execute all feature files from that specific folder
        features={"src\\test\\java\\Features\\Ex1_LoginToApp.feature",
                "src\\test\\java\\Features\\Ex3_ProvideTDFromFeatureFileToSDClass.feature"},
        glue={"Steps","Hooks"}, //package name of step definition & Hooks class -> with hooks
        publish = true,
        tags = ""

)
public class LoginRunner_WithExecutionOfMultipleFeatureFile extends AbstractTestNGCucumberTests
{

}
