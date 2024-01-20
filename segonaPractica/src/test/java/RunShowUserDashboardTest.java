import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/m_showUserDashboard.feature", glue="steps")
public class RunShowUserDashboardTest extends AbstractTestNGCucumberTests{
	
}