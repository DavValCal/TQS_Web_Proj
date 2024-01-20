import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/showSeleniumResources.feature", glue="steps")
public class RunShowSeleniumResourcesTest extends AbstractTestNGCucumberTests{
	
}