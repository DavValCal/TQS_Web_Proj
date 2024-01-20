package steps;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class aboutSendCommentSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setUp() throws Exception {
		driver = webDriverSetUp.getDriver();
		wait = webDriverSetUp.getWait();
		driver.manage().window().maximize();
	}
	
	/*@Given("the user is in the index page")
	public void the_user_is_in_the_index_page() {

		System.setProperty("webdriver.gecko.driver", "Driver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.navigate().to("https://ultimateqa.com/automation");
	}*/

	@When("the user clicks the about tab")
	public void the_user_clicks_the_about_tab() {
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div/div/div/div/div[2]/div[1]/nav/ul/li[5]/a")).click();
	}
	

	@When("the user clicks the name input")
	public void the_user_clicks_the_name_input() throws InterruptedException{
		
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("et_pb_contact_name_0")));

		// Desplazar hasta el elemento
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		// Enfocar en el elemento
		((JavascriptExecutor) driver).executeScript("arguments[0].focus();", element);
		
		Thread.sleep(2000);
	}

	@When("the user fills the comment form")
	public void the_user_fills_the_comment_form() throws InterruptedException {
		
		WebElement first_form_element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("et_pb_contact_name_0")));
		first_form_element.sendKeys("David");
		driver.findElement(By.id("et_pb_contact_email_0")).sendKeys("1598654@uab.cat");
		driver.findElement(By.id("et_pb_contact_message_0")).sendKeys("Comment");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div[7]/div/div[1]/div/div/div[2]/div[2]/form/div/div/p/input")).sendKeys("7");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div[7]/div/div[1]/div/div/div[2]/div[2]/form/div/button")).click();
		Thread.sleep(5000);
	}

	@Then("the comment was submitted")
	public void the_video_is_playing() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div[7]/div/div[1]/div/div/div[2]/div/p")).isDisplayed())
		{
			Thread.sleep(2000);
		}
	}
}