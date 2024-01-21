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

public class accessCourseSteps {
	
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
	*/
	
	@When("the user enters java in the search bar")
	public void theUserEntersJavaInTheSearchBar()
	{
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
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
	
	
	@When("the user fill the form")
	public void theUserFillTheForm() 
	{
		WebElement first_form_element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-1")));
		first_form_element.sendKeys("matiaiacreyseess@gmail.com");
		driver.findElement(By.id("input-2")).sendKeys("jajaja");
		driver.findElement(By.id("input-3")).sendKeys("jejeje");
		
		WebElement checkbox = driver.findElement(By.id("terms-and-privacy-checkbox"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", checkbox);
		
		
	}
	
	@When("the user clicks the SignUp button")
	public void theUserClicksTheSignUpButton() 
	{
		driver.findElement(By.className("payment-button")).click();
		try {
	        Thread.sleep(20000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	@When("the user enters the password")
	public void theUserEntersThePassword() 
	{
		WebElement first_form_element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user[password]")));
		first_form_element.sendKeys("12345678");
	}
	
	@When("the user clicks the Complete SetUp button")
	public void theUserClicksTheCompleteSetUpButton() 
	{
		driver.findElement(By.name("commit")).click();
	}
	
	@Then("the course content appears")
	public void theCourseContentAppears() 
	{
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		
		try {
			//String actualText = driver.findElement(By.partialLinkText("TestProject Java SDK Tutorial")).getText();
			driver.findElement(By.partialLinkText("TestProject Java SDK Tutorial")).getText();

		} catch (NoSuchElementException e) {
		    System.out.println("No se encontró el elemento: " + e.getMessage());
		} finally {
			try {
		        Thread.sleep(2000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		    //driver.quit();
		}
		

	}
	
	
}
