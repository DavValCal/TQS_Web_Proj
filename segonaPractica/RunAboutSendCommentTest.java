import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// Si queremos hacer un test múltiple solo tendremos que cambiar el features por "src/test/java/features".

@CucumberOptions(features="src/test/java/features/aboutSendComment.feature", glue="steps")
public class RunAboutSendCommentTest extends AbstractTestNGCucumberTests{
	
}