import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="steps")
public class RunAllTest extends AbstractTestNGCucumberTests{
	
}
// cuidado con el orden de ejecucion de features