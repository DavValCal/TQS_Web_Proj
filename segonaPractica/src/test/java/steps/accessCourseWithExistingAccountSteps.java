package steps;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class accessCourseWithExistingAccountSteps {
	
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
		
	}
	
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
	
	
	@When("the user enters java in the search bar")
	public void theUserEntersJavaInTheSearchBar()
	{
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("java");
		element.sendKeys(Keys.ENTER);
		
	}
	

	@When("the user clicks the Course")
	public void theUserClicksTheCourse() 
	{
		//Thread.sleep(2000);
		try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		driver.findElement(By.partialLinkText("TestProject Java SDK Tutorial")).click();
		//WebElement courseLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("TestProject Java SDK Tutorial")));
	    //courseLink.click();
	}
	
	@When("the user clicks the unroll for free button")
	public void theUserClicksTheUnrollFroFreeButton() 
	{
		driver.findElement(By.partialLinkText("Enroll for free")).click();
	}
	*/
	
	@When("the user fill the email input")
	public void theUserFillTheForm() 
	{
		WebElement first_form_element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-1")));
		first_form_element.sendKeys("jhereMatsiiReyes@gmail.com");
	}
	
	@Then("automatically the password input appears")
	public void theUserEntersThePassword() 
	{
		WebElement first_form_element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[3]/section[2]/div/div/div/div[3]/span/strong")));
		first_form_element.isDisplayed();
	}
	
	
}
