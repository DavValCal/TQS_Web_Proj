import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/courses.feature", glue="steps")
public class RunCoursesTest extends AbstractTestNGCucumberTests{

}
