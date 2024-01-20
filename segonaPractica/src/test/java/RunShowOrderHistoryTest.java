import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/showOrderHistory.feature", glue="steps")
public class RunShowOrderHistoryTest extends AbstractTestNGCucumberTests{
	
}