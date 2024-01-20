import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/deactivateNotifications.feature", glue="steps")
public class RunDeactivateNotificationsTest extends AbstractTestNGCucumberTests{
	
}
