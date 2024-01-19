import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/signIn_signOut.feature", glue="steps")
public class RunSignIn_SignOutTest extends AbstractTestNGCucumberTests{
	
}


