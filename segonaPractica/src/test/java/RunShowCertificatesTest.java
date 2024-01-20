import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/4_showCertificates.feature", glue="steps")
public class RunShowCertificatesTest extends AbstractTestNGCucumberTests{
	
}