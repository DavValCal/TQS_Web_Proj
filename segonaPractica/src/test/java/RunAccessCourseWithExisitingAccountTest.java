import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/o_accessCourseWithExistingAccount.feature", glue="steps")
public class RunAccessCourseWithExisitingAccountTest extends AbstractTestNGCucumberTests{

}