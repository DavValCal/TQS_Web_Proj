import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/1_login.feature", glue="steps")
public class RunLoginTest extends AbstractTestNGCucumberTests{
	
}