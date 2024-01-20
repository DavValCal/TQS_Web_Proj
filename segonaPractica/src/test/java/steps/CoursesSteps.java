package steps;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoursesSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setUp() throws Exception {
		driver = webDriverSetUp.getDriver();
		wait = webDriverSetUp.getWait();
	}
	
	/*@Given("the user is in the index page")
	public void theUserIsInTheIndexPage()
	{
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.navigate().to("https://ultimateqa.com/automation");
		
	}*/
	
	@When("the user hovers over the Learning option")
	public void theUserHoversOverTheLearningOption()
	{
		WebElement learningOption = driver.findElement(By.partialLinkText("Learning"));
		Actions actions = new Actions(driver);
	    actions.moveToElement(learningOption).perform();
	}
	
	@When("the user clicks on the Courses button")
	public void theUserClicksOnTheCoursesButton()
	{
		driver.findElement(By.partialLinkText("Free Courses")).click();
	}
	
	@Then("the courses list appears")
	public void theCoursesListAppears()
	{
		String title = driver.findElement(By.className("collections__heading")).getText();
		Assert.assertEquals(title, "Products");
		//driver.quit();
	}
	
}
