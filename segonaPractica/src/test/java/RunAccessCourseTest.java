import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/accessCourse.feature", glue="steps")
public class RunAccessCourseTest extends AbstractTestNGCucumberTests{

}