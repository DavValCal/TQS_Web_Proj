import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/showBilling.feature", glue="steps")
public class RunShowBillingTest extends AbstractTestNGCucumberTests{
	
}